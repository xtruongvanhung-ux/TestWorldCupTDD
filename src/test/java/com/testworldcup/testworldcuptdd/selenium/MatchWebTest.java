package com.testworldcup.testworldcuptdd.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MatchWebTest {

    private static WebDriver driver;

    private static final String BASE_URL =
            "http://localhost:8080";

    @BeforeAll
    static void setUp() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get(BASE_URL);
    }

    // TC_WEB_001
    // Match duration = 90 minutes -> VALID
    @Test
    void TC_WEB_001_validMatchDuration90Minutes() {

        driver.get(BASE_URL);

        WebElement input =
                driver.findElement(By.id("minutes"));

        input.clear();
        input.sendKeys("90");

        driver.findElement(
                By.id("checkDuration")
        ).click();

        String result =
                driver.findElement(By.id("result"))
                        .getText();

        assertEquals(
                "VALID: Match duration is 90 minutes.",
                result
        );
    }

    // TC_WEB_002
    // Match duration = 89 minutes -> INVALID
    @Test
    void TC_WEB_002_invalidMatchDuration89Minutes() {

        driver.get(BASE_URL);

        WebElement input =
                driver.findElement(By.id("minutes"));

        input.clear();
        input.sendKeys("89");

        driver.findElement(
                By.id("checkDuration")
        ).click();

        String result =
                driver.findElement(By.id("result"))
                        .getText();

        assertEquals(
                "INVALID: Match duration must be 90 minutes.",
                result
        );
    }

    // TC_WEB_003
    // Match duration = 91 minutes -> INVALID
    @Test
    void TC_WEB_003_invalidMatchDuration91Minutes() {

        driver.get(BASE_URL);

        WebElement input =
                driver.findElement(By.id("minutes"));

        input.clear();
        input.sendKeys("91");

        driver.findElement(
                By.id("checkDuration")
        ).click();

        String result =
                driver.findElement(By.id("result"))
                        .getText();

        assertEquals(
                "INVALID: Match duration must be 90 minutes.",
                result
        );
    }

    // TC_WEB_004
    // Verify homepage UI elements
    @Test
    void TC_WEB_004_verifyMatchRulePage() {

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

    // TC_WEB_005
    // Empty input -> browser validation is triggered
    @Test
    void TC_WEB_005_emptyMatchDuration() {

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

    @AfterAll
    static void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}