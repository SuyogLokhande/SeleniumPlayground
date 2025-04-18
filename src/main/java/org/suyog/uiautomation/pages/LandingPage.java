package org.suyog.uiautomation.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.suyog.uiautomation.pages.common.Page;
import org.openqa.selenium.support.FindBy;


public class LandingPage extends Page {
    private static final Logger logger = LogManager.getLogger(LandingPage.class);

    @FindBy(xpath = "//h1[text()='Selenium Playground']")
    private static WebElement LandingPageCenterText;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public static String CenterText() {
        return LandingPageCenterText.getText();
    }
}
