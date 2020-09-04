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

    @BeforeMethod
    public void clearBrowserCache(){
        driver.manage().deleteAllCookies();
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
    public void testValidateNissanMaxima2016IsAdded() {
        getAQuote.addNissanMaxima();
        getAQuote.validateNissanMaxima2016IsAdded();
    }

    /**
     * This test validates that user is able to add a vehicle (Nissan Maxima 2007) with a VIN number.
     */
    @Test
    public void testValidateNissanMaxima2007IsAddedWithVIN() throws InterruptedException {
        getAQuote.addNissanMaxima2007WithVIN();
        getAQuote.validateNissanMaxima2007IsAddedWithVIN();
    }

    /**
     * This test validates that after deselecting a vehicle and attempting to go to the next step, user will get an
     * alert message, "OOPS! We'll need you to select at least one of your vehicles or add a new one so we can
     * continue with your quote".
     */
    @Test
    public void testValidateDeselectNissanMaxima2007() throws InterruptedException {
        getAQuote.deselectNissanMaxima2007();
        getAQuote.validateDeselectNissanMaxima2007();
    }

    /**
     * This test validates that user is able get a confirmation message after adding a vehicle. The confirmation message
     * does not always appear. In such event, the user is navigated to the 'Your Vehicles' page. Therefore, this method employs
     * two possible assertions.
     */
    @Test
    public void testValidateAddNissanMaxima2007WithVINConfirmation() throws InterruptedException {
        getAQuote.addNissanMaxima2007WithVINConfirmation();
        getAQuote.validateAddNissanMaxima2007WithVINConfirmation();
    }

    /**
     * This test validates that user can fill out 'About You' form and can proceed to 'Your Vehicles' page.
     */
    @Test
    public void testValidateAddVehicleAndGoToYourVehiclePage() throws InterruptedException {
        getAQuote.addVehicleAndGoToYourVehiclePage();
        getAQuote.validateAddVehicleAndGoToYourVehiclePage();

    }
}
