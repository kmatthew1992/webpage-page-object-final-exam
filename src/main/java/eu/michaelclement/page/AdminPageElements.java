package eu.michaelclement.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class AdminPageElements {
    @FindBy(xpath = "//button[@class='add-product-button']")
    protected WebElement productAddButton;
    @FindBy(xpath = "//button[@class='save-button']")
    protected WebElement productSaveButton;
    @FindBy(xpath = "//input[@class='product-name']")
    protected WebElement productNameInput;
    @FindBy(xpath = "//textarea[@class='product-description']")
    protected WebElement productDescriptionInput;
    @FindBy(xpath = "//input[@class='product-price']")
    protected WebElement productPriceInput;
    @FindBy(xpath = "//button[@class='delete-product-button']")
    protected WebElement productDeleteButton;
    @FindBy(xpath = "//div[@data-product-id='6']/input[@class='product-name']")
    protected WebElement secondProductNameInput;
    @FindBy(xpath = "//div[@data-product-id='6']/textarea[@class='product-description']")
    protected WebElement secondProductDescriptionInput;
    @FindBy(xpath = "//div[@data-product-id='6']/input[@class='product-price']")
    protected WebElement secondProductPriceInput;

    public AdminPageElements(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
    }
}
