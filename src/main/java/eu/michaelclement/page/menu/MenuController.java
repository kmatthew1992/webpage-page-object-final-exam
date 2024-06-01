package eu.michaelclement.page.menu;

import org.openqa.selenium.WebDriver;

public class MenuController extends MenuElements implements ProductsMenu {

    public MenuController(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickLogoutButton() {
        logoutButton.click();
    }

    @Override
    public void clickCartButton() {
        cartButton.click();
    }

    @Override
    public void clickContactButton() {
        contactButton.click();
    }

    @Override
    public void clickDummyButton() {
        dummyButton.click();
    }

    @Override
    public void clickProductsButton() {
        productsButton.click();
    }
}
