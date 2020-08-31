package myAccount;

import com.github.javafaker.Faker;

public class MyAccountWebElements {

    static Faker faker = new Faker();

    public static final String randomEmailAddress = faker.internet().emailAddress();
    public static final String randomFirstName = faker.name().firstName();
    public static final String randomLastName = faker.name().lastName();
    public static final String myAccountTabXpathWebElement = "/html/body/header/nav/div[1]/div/ul/li[5]/div/a";
    public static final String imAnEmployerOrPlanAdministratorLoginButtonXPathWebElement = "/html/body/header/nav/div[1]/div/ul/li[5]/div/div/article[4]/div/div/div[2]/div[3]/a[1]/span";
    public static final String imAnEmployerOrPlanAdministratorLoginPageURL = "https://gbuserredirect.thehartford.com/login?usertype=employer";
    public static final String imAnEmployerOrPlanAdministratorRegisterButtonXPathWebElement = "/html/body/header/nav/div[1]/div/ul/li[5]/div/div/article[4]/div/div/div[2]/div[3]/a[2]";
    public static final String imAnEmployerOrPlanAdministratorRegisterPageURL = "https://gbuserredirect.thehartford.com/register?usertype=employer";
    public static final String whatIsYourEmailAddressCSSWebElement = "#email";
    public static final String whatIsYourFirstNameCSSWebElement = "#firstName";
    public static final String whatIsYourLastNameCSSWebElement = "#lastName";
    public static final String captchaImNotARobotXpathWebElement = "//*[@id=\"recaptcha-anchor\"]/div[1]";
    public static final String nextOnRegisterPageCSSWebElement = "#registerButtonId";


}
