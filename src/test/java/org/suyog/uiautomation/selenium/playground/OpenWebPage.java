package org.suyog.uiautomation.selenium.playground;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OpenWebPage {
    public static WebDriver testGoogleSearch() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.lambdatest.com/selenium-playground/");
        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        return driver;
    }
}
