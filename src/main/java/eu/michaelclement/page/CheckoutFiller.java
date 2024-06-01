package eu.michaelclement.page;


import org.openqa.selenium.WebDriver;

public class CheckoutFiller {

    private WebDriver driver;
    private final CheckoutController checkoutController = new CheckoutController(driver);

    public CheckoutFiller(WebDriver driver) {
    }

    public void fillCheckoutForm(
            String firstName,
            String lastName,
            String email,
            String addressLine1,
            String addressLine2,
            String city,
            CountryOption country,
            String zipCode
    ) {
        checkoutController.fillFirstNameField(firstName);
        checkoutController.fillLastNameField(lastName);
        checkoutController.fillEmailAddressField(email);
        checkoutController.fillAddressLine1Field(addressLine1);
        checkoutController.fillAddressLine2Field(addressLine2);
        checkoutController.fillCityField(city);
        checkoutController.selectCountry(country);
        checkoutController.fillZipCodeField(zipCode);
    }
    }


