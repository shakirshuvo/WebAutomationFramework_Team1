package getAQuoteAuto;

import com.github.javafaker.Faker;

public class GetAQuoteAutoWebElements {

    static Faker faker = new Faker();

    public static final String randomEmailAddress = faker.internet().emailAddress();
    public static final String randomFirstName = faker.name().firstName();
    public static final String randomLastName = faker.name().lastName();
    public static final String enterFiveDigitZipCodeAlertXpathWebElement = "//*[text()='Enter five-digit zip code']";
    public static final String vaZipCode = "22182";
    public static final String pntVAStreetAddress = "1604 Spring Hill Rd";
    public static final String pntVASuite = "302";
    public static final String dateOfBirth = "03/16/1983";
    public static final String randomPhoneNumber = faker.phoneNumber().phoneNumber();
    public static final String nissan2007VinNumber = "1N4BA41E67C837695";
    public static final String zipCodeFieldXpathWebElement = "//div[@id=\"cqb-1444641621794\"]/article/form/div[2]/input";
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
    public static final String yesButtonXpathWebElement = "//label[text()='Yes']";
    public static final String enterYourVINCSSWebElement = "#VINQuestionInput";
    public static final String vehicleTypeDropdownCSSWebElement = "#vehicle-type";
    public static final String vehicleYearDropdownCSSWebElement = "#vehicle-year";
    public static final String vehicleMakeDropdownCSSWebElement = "#vehicle-makes";
    public static final String vehicleModelDropdownCSSWebElement = "#vehicle-models";
    public static final String vehicleTrimDropdownCSSWebElement = "#vehicle-submodels";
    public static final String addVehicleButtonXpathWebElement = "//button[text()='Add Vehicle']";
    public static final String sedan0214XpathWebElement = "//button[text()='Add Vehicle']";
    public static final String nissanMaxima2016XpathWebElement = "//span[text()='2016 NISSAN MAXIMA 3.5S 3.5SV 3.']";
    public static final String nissanMaxima2007XpathWebElement = "//span[text()='2007 NISSAN MAXIMA SE SL']";
    public static final String backAboutYouXpathWebElement = "//div[@id='main-content']/app-sales/app-auto/div/div[2]/ng-component/app-page-bottom/div[2]/div/div[1]/div/button";
    public static final String nextVehicleDetailsXpathWebElement = "//button[text()='Next: Vehicle Details']";
    public static final String confirmYourVehiclesXpathWebElement = "//*[text()='Confirm Your Vehicles']";
    public static final String vehicleSelectCheckBoxXpathWebElement = "//*[@id=\"demoCheckbox\"]/div[1]/div[1]/label/span/span";
    public static final String oopsAlertXpathWebElement = "//strong[text()='OOPS!']";
    public static final String continueButtonXpathWebElement = "//div[@id='AllVehicleAddedModal']/div/div/div/div[4]/button";
    public static final String yourVehicleURL = "https://quote.thehartford.com/sales/auto/vehicle";
    public static final String pleaseSelectYourVehicleOwnershipStatusXpathWebElement = "//span[text()='Please select your vehicle ownership status.']";

}