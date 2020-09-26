package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.TMobHomePageWebElements.*;

public class TMobHomePage extends CommonAPI{

    @FindBy(how = How.XPATH, using = wirelessTabXPath) public WebElement wirelessTab;
    @FindBy(how = How.XPATH, using = businessTabXPath) public WebElement businessTab;
    @FindBy(how = How.XPATH, using = prepaidTabXPath) public WebElement prepaidTab;
    @FindBy(how = How.XPATH, using = tvTabXPath) public WebElement tvTab;
    @FindBy(how = How.XPATH, using = bankingTabXPath) public WebElement bankingTab;


        // Action Method
    public void checkWirelessTab() throws InterruptedException {
        wirelessTab.click();
        handleNewTab(driver);
    }

    // Validation Method
    public void validateWirelessTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.t-mobile.com/";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
//    *********************************************

    // Action Method
    public void checkBusinessTab() throws InterruptedException {
        businessTab.click();
        handleNewTab(driver);
    }

    // Validation Method
    public void validateBusinessTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.t-mobile.com/business";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
//    *********************************************

    // Action Method
    public void checkPrepaidTab() throws InterruptedException {
        prepaidTab.click();
        handleNewTab(driver);
    }

    // Validation Method
    public void validatePrepaidTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://prepaid.t-mobile.com/home";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
//    *********************************************

    // Action Method
    public void checkTvTab() throws InterruptedException {
        tvTab.click();
        handleNewTab(driver);
    }

    // Validation Method
    public void validateTvTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.t-mobile.com/tvision";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
//    *********************************************

    // Action Method
    public void checkBankingTab() throws InterruptedException {
        bankingTab.click();
        handleNewTab(driver);
    }

    // Validation Method
    public void validateBankingTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.t-mobilemoney.com/en/home.html";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
//    *********************************************


}
