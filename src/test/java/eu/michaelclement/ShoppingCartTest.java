package eu.michaelclement;

import eu.michaelclement.page.CheckoutController;
import eu.michaelclement.page.CountryOption;
import eu.michaelclement.page.ProductsPageController;
import eu.michaelclement.page.ShoppingCartController;
import eu.michaelclement.page.menu.MenuController;
import eu.michaelclement.util.UserFactory;
import eu.michaelclement.util.UserType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartTest extends ParentTest {
    private final ProductsPageController productsPageController = new ProductsPageController(driver);
    private final ShoppingCartController shoppingCartController = new ShoppingCartController(driver);
    private final MenuController menuController = new MenuController(driver);

    @Test
    public void testShoppingCartQuantities() {
        openLoginPage();
        loginPageController.login(UserFactory.getUser(UserType.VALID_USER));
        productsPageController.addNthProductQuantity(1, 2);
        productsPageController.increaseNthProductQuantityTimes(2, 1);
        menuController.clickCartButton();
        Assertions.assertEquals(2, shoppingCartController.getCartProductCount());
        softAssertions.assertThat(shoppingCartController.getProductNameTexts().get(0)).isEqualTo("Michael's Mug");
        softAssertions.assertThat(shoppingCartController.getProductNameTexts().get(1)).isEqualTo("Michael's Notebook");
        softAssertions.assertThat(shoppingCartController.getProductQuantities().get(0)).isEqualTo(2);
        softAssertions.assertThat(shoppingCartController.getProductQuantities().get(1)).isEqualTo(1);
    }

    @Test
    public void testInCartQuantities() {
        openLoginPage();
        loginPageController.login(UserFactory.getUser(UserType.VALID_USER));
        productsPageController.increaseNthProductQuantityTimes(1, 2);
        productsPageController.addNthProductQuantity(2, 3);
        productsPageController.increaseNthProductQuantityTimes(3, 1);
        menuController.clickCartButton();
        shoppingCartController.clickNthProductIncreaseQuantityButtonTimes(0, 1);
        shoppingCartController.clickNthProductDecreaseQuantityButtonTimes(1, 2);
        menuController.clickProductsButton();
        softAssertions.assertThat(productsPageController.getNthProductQuantity(0)).isEqualTo(0);
        softAssertions.assertThat(productsPageController.getNthProductQuantity(1)).isEqualTo(0);
        softAssertions.assertThat(productsPageController.getNthProductQuantity(2)).isEqualTo(3);
        softAssertions.assertThat(productsPageController.getNthProductQuantity(3)).isEqualTo(2);

    }

}
