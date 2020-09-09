package getAQuoteHome;

import base.CommonAPI;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class GetAQuoteHomeTest extends CommonAPI {

    GetAQuoteHome getAQuoteHome;

    @BeforeMethod
    public void getInit(){
        getAQuoteHome = PageFactory.initElements(driver, GetAQuoteHome.class);
    }

    @BeforeMethod
    public void maximizeWindow(){
        driver.manage().window().maximize();
    }

    /**
     * This test validates that user can navigate to 'Home & Condo Quote' page by URL.
     */
    @Test
    public void testValidateHomeAndCondoQuoteByURL() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getAQuoteHome.homeAndCondoQuote();
        getAQuoteHome.validateHomeAndCondoQuoteByURL();
    }

    /**
     * This test validates that the error 'Please enter a valid first name' is displayed when user do not fill out
     * the first name field when attempting to fill out the 'About You' form in 'Get a Quote' for 'Home & Condo' page.
     */
    @Test
    public void testValidateFillOutAboutYouPageWithoutFirstName() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getAQuoteHome.fillOutAboutYouPageWithoutFirstName();
        getAQuoteHome.validateFillOutAboutYouPageWithoutFirstName();
    }

    /**
     * This test validates that the error 'Please enter a valid last name' is displayed when user do not fill out
     * the last name field when attempting to fill out the 'About You' form in 'Get a Quote' for 'Home & Condo' page.
     */
    @Test
    public void testValidateFillOutAboutYouPageWithoutLastName() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getAQuoteHome.fillOutAboutYouPageWithoutLastName();
        getAQuoteHome.validateFillOutAboutYouPageWithoutLastName();
    }

    /**
     * This test validates that the error 'Please enter your date of birth' is displayed when user do not fill out
     * the Date of Birth field when attempting to fill out the 'About You' form in 'Get a Quote' for 'Home & Condo' page.
     */
    @Test
    public void testValidateFillOutAboutYouPageWithoutDateOfBirth() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getAQuoteHome.fillOutAboutYouPageWithoutDateOfBirth();
        getAQuoteHome.validateFillOutAboutYouPageWithoutDateOfBirth();
    }

    /**
     * This test validates that the error 'Please select a gender' is displayed when user do not select a gender
     * when attempting to fill out the 'About You' form in 'Get a Quote' for 'Home & Condo' page.
     */
    @Test
    public void testValidateFillOutAboutYouPageWithoutGender() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getAQuoteHome.fillOutAboutYouPageWithoutGender();
        getAQuoteHome.validateFillOutAboutYouPageWithoutGender();
    }

    /**
     * This test validates that the error 'Please select a marital status' is displayed when user do not select an option
     * from teh Marital Status dropdown menu when attempting to fill out the 'About You' form in
     *'Get a Quote' for 'Home & Condo' page.
     */
    @Test
    public void testValidateFillOutAboutYouPageWithoutMaritalStatus() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getAQuoteHome.fillOutAboutYouPageWithoutMaritalStatus();
        getAQuoteHome.validateFillOutAboutYouPageWithoutMaritalStatus();
    }

    /**
     * This test validates that the error 'Please enter a valid address' is displayed when user do not fill out
     * the Address field when attempting to fill out the 'About You' form in 'Get a Quote' for 'Home & Condo' page.
     */
    @Test
    public void testValidateFillOutAboutYouPageWithoutAddress() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getAQuoteHome.fillOutAboutYouPageWithoutAddress();
        getAQuoteHome.validateFillOutAboutYouPageWithoutAddress();
    }

    /**
     * This test validates that the error 'Please select a value' is displayed when user do not select either Yes or No
     * when asked "Is this your mailing address?" when attempting to fill out the 'About You' form in
     * 'Get a Quote' for 'Home & Condo' page.
     */
    @Test
    public void testValidateFillOutAboutYouPageWithoutConfirmingMailingAddress() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getAQuoteHome.fillOutAboutYouPageWithoutConfirmingMailingAddress();
        getAQuoteHome.validateFillOutAboutYouPageWithoutConfirmingMailingAddress();
    }

    /**
     * This test verifies that 'About You' form is submitted with URL.
     * @throws InterruptedException
     */
    @Test
    public void testVerifyFillOutAboutYouPage() throws InterruptedException {
        getAQuoteHome.fillOutAboutYouPage();
        getAQuoteHome.verifyFillOutAboutYouPage();
    }
}
