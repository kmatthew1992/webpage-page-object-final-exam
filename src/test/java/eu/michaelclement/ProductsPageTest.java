package eu.michaelclement;

import eu.michaelclement.page.ProductsPageController;
import eu.michaelclement.util.UserFactory;
import eu.michaelclement.util.UserType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductsPageTest extends ParentTest {
    private final ProductsPageController productsPageController = new ProductsPageController(driver);

    @Test
    public void testSearch() {
        openLoginPage();
        loginPageController.login(UserFactory.getUser(UserType.VALID_USER));
        productsPageController.fillSearchField("Mug");
        Assertions.assertEquals(1, productsPageController.getProductCount());
        Assertions.assertEquals("Michael's Mug", productsPageController.getProductTitleTexts().get(0));
    }

    @Test
    public void testFilter() {
        driver.get("https://www.michaelclement.eu/practice-webshop-login/");
        loginPageController.login(UserFactory.getUser(UserType.VALID_USER));
        productsPageController.fillMinPriceFilterField(11);
        productsPageController.fillMaxPriceFilterField(15);
        Assertions.assertEquals(2, productsPageController.getProductCount());
        Assertions.assertEquals("Michael's Cap", productsPageController.getProductTitleTexts().get(0));
        Assertions.assertEquals("Michael's Notebook", productsPageController.getProductTitleTexts().get(1));
    }
}
