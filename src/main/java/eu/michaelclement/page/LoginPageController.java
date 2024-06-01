package eu.michaelclement.page;

import eu.michaelclement.util.Admin;
import eu.michaelclement.util.User;
import org.openqa.selenium.WebDriver;

public class LoginPageController extends LoginPageElements {
    public LoginPageController(WebDriver driver) {
        super(driver);
    }

    private void fillUsernameField(String username) {
        waitHelper.fillTextField(usernameField, username);
    }

    private void fillPasswordField(String password) {
        waitHelper.fillTextField(passwordField, password);
    }

    public void clickLoginButton() {
        waitHelper.clickElement(loginButton);
    }

    public void login(User user) {
        fillUsernameField(user.getUsername());
        fillPasswordField(user.getPassword());
        clickLoginButton();
    }
    public void adminLogin(Admin admin){
        fillUsernameField(admin.getUsername());
        fillPasswordField(admin.getPassword());
        clickLoginButton();
    }
}
