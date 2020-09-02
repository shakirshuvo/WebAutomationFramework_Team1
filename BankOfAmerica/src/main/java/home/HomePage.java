package home;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

import static home.HomePageWebElements.*;

public class HomePage extends CommonAPI {

    @FindBy(how = How.XPATH, using = checkingWebElementXPath)
    WebElement checkingWebElement;

    @FindBy(how = How.XPATH, using = stayFlexibleTextWebElementXPath)
    WebElement stayFlexibleText;

    @FindBy(how = How.XPATH, using = advantageBankingTextWebElementXPath)
    WebElement advantageBanking;

    @FindBy(how = How.ID, using = exploreCheckingSolutionsWebElementID)
    WebElement exploreCheckingSolutions;
    @FindBy(how = How.XPATH, using = enterZipCoderWebElementXPath)
    WebElement enterZipCode;

    @FindBy(how = How.ID, using = goZipCodeButtonWebElementID)
    WebElement goZipCodeButton;

    //personal element
    @FindBy(how = How.ID, using = personalWebElementID)
    WebElement personal;

    @FindBy(how = How.XPATH, using =hereToHelpWebElementXPath)
    WebElement hereToHelp;

    /**
     * test clicking on Personal element
     */
    public void clickOnPersonal(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       clickOnElement(personalWebElementID);
        //personal.click();
        //System.out.println("this is personal");
    }

    /**
     * validate click on personal
     */
    public void validateClickOnPersonal(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String actual = hereToHelp.getText();
        Assert.assertEquals(actual, heretoHelpExpectedText);
    }

//    @FindBy(how = How.XPATH, using = advantageBankingTextWebElementID)
//        WebElement advantageBanking;

    /**
     * checks clicking on the checking element
     * @Author: Waqas
     */

    public void clickOnChecking(){
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        checkingWebElement.click();
    }

    /**
     * validate click on checking
     * @Author: waqas
     */
    public void validateClickOnChecking(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String actualText = stayFlexibleText.getText();
        Assert.assertEquals(actualText,stayFlexibleExpectedText);
    }

    /**
     * get text from advantage Banking element
     */
    public void clickOnAdvantageBanking(){
        advantageBanking.click();
    }

    /**
     * validate advantage Banking
     */
    public void validateAdvantageBanking(){
       /// clickOnAdvantageBanking();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String actual = advantageBanking.getText();
        System.out.println(actual);
        Assert.assertEquals(actual, advantageBankingExpectedText);
    }

    //open account
    @FindBy(how = How.XPATH, using = openAccountWEXPath)
    WebElement openAccount;

    @FindBy(how = How.XPATH, using = safeBalanceBankingXPath)
    WebElement safeBalance;
    /**
     * click on open account button
     */
    public void clickOpenAccount(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickOnPersonal();
        openAccount.click();
    }

    /**
     * validate click on open account
     */
    public void validateClickOpenAccount(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String actual = safeBalance.getText();
        Assert.assertEquals(actual, safeBalanceExpectedText);
    }

    //small business element
    @FindBy(how = How.XPATH, using = smallBusinessWEXPath)
    WebElement smallBusiness;
    @FindBy(how = How.CSS, using = yourNewsWBECss)
    WebElement yourNewselement;

    /**
     * click on small business
     */
    public void clickOnSmallBusiness(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        smallBusiness.click();
    }

    /**
     * validate small business element
     */
    public void validateSmallBusinessElement(){
        String actual = yourNewselement.getText();
        Assert.assertEquals(actual,smExpectedText);
    }

    // wealth management
    @FindBy(how = How.XPATH, using = wealthManagementElementXPath)
    WebElement wealthManagement;
    @FindBy(how = How.XPATH, using = wmTagXPath)
    WebElement wmTag;

    /**
     * click on wealth management
     */
    public void clickOnWealthMangement(){
        wealthManagement.click();
    }

    /**
     * validate click on wealth management
     */
    public void validateClickOnWealthManagement(){
        String actual = wmTag.getText();
        Assert.assertEquals(actual, wmExpectedText);
    }

    //business Institutions element
    @FindBy(how = How.XPATH, using = businessInstElementXPath)
    WebElement businessInstitutes;

    @FindBy(how = How.XPATH, using = economicsOfReopeningXPath)
    WebElement economicsOfReopening;

    /**
     * click on business and institutions
     */
    public void clickOnBusinessInstitutions(){
        businessInstitutes.click();
    }

    /**
     * validate click on business and institutions
     */
    public void validateClickBusinessInstitutions(){
        String actual = economicsOfReopening.getText();
        Assert.assertEquals(actual, erExpectedText);
    }

    // About us
    @FindBy(how= How.XPATH, using = aboutUsElementXPath)
    WebElement aboutUs;
    @FindBy(how= How.ID, using = whoWeArElementID)
    WebElement whoWeAre;

    /**
     * click on About us
     */
    public void clickOnAboutUs(){
        aboutUs.click();
    }
    /**
     * validate About us
     */
    public void validateAboutUs(){
        String actual = whoWeAre.getText();
    }




}// ends class HomePage


