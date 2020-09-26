package home;

import base.CommonAPI;
import dataSource.DataSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

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

    @FindBy(how = How.XPATH, using = crossbuttonXPath) public WebElement crossbutton;
    @FindBy(how = How.XPATH, using = signInButtonXPath) public WebElement signInButton;
    @FindBy(how = How.XPATH, using = myuhcSignInXPath) public WebElement myuhcSignIn;
    @FindBy(how = How.XPATH, using = myuhcSignInButtonXPath) public WebElement myuhcSignInButton;
    @FindBy(how = How.XPATH, using = myuhcUserNameXPath) public WebElement myuhcUserName;
    @FindBy(how = How.XPATH, using = myuhcPasswordXPath) public WebElement myuhcPassword;
    @FindBy(how = How.XPATH, using = myuhcRememberMeCheckBoxXPath) public WebElement myuhcRememberMeCheckBox;
    @FindBy(how = How.XPATH, using = myuhcSignInSubmitButtonXPath) public WebElement myuhcSignInSubmitButton;
    @FindBy(how = How.XPATH, using = myuhcSignInErrorXPath) public WebElement myuhcSignInError;

    @FindBy(how = How.XPATH, using = myuhcRegisterNowXPath) public WebElement myuhcRegisterNow;
    @FindBy(how = How.XPATH, using = myuhcFirstNameXPath) public WebElement myuhcFirstName;
    @FindBy(how = How.XPATH, using = myuhcLastNameXPath) public WebElement myuhcLastName;
    @FindBy(how = How.XPATH, using = myuhcMonthDropDownXPath) public WebElement myuhcMonthDropDown;
    @FindBy(how = How.XPATH, using = myuhcRegisterBirthMonthXPath) public WebElement myuhcRegisterBirthMonth;
    @FindBy(how = How.XPATH, using = myuhcDateInputXPath) public WebElement myuhcDateInput;
    @FindBy(how = How.XPATH, using = myuhcYearInputXPath) public WebElement myuhcYearInput;
    @FindBy(how = How.XPATH, using = myuhcSSNRadioButtonXPath) public WebElement myuhcSSNRadioButton;
    @FindBy(how = How.XPATH, using = myuhcSSNInputXPath) public WebElement myuhcSSNInput;
    @FindBy(how = How.XPATH, using = myuhcZipCodeInputXPath) public WebElement myuhcZipCodeInput;
    @FindBy(how = How.XPATH, using = myuhcRegistrationContinueXPath) public WebElement myuhcRegistrationContinue;
    @FindBy(how = How.XPATH, using = myuhcRegistrationErrorXPath) public WebElement myuhcRegistrationError;

    @FindBy(how = How.XPATH, using = medicareMemberSignInXPath) public WebElement medicareMemberSignIn;
    @FindBy(how = How.XPATH, using = medicareRegisterNowXPath) public WebElement medicareRegisterNow;
    @FindBy(how = How.XPATH, using = helpMeFindThisNumberXPath) public WebElement helpMeFindThisNumber;
    @FindBy(how = How.XPATH, using = helpPopUpXPath) public WebElement helpPopUp;
    @FindBy(how = How.XPATH, using = logoXPath) public WebElement logo;
    @FindBy(how = How.XPATH, using = searchBoxElementXPath) public WebElement searchBoxElement;
//    @FindBy(how = How.XPATH, using = ) public WebElement ;

    /**
     * This method gets the title of the page when called.
     *
     * @return the title of the page in String.
     */
    //public String getTitle() {return driver.getTitle().toString(); }

    /**
     * This method returns the URL of the page.
     * @return
     */
   // public String getURL(){return driver.getCurrentUrl();}


    // Action Method
    public void checkMedicare() {

        medicare.click();
        getCurrentPageUrl();
        System.out.println(getCurrentPageUrl());
    }

    // Validation Method
    public void validateMedicare(){
        String actualResult = getCurrentPageUrl();;
        String expectedResult = "https://www.uhc.com/medicare";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkForProviders   () {

        forProviders.click();
        //windowSwitch();
        handleNewTab(driver);
        getCurrentPageUrl();
        System.out.println(getCurrentPageUrl());
    }

    // Validation Method
    public void validateForProviders   (){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.uhcprovider.com/";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkForEmployers   () {

        forEmployers.click();
        getCurrentPageUrl();
        System.out.println(getCurrentPageUrl());
    }

    // Validation Method
    public void validateForEmployers   (){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.uhc.com/employer";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkForBrokers   () {

        forBrokers.click();
        getCurrentPageUrl();
        System.out.println(getCurrentPageUrl());
    }

    // Validation Method
    public void validateForBrokers   (){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.uhc.com/broker";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkLanguageChange   () {

        languageChange.click();
        getCurrentPageUrl();
        System.out.println(getCurrentPageUrl());
    }

    // Validation Method
    public void validateLanguageChange   (){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.uhc.com/es/latino";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkFindADoctor   () {

        findADoctor.click();
        getCurrentPageUrl();
        System.out.println(getCurrentPageUrl());
    }

    // Validation Method
    public void validateFindADoctor   (){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.uhc.com/find-a-physician";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkFindYourPlan   () {

        scrollUpDownByHeight();
        findYourPlan.click();
        getCurrentPageUrl();
        System.out.println(getCurrentPageUrl());
    }

    // Validation Method
    public void validateFindYourPlan   (){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.uhc.com/shop-online-health-insurance-plans";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkIndividualAndFamilyHealthPlan   () {

        scrollUpDownByHeight();
        individualAndFamilyHealthPlan.click();
        getCurrentPageUrl();
        System.out.println(getCurrentPageUrl());
    }

    // Validation Method
    public void validateIndividualAndFamilyHealthPlan   (){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.uhc.com/individual-and-family";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkMedicareHealthPlan   () {

        scrollUpDownByHeight();
        medicareHealthPlan.click();
        getCurrentPageUrl();
        System.out.println(getCurrentPageUrl());
    }

    // Validation Method
    public void validateMedicareHealthPlan   (){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.uhc.com/medicare";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkSmallBusinessHealthPlan   () {

        scrollUpDownByHeight();
        smallBusinessHealthPlan.click();
        getCurrentPageUrl();
        System.out.println(getCurrentPageUrl());
    }

    // Validation Method
    public void validateSmallBusinessHealthPlan   (){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.uhc.com/employer/small-business";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkShortTermInsurenceHealthPlan   () {

        scrollUpDownByHeight();
        shortTermInsurenceHealthPlan.click();
        getCurrentPageUrl();
        System.out.println(getCurrentPageUrl());
    }

    // Validation Method
    public void validateShortTermInsurenceHealthPlan   (){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.uhc.com/individual-and-family/short-term-health-insurance";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkMedicaidHealthPlan   () {

        scrollUpDownByHeight();
        medicaidHealthPlan.click();
        getCurrentPageUrl();
        System.out.println(getCurrentPageUrl());
    }

    // Validation Method
    public void validateMedicaidHealthPlan   (){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.uhc.com/individual-and-family/health-insurance-plans/medicare-medicaid/what-is-medicaid";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkDentalHealthPlan   () {

        scrollUpDownByHeight();
        dentalHealthPlan.click();
        getCurrentPageUrl();
        System.out.println(getCurrentPageUrl());
    }

    // Validation Method
    public void validateDentalHealthPlan   (){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.uhc.com/individual-and-family/dental-insurance";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkContactUs   () {

        scrollUpDownByHeight();
        contactUs.click();
        getCurrentPageUrl();
        System.out.println(getCurrentPageUrl());
    }

    // Validation Method
    public void validateContactUs   (){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.uhc.com/contact-us";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkCareer   () {

        scrollUpDownByHeight();
        career.click();
        getCurrentPageUrl();
        System.out.println(getCurrentPageUrl());
    }

    // Validation Method
    public void validateCareer   (){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.uhc.com/about-us/careers";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkNewsRoom   () {

        scrollUpDownByHeight();
        newsRoom.click();
        windowSwitch();
        getCurrentPageUrl();
        System.out.println(getCurrentPageUrl());
    }

    // Validation Method
    public void validateNewsRoom   (){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://newsroom.uhc.com/";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkAboutUs   () {

        scrollUpDownByHeight();
        aboutUs.click();
        getCurrentPageUrl();
        System.out.println(getCurrentPageUrl());
    }

    // Validation Method
    public void validateAboutUs   (){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.uhc.com/about-us";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkAccessibility   () {

        scrollUpDownByHeight();
        accessibility.click();
        getCurrentPageUrl();
        System.out.println(getCurrentPageUrl());
    }

    // Validation Method
    public void validateAccessibility   (){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.uhc.com/legal/accessibility";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkLegal   () {

        scrollUpDownByHeight();
        legal.click();
        getCurrentPageUrl();
        System.out.println(getCurrentPageUrl());
    }

    // Validation Method
    public void validateLegal   (){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.uhc.com/legal";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkPrivacy   () {

        scrollUpDownByHeight();
        privacy.click();
        getCurrentPageUrl();
        System.out.println(getCurrentPageUrl());
    }

    // Validation Method
    public void validatePrivacy   (){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.uhc.com/privacy";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void clickSignInButton   () throws InterruptedException {
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        WebElement select = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div[1]/div[3]/div/div[2]/div[3]/button"));
//
//        List<WebElement> options = select.findElements(By.cssSelector("#\\36 71978824-list1599078528739 > li:nth-child(2) > a > span"));
//
//        for (WebElement option : options) {
//
//            if ("Plan through your employer?".equals(option.getText())){
//                System.out.println("text found");
//                option.click();
//                System.out.println("clicked");
//            }else {
//                System.out.println("failed");
//            }



            sleepFor(5);
//            crossbutton.click();
//        signInButton.click();
//        sleepFor(5);
////        cancelAlert();
//        myuhcSignIn.click();
//        }


//        crossbutton.click();
        signInButton.click();
        sleepFor(5);
//        cancelAlert();
        //*[@id="671978824-list1599078528739"]/li[2]
        //myuhcSignIn.click();
        medicareMemberSignIn.click();
    }

    public void clickMyuhcSignIn   () throws InterruptedException {
//        waitUntilClickAble(By.xpath(myuhcSignInXPath));
//        waitUntilVisible(By.xpath(myuhcSignInXPath));

//        myuhcSignIn.click();
//        handleNewTab(driver);
    }

    public void clickMyuhcSignInButton   () {
        handleNewTab(driver);
        myuhcSignInButton.click();
    }

    public void insertMyuhcUserName   (String userName) {
        clearInputBox(myuhcUserName);
        myuhcUserName.sendKeys(userName);
    }

    public void insertMyuhcPassword   (String password) {
        clearInputBox(myuhcPassword);
        myuhcPassword.sendKeys(password);

    }

    public void checkMyuhcRememberMeCheckBox   () {
        myuhcRememberMeCheckBox.click();
    }

    public void clickMyuhcSignInSubmitButton   () {
        myuhcSignInSubmitButton.click();
        //System.out.println(myuhcSignInError.getText());
    }


    // Validation Method
    public void validateMyuhcSigninError  (){
        String actualResult = myuhcSignInError.getText();
        String expectedResult = "alert\n" +
                "The username and password combination entered does not match our records.";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************



    public void searchBoxCheckUsingClassValues() throws InterruptedException {

        driver.manage().window().maximize();
        List<String> products = dataSource.DataSource.getItemValue();
        for (String st : products) {
            typeOnElementNEnter(searchBoxElementXPath, st, driver);
            System.out.println("Expected Text is =" + st);
            String expectedResult = "https://www.uhc.com/searchresult?q=" + st + "&start=0&rows=20&fq=lang:en";
            sleepFor(3);
            String actualResult = getCurrentPageUrl();
            System.out.println("Actual Text  =" + actualResult);
            Assert.assertEquals(actualResult, expectedResult, "Test Failed");

            searchBoxElement.clear();

        }
    }
    public void searchBoxCheckGetItemsListFromDB() throws Exception {
        DataSource.insertDataIntoSQLDB();
        driver.manage().window().maximize();
        List<String> products = dataSource.DataSource.getItemsListFromDB();
        for (String st : products) {
            typeOnElementNEnter(searchBoxElementXPath, st, driver);
            System.out.println("Expected Text is =" + st);
            String expectedResult = "https://www.uhc.com/searchresult?q=" + st + "&start=0&rows=20&fq=lang:en";
            sleepFor(3);
            String actualResult = getCurrentPageUrl();
            System.out.println("Actual Text  =" + actualResult);
            Assert.assertEquals(actualResult, expectedResult, "Test Failed");

            searchBoxElement.clear();

        }

    }
    public void searchBoxCheckGetItemsListFromExcel() throws Exception {
        driver.manage().window().maximize();
        List<String> itemList = DataSource.getItemsListFromExcel();
        for(int i =1; i<itemList.size();i++){
            String st=itemList.get(i);
            typeOnElementNEnter(searchBoxElementXPath, st, driver);
            System.out.println("Expected Text is =" + st);
            String expectedResult = "https://www.uhc.com/searchresult?q=" + st + "&start=0&rows=20&fq=lang:en";
            sleepFor(3);
            String actualResult = getCurrentPageUrl();
            System.out.println("Actual Text  =" + actualResult);
            Assert.assertEquals(actualResult, expectedResult, "Test Failed");

            searchBoxElement.clear();

        }
    }


}
