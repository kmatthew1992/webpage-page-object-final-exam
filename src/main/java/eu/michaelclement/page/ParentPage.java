package eu.michaelclement.page;

import eu.michaelclement.util.WaitHelper;
import org.openqa.selenium.WebDriver;

public abstract class ParentPage {
    protected final WaitHelper waitHelper;
    protected final WebDriver driver;

    public ParentPage(WebDriver driver) {
        this.driver = driver;
        this.waitHelper = new WaitHelper(driver);
    }
}
