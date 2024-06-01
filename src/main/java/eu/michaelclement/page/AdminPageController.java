package eu.michaelclement.page;

import org.openqa.selenium.WebDriver;

public class AdminPageController extends AdminPageElements{
    public AdminPageController(WebDriver driver)  {super(driver); }
    public void clickProductAddButton()  {productAddButton.click();}
    public void clickProductSaveButton() {productSaveButton.click();}
    public void fillProductNameInput(String input) {productNameInput.sendKeys(input);}
    public void fillProductDescriptionInput(String input) {productDescriptionInput.sendKeys(input);}
    public void fillProductPriceInput(String input) {productPriceInput.sendKeys(input);}
    public void clickProductDeleteButton() {productDeleteButton.click();}
    public void fillSecondProductNameInput(String input) {secondProductNameInput.sendKeys(input);}
    public void fillSecondProductDescriptionInput(String input) {secondProductDescriptionInput.sendKeys(input);}
    public void fillSecondProductPriceInput(String input) {secondProductPriceInput.sendKeys(input);}
}
