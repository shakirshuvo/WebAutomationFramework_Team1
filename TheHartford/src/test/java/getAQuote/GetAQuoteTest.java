package getAQuote;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetAQuoteTest extends CommonAPI {

    GetAQuote getAQuote;

    @BeforeMethod
    public void getInit(){
        getAQuote = PageFactory.initElements(driver, GetAQuote.class);
    }

    @BeforeMethod
    public void maximizeWindow(){
        driver.manage().window().maximize();
    }

    /**
     * This test validates that the user can enter a zip code from the homepage and be able to navigate to 'About You' form page
     * using URL.
     * @throws InterruptedException
     */
    @Test
    public void testValidateStartQuote() throws InterruptedException {
        getAQuote.startQuote();
        getAQuote.validateStartQuote();
    }

    /**
     * This test validates that the user can fill out 'About You' form. After filling out the form, the user should be able to see
     * 'Need Help? 1-800-333-9238'on the following page.
     * @throws InterruptedException
     */
    @Test
    public void testFillOutAboutYou() {
        getAQuote.fillOutAboutYou();
        getAQuote.validateAddVehiclePopUpIsDisplayed();
    }

    /**
     * This test validates that "Please enter a valid first name" alert is triggered for not entering a first name
     * when filling out the 'About You' form.
     */
    @Test
    public void testValidatePleaseEnterAValidFirstNameAlert() {
        getAQuote.pleaseEnterAValidFirstNameAlert();
        getAQuote.validatePleaseEnterAValidFirstNameAlert();
    }

    /**
     * This test validates that "Please enter a valid first name" alert is triggered for not entering a last name
     * when filling out the 'About You' form.
     */
    @Test
    public void testValidatePleaseEnterAValidLastNameAlert() {
        getAQuote.pleaseEnterAValidLastNameAlert();
        getAQuote.validatePleaseEnterAValidLastNameAlert();
    }

    /**
     * This test validates that "Please enter a valid first name" alert is triggered for not entering a valid address
     * when filling out the 'About You' form.
     */
    @Test
    public void testValidatePleaseEnterAValidAddressAlert() {
        getAQuote.pleaseEnterAValidAddressAlert();
        getAQuote.validatePleaseEnterAValidAddressAlert();
    }

    /**
     * This test validates that "Please enter your date of birth" alert is triggered for not entering a valid date of birth
     * when filling out the 'About You' form.
     */
    @Test
    public void testValidatePleaseEnterYourDateOfBirthAlert() {
        getAQuote.pleaseEnterYourDateOfBirthAlert();
        getAQuote.validatePleaseEnterYourDateOfBirthAlert();
    }

    /**
     * This test validates that user is able to add Nissan Maxima 2016 for a quote.
     */
    @Test
    public void testValidate1016NissanMaximaIsAdded() {
        getAQuote.addNissanMaxima();
        getAQuote.validateNissanMaximaIsAdded();
    }
}
