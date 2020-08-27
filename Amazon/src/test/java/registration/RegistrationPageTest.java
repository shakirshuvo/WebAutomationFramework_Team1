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

    @Test
    public void testVerifyClickStartHere(){
        registrationPage.clickStartHere();
        registrationPage.verifyClickStartHere();
    }

    @Test
    public void testPasswordMustBeAtLeast6CharacterAlertSignIsEnabled(){
        registrationPage.registerWith5CharacterPassword();
        registrationPage.verifyPasswordMustBeAtLeast6CharacterAlertIsDisplayed();
    }

    @Test
    public void testVerifyEnterAValidEmailAddressAlertSignIsDisplayed(){
        registrationPage.registerWithInvalidEmail();
        registrationPage.verifyEnterAValidEmailAddressAlertSignIsDisplayed();
    }

    @Test
    public void testVerifyPasswordsMustMatchAlertIsDisplayed(){
        registrationPage.registerWithPasswordsNotMatching();
        registrationPage.verifyPasswordsMustMatchAlertIsDisplayed();
    }

    @Test
    public void testVerifyEnterYourNameAlertSignIsDisplayed(){
        registrationPage.registerWithoutYourName();
        registrationPage.verifyEnterYourNameAlertSignIsDisplayed();
    }
}
