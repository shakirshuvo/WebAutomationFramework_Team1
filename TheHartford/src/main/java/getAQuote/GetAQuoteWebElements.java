package getAQuote;

import com.github.javafaker.Faker;

public class GetAQuoteWebElements {

    static Faker faker = new Faker();

    public static final String randomEmailAddress = faker.internet().emailAddress();
    public static final String randomFirstName = faker.name().firstName();
    public static final String randomLastName = faker.name().lastName();
    public static final String vaZipCode = "22182";
    public static final String pntVAStreetAddress = "1604 Spring Hill Rd";
    public static final String pntVASuite = "302";
    public static final String dateOfBirth = "03/16/1983";
    public static final String randomPhoneNumber = faker.phoneNumber().phoneNumber();
    public static final String zipCodeFieldXpathWebElement = "//*[@id=\"cqb-1444641621794\"]/article/form/div[2]/input";
    public static final String aboutYourURL = "https://quote.thehartford.com/sales/auto/about-me";
    public static final String whatIsYourFirstNameCSSWebElement = "#firstName";
    public static final String whatIsYourLastNameCSSWebElement = "#lastName";
    public static final String whatIsYourStreetAddressCSSWebElement = "#aboutMeAddress";
    public static final String whatIsYourAptSuiteCSSWebElement = "#aboutMeAddressPostFix";
    public static final String whatIsYourDateOfBirthCSSWebElement = "#dateOfBirth";
    public static final String whatIsYourEmailOptionalXpathWebElement = "//input[@name='emailAddress']";
    public static final String whatIsYourPhoneOptionalXpathWebElement = "//input[@name='phoneNumber']";
    public static final String nextAddYourVehiclesIDWebElement = "about-you-next-button";
    public static final String cancelXpathWebElement = "//div[@id='add-vehicle-modal']/div/div/div[2]/form/div[6]/div/a";
    public static final String needHelpPhoneNumberXpathWebElement = "//a[@id='footerPhoneNumId']";
    public static final String pleaseEnterAValidFirstNameAlertXpathWebElement = "//div[text()='Please enter a valid first name']";
    public static final String pleaseEnterAValidLastNameAlertXpathWebElement = "//div[text()='Please enter a valid last name']";
    public static final String pleaseEnterAValidAddressAlertXpathWebElement = "//div[text()='Please enter a valid address']";
    public static final String pleaseEnterYourDateOfBirthAlertXpathWebElement = "//div[text()='Please enter your date of birth']";
    public static final String noButtonXpathWebElement = "//label[text()='No']";
    public static final String vehicleTypeDropdownCSSWebElement = "#vehicle-type";
    public static final String vehicleYearDropdownCSSWebElement = "#vehicle-year";
    public static final String vehicleMakeDropdownCSSWebElement = "#vehicle-makes";
    public static final String vehicleModelDropdownCSSWebElement = "#vehicle-models";
    public static final String vehicleTrimDropdownCSSWebElement = "#vehicle-submodels";
    public static final String addVehicleButtonXpathWebElement = "//button[text()='Add Vehicle']";
    public static final String sedan0214XpathWebElement = "//button[text()='Add Vehicle']";
    public static final String nissanMaximaXpathWebElement = "//span[text()='2016 NISSAN MAXIMA 3.5S 3.5SV 3.']";

}
