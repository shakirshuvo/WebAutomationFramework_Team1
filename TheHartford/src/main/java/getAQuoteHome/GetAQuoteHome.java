package getAQuoteHome;

import base.CommonAPI;
import org.testng.Assert;

import static getAQuoteHome.GetAQuoteHomeWebElements.*;

public class GetAQuoteHome extends CommonAPI {


    /**
     * This method navigates user to 'Home & Condo
     */
    public void homeAndCondoQuote() {
        clickOnElement(homeAndCondoButtonXpathWebElement);
        typeOnElementNEnter(homeAndCondoZipCodeField, vaZipCode);
    }

    /**
     * This method validates 'Home & Condo Quote' page by URL.
     */
    public void validateHomeAndCondoQuoteByURL() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(getCurrentPageUrl(), homeAndCondoAboutYouURL);
    }

    /**
     * This method attempts to fill out the 'About You' form in 'Get a Quote' for 'Home & Condo' page without providing a first name.
     * The user will not be able to submit the form as it requires user to enter a first name. Thus, an error will be displayed,
     *'Please enter a valid first name'.
     */
    public void fillOutAboutYouPageWithoutFirstName(){
        clickOnElement(homeAndCondoButtonXpathWebElement);
        typeOnElementNEnter(homeAndCondoZipCodeField, vaZipCode);
        typeOnElement(homeAndCondoAboutYouLastNameCSSWebElement, randomLastName);
        typeOnElement(homeAndCondoAboutYouDateOfBirthCSSWebElement, dateOfBirth);
        clickOnElement(homeAndCondoAboutYouRadioMaleXpathWebElement);
        selectOptionByValue(homeAndCondoAboutYouMaritalStatusDropdownCSSWebElement, "string:S");
        typeOnElement(homeAndCondoAboutYouAddressCSSWebElement, pntVAStreetAddress);
        clickOnElement(homeAndCondoAboutYouIsThisYourMailingAddressRadioYesXpathWebElement);
        clickOnElement(continueButtonIDWebElement);
    }

    /**
     * This method validates that the error 'Please enter a valid first name' is displayed when user do not fill out
     * the first name field when attempting to fill out the 'About You' form in 'Get a Quote' for 'Home & Condo' page.
     */
    public void validateFillOutAboutYouPageWithoutFirstName(){
        Assert.assertTrue(elementIsDisplayed(pleaseEnterAValidFirstNameAlertXpathWebElement));
    }

    /**
     * This method attempts to fill out the 'About You' form in 'Get a Quote' for 'Home & Condo' page without providing a last name.
     * The user will not be able to submit the form as it requires user to enter a last name. Thus, an error will be displayed,
     *'Please enter a valid last name'.
     */
    public void fillOutAboutYouPageWithoutLastName(){
        clickOnElement(homeAndCondoButtonXpathWebElement);
        typeOnElementNEnter(homeAndCondoZipCodeField, vaZipCode);
        typeOnElement(homeAndCondoAboutYouFirstNameCSSWebElement, randomFirstName);
        typeOnElement(homeAndCondoAboutYouDateOfBirthCSSWebElement, dateOfBirth);
        clickOnElement(homeAndCondoAboutYouRadioMaleXpathWebElement);
        selectOptionByValue(homeAndCondoAboutYouMaritalStatusDropdownCSSWebElement, "string:S");
        typeOnElement(homeAndCondoAboutYouAddressCSSWebElement, pntVAStreetAddress);
        clickOnElement(homeAndCondoAboutYouIsThisYourMailingAddressRadioYesXpathWebElement);
        clickOnElement(continueButtonIDWebElement);
    }

    /**
     * This method validates that the error 'Please enter a valid last name' is displayed when user do not fill out
     * the last name field when attempting to fill out the 'About You' form in 'Get a Quote' for 'Home & Condo' page.
     */
    public void validateFillOutAboutYouPageWithoutLastName(){
        Assert.assertTrue(elementIsDisplayed(pleaseEnterAValidLastNameAlertXpathWebElement));
    }

    /**
     * This method attempts to fill out the 'About You' form in 'Get a Quote' for 'Home & Condo' page without providing a date of birth.
     * The user will not be able to submit the form as it requires user to enter a date of birth. Thus, an error will be displayed,
     *'Please enter a valid last name'.
     */
    public void fillOutAboutYouPageWithoutDateOfBirth(){
        clickOnElement(homeAndCondoButtonXpathWebElement);
        typeOnElementNEnter(homeAndCondoZipCodeField, vaZipCode);
        typeOnElement(homeAndCondoAboutYouFirstNameCSSWebElement, randomFirstName);
        typeOnElement(homeAndCondoAboutYouLastNameCSSWebElement, randomLastName);
        clickOnElement(homeAndCondoAboutYouRadioMaleXpathWebElement);
        selectOptionByValue(homeAndCondoAboutYouMaritalStatusDropdownCSSWebElement, "string:S");
        typeOnElement(homeAndCondoAboutYouAddressCSSWebElement, pntVAStreetAddress);
        clickOnElement(homeAndCondoAboutYouIsThisYourMailingAddressRadioYesXpathWebElement);
        clickOnElement(continueButtonIDWebElement);
    }

    /**
     * This method validates that the error 'Please enter your date of birth' is displayed when user do not fill out
     * the Date of Birth field when attempting to fill out the 'About You' form in 'Get a Quote' for 'Home & Condo' page.
     */
    public void validateFillOutAboutYouPageWithoutDateOfBirth(){
        Assert.assertTrue(elementIsDisplayed(pleaseEnterYourDateOfBirthAlertXpathWebElement));
    }

    /**
     * This method attempts to fill out the 'About You' form in 'Get a Quote' for 'Home & Condo' page without selecting a gender.
     * The user will not be able to submit the form as it requires user to choose either Male or Female from the radio button.
     * Thus, an error will be displayed, 'Please select a gender'.
     */
    public void fillOutAboutYouPageWithoutGender(){
        clickOnElement(homeAndCondoButtonXpathWebElement);
        typeOnElementNEnter(homeAndCondoZipCodeField, vaZipCode);
        typeOnElement(homeAndCondoAboutYouFirstNameCSSWebElement, randomFirstName);
        typeOnElement(homeAndCondoAboutYouLastNameCSSWebElement, randomLastName);
        typeOnElement(homeAndCondoAboutYouDateOfBirthCSSWebElement, dateOfBirth);
        selectOptionByValue(homeAndCondoAboutYouMaritalStatusDropdownCSSWebElement, "string:S");
        typeOnElement(homeAndCondoAboutYouAddressCSSWebElement, pntVAStreetAddress);
        clickOnElement(homeAndCondoAboutYouIsThisYourMailingAddressRadioYesXpathWebElement);
        clickOnElement(continueButtonIDWebElement);
    }

    /**
     * This method validates that the error 'Please select a gender' is displayed when user do not select a gender.
     * when attempting to fill out the 'About You' form in 'Get a Quote' for 'Home & Condo' page.
     */
    public void validateFillOutAboutYouPageWithoutGender(){
        Assert.assertTrue(elementIsDisplayed(pleaseSelectAGenderAlertXpathWebElement));
    }

    /**
     * This method attempts to fill out the 'About You' form in 'Get a Quote' for 'Home & Condo' page without selecting
     * a Marital Status from the dropdown menu. The user will not be able to submit the form as it requires user to
     * choose an option from the dropdown menu. Thus, an error will be displayed, 'Please select a marital status'.
     */
    public void fillOutAboutYouPageWithoutMaritalStatus(){
        clickOnElement(homeAndCondoButtonXpathWebElement);
        typeOnElementNEnter(homeAndCondoZipCodeField, vaZipCode);
        typeOnElement(homeAndCondoAboutYouFirstNameCSSWebElement, randomFirstName);
        typeOnElement(homeAndCondoAboutYouLastNameCSSWebElement, randomLastName);
        typeOnElement(homeAndCondoAboutYouDateOfBirthCSSWebElement, dateOfBirth);
        clickOnElement(homeAndCondoAboutYouRadioMaleXpathWebElement);
        typeOnElement(homeAndCondoAboutYouAddressCSSWebElement, pntVAStreetAddress);
        clickOnElement(homeAndCondoAboutYouIsThisYourMailingAddressRadioYesXpathWebElement);
        clickOnElement(continueButtonIDWebElement);
    }

    /**
     * This method validates that the error 'Please select a marital status' is displayed when user
     * do not select an open from the Marital Status dropdown menu when attempting to fill out the
     * 'About You' form in 'Get a Quote' for 'Home & Condo' page.
     */
    public void validateFillOutAboutYouPageWithoutMaritalStatus(){
        Assert.assertTrue(elementIsDisplayed(pleaseSelectAMaritalStatusAlertXpathWebElement));
    }

    /**
     * This method attempts to fill out the 'About You' form in 'Get a Quote' for 'Home & Condo' page without providing an address.
     * The user will not be able to submit the form as it requires user to enter an address. Thus, an error will be displayed,
     *'Please enter a valid address'.
     */
    public void fillOutAboutYouPageWithoutAddress(){
        clickOnElement(homeAndCondoButtonXpathWebElement);
        typeOnElementNEnter(homeAndCondoZipCodeField, vaZipCode);
        typeOnElement(homeAndCondoAboutYouFirstNameCSSWebElement, randomFirstName);
        typeOnElement(homeAndCondoAboutYouLastNameCSSWebElement, randomLastName);
        typeOnElement(homeAndCondoAboutYouDateOfBirthCSSWebElement, dateOfBirth);
        clickOnElement(homeAndCondoAboutYouRadioMaleXpathWebElement);
        selectOptionByValue(homeAndCondoAboutYouMaritalStatusDropdownCSSWebElement, "string:S");
        clickOnElement(homeAndCondoAboutYouIsThisYourMailingAddressRadioYesXpathWebElement);
        clickOnElement(continueButtonIDWebElement);
    }

    /**
     * This method validates that the error 'Please enter a valid address' is displayed when user do not fill out
     * the Address field when attempting to fill out the 'About You' form in 'Get a Quote' for 'Home & Condo' page.
     */
    public void validateFillOutAboutYouPageWithoutAddress(){
        Assert.assertTrue(elementIsDisplayed(pleaseEnterAValidAddressAlertXpathWebElement));
    }

    /**
     * This method attempts to fill out the 'About You' form in 'Get a Quote' for 'Home & Condo' page without confirming
     * a mailing address. The user will not be able to submit the form as it requires user to choose either Yes or No
     * from the radio button. Thus, an error will be displayed, 'Please select a value'.
     */
    public void fillOutAboutYouPageWithoutConfirmingMailingAddress(){
        clickOnElement(homeAndCondoButtonXpathWebElement);
        typeOnElementNEnter(homeAndCondoZipCodeField, vaZipCode);
        typeOnElement(homeAndCondoAboutYouFirstNameCSSWebElement, randomFirstName);
        typeOnElement(homeAndCondoAboutYouLastNameCSSWebElement, randomLastName);
        typeOnElement(homeAndCondoAboutYouDateOfBirthCSSWebElement, dateOfBirth);
        clickOnElement(homeAndCondoAboutYouRadioMaleXpathWebElement);
        selectOptionByValue(homeAndCondoAboutYouMaritalStatusDropdownCSSWebElement, "string:S");
        typeOnElement(homeAndCondoAboutYouAddressCSSWebElement, pntVAStreetAddress);
        clickOnElement(continueButtonIDWebElement);
    }

    /**
     * This method validates that the error 'Please select a value' is displayed when user do not select either Yes or No
     * when asked "Is this your mailing address?" when attempting to fill out the 'About You' form in
     * 'Get a Quote' for 'Home & Condo' page.
     */
    public void validateFillOutAboutYouPageWithoutConfirmingMailingAddress(){
        Assert.assertTrue(elementIsDisplayed(pleaseSelectAValueAlertXpathWebElement));
    }

    /**
     * This method completes the 'About You' form and submits.
     */
    public void fillOutAboutYouPage(){
        clickOnElement(homeAndCondoButtonXpathWebElement);
        typeOnElementNEnter(homeAndCondoZipCodeField, vaZipCode);
        typeOnElement(homeAndCondoAboutYouFirstNameCSSWebElement, randomFirstName);
        typeOnElement(homeAndCondoAboutYouLastNameCSSWebElement, randomLastName);
        typeOnElement(homeAndCondoAboutYouDateOfBirthCSSWebElement, dateOfBirth);
        clickOnElement(homeAndCondoAboutYouRadioMaleXpathWebElement);
        selectOptionByValue(homeAndCondoAboutYouMaritalStatusDropdownCSSWebElement, "string:S");
        typeOnElement(homeAndCondoAboutYouAddressCSSWebElement, pntVAStreetAddress);
        clickOnElement(homeAndCondoAboutYouIsThisYourMailingAddressRadioYesXpathWebElement);
        clickOnElement(continueButtonIDWebElement);
    }

    /**
     * This method verifies that 'About You' form is submitted.
     * @throws InterruptedException
     */
    public void verifyFillOutAboutYouPage() throws InterruptedException {
        sleepFor(3);
        Assert.assertEquals(getCurrentPageUrl(), thankYouURL);
    }


}
