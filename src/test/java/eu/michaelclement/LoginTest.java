package eu.michaelclement;

import eu.michaelclement.util.URLs;
import eu.michaelclement.util.UrlReader;
import eu.michaelclement.util.UserFactory;
import eu.michaelclement.util.UserType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends ParentTest {
    @Test
    public void testLogin() {
        openLoginPage();
        loginPageController.login(UserFactory.getUser(UserType.VALID_USER));
        Assertions.assertEquals(UrlReader.getUrl(URLs.PRODUCTS), driver.getCurrentUrl());
    }
}
