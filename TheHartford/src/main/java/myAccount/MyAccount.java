package myAccount;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static myAccount.MyAccountWebElements.*;

public class MyAccount extends CommonAPI {

    @FindBy(how = How.XPATH, using = myAccountTabXpathWebElement)
    public WebElement myAccountTab;
    @FindBy(how = How.XPATH, using = imAnEmployerOrPlanAdministratorLoginButtonXPathWebElement)
    public WebElement imAnEmployerOrPlanAdministratorLoginButton;
    @FindBy(how = How.XPATH, using = imAnEmployerOrPlanAdministratorRegisterButtonXPathWebElement)
    public WebElement imAnEmployerOrPlanAdministratorRegisterButton;
    @FindBy(how = How.CSS, using = whatIsYourFirstNameCSSWebElement)
    public WebElement whatIsYourFirstName;

    /**
     * This method overs over 'My Account' tab and then click on 'I Am An Employee Or Plan Administrator' login button.
     */
    public void navigateToImAnEmployerOrPlanAdministrator() {
        driver.manage().window().maximize();
        mouseHoverByXpath(myAccountTabXpathWebElement);
        clickOnElement(imAnEmployerOrPlanAdministratorLoginButtonXPathWebElement);
        handleNewTab(driver);
    }

    /**
     * This method validates 'I Am An Employee Or Plan Administrator' login page with URL.
     */
    public void validateNavigateToImAnEmployerOrPlanAdministratorLogin() {
        Assert.assertEquals(getCurrentPageUrl(), imAnEmployerOrPlanAdministratorLoginPageURL);
    }

    /**
     * This method overs over 'My Account' tab and then click on 'I Am An Employee Or Plan Administrator' register button.
     */
    public void navigateToImAnEmployerOrPlanAdministratorRegister() {
        driver.manage().window().maximize();
        mouseHoverByXpath(myAccountTabXpathWebElement);
        clickOnElement(imAnEmployerOrPlanAdministratorRegisterButtonXPathWebElement);
        handleNewTab(driver);
    }

    /**
     * This method validates 'I Am An Employee Or Plan Administrator' register page with URL.
     */
    public void validateNavigateToImAnEmployerOrPlanAdministratorRegister() {
        Assert.assertEquals(getCurrentPageUrl(), imAnEmployerOrPlanAdministratorRegisterPageURL);
    }

    /**
     * This method allows user to enter a zip code and submit to take the user to the next page to fill out "About You' form.
     * @throws InterruptedException
     */
    public void startQuote() throws InterruptedException {
        driver.manage().window().maximize();
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
     * @throws InterruptedException
     */
    public void fillOutAboutYou() throws InterruptedException {
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
    public void validateAddVehiclePopUpIsDisplayed(){
        Assert.assertTrue(elementIsDisplayed(needHelpPhoneNumberXpathWebElement));
    }

}
