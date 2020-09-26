package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import static home.TMHomePageWebElements.*;
public class TMobileHomepage extends CommonAPI {
        String actual, expected;
    /**
     * click on wireless element
     */
    public void clickOnWirelessTab(){
        clickOnElement(wirelessTabElementXpath);
    }

    /**
     * validate click on wireless tab
     */
    public void validateClickOnWirelessTab(){

        actual = driver.getTitle();
        expected = "T-Mobile & Sprint Merged to Create the Best Wireless Carrier";
        Assert.assertEquals(actual, expected);
    }

    /**
     * click on business tab on top element
     */
    public void clickOnBusinessTab(){
        clickOnElement(businessTabElementXpath);
    }

    /**
     * validate click on business tab
     */
    public void validateClickOnBusinessTab(){
        handleNewTab(driver);
        actual = driver.getTitle();
        expected = "Business Phones, Plans, Wireless Solutions | T-Mobile for Business";
        Assert.assertEquals(actual, expected);
    }

    /**
     * click on prepaid tab on top element
     */
    public void clickOnPrePaidTab(){

        clickOnElement(prePaidTabElementXpath);
    }

    /**
     * validate click on prepaid tab
     */
    public void validateClickOnPrePaidTab(){
        handleNewTab(driver);
        actual = driver.getTitle();
        expected = "Prepaid Cell Phone Plans, Smartphones & 4G LTE Service | T-Mobile";
        Assert.assertEquals(actual, expected);
    }

    /**
     * click on tv tab on top element
     */
    public void clickOnTvTab(){
        clickOnElement(tvTabElementXpath);
    }

    /**
     * validate click on tv tab
     */
    public void validateClickOnTv(){
        handleNewTab(driver);
        actual = driver.getTitle();
        expected = "TVision Home TV Services: An Alternative to Cable TV | T-Mobile";
        Assert.assertEquals(actual, expected);
    }

    /**
     * click on banking tab on top element
     */
    public void clickOnBankingTab(){
        clickOnElement(bankingTabElementXpath);
    }

    /**
     * validate click on banking tab
     */
    public void validateClickOnBanking(){
        handleNewTab(driver);
        actual = driver.getTitle();
        expected = "T-Mobile MONEY | Online Checking Account | T-Mobile";
        Assert.assertEquals(actual, expected);
    }




}
