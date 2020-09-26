package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static home.UHomePageWebElements.*;


public class UHomePage extends CommonAPI {



    @FindBy(how = How.XPATH, using = forBrokersElement)
    WebElement brokersElement;
    @FindBy(how = How.XPATH, using = brokersTextElement)
    WebElement brokersText;

    /**
     * click on brokers tab
     */
    public void clickOnBrokers(){
        brokersElement.click();
    }

    /**
     * validate
     */
    public void validateClickOnBrokers(){
        String actual = driver.getTitle();
        Assert.assertEquals(actual, brokersExpectedText);
    }


    @FindBy(how = How.XPATH, using = searchBoxElement)
    WebElement searchBox;

    @FindBy(how = How.XPATH, using = searchButtonElement)
    WebElement searchButton;

    @FindBy(how = How.XPATH, using = resultsElement)
    WebElement results;

    /**
     * search box element
     */
    public void searchBox(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchBox.click();
        searchBox.sendKeys(searchString);

    }

    /**
     * click on search button
     */
    public  void clickOnSearchButton(){
        searchButton.click();
    }

    /**
     * validate search element
     */
    public void validateSearch(){
        String actual = results.getText();
        Assert.assertEquals(actual, resultsExpectedText);
    }

    //medicare tab
    @FindBy(how = How.XPATH, using = medicareElementXPath)
    WebElement medicareTab;

    /**
     * click on medcare tab
     */
    public void clickOnMedicare(){
        medicareTab.click();
    }
    /**
     * validate medicare click
     */
    public void validateClickOnMedicare(){
        String actual = driver.getTitle();
        Assert.assertEquals(actual, medicareExpectedTitleText);
    }

    // for providers tab
    @FindBy(how = How.XPATH, using = forProvidersElementXPath)
    WebElement forProviders;
    /**
     * click on for providers tab
     */
    public void clickOnForProviders(){
        forProviders.click();
    }
    /**
     * validate for providers
     */
    public void validateClickOnForProviders(){
        String actual = driver.getTitle();
        Assert.assertEquals(actual, forProviderExpectedTitleText);
    }

    // for employers tab
    @FindBy(how = How.XPATH, using = forEmployersElementXPath)
    WebElement forEmployers;

    /**
     * click on for employers tab
     */
    public void clickOnForEmployersTab(){
        forEmployers.click();
    }

    /**
     * validate for employers click
     */
    public void validateClickOnForEmployers(){
        String actual = driver.getTitle();
        Assert.assertEquals(actual, forEmployersExpectedText);
    }

    /**
     * click on for insurance tab
     */
    public void clickOnInsuranceTab(){

        clickOnElement(insuranceElementXpath);
    }

    /**
     * validate for employers click
     */
    public void validateClickOnInsuranceTab(){
        String actual = getTextByXpath(verifierElementXpath);
        String expected = "Not sure which plan is best for you?";
        Assert.assertEquals(actual, expected);
    }

    /**
     * click on for insurance tab
     */
    public void clickOnAllBusinessTab(){
        clickOnInsuranceTab();
        waitUntilClickAble(By.xpath(allBusinessElementXpath));
        clickOnElement(allBusinessElementXpath);
    }

    /**
     * validate all business element
     */
    public void validateAllBusinessTab(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.uhc.com/employer";
        Assert.assertEquals(actual, expected, "Test failed");
    }

    /**
     * click on for small business tab
     */
    public void clickOnSmallBusiness(){
        clickOnInsuranceTab();
        waitUntilClickAble(By.xpath(smallBusinessElementXpath));
        clickOnElement(smallBusinessElementXpath);
    }

    /**
     * validate all business element
     */
    public void validateClickSmallBuiness(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.uhc.com/employer/small-business";
        Assert.assertEquals(actual, expected, "Test failed");
    }


    /**
     * click on for national accounts tab
     */
    public void clickOnNationalAccounts(){
        clickOnInsuranceTab();
        waitUntilClickAble(By.xpath(nationalAccountsBusinessElementXpath));
        clickOnElement(nationalAccountsBusinessElementXpath);
    }

    /**
     * validate all national account element
     */
    public void validateClickNationalAccounts(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.uhc.com/employer/national-accounts";
        Assert.assertEquals(actual, expected, "Test failed");
    }

    /**
     * click on for group retiree tab
     */
    public void clickOnGroupRetiree(){
        clickOnInsuranceTab();
        waitUntilClickAble(By.xpath(groupRetireeBusinessElementXpath));
        clickOnElement(groupRetireeBusinessElementXpath);
    }

    /**
     * validate all national account element
     */
    public void validateClickGroupRetiree(){
        String actual = driver.getCurrentUrl();
        String expected = "ttps://www.uhc.com/employer/group-retiree-solution";
        Assert.assertEquals(actual, expected, "Test failed");
    }
}
