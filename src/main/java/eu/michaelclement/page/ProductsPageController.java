package eu.michaelclement.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ProductsPageController extends ProductsPageElements {
    public ProductsPageController(WebDriver driver) {
        super(driver);
    }

    public void fillSearchField(String input) {
        this.searchInput.sendKeys(input);
    }

    public void fillMinPriceFilterField(int price) {
        minimumPriceFilterField.sendKeys(String.valueOf(price) + Keys.ENTER);
    }

    public void fillMaxPriceFilterField(int price) {
        maximumPriceFilterField.sendKeys(String.valueOf(price) + Keys.ENTER);
    }

    public void selectSortDropdownOption(SortOption option) {
        this.sortDropdown.click();
        switch (option) {
            case NAME:
                this.sortDropdownOptionName.click();
                break;
            case PRICE:
                this.sortDropdownOptionPrice.click();
                break;
            default:
                throw new RuntimeException();
        }

    }

    public int getProductCount() {
        return this.productCards.size();
    }

    public List<String> getProductTitleTexts() {
        return waitHelper.getElementsText(productTitleTexts);
    }

    public void addNthProductQuantity(int index, int quantity) {
        productQuantityInputs.get(index).sendKeys(String.valueOf(quantity) + Keys.ENTER);
    }

    public void increaseNthProductQuantityTimes(int index, int times) {
        for (int i = 0; i < times; i++) {
            productIncreaseButtons.get(index).click();
        }
    }

    public int getNthProductQuantity(int index) {
        return Integer.parseInt(productQuantityInputs.get(index).getAttribute("value"));
    }
}


