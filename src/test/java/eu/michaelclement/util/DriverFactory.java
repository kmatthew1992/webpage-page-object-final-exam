package eu.michaelclement.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

    public static WebDriver getDriver(DriverType driverType) {
        switch (driverType) {
            case CHROME -> {
                return new ChromeDriver();
            }
            case FIREFOX -> {
                return new FirefoxDriver();
            }
            case EDGE -> {
                return new EdgeDriver();
            }
            case SAFARI -> {
                return new SafariDriver();
            }
            default -> throw new RuntimeException();
        }
    }
}
