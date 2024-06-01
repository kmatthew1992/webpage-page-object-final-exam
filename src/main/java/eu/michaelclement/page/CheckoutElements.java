package eu.michaelclement.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public abstract class CheckoutElements {
    @FindBy(xpath = "//input[@id='first-name']")
    protected WebElement firstNameField;
    @FindBy(xpath = "//input[@id='last-name']")
    protected WebElement lastNameField;
    @FindBy(xpath = "//input[@id='email']")
    protected WebElement emailAddressField;
    @FindBy(xpath = "//input[@id='address-line-1']")
    protected WebElement addressLine1Field;
    @FindBy(xpath = "//input[@id='address-line-2']")
    protected WebElement addressLine2Field;
    @FindBy(xpath = "//input[@id='city']")
    protected WebElement cityField;
    @FindBy(xpath = "//select[@id='country']")
    protected WebElement countryField;
    @FindBy(xpath = "//option[@data-test-id]")
    protected List<WebElement> countryDropdownOptions;

    @FindBy(xpath = "//input[@id='zip-code']")
    protected WebElement zipCodeField;

    @FindBy(xpath = "//button[@data-test-id='summary']")
    protected WebElement summaryButton;

    public CheckoutElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
