package getAQuoteAuto;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetAQuoteAutoTest extends CommonAPI {

    GetAQuoteAuto getAQuoteAuto;

    @BeforeMethod
    public void getInit(){
        getAQuoteAuto = PageFactory.initElements(driver, GetAQuoteAuto.class);
    }

    @BeforeMethod
    public void maximizeWindow(){
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void clearBrowserCache(){
        driver.manage().deleteAllCookies();
    }

    /**
     * This test  validates that an alert 'Enter five-digit zip code' is triggered
     * when user does not provide a Zip Code and tries to proceed to Quote.
     */
    @Test
    public void testValidateQuoteWithoutZipCode()  {
        getAQuoteAuto.quoteWithoutZipCode();
        getAQuoteAuto.validateQuoteWithoutZipCode();
    }

    /**
     * This test validates that the user can enter a zip code from the homepage and be able to navigate to 'About You' form page
     * using URL.
     * @throws InterruptedException
     */
    @Test
    public void testValidateStartQuote() throws InterruptedException {
        getAQuoteAuto.startQuote();
        getAQuoteAuto.validateStartQuote();
    }

    /**
     * This test validates that the user can fill out 'About You' form. After filling out the form, the user should be able to see
     * 'Need Help? 1-800-333-9238'on the following page.
     * @throws InterruptedException
     */
    @Test
    public void testFillOutAboutYou() {
        getAQuoteAuto.fillOutAboutYou();
        getAQuoteAuto.validateAddVehiclePopUpIsDisplayed();
    }

    /**
     * This test validates that "Please enter a valid first name" alert is triggered for not entering a first name
     * when filling out the 'About You' form.
     */
    @Test
    public void testValidatePleaseEnterAValidFirstNameAlert() {
        getAQuoteAuto.pleaseEnterAValidFirstNameAlert();
        getAQuoteAuto.validatePleaseEnterAValidFirstNameAlert();
    }

    /**
     * This test validates that "Please enter a valid first name" alert is triggered for not entering a last name
     * when filling out the 'About You' form.
     */
    @Test
    public void testValidatePleaseEnterAValidLastNameAlert() {
        getAQuoteAuto.pleaseEnterAValidLastNameAlert();
        getAQuoteAuto.validatePleaseEnterAValidLastNameAlert();
    }

    /**
     * This test validates that "Please enter a valid first name" alert is triggered for not entering a valid address
     * when filling out the 'About You' form.
     */
    @Test
    public void testValidatePleaseEnterAValidAddressAlert() {
        getAQuoteAuto.pleaseEnterAValidAddressAlert();
        getAQuoteAuto.validatePleaseEnterAValidAddressAlert();
    }

    /**
     * This test validates that "Please enter your date of birth" alert is triggered for not entering a valid date of birth
     * when filling out the 'About You' form.
     */
    @Test
    public void testValidatePleaseEnterYourDateOfBirthAlert() {
        getAQuoteAuto.pleaseEnterYourDateOfBirthAlert();
        getAQuoteAuto.validatePleaseEnterYourDateOfBirthAlert();
    }

    /**
     * This test validates that user is able to add Nissan Maxima 2016 for a quote.
     */
    @Test
    public void testValidateNissanMaxima2016IsAdded() {
        getAQuoteAuto.addNissanMaxima();
        getAQuoteAuto.validateNissanMaxima2016IsAdded();
    }

    /**
     * This test validates that user is able to add a vehicle (Nissan Maxima 2007) with a VIN number.
     */
    @Test
    public void testValidateNissanMaxima2007IsAddedWithVIN() throws InterruptedException {
        getAQuoteAuto.addNissanMaxima2007WithVIN();
        getAQuoteAuto.validateNissanMaxima2007IsAddedWithVIN();
    }

    /**
     * This test validates that after deselecting a vehicle and attempting to go to the next step, user will get an
     * alert message, "OOPS! We'll need you to select at least one of your vehicles or add a new one so we can
     * continue with your quote".
     */
    @Test
    public void testValidateDeselectNissanMaxima2007() throws InterruptedException {
        getAQuoteAuto.deselectNissanMaxima2007();
        getAQuoteAuto.validateDeselectNissanMaxima2007();
    }

    /**
     * This test validates that user is able get a confirmation message after adding a vehicle. The confirmation message
     * does not always appear. In such event, the user is navigated to the 'Your Vehicles' page. Therefore, this method employs
     * two possible assertions.
     */
    @Test
    public void testValidateAddNissanMaxima2007WithVINConfirmation() throws InterruptedException {
        getAQuoteAuto.addNissanMaxima2007WithVINConfirmation();
        getAQuoteAuto.validateAddNissanMaxima2007WithVINConfirmation();
    }

    /**
     * This test validates that user can fill out 'About You' form and can proceed to 'Your Vehicles' page.
     */
    @Test
    public void testValidateAddVehicleAndGoToYourVehiclePage() throws InterruptedException {
        getAQuoteAuto.addVehicleAndGoToYourVehiclePage();
        getAQuoteAuto.validateAddVehicleAndGoToYourVehiclePage();
    }

}
