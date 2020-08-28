package signIn;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignInTest extends CommonAPI {

    SignIn signIn;

    @BeforeMethod
    public void getInit(){
        signIn = PageFactory.initElements(driver, SignIn.class);
    }

    /**
     * This method verifies that users can navigate to Sign-In page from the Homepage
     * by verifying the title of the Sign-In page.
     */
    @Test
    public void testVerifySignInTitle(){
        signIn.clickStartHere();
        signIn.verifySignInTitle();
    }

    //    // This test tests that two users can successfully log in.
//    @DataProvider(name = "validLogins")
//    public static Object[][] twoLoginsCredentials() {
//        return new Object[][]{{"shakir.jahangir83@gmail.com", "BugBusters"},
//                {"ciara105@xhanimatedm.com", "BugBusters"}};
//    }

    @DataProvider(name = "validLogins")
    public static Object[][] twoLoginsCredentials() {
        return new Object[][]{{SignInWebElements.validEmailAddress1, SignInWebElements.password},
                {SignInWebElements.validEmailAddress2, SignInWebElements.password}};
    }

    @Test(dataProvider = "validLogins")
    public void testTwoUsersCanLogin(String email, String password) {
        signIn.signIn(email, password);
        signIn.validateTwoUsersCanLogin();
    }

    @Test
    public void testVerifyThatErrorIsDisplayedWhenLoggingInWithInvalidEmailAddressFormat(){
        signIn.loginWithInvalidEmailAddressFormat();
        signIn.verifyThatErrorIsDisplayedWhenLoggingInWithInvalidEmailAddressFormat();
    }

    @Test
    public void testVerifyLoginWithInvalidPassword(){
        signIn.loginWithInvalidPassword();
        signIn.invalidPasswordErrorMessageIsDisplayed();
    }

    @Test
    public void testVerifyEnterYourEmailOrMobilePhoneNumberAlertIsDisplayed(){
        signIn.signInWithoutEmail();
        signIn.verifyEnterYourEmailOrMobilePhoneNumberAlertIsDisplayed();
    }

    @Test
    public void testVerifyWeCannotFindAnAccountWithThatEmailAddressAlertIsDisplayed(){
        signIn.signInWithAnIncorrectEmail();
        signIn.verifyWeCannotFindAnAccountWithThatEmailAddressAlertIsDisplayed();
    }

    @Test
    public void testVerifyIncorrectPhoneNumberAlertIsDispalyed(){
        signIn.signInWithAnIncorrectPhoneNumber();
        signIn.verifyIncorrectPhoneNumberAlertIsDispalyed();
    }

}
