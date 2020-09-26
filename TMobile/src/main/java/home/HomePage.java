package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageWebElements.*;

public class HomePage extends CommonAPI {

    @FindBy(how = How.ID,using = logoSignID)
    public WebElement logoSign;
    @FindBy(how = How.XPATH,using = logoSignValidationXP)
    public WebElement logoSignValidation;
    @FindBy(how = How.ID,using = plansCSS)
    public WebElement plans;
    @FindBy(how =How.CSS,using = magentaPlanCSS)
    public WebElement magentaPlan;
    @FindBy(how = How.XPATH,using = planValidationXP)
    public WebElement planValidation;
    @FindBy(how = How.ID,using = phoneDevisesID)
    public WebElement phoneDevises;
    @FindBy(how = How.XPATH,using = cellPhoneXP)
    public WebElement cellPhone;
    @FindBy(how = How.XPATH,using = phoneDeviseValidationXP)
    public WebElement phoneDeviseValidation;
    @FindBy(how = How.ID,using = dealsID)
    public WebElement deals;
    @FindBy(how = How.CSS,using = appleCSS)
    public WebElement apple;
    @FindBy(how = How.XPATH,using = dealsValidationXP)
    public WebElement dealsValidation;
    @FindBy(how = How.ID,using = coverageID)
    public WebElement coverage;
    @FindBy(how = How.XPATH,using = whatIs5gXp)
    public WebElement whatIs5g;
    @FindBy(how = How.XPATH,using = coverageValidationXP)
    public WebElement coverageValidation;
    @FindBy(how = How.ID,using = benefitsMoreID)
    public WebElement benefits;
    @FindBy(how = How.XPATH,using = blockScamCallsXP)
    public WebElement blockScamCalls;
    @FindBy(how = How.XPATH,using = findStoreXP)
    public WebElement findStore;
    @FindBy(how = How.XPATH,using = findStoreSearchFieldXP)
    public WebElement findStoreSearchField;
    @FindBy(how = How.XPATH,using = bay28thStoreXP)
    public WebElement bay28thStore;
    @FindBy(how = How.XPATH,using = findStoreValidationXP)
    public WebElement findStoreValidation;

    public void setLogoSign() throws InterruptedException {
        logoSign.click();
        sleepFor(3);
        String actualText=logoSignValidation.getText();
        String expectedText="T-Mobile has merged with Sprint!";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }
    public void setPlans() throws InterruptedException {
        Actions actions=new Actions(driver);
        actions.moveToElement(plans).build().perform();
        sleepFor(3);
        magentaPlan.click();
        sleepFor(3);
        String actualText=planValidation.getText();
        String expectedText="There's a cell phone plan for everyone.";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
        sleepFor(3);
    }
    public void setPhoneDevises() throws InterruptedException {
     Actions actions=new Actions(driver);
     actions.moveToElement(phoneDevises).build().perform();
     cellPhone.click();
     sleepFor(3);
     String actualText=phoneDeviseValidation.getText();
     String expectedText="Shop";
     Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }
    public void setDeals() throws InterruptedException {
        Actions actions=new Actions(driver);
        actions.moveToElement(deals).build().perform();
        sleepFor(2);
        apple.click();
        sleepFor(2);
        String actualText=dealsValidation.getText();
        String expectedText="Apple iPhone and device deals.";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
        sleepFor(2);
    }
    public void setCoverage() throws InterruptedException {
        Actions actions =new Actions(driver);
        actions.moveToElement(coverage).build().perform();
        sleepFor(2);
        whatIs5g.click();
        String actualText=coverageValidation.getText();
        String expectedText="What is 5G?";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
        sleepFor(2);
    }
    public void setBenefits() throws InterruptedException {
        Actions actions=new Actions(driver);
        actions.moveToElement(benefits).build().perform();
        sleepFor(2);
        blockScamCalls.click();
        sleepFor(2);
         String actualText=driver.getTitle();
         String expectedText="T-Mobile® Scam Shield – Block Scam & Unwanted Calls | T-Mobile";
         Assert.assertEquals(actualText,expectedText,"text doesn't match");
         sleepFor(2);
    }
    public void setFindStore() throws InterruptedException {
        findStore.click();
        sleepFor(3);
        findStoreSearchField.sendKeys("11214");
        findStoreSearchField.submit();
        sleepFor(2);
        bay28thStore.click();
        sleepFor(3);
        String actualText=findStoreValidation.getText();
        String expectedText="86th St & Bay 28th St";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }





}
