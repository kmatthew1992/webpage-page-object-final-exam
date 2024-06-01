package eu.michaelclement;

import eu.michaelclement.page.*;
import eu.michaelclement.page.menu.MenuController;
import eu.michaelclement.util.UserFactory;
import eu.michaelclement.util.UserType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderDetailsTest extends ParentTest{

    private final ProductsPageController productsPageController = new ProductsPageController(driver);
    ShoppingCartController shoppingCartController = new ShoppingCartController(driver);
    MenuController menuController = new MenuController(driver);
    CheckoutController checkoutController = new CheckoutController(driver);
    SummaryPageController summaryPageController = new SummaryPageController(driver);

    @Test
    public void testOrderDetailsFields() {
        openLoginPage();
        loginPageController.login(UserFactory.getUser(UserType.VALID_USER));
        productsPageController.addNthProductQuantity(3, 1);
        menuController.clickCartButton();
        shoppingCartController.clickCheckoutButton();
        checkoutController.fillFirstNameField("Elek");
        checkoutController.fillLastNameField("Teszt");
        checkoutController.fillEmailAddressField("tesztelek@teszt.hu");
        checkoutController.fillAddressLine1Field("Futrinka utca 1.");
        checkoutController.fillAddressLine2Field("Fsz. 2.A.");
        checkoutController.fillCityField("MTV");
        checkoutController.selectCountry(CountryOption.HUNGARY);
        checkoutController.fillZipCodeField("1234");
        checkoutController.clickSummaryButton();

        /*Assertions.assertEquals("Contact Details", summaryPageController.getHeaderText() );*/

    }
}
