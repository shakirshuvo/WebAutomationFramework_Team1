package registration;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static registration.RegistrationWebElements.*;



public class RegistrationPage extends CommonAPI {

    @FindBy(how = How.ID, using = helloSignInIDWebElement)
    public WebElement helloSignIn;
    @FindBy(how = How.XPATH, using = startHereXPathWebElement)
    public WebElement startHereXPath;
    @FindBy(how = How.CSS, using = yourNameFieldCSSWebElement)
    public WebElement yourNameField;
    @FindBy(how = How.CSS, using = yourEmailFieldCSSWebElement)
    public WebElement emailField;
    @FindBy(how = How.CSS, using = passwordFieldCSSWebElement)
    public WebElement passwordField;
    @FindBy(how = How.CSS, using = passwordReEnterFieldCSSWebElement)
    public WebElement passwordReEnterField;
    @FindBy(how = How.CSS, using = createYourAmazonAccountButtonCSSWebElement)
    public WebElement createYourAmazonAccountButton;
    @FindBy(how = How.ID, using = passwordMustBeAtLeast6CharacterAlertIDWebElement)
    public WebElement passwordMustBeAtLeast6CharacterAlertSign;
    @FindBy(how = How.ID, using = enterAValidEmailAddressAlertIDWebElement)
    public WebElement enterAValidEmailAddressAlert;
    @FindBy(how = How.ID, using = passwordsMustMatchAlertIDWebElement)
    public WebElement passwordsMustMatchAlert;
    @FindBy(how = How.ID, using = enterYourNameAlertIDWebElement)
    public WebElement enterYourNameAlert;

    /**
     * This method allows the mouse to hover over "Hello, Sign in" button to view and then click on the
     * Start Here link.
     */
    public void clickStartHere() {
        Actions actions = new Actions(driver);
        WebElement features = helloSignIn;
        actions.moveToElement(features).build().perform();
        startHereXPath.click();
    }

    /**
     * This method returns the title of the page.
     * @return
     */
    public String getTitle(){
       return driver.getTitle().toString();
    }

    /**
     * This method verifies the title of the Amazon Registration Page.
     */
    public void verifyClickStartHere(){
        Assert.assertTrue(getTitle().equals(amazonRegistrationTitleString));
    }

    /**
     * This method enters value in 'Your name' field when creating a new account.
     * @param name
     */
    public void enterYourNameField(String name){
        yourNameField.sendKeys(name);
    }

    /**
     * This method enters value in 'Email' field when creating a new account.
     * @param email
     */
    public void enterYourEmailField(String email){
        emailField.sendKeys(email);
    }

    /**
     * This method enters value in 'Password' field when creating a new account.
     * @param password
     */
    public void enterYourPasswordField(String password){
        passwordField.sendKeys(password);
    }

    /**
     * This method enters value in 'Re-enter Password' field when creating a new account.
     * @param password
     */
    public void reEnterYourPasswordField(String password){
        passwordReEnterField.sendKeys(password);
    }

    /**
     * This method clicks on 'Create your Amazon account' button when creating a new account.
     */
    public void clickCreateYourAmazonAccountButton(){
        createYourAmazonAccountButton.click();
    }

    /**
     * This method attempts to create a new user without entering your name.
     * Amazon require your name to be filled when creating a new account.
     * Therefore, this method should not succeed in creating a new account.
     */
    public void registerWithoutYourName(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickStartHere();
        enterYourEmailField(email);
        enterYourPasswordField(password6Characters1);
        reEnterYourPasswordField(password6Characters1);
        clickCreateYourAmazonAccountButton();
    }

    /**
     * When creating a new account, if 'Your name' field is empty, an error message will be displayed.
     * @return
     */
    public boolean enterYourNameAlertSignIsDisplayed(){
        return enterYourNameAlert.isDisplayed();
    }

    /**
     * This method verifies that an error message is displayed when no name is entered in 'Your name' field
     * during creating a new account.
     */
    public void verifyEnterYourNameAlertSignIsDisplayed(){
        Assert.assertTrue(enterYourNameAlertSignIsDisplayed());
    }

    /**
     * This method attempts to create a new user using password that is of five characters.
     * Amazon require passwords to be of at least 6 characters.
     * Therefore, this method should not succeed in creating a new account.
     */
    public void registerWith5CharacterPassword(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickStartHere();
        enterYourNameField(name);
        enterYourEmailField(email);
        enterYourPasswordField(password5Characters);
        reEnterYourPasswordField(password5Characters);
        clickCreateYourAmazonAccountButton();
    }

    /**
     * When creating a new account, if password is less than six characters, an error message will be displayed.
     * @return
     */
    public boolean passwordMustBeAtLeast6CharacterAlertSignIsDisplayed(){
        return passwordMustBeAtLeast6CharacterAlertSign.isDisplayed();
    }

    /**
     * This method verifies that an error message is displayed when password is less than six characters
     * during creating a new account.
     */
    public void verifyPasswordMustBeAtLeast6CharacterAlertIsDisplayed(){
        Assert.assertTrue(passwordMustBeAtLeast6CharacterAlertSignIsDisplayed());
    }

    /**
     * This method attempts to create a new user using invalid email address.
     * Amazon require email addresses to be of valid format when creating a new account.
     * Therefore, this method should not succeed in creating a new account.
     */
    public void registerWithInvalidEmail(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickStartHere();
        enterYourNameField(name);
        enterYourEmailField(invalidEmail);
        enterYourPasswordField(password6Characters1);
        reEnterYourPasswordField(password6Characters1);
        clickCreateYourAmazonAccountButton();
    }

    /**
     * When creating a new account, if password is less than six characters, an error message will be displayed.
     * @return
     */
    public boolean enterAValidEmailAddressAlertIsDisplayed(){
        return enterAValidEmailAddressAlert.isDisplayed();
    }

    /**
     * This method verifies that an error message is displayed when an invalid email is entered
     * during creating a new account.
     */
    public void verifyEnterAValidEmailAddressAlertSignIsDisplayed(){
        Assert.assertTrue(enterAValidEmailAddressAlertIsDisplayed());
    }

    /**
     * This method attempts to create a new user using invalid email address.
     * Amazon require email addresses to be of valid format when creating a new account.
     * Therefore, this method should not succeed in creating a new account.
     */
    public void registerWithPasswordsNotMatching(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickStartHere();
        enterYourNameField(name);
        enterYourEmailField(email);
        enterYourPasswordField(password6Characters1);
        reEnterYourPasswordField(password6Characters2);
        clickCreateYourAmazonAccountButton();
    }

    /**
     * When creating a new account, if passwords do not match, an error message will be displayed.
     * @return
     */
    public boolean passwordsMustMatchAlertIsDisplayed(){
        return passwordsMustMatchAlert.isDisplayed();
    }

    /**
     * This method verifies that an error message is displayed when passwords do not match
     * during creating a new account.
     */
    public void verifyPasswordsMustMatchAlertIsDisplayed(){
        Assert.assertTrue(passwordsMustMatchAlertIsDisplayed());
    }

}
