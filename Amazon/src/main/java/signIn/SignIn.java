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

    /**
     * This method allows the mouse to hover over "Hello, Sign in" button to view and then click on the
     * Sign In button.
     */
    public void mouseOverHelloSign() {
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
     * This method allows users to log into their account with valid credentials.
     *
     * @param email
     * @param password
     */
    public void signIn(String email, String password) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().deleteAllCookies();
        mouseOverHelloSign();
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
    public void loginWithInvalidEmailAddress() {
        mouseOverHelloSign();
        typeEmailAddress(invalidEmailAddress);
        clickContinueButtonAfterEmail();
    }

    /**
     * This method verifies that an error is displayed when user tries to login using an invalid
     * email address.
     */
    public void verifyThatErrorIsDisplayedWhenLoggingInWithInvalidEmailAddress(){
        Assert.assertTrue(invalidEmailAddressErrorMessageIsDisplayed());
    }

    /**
     * This method tries to login with an invalid password.
     */
    public void loginWithInvalidPassword() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        mouseOverHelloSign();
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


}
