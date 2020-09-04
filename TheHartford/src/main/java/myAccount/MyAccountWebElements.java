package myAccount;

import com.github.javafaker.Faker;

import java.util.Date;

public class MyAccountWebElements {

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
    public static final String myAccountTabXpathWebElement = "/html/body/header/nav/div[1]/div/ul/li[5]/div/a";
    public static final String imAnEmployerOrPlanAdministratorLoginButtonXPathWebElement = "/html/body/header/nav/div[1]/div/ul/li[5]/div/div/article[4]/div/div/div[2]/div[3]/a[1]/span";
    public static final String imAnEmployerOrPlanAdministratorLoginPageURL = "https://gbuserredirect.thehartford.com/login?usertype=employer";
    public static final String imAnEmployerOrPlanAdministratorRegisterButtonXPathWebElement = "/html/body/header/nav/div[1]/div/ul/li[5]/div/div/article[4]/div/div/div[2]/div[3]/a[2]";
    public static final String imAnEmployerOrPlanAdministratorRegisterPageURL = "https://gbuserredirect.thehartford.com/register?usertype=employer";
    public static final String whatIsYourEmailAddressCSSWebElement = "#email";
    public static final String whatIsYourFirstNameCSSWebElement = "#firstName";
    public static final String whatIsYourLastNameCSSWebElement = "#lastName";
    public static final String whatIsYourStreetAddressCSSWebElement = "#aboutMeAddress";
    public static final String whatIsYourAptSuiteCSSWebElement = "#aboutMeAddressPostFix";
    public static final String whatIsYourDateOfBirthCSSWebElement = "#dateOfBirth";
    public static final String whatIsYourEmailOptionalXpathWebElement = "//input[@name='emailAddress']";
    public static final String whatIsYourPhoneOptionalXpathWebElement = "//input[@name='phoneNumber']";
    public static final String nextAddYourVehiclesIDWebElement = "about-you-next-button";
    public static final String addVehiclePopUpXpathWebElement = "//span[text()=' Add Vehicle ']";
    public static final String addADifferentVehicleXpathWebElement = "//span[text()='Add a Different Vehicle']";
    public static final String cancelXpathWebElement = "//div[@id='add-vehicle-modal']/div/div/div[2]/form/div[6]/div/a";
    public static final String needHelpPhoneNumberXpathWebElement = "//a[@id='footerPhoneNumId']";

    public static final String captchaImNotARobotXpathWebElement = "//*[@id=\"recaptcha-anchor\"]/div[1]";
    public static final String nextOnRegisterPageCSSWebElement = "#registerButtonId";


}
