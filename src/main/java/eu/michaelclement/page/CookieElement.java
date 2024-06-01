package eu.michaelclement.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class CookieElement extends ParentPage{
    @FindBy(xpath = "//button[@data-cky-tag='accept-button']")
    protected WebElement cookieButton;
    public CookieElement(WebDriver driver)  {
        super(driver);
        PageFactory.initElements(driver, this); }
}
