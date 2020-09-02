package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.UHCHomePageWebElements.*;


public class UHCHomePage extends CommonAPI {
    // Action Class: All the action methods and Validate methods

    @FindBy(how = How.XPATH, using = medicareXPath) public WebElement medicare;
    @FindBy(how = How.XPATH, using = forProvidersXPath) public WebElement forProviders;
    @FindBy(how = How.XPATH, using = forEmployersXPath) public WebElement forEmployers;
    @FindBy(how = How.XPATH, using = forBrokersXPath) public WebElement forBrokers;
    @FindBy(how = How.XPATH, using = languageChangeXPath) public WebElement languageChange;
    @FindBy(how = How.XPATH, using = findADoctorXPath) public WebElement findADoctor;
    @FindBy(how = How.XPATH, using = findYourPlanXPath) public WebElement findYourPlan;
    @FindBy(how = How.XPATH, using = individualAndFamilyHealthPlanXPath) public WebElement individualAndFamilyHealthPlan;
    @FindBy(how = How.XPATH, using = medicareHealthPlanXPath) public WebElement medicareHealthPlan;
    @FindBy(how = How.XPATH, using = smallBusinessHealthPlanXPath) public WebElement smallBusinessHealthPlan;
    @FindBy(how = How.XPATH, using = shortTermInsurenceHealthPlanXPath) public WebElement shortTermInsurenceHealthPlan;
    @FindBy(how = How.XPATH, using = medicaidHealthPlanXPath) public WebElement medicaidHealthPlan;
    @FindBy(how = How.XPATH, using = dentalHealthPlanXPath) public WebElement dentalHealthPlan;
    @FindBy(how = How.XPATH, using = contactUsXPath) public WebElement contactUs;
    @FindBy(how = How.XPATH, using = careerXPath) public WebElement career;
    @FindBy(how = How.XPATH, using = newsRoomXPath) public WebElement newsRoom;
    @FindBy(how = How.XPATH, using = aboutUsXPath) public WebElement aboutUs;
    @FindBy(how = How.XPATH, using = accessibilityXPath) public WebElement accessibility;
    @FindBy(how = How.XPATH, using = legalXPath) public WebElement legal;
    @FindBy(how = How.XPATH, using = privacyXPath) public WebElement privacy;


    /**
     * This method gets the title of the page when called.
     *
     * @return the title of the page in String.
     */
    public String getTitle() {
        return driver.getTitle().toString();
    }

    /**
     * This method returns the URL of the page.
     * @return
     */
    public String getURL(){
        return driver.getCurrentUrl();
    }


    // Action Method
    public void checkMedicare() {

        medicare.click();
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
    }

    // Validation Method
    public void validateMedicare(){
        String actualResult = getURL();
        String expectedResult = "https://www.uhc.com/medicare";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkForProviders   () {

        forProviders.click();
//        windowSwitch();
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
    }

    // Validation Method
    public void validateForProviders   (){
        String actualResult = getURL();
        String expectedResult = "https://www.uhcprovider.com/";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkForEmployers   () {

        forEmployers.click();
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
    }

    // Validation Method
    public void validateForEmployers   (){
        String actualResult = getURL();
        String expectedResult = "https://www.uhc.com/employer";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkForBrokers   () {

        forBrokers.click();
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
    }

    // Validation Method
    public void validateForBrokers   (){
        String actualResult = getURL();
        String expectedResult = "https://www.uhc.com/broker";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkLanguageChange   () {

        languageChange.click();
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
    }

    // Validation Method
    public void validateLanguageChange   (){
        String actualResult = getURL();
        String expectedResult = "https://www.uhc.com/es/latino";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkFindADoctor   () {

        findADoctor.click();
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
    }

    // Validation Method
    public void validateFindADoctor   (){
        String actualResult = getURL();
        String expectedResult = "https://www.uhc.com/find-a-physician";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkFindYourPlan   () {

//        scrollUpDownByHeight();
        findYourPlan.click();
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
    }

    // Validation Method
    public void validateFindYourPlan   (){
        String actualResult = getURL();
        String expectedResult = "https://www.uhc.com/shop-online-health-insurance-plans";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkIndividualAndFamilyHealthPlan   () {

//        scrollUpDownByHeight();
        individualAndFamilyHealthPlan.click();
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
    }

    // Validation Method
    public void validateIndividualAndFamilyHealthPlan   (){
        String actualResult = getURL();
        String expectedResult = "https://www.uhc.com/individual-and-family";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkMedicareHealthPlan   () {

//        scrollUpDownByHeight();
        medicareHealthPlan.click();
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
    }

    // Validation Method
    public void validateMedicareHealthPlan   (){
        String actualResult = getURL();
        String expectedResult = "https://www.uhc.com/medicare";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkSmallBusinessHealthPlan   () {

//        scrollUpDownByHeight();
        smallBusinessHealthPlan.click();
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
    }

    // Validation Method
    public void validateSmallBusinessHealthPlan   (){
        String actualResult = getURL();
        String expectedResult = "https://www.uhc.com/employer/small-business";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkShortTermInsurenceHealthPlan   () {

//        scrollUpDownByHeight();
        shortTermInsurenceHealthPlan.click();
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
    }

    // Validation Method
    public void validateShortTermInsurenceHealthPlan   (){
        String actualResult = getURL();
        String expectedResult = "https://www.uhc.com/individual-and-family/short-term-health-insurance";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkMedicaidHealthPlan   () {

//        scrollUpDownByHeight();
        medicaidHealthPlan.click();
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
    }

    // Validation Method
    public void validateMedicaidHealthPlan   (){
        String actualResult = getURL();
        String expectedResult = "https://www.uhc.com/individual-and-family/health-insurance-plans/medicare-medicaid/what-is-medicaid";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkDentalHealthPlan   () {

//        scrollUpDownByHeight();
        dentalHealthPlan.click();
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
    }

    // Validation Method
    public void validateDentalHealthPlan   (){
        String actualResult = getURL();
        String expectedResult = "https://www.uhc.com/individual-and-family/dental-insurance";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkContactUs   () {

//        scrollUpDownByHeight();
        contactUs.click();
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
    }

    // Validation Method
    public void validateContactUs   (){
        String actualResult = getURL();
        String expectedResult = "https://www.uhc.com/contact-us";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkCareer   () {

//        scrollUpDownByHeight();
        career.click();
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
    }

    // Validation Method
    public void validateCareer   (){
        String actualResult = getURL();
        String expectedResult = "https://www.uhc.com/about-us/careers";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkNewsRoom   () {

//        scrollUpDownByHeight();
        newsRoom.click();
//        windowSwitch();
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
    }

    // Validation Method
    public void validateNewsRoom   (){
        String actualResult = getURL();
        String expectedResult = "https://newsroom.uhc.com/";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkAboutUs   () {

//        scrollUpDownByHeight();
        aboutUs.click();
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
    }

    // Validation Method
    public void validateAboutUs   (){
        String actualResult = getURL();
        String expectedResult = "https://www.uhc.com/about-us";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkAccessibility   () {

//        scrollUpDownByHeight();
        accessibility.click();
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
    }

    // Validation Method
    public void validateAccessibility   (){
        String actualResult = getURL();
        String expectedResult = "https://www.uhc.com/legal/accessibility";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkLegal   () {

//        scrollUpDownByHeight();
        legal.click();
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
    }

    // Validation Method
    public void validateLegal   (){
        String actualResult = getURL();
        String expectedResult = "https://www.uhc.com/legal";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkPrivacy   () {

//        scrollUpDownByHeight();
        privacy.click();
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
    }

    // Validation Method
    public void validatePrivacy   (){
        String actualResult = getURL();
        String expectedResult = "https://www.uhc.com/privacy";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************




}
