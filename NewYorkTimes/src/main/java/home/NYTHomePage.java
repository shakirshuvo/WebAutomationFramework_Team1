package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static home.NYTHomePageWebElements.*;

public class NYTHomePage extends CommonAPI {

    // @FindBy(how = How.XPATH, using = destinationFromXPath) public WebElement destinationFrom;
    @FindBy(how = How.XPATH, using = worldTabXPath)
    public WebElement worldTab;
    @FindBy(how = How.XPATH, using = usTabXPath)
    public WebElement usTab;
    @FindBy(how = How.XPATH, using = politicsTabXPath)
    public WebElement politicsTab;
    @FindBy(how = How.XPATH, using = nyTabXPath)
    public WebElement nyTab;
    @FindBy(how = How.XPATH, using = businessTabXPath)
    public WebElement businessTab;


    // Action Method
    public void checkWorldTab() throws InterruptedException {
        worldTab.click();
    }

    // Validation Method
    public void validateWorldTab() {
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.nytimes.com/section/world";
        Assert.assertEquals(actualResult, expectedResult, "Test failed");
    }
    //*********************************************

    // Action Method
    public void checkUSTab() throws InterruptedException {
        usTab.click();
    }

    // Validation Method
    public void validateUSTab() {
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.nytimes.com/section/us";
        Assert.assertEquals(actualResult, expectedResult, "Test failed");
    }
    //*********************************************

    // Action Method
    public void checkPoliticsTab() throws InterruptedException {
        politicsTab.click();
    }

    // Validation Method
    public void validatePoliticsTab() {
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.nytimes.com/section/politics";
        Assert.assertEquals(actualResult, expectedResult, "Test failed");
    }
    //*********************************************

    // Action Method
    public void checkNYTab() {
        nyTab.click();
    }

    // Validation Method
    public void validateNYTab() {
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.nytimes.com/section/nyregion";
        Assert.assertEquals(actualResult, expectedResult, "Test failed");
    }
    //*********************************************

    // Action Method
    public void checkBusinessTab() throws InterruptedException {
        businessTab.click();
    }

    // Validation Method
    public void validateBusinessTab() {
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.nytimes.com/section/business";
        Assert.assertEquals(actualResult, expectedResult, "Test failed");
    }
    //*********************************************

}