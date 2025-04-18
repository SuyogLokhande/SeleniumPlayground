package org.suyog.uiautomation.selenium.playground;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebPage {
    private static final Logger logger = LogManager.getLogger(OpenWebPage.class);


    public static WebDriver setUp() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "https://www.lambdatest.com/selenium-playground/";
        driver.get(url);
        logger.printf(Level.INFO, "Opening webpage: " + url);
        return driver;
    }
}
