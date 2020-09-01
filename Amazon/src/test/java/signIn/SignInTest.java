package signIn;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SignInTest extends CommonAPI {

    SignIn signIn;

    @BeforeMethod
    public void getInit(){
        signIn = PageFactory.initElements(driver, SignIn.class);
    }

    /**
     * This test method verifies that users can navigate to Sign-In page from the Homepage
     * by verifying the title of the Sign-In page.
     */
    @Test(enabled = true, priority = 1)
    public void testVerifySignInTitle(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signIn.clickStartHere();
        signIn.verifySignInTitle();
    }

    /**
     * This method stores the email address and password in a two-dimension array and
     * provides them to testTwoUsersCanLogin test method.
     * @return
     */
    @DataProvider(name = "validLogins")
    public static Object[][] twoLoginsCredentials() {
        return new Object[][]{{SignInWebElements.validEmailAddress1, SignInWebElements.password},
                {SignInWebElements.validEmailAddress2, SignInWebElements.password}};
    }

    /**
     * This method allows two users to login consecutively and validates that they can log in using captcha.
     * @param email
     * @param password
     */
    @Test(dataProvider = "validLogins", priority = 1)
    public void testTwoUsersCanLogin(String email, String password) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signIn.signIn(email, password);
        signIn.validateTwoUsersCanLogin();
    }

    /**
     * This test validates that error is displayed when logging in with an invalid email format (e.g., shakir@hotmail).
     */
    @Test
    public void testVerifyThatErrorIsDisplayedWhenLoggingInWithInvalidEmailAddressFormat(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signIn.loginWithInvalidEmailAddressFormat();
        signIn.verifyThatErrorIsDisplayedWhenLoggingInWithInvalidEmailAddressFormat();
    }

    /**
     * This test verifies that user cannot login with an invalid password and receives an error.
     */
    @Test
    public void testVerifyLoginWithInvalidPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signIn.loginWithInvalidPassword();
        signIn.verifyLoginWithInvalidPassword();
    }

    /**
     * This test verifies that user will receive an error when an email or phone number is not provided when
     * logging in.
     */
    @Test
    public void testVerifyEnterYourEmailOrMobilePhoneNumberAlertIsDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signIn.signInWithoutEmail();
        signIn.verifyEnterYourEmailOrMobilePhoneNumberAlertIsDisplayed();
    }

    @Test
    public void testVerifyWeCannotFindAnAccountWithThatEmailAddressAlertIsDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signIn.signInWithAnIncorrectEmail();
        signIn.verifyWeCannotFindAnAccountWithThatEmailAddressAlertIsDisplayed();
    }

    @Test
    public void testVerifyIncorrectPhoneNumberAlertIsDispalyed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signIn.signInWithAnIncorrectPhoneNumber();
        signIn.verifyIncorrectPhoneNumberAlertIsDispalyed();
    }

    @Test
    public void testVerifyEnterYourPasswordAlertIsDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signIn.signInWithoutAPassword();
        signIn.verifyEnterYourPasswordAlertIsDisplayed();
    }

    /**
     * This test method verifies that users can navigate to 'Forgot Your Password?' page
     * by verifying the title of the 'Forgot Your Password? page.
     */
    @Test
    public void testVerifyForgotYourPasswordTitle(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signIn.forgotYourPasswordPage();
        signIn.verifyForgotYourPasswordTitle();
    }

}
