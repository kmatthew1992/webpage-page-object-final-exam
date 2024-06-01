package eu.michaelclement.page;

import org.openqa.selenium.WebDriver;

public class CookieController extends CookieElement{

    public CookieController(WebDriver driver) { super(driver); }
    public void clickCookieButton() {waitHelper.clickElement(cookieButton);}
}
