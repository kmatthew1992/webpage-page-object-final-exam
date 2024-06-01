package eu.michaelclement.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartController extends ShoppingCartElements {
    public ShoppingCartController(WebDriver driver) {
        super(driver);
    }

    public List<String> getProductNameTexts() {
        waitHelper.getWait().until(d -> !productNameTexts.isEmpty());
        List<String> productNameList = new ArrayList<>();
        for (WebElement productName : productNameTexts) {
            productNameList.add(productName.getText());
        }
        return productNameList;
    }

    public int getCartProductCount() {
        return getProductNameTexts().size();
    }

    public List<Integer> getProductQuantities() {
        List<Integer> productQuantityList = new ArrayList<>();
        for (WebElement productQuantity : productQuantityInputs) {
            productQuantityList.add(Integer.parseInt(productQuantity.getAttribute("value")));
        }
        return productQuantityList;
    }

    /**
     * @param index    0-indexed
     * @param quantity product quantity
     */
    public void setNthProductQuantity(int index, int quantity) {
        productQuantityInputs.get(index).sendKeys(String.valueOf(quantity) + Keys.ENTER);
    }

    public void clickNthProductIncreaseQuantityButtonTimes(int index, int times) {
        for (int i = 0; i < times; i++) {
            productIncreaseQuantityButtons.get(index).click();
        }
    }

    public void clickNthProductDecreaseQuantityButtonTimes(int index, int times) {
        for (int i = 0; i < times; i++) {
            productDecreaseQuantityButtons.get(index).click();
        }
    }

    public void clickCheckoutButton() {
        checkoutButton.click();
    }

}
