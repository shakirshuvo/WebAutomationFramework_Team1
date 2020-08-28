package signIn;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static signIn.SignInWebElements.*;

public class SignIn extends CommonAPI {

    @FindBy(how = How.ID, using = helloSignInIDWebElement)
    public WebElement helloSignIn;
    @FindBy(how = How.CSS, using = signInMainCSSWebElement)
    public WebElement signInMain;
    @FindBy(how = How.CSS, using = emailFieldCSSWebElement)
    public WebElement emailField;
    @FindBy(how = How.CLASS_NAME, using = continueButtonAfterEmailClassWebElement)
    public WebElement continueButtonAfterEmail;
    @FindBy(how = How.CSS, using = passwordFieldCSSWebElement)
    public WebElement passwordField;
    @FindBy(how = How.ID, using = signInAfterPasswordIDWebElement)
    public WebElement signInAfterPassword;
    @FindBy(how = How.LINK_TEXT, using = highShakirLinkTextWebElement)
    public WebElement highShakirText;
    @FindBy(how = How.LINK_TEXT, using = recommendationForYouLinkTextWebElement)
    public WebElement recommendationForYouText;
    @FindBy(how = How.XPATH, using = captchaXPath)
    public WebElement captcha;
    @FindBy(how = How.XPATH, using = invalidEmailAddressErrorMessageXPathWebElement)
    public WebElement invalidEmailAddressErrorMessage;
    @FindBy(how = How.XPATH, using = invalidPasswordErrorMessagePartialLinkText)
    public WebElement invalidPasswordErrorMessage;
    @FindBy(how = How.ID, using = enterYourEmailOrMobilePhoneNumberAlertIDWebElement)
    public WebElement enterYourEmailOrMobilePhoneNumberAlert;
    @FindBy(how = How.XPATH, using = weCannotFindAnAccountWithThatEmailAddressAlertXpathWebElement)
    public WebElement weCannotFindAnAccountWithThatEmailAddressAlert;
    @FindBy(how = How.XPATH, using = incorrectPhoneNumberAlertXpathWebElement)
    public WebElement incorrectPhoneNumberAlert;
    @FindBy(how = How.ID, using = enterYourPasswordAlertIDWebElement)
    public WebElement enterYourPasswordAlert;
    @FindBy(how = How.ID, using = forgotYourPasswordLinkIDWebElement)
    public WebElement forgotYourPasswordLink;


    /**
     * This method allows the mouse to hover over "Hello, Sign in" button to view and then click on the
     * Sign In button.
     */
    public void clickStartHere() {
        Actions actions = new Actions(driver);
        WebElement features = helloSignIn;
        actions.moveToElement(features).build().perform();
        signInMain.click();
    }

    /**
     * This method returns title of the page.
     *
     * @return title.
     */
    public String getTitle() {
        return driver.getTitle();
    }

    /**
     * This method verifies the title of Sign-In page.
     */
    public void verifySignInTitle() {
        Assert.assertTrue(getTitle().equals(signInTitleText));
    }

    /**
     * This method allows user to enter the email address when logging in.
     *
     * @param email
     */
    public void typeEmailAddress(String email) {
        emailField.sendKeys(email);
    }

    /**
     * This method allows users to click on the Continue button after entering an email address.
     */
    public void clickContinueButtonAfterEmail() {
        continueButtonAfterEmail.click();
    }

    /**
     * This method allows users to enter a password to login.
     *
     * @param password
     */
    public void typePassword(String password) {
        passwordField.sendKeys(password);
    }

    /**
     * This method allows users to click on the Sign In button after entering a password.
     */
    public void clickSignInButtonAfterPassword() {
        signInAfterPassword.click();
    }

    /**
     * This method clicks on 'Forgot your password?' link when signing in.
     */
    public void clickForgotYourPassword(){
        forgotYourPasswordLink.click();
    }

    /**
     * This method allows users to log into their account with valid credentials.
     *
     * @param email
     * @param password
     */
    public void signIn(String email, String password) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().deleteAllCookies();
        clickStartHere();
//        clickSignInMain();
        typeEmailAddress(email);
        clickContinueButtonAfterEmail();
        typePassword(password);
        clickSignInButtonAfterPassword();
    }

    /**
     * Validate that two users can log in if captcha is displayed.
     * Amazon does not allow automation login for security reasons.
     * Therefore, if we can display captcha in the process of logging in, we would consider the test as pass.
     */
    public void validateTwoUsersCanLogin() {
        captcha.isDisplayed();
    }

    /**
     * This method returns invalid email address message in the event of entering an invalid email address to log in.
     * @return
     */
    public boolean invalidEmailAddressErrorMessageIsDisplayed() {
        return invalidEmailAddressErrorMessage.isDisplayed();
    }

    /**
     * This method tries to login with an invalid email address.
     */
    public void loginWithInvalidEmailAddressFormat() {
        clickStartHere();
        typeEmailAddress(invalidEmailAddressFormat);
        clickContinueButtonAfterEmail();
    }

    /**
     * This method verifies that an error is displayed when user tries to login using an invalid
     * email address.
     */
    public void verifyThatErrorIsDisplayedWhenLoggingInWithInvalidEmailAddressFormat(){
        Assert.assertTrue(invalidEmailAddressErrorMessageIsDisplayed());
    }

    /**
     * This method tries to login with an invalid password.
     */
    public void loginWithInvalidPassword() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        clickStartHere();
        typeEmailAddress(validEmailAddress1);
        clickContinueButtonAfterEmail();
        typePassword(invalidPassword);
        clickSignInButtonAfterPassword();
    }

    public boolean invalidPasswordErrorMessageIsDisplayed(){
        return invalidPasswordErrorMessage.isDisplayed();
    }

    public void verifyLoginWithInvalidPassword(){
        loginWithInvalidPassword();
        invalidPasswordErrorMessageIsDisplayed();
    }

    /**
     * This method attempts to login without entering an Email (phone for mobile account).
     */
    public void signInWithoutEmail(){
        clickStartHere();
        clickContinueButtonAfterEmail();
    }

    /**
     * When user attempts to login without entering an email or phone number,
     * an alert 'Enter your email or mobile phone number' is displayed.
     * @return
     */
    public boolean enterYourEmailOrMobilePhoneNumberAlertIsDisplayed(){
        return enterYourEmailOrMobilePhoneNumberAlert.isDisplayed();
    }

    /**
     * This method verifies that 'Enter your email or mobile phone number' alert is displayed
     * when user attempts to log in without providing an email or phone number.
     */
    public void verifyEnterYourEmailOrMobilePhoneNumberAlertIsDisplayed(){
        Assert.assertTrue(enterYourEmailOrMobilePhoneNumberAlertIsDisplayed());
    }

    /**
     * This method attempts to login with an incorrect Email address.
     */
    public void signInWithAnIncorrectEmail(){
        clickStartHere();
        typeEmailAddress(incorrectEmailAddress);
        clickContinueButtonAfterEmail();
    }

    /**
     * When user attempts to login with an invalid email address,
     * an alert 'We cannot find an account with that email address' is displayed.
     * @return
     */
    public boolean weCannotFindAnAccountWithThatEmailAddressAlertIsDisplayed(){
        return weCannotFindAnAccountWithThatEmailAddressAlert.isDisplayed();
    }

    /**
     * This method verifies that 'We cannot find an account with that email address' alert is displayed
     * when user attempts to log in by providing an invalid email address.
     */
    public void verifyWeCannotFindAnAccountWithThatEmailAddressAlertIsDisplayed(){
        Assert.assertTrue(weCannotFindAnAccountWithThatEmailAddressAlertIsDisplayed());
    }

    /**
     * This method attempts to login with an incorrect phone number.
     */
    public void signInWithAnIncorrectPhoneNumber(){
        clickStartHere();
        typeEmailAddress(incorrectPhoneNumber);
        clickContinueButtonAfterEmail();
    }

    /**
     * When user attempts to login with an invalid phone number,
     * an alert 'We cannot find an account with that mobile number' is displayed.
     * @return
     */
    public boolean incorrectPhoneNumberAlertIsDispalyed(){
        return incorrectPhoneNumberAlert.isDisplayed();
    }

    /**
     * This method verifies that 'We cannot find an account with that mobile number' alert is displayed
     * when user attempts to log in by providing an invalid phone number.
     */
    public void verifyIncorrectPhoneNumberAlertIsDispalyed(){
        Assert.assertTrue(incorrectPhoneNumberAlertIsDispalyed());
    }

    /**
     * This method attempts to login without any password.
     */
    public void signInWithoutAPassword(){
        clickStartHere();
        typeEmailAddress(validEmailAddress1);
        clickContinueButtonAfterEmail();
        clickSignInButtonAfterPassword();
    }

    /**
     * When user attempts to login without a password,
     * an alert 'Enter your password' is displayed.
     * @return
     */
    public boolean enterYourPasswordAlertIsDisplayed(){
        return enterYourPasswordAlert.isDisplayed();
    }

    /**
     * This method verifies that 'Enter your password' alert is displayed
     * when user attempts to log in by providing an invalid phone number.
     */
    public void verifyEnterYourPasswordAlertIsDisplayed(){
        Assert.assertTrue(enterYourPasswordAlertIsDisplayed());
    }

    /**
     * This method takes user to 'Forgot your password? page.
     */
    public void forgotYourPasswordPage(){
        clickStartHere();
        typeEmailAddress(validEmailAddress1);
        clickContinueButtonAfterEmail();
        clickForgotYourPassword();
    }

    /**
     * This method verifies the title of Forgot your Password page.
     */
    public void verifyForgotYourPasswordTitle(){
        Assert.assertTrue(getTitle().equals(forgotYourPasswordTitleString));
    }

}
