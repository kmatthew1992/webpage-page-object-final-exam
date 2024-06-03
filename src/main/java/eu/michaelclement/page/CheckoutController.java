package eu.michaelclement.page;

import org.openqa.selenium.WebDriver;

public class CheckoutController extends CheckoutElements {
    public CheckoutController(WebDriver driver) {
        super(driver);
    }

    public CheckoutController fillFirstNameField(String input) {
        firstNameField.sendKeys(input);
        return this;
    }

    public CheckoutController fillLastNameField(String input) {
        lastNameField.sendKeys(input);
        return this;
    }

    public CheckoutController fillEmailAddressField(String input) {
        emailAddressField.sendKeys(input);
        return this;
    }

    public CheckoutController fillAddressLine1Field(String input) {
        addressLine1Field.sendKeys(input);
        return this;
    }

    public CheckoutController fillAddressLine2Field(String input) {
        addressLine2Field.sendKeys(input);
        return this;
    }

    public CheckoutController fillCityField(String input) {
        cityField.sendKeys(input);
        return this;
    }

    public CheckoutController selectCountry(CountryOption country) {
        countryField.click();
        countryDropdownOptions.stream().filter(e -> country.getValue().equals(e.getText())).toList().get(0).click();
        return this;
    }

    public CheckoutController fillZipCodeField(String input) {
        zipCodeField.sendKeys(input);
        return this;
    }

    public void clickSummaryButton() {
        summaryButton.click();
    }

}
