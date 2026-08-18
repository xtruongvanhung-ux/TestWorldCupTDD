package com.testworldcup.testworldcuptdd.selenium;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MatchWebTest {

    private static WebDriver driver;
    private static WebDriverWait wait;

    private static final String BASE_URL =
            "http://localhost:8080";

    @BeforeAll
    static void setUp() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10)
        );

        driver.get(BASE_URL);
    }

    // TC252
    // Match duration = 90 minutes -> VALID
    @Test
    void TC252_validMatchDuration90Minutes() {

        driver.get(BASE_URL);

        WebElement input =
                driver.findElement(By.id("minutes"));

        input.clear();
        input.sendKeys("90");

        driver.findElement(
                By.id("checkDuration")
        ).click();

        String result =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                By.id("result")
                        )
                ).getText();

        assertEquals(
                "VALID: Match duration is 90 minutes.",
                result
        );
    }

    // TC253
    // Match duration = 89 minutes -> INVALID
    @Test
    void TC253_invalidMatchDuration89Minutes() {

        driver.get(BASE_URL);

        WebElement input =
                driver.findElement(By.id("minutes"));

        input.clear();
        input.sendKeys("89");

        driver.findElement(
                By.id("checkDuration")
        ).click();

        String result =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                By.id("result")
                        )
                ).getText();

        assertEquals(
                "INVALID: Match duration must be 90 minutes.",
                result
        );
    }

    // TC254
    // Match duration = 91 minutes -> INVALID
    @Test
    void TC254_invalidMatchDuration91Minutes() {

        driver.get(BASE_URL);

        WebElement input =
                driver.findElement(By.id("minutes"));

        input.clear();
        input.sendKeys("91");

        driver.findElement(
                By.id("checkDuration")
        ).click();

        String result =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                By.id("result")
                        )
                ).getText();

        assertEquals(
                "INVALID: Match duration must be 90 minutes.",
                result
        );
    }

    // TC255
    // Verify homepage UI elements
    @Test
    void TC255_verifyMatchRulePage() {

        driver.get(BASE_URL);

        assertEquals(
                "World Cup Test Application",
                driver.getTitle()
        );

        WebElement input =
                driver.findElement(By.id("minutes"));

        WebElement button =
                driver.findElement(
                        By.id("checkDuration")
                );

        assertTrue(input.isDisplayed());
        assertTrue(button.isDisplayed());

        assertEquals(
                "Check Match Duration",
                button.getText()
        );
    }

    // TC256
    // Empty input -> browser validation is triggered
    @Test
    void TC256_emptyMatchDuration() {

        driver.get(BASE_URL);

        WebElement input =
                driver.findElement(By.id("minutes"));

        input.clear();

        WebElement button =
                driver.findElement(
                        By.id("checkDuration")
                );

        button.click();

        // Because the input has HTML5 "required",
        // the browser should not navigate to /match.
        assertEquals(
                BASE_URL + "/",
                driver.getCurrentUrl()
        );
    }

    // TC257
    // Invalid numeric input -> INVALID
    @Test
    void TC257_invalidNumericInput() {

        driver.get(BASE_URL);

        // The HTML input is type="number", so send an invalid
        // numeric value directly through the URL.
        driver.get(BASE_URL + "/match?minutes=abc");

        String result =
                driver.findElement(By.id("result"))
                        .getText();

        assertEquals(
                "INVALID: Minutes must be a number.",
                result
        );
    }

    @AfterAll
    static void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}