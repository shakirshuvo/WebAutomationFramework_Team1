package getAQuote;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static getAQuote.GetAQuoteWebElements.*;
import static myAccount.MyAccountWebElements.myAccountTabXpathWebElement;

public class GetAQuote extends CommonAPI {

    @FindBy(how = How.XPATH, using = vehicleYearDropdownCSSWebElement)
    public WebElement vehicleYearDropdown;
    @FindBy(how = How.XPATH, using = vehicleMakeDropdownCSSWebElement)
    public WebElement vehicleMakeDropdown;
    @FindBy(how = How.XPATH, using = vehicleModelDropdownCSSWebElement)
    public WebElement vehicleModelDropdown;
    @FindBy(how = How.XPATH, using = vehicleTrimDropdownCSSWebElement)
    public WebElement vehicleTrimDropdown;
    @FindBy(how = How.XPATH, using = sedan0214XpathWebElement)
    public WebElement sedan0214;


    /**
     * This method allows user to enter a zip code and submit to take the user to the next page to fill out "About You' form.
     *
     * @throws InterruptedException
     */
    public void startQuote() throws InterruptedException {
        typeOnElementNEnter(zipCodeFieldXpathWebElement, vaZipCode);
        Thread.sleep(5000);
    }

    /**
     * This method validates the 'About You' form page by URL.
     */
    public void validateStartQuote() {
        Assert.assertEquals(getCurrentPageUrl(), aboutYourURL);
    }

    /**
     * This method fills out 'About You' form.
     *
     * @throws InterruptedException
     */
    public void fillOutAboutYou() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        typeOnElementNEnter(zipCodeFieldXpathWebElement, vaZipCode);
        waitUntilVisible(By.cssSelector(whatIsYourFirstNameCSSWebElement));
        typeOnElement(whatIsYourFirstNameCSSWebElement, randomFirstName);
        typeOnElement(whatIsYourLastNameCSSWebElement, randomLastName);
        typeOnElement(whatIsYourStreetAddressCSSWebElement, pntVAStreetAddress);
        typeOnElement(whatIsYourAptSuiteCSSWebElement, pntVASuite);
        typeOnElement(whatIsYourDateOfBirthCSSWebElement, dateOfBirth);
        typeOnElement(whatIsYourEmailOptionalXpathWebElement, randomEmailAddress);
        typeOnElement(whatIsYourPhoneOptionalXpathWebElement, randomPhoneNumber);
        clickOnElement(nextAddYourVehiclesIDWebElement);
        clickOnElement(cancelXpathWebElement);
    }

    /**
     * This method validates that user is able to fill out 'About You'. The user should be able to to see 'Need Help?' phone number
     * '1-800-333-9238' after filling out 'About you' form.
     */
    public void validateAddVehiclePopUpIsDisplayed() {
        Assert.assertTrue(elementIsDisplayed(needHelpPhoneNumberXpathWebElement));
    }

    /**
     * This method triggers "Please enter a valid first name" alert for not entering a first name
     * when filling out the 'About You' form.
     */
    public void pleaseEnterAValidFirstNameAlert() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        typeOnElementNEnter(zipCodeFieldXpathWebElement, vaZipCode);
        waitUntilVisible(By.cssSelector(whatIsYourFirstNameCSSWebElement));
        typeOnElement(whatIsYourLastNameCSSWebElement, randomLastName);
        typeOnElement(whatIsYourStreetAddressCSSWebElement, pntVAStreetAddress);
        typeOnElement(whatIsYourAptSuiteCSSWebElement, pntVASuite);
        typeOnElement(whatIsYourDateOfBirthCSSWebElement, dateOfBirth);
        typeOnElement(whatIsYourEmailOptionalXpathWebElement, randomEmailAddress);
        typeOnElement(whatIsYourPhoneOptionalXpathWebElement, randomPhoneNumber);
        clickOnElement(nextAddYourVehiclesIDWebElement);
    }

    /**
     * This method validates that "Please enter a valid first name" alert is triggered for not entering a first name
     * when filling out the 'About You' form.
     */
    public void validatePleaseEnterAValidFirstNameAlert() {
        Assert.assertTrue(elementIsDisplayed(pleaseEnterAValidFirstNameAlertXpathWebElement));
    }

    /**
     * This method triggers "Please enter a valid last name" alert for not entering a last name
     * when filling out the 'About You' form.
     */
    public void pleaseEnterAValidLastNameAlert() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        typeOnElementNEnter(zipCodeFieldXpathWebElement, vaZipCode);
        waitUntilVisible(By.cssSelector(whatIsYourFirstNameCSSWebElement));
        typeOnElement(whatIsYourFirstNameCSSWebElement, randomFirstName);
        typeOnElement(whatIsYourStreetAddressCSSWebElement, pntVAStreetAddress);
        typeOnElement(whatIsYourAptSuiteCSSWebElement, pntVASuite);
        typeOnElement(whatIsYourDateOfBirthCSSWebElement, dateOfBirth);
        typeOnElement(whatIsYourEmailOptionalXpathWebElement, randomEmailAddress);
        typeOnElement(whatIsYourPhoneOptionalXpathWebElement, randomPhoneNumber);
        clickOnElement(nextAddYourVehiclesIDWebElement);
    }

    /**
     * This method validates that "Please enter a valid last name" alert is triggered for not entering a name
     * when filling out the 'About You' form.
     */
    public void validatePleaseEnterAValidLastNameAlert() {
        Assert.assertTrue(elementIsDisplayed(pleaseEnterAValidLastNameAlertXpathWebElement));
    }

    /**
     * This method triggers "Please enter a valid address" alert for not entering a valid address
     * when filling out the 'About You' form.
     */
    public void pleaseEnterAValidAddressAlert() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        typeOnElementNEnter(zipCodeFieldXpathWebElement, vaZipCode);
        waitUntilVisible(By.cssSelector(whatIsYourFirstNameCSSWebElement));
        typeOnElement(whatIsYourFirstNameCSSWebElement, randomFirstName);
        typeOnElement(whatIsYourLastNameCSSWebElement, randomLastName);
        typeOnElement(whatIsYourAptSuiteCSSWebElement, pntVASuite);
        typeOnElement(whatIsYourDateOfBirthCSSWebElement, dateOfBirth);
        typeOnElement(whatIsYourEmailOptionalXpathWebElement, randomEmailAddress);
        typeOnElement(whatIsYourPhoneOptionalXpathWebElement, randomPhoneNumber);
        clickOnElement(nextAddYourVehiclesIDWebElement);
    }

    /**
     * This method validates that "Please enter a valid last name" alert is triggered for not entering a valid address
     * when filling out the 'About You' form.
     */
    public void validatePleaseEnterAValidAddressAlert() {
        Assert.assertTrue(elementIsDisplayed(pleaseEnterAValidAddressAlertXpathWebElement));
    }

    /**
     * This method triggers "Please enter your date of birth" alert for not entering a valid date of birth
     * when filling out the 'About You' form.
     */
    public void pleaseEnterYourDateOfBirthAlert() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        typeOnElementNEnter(zipCodeFieldXpathWebElement, vaZipCode);
        waitUntilVisible(By.cssSelector(whatIsYourFirstNameCSSWebElement));
        typeOnElement(whatIsYourFirstNameCSSWebElement, randomFirstName);
        typeOnElement(whatIsYourLastNameCSSWebElement, randomLastName);
        typeOnElement(whatIsYourStreetAddressCSSWebElement, pntVAStreetAddress);
        typeOnElement(whatIsYourAptSuiteCSSWebElement, pntVASuite);
        typeOnElement(whatIsYourEmailOptionalXpathWebElement, randomEmailAddress);
        typeOnElement(whatIsYourPhoneOptionalXpathWebElement, randomPhoneNumber);
        clickOnElement(nextAddYourVehiclesIDWebElement);
    }

    /**
     * This method validates that "Please enter your date of birth" alert is triggered for not entering a valid date of birth
     * when filling out the 'About You' form.
     */
    public void validatePleaseEnterYourDateOfBirthAlert() {
        Assert.assertTrue(elementIsDisplayed(pleaseEnterYourDateOfBirthAlertXpathWebElement));
    }

    /**
     * This method adds Nissan Maxima 2016 vehicle for a quote.
     */
    public void addNissanMaxima() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        typeOnElementNEnter(zipCodeFieldXpathWebElement, vaZipCode);
        waitUntilVisible(By.cssSelector(whatIsYourFirstNameCSSWebElement));
        typeOnElement(whatIsYourFirstNameCSSWebElement, randomFirstName);
        typeOnElement(whatIsYourLastNameCSSWebElement, randomLastName);
        typeOnElement(whatIsYourStreetAddressCSSWebElement, pntVAStreetAddress);
        typeOnElement(whatIsYourAptSuiteCSSWebElement, pntVASuite);
        typeOnElement(whatIsYourDateOfBirthCSSWebElement, dateOfBirth);
        typeOnElement(whatIsYourEmailOptionalXpathWebElement, randomEmailAddress);
        typeOnElement(whatIsYourPhoneOptionalXpathWebElement, randomPhoneNumber);
        clickOnElement(nextAddYourVehiclesIDWebElement);
        clickOnElement(noButtonXpathWebElement);
        selectOptionByValue(vehicleYearDropdownCSSWebElement, "6: 2016");
        selectOptionByValue(vehicleMakeDropdownCSSWebElement, "28: Object");
        selectOptionByValue(vehicleModelDropdownCSSWebElement, "15: Object");
        selectOptionByValue(vehicleTrimDropdownCSSWebElement, "2: Object");
        clickOnElement(addVehicleButtonXpathWebElement);
    }

    /**
     * This method validates that user is able to add Nissan Maxima 2016 for a quote.
     */
    public void validateNissanMaximaIsAdded(){
        Assert.assertTrue(elementIsDisplayed(nissanMaximaXpathWebElement));
    }

}
