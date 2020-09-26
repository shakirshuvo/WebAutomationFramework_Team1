package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HFHomePageWebElements.*;

public class HFHomePage extends CommonAPI{

    // @FindBy(how = How.XPATH, using = ) public WebElement ;
    @FindBy(how = How.XPATH, using = autoTabXPath) public WebElement autoTab;
    @FindBy(how = How.XPATH, using = carInsuranceTabXPath) public WebElement carInsuranceTab;
    @FindBy(how = How.XPATH, using = homeTabXPath) public WebElement homeTab;
    @FindBy(how = How.XPATH, using = condoInsuranceTabXPath) public WebElement condoInsuranceTab;
    @FindBy(how = How.XPATH, using = businessTabXPath) public WebElement businessTab;
    @FindBy(how = How.XPATH, using = businessInsuranceTabXPath) public WebElement businessInsuranceTab;
    @FindBy(how = How.XPATH, using = employeeBenefitTabXPath) public WebElement employeeBenefitTab;
    @FindBy(how = How.XPATH, using = forEmployersTabXPath) public WebElement forEmployersTab;
    @FindBy(how = How.XPATH, using = aboutUsTabXPath) public WebElement aboutUsTab;
    @FindBy(how = How.XPATH, using = newsroomTabXPath) public WebElement newsroomTab;

    // Action Method
    public void checkCarInsuranceTab() throws InterruptedException {
        mouseHoverByXpath(autoTabXPath);
        sleepFor(2);
        carInsuranceTab.click();
    }

    // Validation Method
    public void validateCarInsuranceTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.thehartford.com/aarp/car-insurance";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkCondoInsuranceTab() throws InterruptedException {
        mouseHoverByXpath(homeTabXPath);
        sleepFor(2);
        condoInsuranceTab.click();
    }

    // Validation Method
    public void validateCondoInsuranceTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.thehartford.com/aarp/condo-insurance";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkBusinessInsuranceTab() throws InterruptedException {
        mouseHoverByXpath(businessTabXPath);
        sleepFor(2);
        businessInsuranceTab.click();
    }

    // Validation Method
    public void validateBusinessInsuranceTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.thehartford.com/business-coverages";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkforEmployersTab() throws InterruptedException {
        mouseHoverByXpath(employeeBenefitTabXPath);
        sleepFor(2);
        forEmployersTab.click();
    }

    // Validation Method
    public void validateforEmployersTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.thehartford.com/employee-benefits/employers";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkNewsroomTab() throws InterruptedException {
        mouseHoverByXpath(aboutUsTabXPath);
        sleepFor(2);
        newsroomTab.click();
        handleNewTab(driver);
    }

    // Validation Method
    public void validateNewsroomTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://newsroom.thehartford.com/newsroom/";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

}
