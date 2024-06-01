package eu.michaelclement.page;

import org.openqa.selenium.WebDriver;

public class CheckoutController extends CheckoutElements {
    public CheckoutController(WebDriver driver) {
        super(driver);
    }

    public void fillFirstNameField(String input) {
        firstNameField.sendKeys(input);
    }

    public void fillLastNameField(String input) {
        lastNameField.sendKeys(input);
    }

    public void fillEmailAddressField(String input) {
        emailAddressField.sendKeys(input);
    }

    public void fillAddressLine1Field(String input) {
        addressLine1Field.sendKeys(input);
    }

    public void fillAddressLine2Field(String input) {
        addressLine2Field.sendKeys(input);
    }

    public void fillCityField(String input) {
        cityField.sendKeys(input);
    }

    public void selectCountry(CountryOption country) {
        countryField.click();
        countryDropdownOptions.stream().filter(e -> country.getValue().equals(e.getText())).toList().get(0).click();
    }

    public void fillZipCodeField(String input) {
        zipCodeField.sendKeys(input);
    }

    public void clickSummaryButton() {
        summaryButton.click();
    }

}
