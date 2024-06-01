package eu.michaelclement.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class LoginPageElements extends ParentPage {
    @FindBy(xpath = "//input[@id='username']")
    protected WebElement usernameField;
    @FindBy(xpath = "//input[@id='password']")
    protected WebElement passwordField;
    @FindBy(xpath = "//button[@type='submit']")
    protected WebElement loginButton;

    public LoginPageElements(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
