package org.suyog.uiautomation.selenium.playground;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class ValidateLandingPageTest {
    static WebDriver driver;
    @BeforeEach
    void setup() {
        driver = OpenWebPage.testGoogleSearch();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void validatePageTitle() {
        Assertions.assertEquals("Selenium Grid Online | Run Selenium Test On Cloud", driver.getTitle(), "Validating page title: ");
    }

    @Test
    void validatePageElements() {
        WebElement centerText= driver.findElement(By.xpath("//h1[text()='Selenium Playground']"));
        Assertions.assertEquals("Selenium Playground", centerText.getText(), "Validating landing page center header: ");
    }

}
