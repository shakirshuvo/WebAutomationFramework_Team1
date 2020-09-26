package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageWebElements.*;

public class HomePage extends CommonAPI {
    String actual, expected;

    @FindBy(how = How.LINK_TEXT, using = todaysDealElementXpath )
    WebElement todaysDeals;

    @FindBy(how = How.LINK_TEXT, using = newReleasesElementXpath)
    WebElement newReleases;

    @FindBy(how = How.LINK_TEXT, using = customerServiceTabElementXpath)
    WebElement customerService;


    /**
     * click on customer service
     */
    public void clickOnCustomerService(){
        clickOnElement(customerServiceTabElementXpath);
    }

    /**
     * validate click on customer servce
     */
    public void validateClickOnCustomerService(){
        actual = driver.getTitle();
        expected = "Amazon.com Help: Help & Customer Service";
        Assert.assertEquals(actual, expected, "Test failed");
    }

    /**
     * click on new release
     */
    public void clickOnNewRelease(){
        clickOnElement(newReleasesElementXpath);
    }

    /**
     * validate click on new Release
     */
    public void validateClickOnNewRelease(){
        actual = driver.getTitle();
        expected = "Amazon.com New Releases: The best-selling new & future releases on Amazon";
        Assert.assertEquals(actual, expected, "Test failed");
    }

    /**
     * click on todays deals
     */
    public void clickOnTodaysDeals(){
        clickOnElement(todaysDealElementXpath);
    }

    /**
     * validate click on todays deals
     */
    public void validateClickOnTodysDeals(){
        actual = driver.getTitle();
        expected = "Gold Box Deals | Today's Deals - Amazon.com";
        Assert.assertEquals(actual, expected, "Test failed");
    }








}
