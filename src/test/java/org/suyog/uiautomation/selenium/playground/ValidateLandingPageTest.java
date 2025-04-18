package org.suyog.uiautomation.selenium.playground;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.suyog.uiautomation.pages.LandingPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class ValidateLandingPageTest {
    private WebDriver driver;
    private LandingPage landingPage;

    @BeforeEach
    void setup() {
        this.driver = OpenWebPage.setUp();
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
    public void validatePageHeaderElements() {
        landingPage = PageFactory.initElements(driver, LandingPage.class);

        Assertions.assertEquals("Selenium Playground", landingPage.CenterText(), "Validating landing page center header: ");
    }
}
