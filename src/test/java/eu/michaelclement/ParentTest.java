package eu.michaelclement;

import eu.michaelclement.page.LoginPageController;
import eu.michaelclement.util.DriverFactory;
import eu.michaelclement.util.DriverType;
import eu.michaelclement.util.URLs;
import eu.michaelclement.util.UrlReader;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ParentTest {
    protected final WebDriver driver = DriverFactory.getDriver(DriverType.CHROME);
    protected final LoginPageController loginPageController = new LoginPageController(driver);
    protected final SoftAssertions softAssertions = new SoftAssertions();

    @BeforeEach
    public void setUp() {
        driver.manage().window().maximize();
    }

    protected void openLoginPage() {
        driver.get(UrlReader.getUrl(URLs.LOGIN));
    }

    @AfterEach
    public void tearDown() {
        driver.close();
        softAssertions.assertAll();
    }
}
