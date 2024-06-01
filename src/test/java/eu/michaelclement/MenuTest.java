package eu.michaelclement;

import eu.michaelclement.page.menu.AdminMenu;
import eu.michaelclement.page.menu.MenuController;
import eu.michaelclement.page.menu.ProductsMenu;
import eu.michaelclement.page.menu.WebshopMenu;
import eu.michaelclement.util.URLs;
import eu.michaelclement.util.UrlReader;
import eu.michaelclement.util.UserFactory;
import eu.michaelclement.util.UserType;
import org.junit.jupiter.api.Test;

public class MenuTest extends ParentTest {
    private final AdminMenu adminMenu = new MenuController(driver);
    private final WebshopMenu webshopMenu = new MenuController(driver);
    private final ProductsMenu productsMenu = new MenuController(driver);

    @Test
    public void testWebshopMenu() {
        openLoginPage();
        loginPageController.login(UserFactory.getUser(UserType.VALID_USER));
        productsMenu.clickContactButton();
        softAssertions.assertThat(driver.getCurrentUrl()).isEqualTo(UrlReader.getUrl(URLs.CONTACT));
        webshopMenu.clickProductsButton();
        softAssertions.assertThat(driver.getCurrentUrl()).isEqualTo(UrlReader.getUrl(URLs.PRODUCTS));
        productsMenu.clickCartButton();
        softAssertions.assertThat(driver.getCurrentUrl()).isEqualTo(UrlReader.getUrl(URLs.CART));
    }
}
