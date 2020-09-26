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
//
//
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



}
