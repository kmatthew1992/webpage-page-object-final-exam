package eu.michaelclement;

import eu.michaelclement.page.*;
import eu.michaelclement.page.menu.MenuController;
import eu.michaelclement.util.AdminFactory;
import eu.michaelclement.util.AdminType;
import eu.michaelclement.util.UserFactory;
import eu.michaelclement.util.UserType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class ExamTest extends ParentTest {
    private final AdminPageController adminPageController = new AdminPageController(driver);
    private final CookieController cookieController = new CookieController(driver);
    private final MenuController menuController = new MenuController(driver);
    private final LoginPageController loginPageController = new LoginPageController(driver);
    private final ProductsPageController productsPageController = new ProductsPageController(driver);
    private final ShoppingCartController shoppingCartController = new ShoppingCartController(driver);
    private final CheckoutController checkoutController = new CheckoutController(driver);
    private final SummaryPageController summaryPageController = new SummaryPageController(driver);

    @Test
    public void testWebpage() {
        openLoginPage();
        loginPageController.adminLogin(AdminFactory.getAdmin(AdminType.VALID_ADMIN));
        cookieController.clickCookieButton();
        adminPageController.clickProductAddButton();
        adminPageController.fillProductNameInput("Máté 1 termék");
        adminPageController.fillProductDescriptionInput("jó");
        adminPageController.fillProductPriceInput("10");
        adminPageController.clickProductSaveButton();
        adminPageController.clickProductAddButton();
        adminPageController.fillSecondProductNameInput("Máté 2 termék");
        adminPageController.fillSecondProductDescriptionInput("tökéletes");
        adminPageController.fillSecondProductPriceInput("20");
        adminPageController.clickProductSaveButton();
        menuController.clickLogoutButton();
        loginPageController.login(UserFactory.getUser(UserType.VALID_USER));
        productsPageController.addNthProductQuantity(0, 1);
        productsPageController.addNthProductQuantity(1, 1);
        menuController.clickCartButton();
        shoppingCartController.clickCheckoutButton();
        checkoutController.fillFirstNameField("Kőszegi")
                .fillLastNameField("Máté")
                .fillEmailAddressField("valami@valami.hu")
                .fillAddressLine1Field("Valami utca")
                .fillAddressLine2Field("8.")
                .fillCityField("Budapest")
                .selectCountry(CountryOption.HUNGARY)
                .fillZipCodeField("1234")
                .clickSummaryButton();
        Assertions.assertEquals("Kőszegi", summaryPageController.getDataTexts().get(0));
        Assertions.assertEquals("Máté", summaryPageController.getDataTexts().get(1));
        Assertions.assertEquals("valami@valami.hu", summaryPageController.getDataTexts().get(2));
        Assertions.assertEquals("Valami utca", summaryPageController.getDataTexts().get(3));
        Assertions.assertEquals("8.", summaryPageController.getDataTexts().get(4));
        Assertions.assertEquals("Budapest", summaryPageController.getDataTexts().get(5));
        Assertions.assertEquals("Hungary", summaryPageController.getDataTexts().get(6));
        Assertions.assertEquals("1234", summaryPageController.getDataTexts().get(7));
        Assertions.assertEquals("Máté 1 termék", summaryPageController.getProductNameTexts().get(0));
        Assertions.assertEquals("Máté 2 termék", summaryPageController.getProductNameTexts().get(1));
        Assertions.assertEquals("1", summaryPageController.getProductQuantity().get(0));
        Assertions.assertEquals("1", summaryPageController.getProductQuantity().get(1));
        Assertions.assertEquals("$10", summaryPageController.getProductPrice().get(0));
        Assertions.assertEquals("$20", summaryPageController.getProductPrice().get(1));
        Assertions.assertEquals("$10", summaryPageController.getProductTotalPrice().get(0));
        Assertions.assertEquals("$20", summaryPageController.getProductTotalPrice().get(1));
        Assertions.assertEquals("$30", summaryPageController.getTotalPrice().getFirst());
        summaryPageController.clickOrderButton();
        Assertions.assertEquals("Thank you for your order!", summaryPageController.getOrderEndingMessage().getFirst());
    }
}
