package eu.michaelclement.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class ShoppingCartElements extends ParentPage {
    @FindBy(xpath = "//td[@data-test-id='table-product-name']")
    protected List<WebElement> productNameTexts;
    @FindBy(xpath = "//input[@class='quantity-input']")
    protected List<WebElement> productQuantityInputs;
    @FindBy(xpath = "//button[@class='plus-button']")
    protected List<WebElement> productIncreaseQuantityButtons;
    @FindBy(xpath = "//button[@class='minus-button']")
    protected List<WebElement> productDecreaseQuantityButtons;
    @FindBy(xpath = "//button[@data-test-id='checkout']")
    protected WebElement checkoutButton;

    public ShoppingCartElements(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
