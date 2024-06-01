package eu.michaelclement.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SummaryPageController extends SummaryPageElements {
    public SummaryPageController(WebDriver driver) {
        super(driver);
    }
    public List<String> getDataTexts() {
        waitHelper.getWait().until(d -> !personalDataTexts.isEmpty());
        List<String> productNameList = new ArrayList<>();
        for (WebElement productName : personalDataTexts) {
            productNameList.add(productName.getText());
        }
        return productNameList;
    }
    public List<String> getProductNameTexts() {
        waitHelper.getWait().until(d -> !productNameTexts.isEmpty());
        List<String> productNameList = new ArrayList<>();
        for (WebElement productName : productNameTexts) {
            productNameList.add(productName.getText());
        }
        return productNameList;
    }
    public List<String> getProductQuantity() {
        waitHelper.getWait().until(d -> !productQuantity.isEmpty());
        List<String> productNameList = new ArrayList<>();
        for (WebElement productName : productQuantity) {
            productNameList.add(productName.getText());
        }
        return productNameList;
    }
    public List<String> getProductPrice() {
        waitHelper.getWait().until(d -> !productPrice.isEmpty());
        List<String> productNameList = new ArrayList<>();
        for (WebElement productName : productPrice) {
            productNameList.add(productName.getText());
        }
        return productNameList;
    }
    public List<String> getProductTotalPrice() {
        waitHelper.getWait().until(d -> !productTotalPrice.isEmpty());
        List<String> productNameList = new ArrayList<>();
        for (WebElement productName : productTotalPrice) {
            productNameList.add(productName.getText());
        }
        return productNameList;
    }
    public List<String> getTotalPrice() {
        waitHelper.getWait().until(d -> !totalPrice.isEmpty());
        List<String> productNameList = new ArrayList<>();
        for (WebElement productName : totalPrice) {
            productNameList.add(productName.getText());
        }
        return productNameList;
    }

    public void clickOrderButton() {orderButton.click();}
    public List<String> getOrderEndingMessage() {
        waitHelper.getWait().until(d -> !orderEndingMessage.isEmpty());
        List<String> productNameList = new ArrayList<>();
        for (WebElement productName : orderEndingMessage) {
            productNameList.add(productName.getText());
        }
        return productNameList;
    }

}
