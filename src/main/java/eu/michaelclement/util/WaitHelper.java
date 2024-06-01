package eu.michaelclement.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class WaitHelper {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public WaitHelper(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofMillis(3000));
    }

    public void clickElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    public void fillTextField(WebElement element, String value) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }

    public List<String> getElementsText(List<WebElement> elements) {
        List<String> textList = new ArrayList<>();
        try {
            wait.until(d -> !elements.isEmpty());
        } catch (Exception e) {
            return textList;
        }
        for (WebElement title : elements) {
            textList.add(title.getText());
        }
        return textList;
    }

    public WebDriverWait getWait() {
        return wait;
    }
}
