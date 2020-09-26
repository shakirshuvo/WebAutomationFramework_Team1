package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;

import static home.HomeWebElements.*;

public class Home extends CommonAPI {
    @FindBy(how = How.ID,using = personalButtonID)
    public WebElement personalButton;
    @FindBy(how = How.CSS,using = checkingButtonCSS)
    public WebElement checkingButton;
    @FindBy(how = How.ID,using = onlineCheckingID)
    public WebElement onlineChecking;
    @FindBy(how = How.CSS,using = personalValidationCSS)
    public WebElement personalValidation;
    @FindBy(how = How.ID,using = smallBusinessID)
    public WebElement smallBusiness;
    @FindBy(how = How.CSS,using = savingButtonCSS)
    public WebElement savingButton;
    @FindBy(how = How.ID,using = businessInvestmentAccountID)
    public WebElement businessInvestmentAccount;
    @FindBy(how = How.XPATH,using = zipCodeFieldXP)
    public WebElement zipCodeField;
    @FindBy(how = How.ID,using = goButtonID)
    public WebElement goButton;
    @FindBy(how = How.XPATH,using = smallBusinessValidationXP)
    public WebElement smallBusinessValidation;
    @FindBy(how = How.XPATH,using = wealthManagementXP)
    public WebElement wealthManagement;
    @FindBy(how = How.CLASS_NAME,using = wealthManagementValidationClass)
    public WebElement wealthManagementValidation;
    @FindBy(how = How.XPATH,using =businessesInstitutionsXP)
    public WebElement businessesInstitutions;
    @FindBy(how = How.XPATH,using = businessesInstitutionsValidationXP)
    public WebElement businessesInstitutionsValidation;
    @FindBy(how = How.ID,using = securityID)
    public WebElement security;
    @FindBy(how = How.XPATH,using = securityValidationXP)
    public WebElement securityValidation;

    @FindBy(tagName = "a")
    List<WebElement> aTag;

    @FindBy(tagName = "img")
    List<WebElement> IMG;


    public void setPersonalButton() throws InterruptedException {
        personalButton.click();
        sleepFor(3);
        checkingButton.click();
        sleepFor(3);
        onlineChecking.click();
        sleepFor(3);
        String actualText=personalValidation.getText();
        String expectedText="Take charge of your account, at home or on the go";
        Assert.assertEquals(actualText,expectedText,"*********failed**********");
    }
    public void setSmallBusiness() throws InterruptedException {
        smallBusiness.click();
        sleepFor(3);
        savingButton.click();
        sleepFor(3);
        businessInvestmentAccount.click();
        sleepFor(3);
        zipCodeField.sendKeys("11214");
        goButton.click();
        sleepFor(3);
        String actualText=smallBusinessValidation.getText();
        String expectedText="Overview";
        Assert.assertEquals(actualText,expectedText,"********failed********");
    }
    public void setWealthManagement() throws InterruptedException {
        wealthManagement.click();
        sleepFor(3);
        String actualText=wealthManagementValidation.getText();
        String expectedText="Wealth Management";
        Assert.assertEquals(actualText,expectedText,"**********failed**********");
    }
    public void setBusinessesInstitutions() throws InterruptedException {
        businessesInstitutions.click();
        sleepFor(3);
        String actualText=businessesInstitutionsValidation.getText();
        String expected="Global Banking & Markets";
        Assert.assertEquals(actualText,expected,"*********failed***********");
    }
    public void setSecurity() throws InterruptedException {
        security.click();
        sleepFor(3);
        String actualTex=securityValidation.getText();
        String expectedText="Bank of America Security Center";
        Assert.assertEquals(actualTex,expectedText,"**********failed*********");
    }

    }





