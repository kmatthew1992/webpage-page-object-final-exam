package eu.michaelclement.page.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class MenuElements {
    public MenuElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='shopping-cart']")
    protected WebElement cartButton;
    @FindBy(xpath = "//button[@id='contact-menu-button']")
    protected WebElement contactButton;
    @FindBy(xpath = "//button[@id='dummy-menu-button']")
    protected WebElement dummyButton;
    @FindBy(xpath = "//button[@id='logout-menu-button']")
    protected WebElement logoutButton;
    @FindBy(xpath = "//button[@id='products-menu-button']")
    protected WebElement productsButton;
}
