package getAQuoteHome;

import com.github.javafaker.Faker;

public class GetAQuoteHomeWebElements {

    static Faker faker = new Faker();


    public static final String randomEmailAddress = faker.internet().emailAddress();
    public static final String randomFirstName = faker.name().firstName();
    public static final String randomLastName = faker.name().lastName();
    public static final String phoneAreaCode = "778";
    public static final String phone3Digits = "322";
    public static final String phone4Digits = "3092";
    public static final String dateOfBirth = "03/16/1983";
    public static final String pntVAStreetAddress = "1604 Spring Hill Rd";
    public static final String vaZipCode = "22182";
    public static final String homeAndCondoButtonXpathWebElement = "//a[text()='Home & Condo']";
    public static final String homeAndCondoZipCodeField = "//div[@id=\"cqb-1444653502913\"]/article/form/div[2]/input";
    public static final String homeAndCondoAboutYouURL = "https://homequote.thehartford.com/sales/#/personalInfo";
    public static final String homeAndCondoAboutYouFirstNameCSSWebElement = "#fname";
    public static final String homeAndCondoAboutYouLastNameCSSWebElement = "#lname";
    public static final String homeAndCondoAboutYouDateOfBirthCSSWebElement = "#dob";
    public static final String homeAndCondoAboutYouRadioMaleXpathWebElement = "//input[@value='M']";
    public static final String homeAndCondoAboutYouMaritalStatusDropdownCSSWebElement = "#maritalStatus";
    public static final String homeAndCondoAboutYouResidenceTypeDropdownCSSWebElement = "#maritalStatus";
    public static final String homeAndCondoAboutYouAddressCSSWebElement = "#insureAddress";
    public static final String homeAndCondoAboutYouSuiteCSSWebElement = "#insureApt";
    public static final String homeAndCondoAboutYouIsThisYourMailingAddressRadioYesXpathWebElement = "//input[@name='mailingAddressStatus' and @value='Yes']";
    public static final String homeAndCondoAboutYouMailingAddress3YearsRadioYesXpathWebElement = "//input[@name='previousAddressReqd' and @value='Yes']";
    public static final String pleaseEnterAValidFirstNameAlertXpathWebElement = "//span[text()='Please enter a valid first name']";
    public static final String pleaseEnterAValidLastNameAlertXpathWebElement = "//span[text()='Please enter a valid last name']";
    public static final String pleaseEnterYourDateOfBirthAlertXpathWebElement = "//span[text()='Please enter your date of birth']";
    public static final String pleaseSelectAGenderAlertXpathWebElement = "//span[text()='Please select a gender']";
    public static final String pleaseSelectAMaritalStatusAlertXpathWebElement = "//span[text()='Please select a marital status']";
    public static final String pleaseEnterAValidAddressAlertXpathWebElement = "//span[text()='Please enter a valid address']";
    public static final String pleaseSelectAValueAlertXpathWebElement = "//span[text()='Please select a value']";
    public static final String continueButtonIDWebElement = "continueAboutBtn";
    public static final String phoneFirstNameWebElement = "phoneFirst";
    public static final String phoneSecondNameWebElement = "phoneSecond";
    public static final String phoneThirdNameWebElement = "phoneThird";
}
