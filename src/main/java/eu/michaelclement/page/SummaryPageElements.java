package eu.michaelclement.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class SummaryPageElements extends ParentPage{
    @FindBy(xpath = "//h4[1]")
    protected WebElement summaryHeaderText;
    @FindBy(xpath = "//td[@data-test-id]")
    protected List<WebElement> personalDataTexts;
    @FindBy(xpath = "//td[@data-test-id='product-name']")
    protected List<WebElement> productNameTexts;
    @FindBy(xpath = "//td[@data-test-id='quantity']")
    protected List<WebElement> productQuantity;
    @FindBy(xpath = "//td[@data-test-id='price']")
    protected List<WebElement> productPrice;
    @FindBy(xpath = "//td[@data-test-id='product-total-price']")
    protected List<WebElement> productTotalPrice;
    @FindBy(xpath = "//td[@data-test-id='total-price']")
    protected List<WebElement> totalPrice;
    @FindBy(xpath = "//button[@data-test-id='order']")
    protected WebElement orderButton;
    @FindBy(xpath = "//h3[@class='wp-block-heading has-text-align-center']")
    protected List<WebElement> orderEndingMessage;

    public SummaryPageElements(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
