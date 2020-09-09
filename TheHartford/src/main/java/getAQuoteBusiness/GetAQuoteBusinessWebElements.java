package getAQuoteBusiness;

import com.github.javafaker.Faker;

public class GetAQuoteBusinessWebElements {

    static Faker faker = new Faker();

    public static final String businessButtonXpathWebElement = "//div[@id='cqb-nav-1']/ul/li[3]/div/a";
    public static final String quoteTodayButtonXpathWebElement = "//span[text()='Quote Today']";
    public static final String beginURL = "https://smallbizquote.thehartford.com/app/index.html#/form/begin";
    public static final String describeBusinessFieldCSSWebElement = "#primaryBusinessTxt";
    public static final String businessType = "Technology Service Provider";
    public static final String additionalServiceNoCSSWebElement = "#options2";
    public static final String numberOfBusinessLocationsCSSWebElement = "#businessLocation";
    public static final String randomNumber = faker.internet().password(1,1);
    public static final String numberOfEmployeesCSSWebElement = "#noOfEmployee";
    public static final String vaZipCode = "22182";
    public static final String zipCodeCSSWebElement = "#businessZIPCode";
    public static final String continueButtonIDWebElement = "btnNext";
    public static final String pleaseSelectADescriptionForYourBusinessAlterXpathWebElement = "//span[text()='Please select a description for your business']";



}
