package org.suyog.uiautomation.pages.common;

import org.openqa.selenium.WebDriver;

public abstract class Page {
    protected static WebDriver driver;

    public Page(WebDriver driver) {
        Page.driver = driver;
    }
}
