package getAQuoteAuto;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static getAQuoteAuto.GetAQuoteAutoWebElements.*;


public class GetAQuoteAuto extends CommonAPI {

    @FindBy(how = How.XPATH, using = zipCodeFieldXpathWebElement)
    public WebElement zipCodeField;
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
     * This method triggers an alert 'Enter five-digit zip code' when user does not provide a Zip Code and tries to
     * proceed to Quote.
     */
    public void quoteWithoutZipCode() {
        typeOnInputBox(zipCodeFieldXpathWebElement, "");
    }

    /**
     * This method  validates that an alert 'Enter five-digit zip code' is triggered
     * when user does not provide a Zip Code and tries to proceed to Quote.
     */
    public void validateQuoteWithoutZipCode() {
        Assert.assertTrue(elementIsDisplayed(enterFiveDigitZipCodeAlertXpathWebElement));
    }

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
    public void fillOutAboutYou() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        typeOnElementNEnter(zipCodeFieldXpathWebElement, vaZipCode);
        waitUntilVisible(By.cssSelector(whatIsYourFirstNameCSSWebElement));
        typeOnElement(whatIsYourFirstNameCSSWebElement, randomFirstName);
        typeOnElement(whatIsYourLastNameCSSWebElement, randomLastName);
        typeOnElement(whatIsYourStreetAddressCSSWebElement, pntVAStreetAddress);
        typeOnElement(whatIsYourAptSuiteCSSWebElement, pntVASuite);
        typeOnElement(whatIsYourDateOfBirthCSSWebElement, dateOfBirth);
        typeOnElement(whatIsYourEmailOptionalXpathWebElement, randomEmailAddress);
        typeOnElement(whatIsYourPhoneOptionalXpathWebElement, randomPhoneNumber);
        clickOnElementByID(nextAddYourVehiclesIDWebElement);
        sleepFor(3);
        if (elementIsDisplayedXpath(cancel1XpathWebElement)) {
            clickOnElementByXpath(cancel1XpathWebElement);
        } else clickOnElementByXpath(cancel2XpathWebElement);
        sleepFor(3);
    }

    /**
     * This method validates that user is able to fill out 'About You'. The user should be able to to see 'Need Help?' phone number
     * '1-800-333-9238' after filling out 'About you' form.
     */
    public void validateAddVehiclePopUpIsDisplayed() throws InterruptedException {
        Assert.assertTrue(elementIsDisplayedXpath(needHelpPhoneNumberXpathWebElement));
    }

    /**
     * This method triggers "Please enter a valid first name" alert for not entering a first name
     * when filling out the 'About You' form.
     */
    public void pleaseEnterAValidFirstNameAlert() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        typeOnElementNEnter(zipCodeFieldXpathWebElement, vaZipCode);
        waitUntilVisible(By.cssSelector(whatIsYourFirstNameCSSWebElement));
        typeOnElement(whatIsYourLastNameCSSWebElement, randomLastName);
        typeOnElement(whatIsYourStreetAddressCSSWebElement, pntVAStreetAddress);
        typeOnElement(whatIsYourAptSuiteCSSWebElement, pntVASuite);
        typeOnElement(whatIsYourDateOfBirthCSSWebElement, dateOfBirth);
        typeOnElement(whatIsYourEmailOptionalXpathWebElement, randomEmailAddress);
        typeOnElement(whatIsYourPhoneOptionalXpathWebElement, randomPhoneNumber);
        clickOnElementByID(nextAddYourVehiclesIDWebElement);
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
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        typeOnElementNEnter(zipCodeFieldXpathWebElement, vaZipCode);
        waitUntilVisible(By.cssSelector(whatIsYourFirstNameCSSWebElement));
        typeOnElement(whatIsYourFirstNameCSSWebElement, randomFirstName);
        typeOnElement(whatIsYourStreetAddressCSSWebElement, pntVAStreetAddress);
        typeOnElement(whatIsYourAptSuiteCSSWebElement, pntVASuite);
        typeOnElement(whatIsYourDateOfBirthCSSWebElement, dateOfBirth);
        typeOnElement(whatIsYourEmailOptionalXpathWebElement, randomEmailAddress);
        typeOnElement(whatIsYourPhoneOptionalXpathWebElement, randomPhoneNumber);
        clickOnElementByID(nextAddYourVehiclesIDWebElement);
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
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        typeOnElementNEnter(zipCodeFieldXpathWebElement, vaZipCode);
        waitUntilVisible(By.cssSelector(whatIsYourFirstNameCSSWebElement));
        typeOnElement(whatIsYourFirstNameCSSWebElement, randomFirstName);
        typeOnElement(whatIsYourLastNameCSSWebElement, randomLastName);
        typeOnElement(whatIsYourAptSuiteCSSWebElement, pntVASuite);
        typeOnElement(whatIsYourDateOfBirthCSSWebElement, dateOfBirth);
        typeOnElement(whatIsYourEmailOptionalXpathWebElement, randomEmailAddress);
        typeOnElement(whatIsYourPhoneOptionalXpathWebElement, randomPhoneNumber);
        clickOnElementByID(nextAddYourVehiclesIDWebElement);
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
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        typeOnElementNEnter(zipCodeFieldXpathWebElement, vaZipCode);
        waitUntilVisible(By.cssSelector(whatIsYourFirstNameCSSWebElement));
        typeOnElement(whatIsYourFirstNameCSSWebElement, randomFirstName);
        typeOnElement(whatIsYourLastNameCSSWebElement, randomLastName);
        typeOnElement(whatIsYourStreetAddressCSSWebElement, pntVAStreetAddress);
        typeOnElement(whatIsYourAptSuiteCSSWebElement, pntVASuite);
        typeOnElement(whatIsYourEmailOptionalXpathWebElement, randomEmailAddress);
        typeOnElement(whatIsYourPhoneOptionalXpathWebElement, randomPhoneNumber);
        clickOnElementByID(nextAddYourVehiclesIDWebElement);
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
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        typeOnElementNEnter(zipCodeFieldXpathWebElement, vaZipCode);
        waitUntilVisible(By.cssSelector(whatIsYourFirstNameCSSWebElement));
        typeOnElement(whatIsYourFirstNameCSSWebElement, randomFirstName);
        typeOnElement(whatIsYourLastNameCSSWebElement, randomLastName);
        typeOnElement(whatIsYourStreetAddressCSSWebElement, pntVAStreetAddress);
        typeOnElement(whatIsYourAptSuiteCSSWebElement, pntVASuite);
        typeOnElement(whatIsYourDateOfBirthCSSWebElement, dateOfBirth);
        typeOnElement(whatIsYourEmailOptionalXpathWebElement, randomEmailAddress);
        typeOnElement(whatIsYourPhoneOptionalXpathWebElement, randomPhoneNumber);
        clickOnElementByID(nextAddYourVehiclesIDWebElement);
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
    public void validateNissanMaxima2016IsAdded() throws InterruptedException {
        sleepFor(2);
        Assert.assertTrue(elementIsDisplayed(nissanMaxima2016XpathWebElement));
    }

    /**
     * This method adds a vehicle (Nissan Maxima 2007) with a VIN number.
     *
     * @throws InterruptedException
     */
    public void addNissanMaxima2007WithVIN() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        typeOnElementNEnter(zipCodeFieldXpathWebElement, vaZipCode);
        waitUntilVisible(By.cssSelector(whatIsYourFirstNameCSSWebElement));
        typeOnElement(whatIsYourFirstNameCSSWebElement, randomFirstName);
        typeOnElement(whatIsYourLastNameCSSWebElement, randomLastName);
        typeOnElement(whatIsYourStreetAddressCSSWebElement, pntVAStreetAddress);
        typeOnElement(whatIsYourAptSuiteCSSWebElement, pntVASuite);
        typeOnElement(whatIsYourDateOfBirthCSSWebElement, dateOfBirth);
        typeOnElement(whatIsYourEmailOptionalXpathWebElement, randomEmailAddress);
        typeOnElement(whatIsYourPhoneOptionalXpathWebElement, randomPhoneNumber);
        clickOnElementByID(nextAddYourVehiclesIDWebElement);
        clickOnElement(yesButtonXpathWebElement);
        typeOnElement(enterYourVINCSSWebElement, nissan2007VinNumber);
        waitUntilClickAble(By.xpath(addVehicleButtonXpathWebElement));
        Thread.sleep(3000);
        clickOnElement(addVehicleButtonXpathWebElement);
    }

    /**
     * This method validates that user is able to add a vehicle (Nissan Maxima 2007) with a VIN number.
     */
    public void validateNissanMaxima2007IsAddedWithVIN() throws InterruptedException {
        sleepFor(2);
        Assert.assertTrue(elementIsDisplayed(nissanMaxima2007XpathWebElement));
    }

    /**
     * This method adds a vehicle (Nissan Maxima 2007) with a VIN number.
     * Then, it it deselects the vehicle and attempts to go to the next step; however, the user will get an
     * alert message, "OOPS! We'll need you to select at least one of your vehicles or add a new one so we can
     * continue with your quote".
     *
     * @throws InterruptedException
     */
    public void deselectNissanMaxima2007() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        typeOnElementNEnter(zipCodeFieldXpathWebElement, vaZipCode);
        waitUntilVisible(By.cssSelector(whatIsYourFirstNameCSSWebElement));
        typeOnElement(whatIsYourFirstNameCSSWebElement, randomFirstName);
        typeOnElement(whatIsYourLastNameCSSWebElement, randomLastName);
        typeOnElement(whatIsYourStreetAddressCSSWebElement, pntVAStreetAddress);
        typeOnElement(whatIsYourAptSuiteCSSWebElement, pntVASuite);
        typeOnElement(whatIsYourDateOfBirthCSSWebElement, dateOfBirth);
        typeOnElement(whatIsYourEmailOptionalXpathWebElement, randomEmailAddress);
        typeOnElement(whatIsYourPhoneOptionalXpathWebElement, randomPhoneNumber);
        clickOnElementByID(nextAddYourVehiclesIDWebElement);
        if (elementIsDisplayedID(crossIDWebElement)) {
            clickOnElementByID(crossIDWebElement);
        }
        sleepFor(3);
        clickOnElement(yesButtonXpathWebElement);
        typeOnElement(enterYourVINCSSWebElement, nissan2007VinNumber);
        waitUntilClickAble(By.xpath(addVehicleButtonXpathWebElement));
        sleepFor(3);
        clickOnElement(addVehicleButtonXpathWebElement);
        clickOnElement(nissanMaxima2007XpathWebElement);
        clickOnElement(nextVehicleDetailsXpathWebElement);
    }


    /**
     * This method validates that after deselecting a vehicle and attempting to go to the next step, user will get an
     * alert message, "OOPS! We'll need you to select at least one of your vehicles or add a new one so we can
     * continue with your quote".
     */
    public void validateDeselectNissanMaxima2007() throws InterruptedException {
        sleepFor(2);
        Assert.assertTrue(elementIsSelected(oopsAlertXpathWebElement));
    }

    /**
     * This method adds a vehicle (Nissan Maxima 2007) with a VIN number.
     * Then, it generates a confirmation message.
     *
     * @throws InterruptedException
     */
    public void addNissanMaxima2007WithVINConfirmation() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        typeOnElementNEnter(zipCodeFieldXpathWebElement, vaZipCode);
        waitUntilVisible(By.cssSelector(whatIsYourFirstNameCSSWebElement));
        typeOnElement(whatIsYourFirstNameCSSWebElement, randomFirstName);
        typeOnElement(whatIsYourLastNameCSSWebElement, randomLastName);
        typeOnElement(whatIsYourStreetAddressCSSWebElement, pntVAStreetAddress);
        typeOnElement(whatIsYourAptSuiteCSSWebElement, pntVASuite);
        typeOnElement(whatIsYourDateOfBirthCSSWebElement, dateOfBirth);
        typeOnElement(whatIsYourEmailOptionalXpathWebElement, randomEmailAddress);
        typeOnElement(whatIsYourPhoneOptionalXpathWebElement, randomPhoneNumber);
        clickOnElementByID(nextAddYourVehiclesIDWebElement);
    }

    /**
     * This method validates that user is able get a confirmation message after adding a vehicle. The confirmation message
     * does not always appear. In such event, the user is navigated to the 'Your Vehicles' page. Therefore, this method employs
     * two possible assertions.
     */
    public void validateAddNissanMaxima2007WithVINConfirmation() throws InterruptedException {
        String expectedText = "Thanks, " + randomFirstName + "! Now let's add your vehicles.";

        if (elementIsDisplayedID(crossIDWebElement)) {
            clickOnElementByID(crossIDWebElement);
            sleepFor(3);
        } else {
            clickOnElementByXpath(cancel2XpathWebElement);
        }
        sleepFor(2);
        validateByText(thanksTextXpathWebElement, expectedText);
    }


    /**
     * This method fills out 'About You' form and then proceeds to 'Your Vehicles' page.
     *
     * @throws InterruptedException
     */
    public void addVehicleAndGoToYourVehiclePage() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        typeOnElementNEnter(zipCodeFieldXpathWebElement, vaZipCode);
        waitUntilVisible(By.cssSelector(whatIsYourFirstNameCSSWebElement));
        typeOnElement(whatIsYourFirstNameCSSWebElement, randomFirstName);
        typeOnElement(whatIsYourLastNameCSSWebElement, randomLastName);
        typeOnElement(whatIsYourStreetAddressCSSWebElement, pntVAStreetAddress);
        typeOnElement(whatIsYourAptSuiteCSSWebElement, pntVASuite);
        typeOnElement(whatIsYourDateOfBirthCSSWebElement, dateOfBirth);
        typeOnElement(whatIsYourEmailOptionalXpathWebElement, randomEmailAddress);
        typeOnElement(whatIsYourPhoneOptionalXpathWebElement, randomPhoneNumber);
        clickOnElementByID(nextAddYourVehiclesIDWebElement);
        if (elementIsDisplayedID(crossIDWebElement)) {
            clickOnElementByID(crossIDWebElement);
            sleepFor(3);
        }
        clickOnElement(yesButtonXpathWebElement);
        sleepFor(2);
        typeOnElement(enterYourVINCSSWebElement, nissan2007VinNumber);
        waitUntilClickAble(By.xpath(addVehicleButtonXpathWebElement));
        sleepFor(3);
        clickOnElement(addVehicleButtonXpathWebElement);
        sleepFor(2);
        clickOnElement(nextVehicleDetailsXpathWebElement);
    }

    /**
     * This method validates 'Your Vehicles' page with URL.
     */
    public void validateAddVehicleAndGoToYourVehiclePage() {
        validateByURL(yourVehicleURL);
    }

}
