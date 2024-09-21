package org.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver driver;

    public static WebDriver getBrowser(String BrowserName) {

        if (BrowserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (BrowserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }

        return driver;
    }
}
