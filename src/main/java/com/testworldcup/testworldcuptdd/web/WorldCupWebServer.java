package com.testworldcup.testworldcuptdd.web;

import com.testworldcup.testworldcuptdd.Match;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class WorldCupWebServer {

    private static final int PORT = 8080;

    public static void main(String[] args) throws IOException {

        HttpServer server = HttpServer.create(
                new InetSocketAddress(PORT), 0);

        server.createContext("/", WorldCupWebServer::handleHome);
        server.createContext("/match", WorldCupWebServer::handleMatch);

        server.setExecutor(null);
        server.start();

        System.out.println(
                "World Cup Web Server started at http://localhost:" + PORT
        );
    }

    // Homepage
    private static void handleHome(HttpExchange exchange)
            throws IOException {

        String html = """
                <!DOCTYPE html>
                <html>
                <head>
                    <meta charset="UTF-8">
                    <title>World Cup Test Application</title>
                    <style>
                        body {
                            font-family: Arial, sans-serif;
                            margin: 40px;
                        }

                        h1 {
                            color: #333;
                        }

                        .card {
                            width: 500px;
                            padding: 20px;
                            border: 1px solid #ccc;
                            border-radius: 8px;
                        }

                        input {
                            padding: 8px;
                            margin: 8px 0;
                            width: 200px;
                        }

                        button {
                            padding: 8px 16px;
                            cursor: pointer;
                        }
                    </style>
                </head>

                <body>

                    <h1>World Cup Test Application</h1>

                    <div class="card">

                        <h2>Match Rules</h2>

                        <form action="/match" method="get">

                            <label for="minutes">
                                Match duration:
                            </label>

                            <br>

                            <input
                                id="minutes"
                                name="minutes"
                                type="number"
                                placeholder="Enter minutes"
                                required
                            >

                            <br>

                            <button
                                id="checkDuration"
                                type="submit">
                                Check Match Duration
                            </button>

                        </form>

                    </div>

                </body>
                </html>
                """;

        sendResponse(exchange, 200, html);
    }

    // Match validation
    private static void handleMatch(HttpExchange exchange)
            throws IOException {

        Map<String, String> params =
                parseQuery(exchange.getRequestURI().getRawQuery());

        String minutesText = params.get("minutes");

        String result;

        if (minutesText == null || minutesText.isBlank()) {

            result = "Please enter match duration.";

        } else {

            try {

                int minutes = Integer.parseInt(minutesText);

                Match match = new Match();

                boolean valid =
                        match.isMatchDurationValid(minutes);

                if (valid) {
                    result = "VALID: Match duration is 90 minutes.";
                } else {
                    result = "INVALID: Match duration must be 90 minutes.";
                }

            } catch (NumberFormatException e) {

                result = "INVALID: Minutes must be a number.";
            }
        }

        String html = """
                <!DOCTYPE html>
                <html>
                <head>
                    <meta charset="UTF-8">
                    <title>Match Validation Result</title>
                </head>

                <body>

                    <h1>Match Validation Result</h1>

                    <p id="result">%s</p>

                    <a href="/">
                        Back to Match Rules
                    </a>

                </body>
                </html>
                """.formatted(result);

        sendResponse(exchange, 200, html);
    }

    private static Map<String, String> parseQuery(String query) {

        Map<String, String> params = new HashMap<>();

        if (query == null || query.isBlank()) {
            return params;
        }

        for (String pair : query.split("&")) {

            String[] parts = pair.split("=", 2);

            if (parts.length == 2) {

                String key = URLDecoder.decode(
                        parts[0],
                        StandardCharsets.UTF_8
                );

                String value = URLDecoder.decode(
                        parts[1],
                        StandardCharsets.UTF_8
                );

                params.put(key, value);
            }
        }

        return params;
    }

    private static void sendResponse(
            HttpExchange exchange,
            int statusCode,
            String response)
            throws IOException {

        byte[] bytes =
                response.getBytes(StandardCharsets.UTF_8);

        exchange.getResponseHeaders().set(
                "Content-Type",
                "text/html; charset=UTF-8"
        );

        exchange.sendResponseHeaders(
                statusCode,
                bytes.length
        );

        try (OutputStream output =
                     exchange.getResponseBody()) {

            output.write(bytes);
        }
    }
}