package registration;

import com.github.javafaker.Faker;

public class RegistrationWebElements {

    static Faker faker = new Faker();

    public static final String randomName = faker.name().name();
    public static final String randomEmail = faker.internet().safeEmailAddress();
    public static final String randomPhoneNumber = faker.phoneNumber().phoneNumber();
    public static final String randomPasswordLength6to8 = faker.internet().password(6,8);
    public static final String newAccountCaptchaXPathWebElement = "//span[text()=\"Please solve this puzzle so we know you're a real person\"]";
    public static final String helloSignInIDWebElement="nav-link-accountList";
    public static final String startHereXPathWebElement ="//div[@id='nav-flyout-ya-newCust']/a";
    public static final String amazonRegistrationTitleString = "Amazon Registration";
    public static final String yourNameFieldCSSWebElement = "#ap_customer_name";
    public static final String yourEmailFieldCSSWebElement = "#ap_email";
    public static final String passwordFieldCSSWebElement = "#ap_password";
    public static final String passwordReEnterFieldCSSWebElement = "#ap_password_check";
    public static final String createYourAmazonAccountButtonCSSWebElement = "#continue";
    public static final String email = "shakir@nosuchemail83.com";
    public static final String invalidEmail = "shakir@nosuchemail83";
    public static final String password5Characters = "BugBu";
    public static final String password6Characters1 = "Pass1!";
    public static final String password6Characters2 = "Pass2!";
    public static final String passwordMustBeAtLeast6CharacterAlertIDWebElement = "auth-password-invalid-password-alert";
    public static final String enterAValidEmailAddressAlertIDWebElement = "auth-email-invalid-email-alert";
    public static final String enterYourEmailAlertIDWebElement = "auth-email-missing-alert";
    public static final String enterYourPasswordAlertIDWebElement = "auth-password-missing-alert";
    public static final String typeYourPasswordAgainIDWebElement = "auth-passwordCheck-missing-alert";
    public static final String passwordsMustMatchAlertIDWebElement = "auth-password-mismatch-alert";
    public static final String enterYourNameAlertIDWebElement = "auth-customerName-missing-alert";
    public static final String startASellingAccountLinkXpathWebElement = "//span[text()='Start a Selling Account']";
    public static final String amazonSellerSignUpTabIDWebElement = "Sign_up_n";
    public static final String amazonSellerSignUpPageTitle = "Amazon Next";

}
