package registration;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationPageTest extends CommonAPI {

    RegistrationPage registrationPage;

    @BeforeMethod
    public void getInit() {
        registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
    }

    /**
     * This test verifies that user can hover over 'Hello, Sign in' and click on 'Start Here' in order to create an account.
     */
    @Test
    public void testVerifyClickStartHere() {
        registrationPage.clickStartHere();
        registrationPage.verifyClickStartHere();
    }

    /**
     * This test verifies that the user gets an alert message 'Passwords must be at least 6 characters' if attempting
     * to sign up with an password that is less than six characters.
     */
    @Test
    public void testPasswordMustBeAtLeast6CharacterAlertSignIsEnabled() {
        registrationPage.registerWith5CharacterPassword();
        registrationPage.verifyPasswordMustBeAtLeast6CharacterAlertIsDisplayed();
    }

    /**
     * This test verifies that the user gets an alert message 'Enter your email' if attempting
     * to sign up without an email address.
     */
    @Test
    public void testVerifyEnterYourEmailAlertSignIsDisplayed() {
        registrationPage.registerWithoutEmail();
        registrationPage.verifyEnterYourEmailAlertSignIsDisplayed();
    }

    /**
     * This test verifies that the user gets an alert message 'Enter a valid email address' if attempting
     * to sign up without a valid email address.
     */
    @Test
    public void testVerifyEnterAValidEmailAddressAlertSignIsDisplayed() {
        registrationPage.registerWithInvalidEmail();
        registrationPage.verifyEnterAValidEmailAddressAlertSignIsDisplayed();
    }

    /**
     * This test verifies that the user gets an alert message 'Enter your password' if attempting
     * to sign up without entering a password.
     */
    @Test
    public void testVerifyEnterYourPasswordAlertSignIsDisplayed() {
        registrationPage.registerWithoutPassword();
        registrationPage.verifyEnterYourPasswordAlertSignIsDisplayed();
    }

    /**
     * This test verifies that the user gets an alert message 'Type your password again' if attempting
     * to sign up without re-entering a password for verification.
     */
    @Test
    public void testVerifyTypeYourPasswordAgainAlertSignIsDisplayed() {
        registrationPage.registerWithoutReEnteringPassword();
        registrationPage.verifyTypeYourPasswordAgainAlertSignIsDisplayed();
    }

    /**
     * This test verifies that the user gets an alert message 'Passwords must match' if attempting
     * to sign up without matching password.
     */
    @Test
    public void testVerifyPasswordsMustMatchAlertIsDisplayed() {
        registrationPage.registerWithPasswordsNotMatching();
        registrationPage.verifyPasswordsMustMatchAlertIsDisplayed();
    }

    /**
     * This test verifies that the user gets an alert message 'Enter your name' if attempting
     * to sign up without a name.
     */
    @Test
    public void testVerifyEnterYourNameAlertSignIsDisplayed() {
        registrationPage.registerWithoutYourName();
        registrationPage.verifyEnterYourNameAlertSignIsDisplayed();
    }

    /**
     * This test verifies when attempting sign up with automation, the user will receive a captcha.
     */
    @Test
    public void testVerifyNewAccountCaptchaIsDisplayed() {
        registrationPage.createANewAccount();
        registrationPage.verifyNewAccountCaptchaIsDisplayed();
    }

    /**
     * This test verifies that the user can navigate to Sellers' sign up page using title.
     */
    @Test
    public void testVerifyNavigateToAmazonSellerSignUpPageByTitle(){
        registrationPage.navigateToAmazonSellerSignUpPage();
        registrationPage.verifyNavigateToAmazonSellerSignUpPageByTitle();
    }
}
