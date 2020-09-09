package getAQuoteBusiness;

import base.CommonAPI;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static getAQuoteBusiness.GetAQuoteBusinessWebElements.*;

public class GetAQuoteBusiness extends CommonAPI {

    /**
     * This method navigates user to 'Begin' page for Business Quote.
     */
    public void navigateToBeginPage(){
        clickOnElement(businessButtonXpathWebElement);
        clickOnElement(quoteTodayButtonXpathWebElement);
    }

    /**
     * This method verifies the 'Begin' page by URL.
     */
    public void verifyNavigateToBeginPage(){
        Assert.assertEquals(getCurrentPageUrl(), beginURL);
    }

    public void fillOutBeginFormWithoutTypeOfBusiness() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickOnElement(businessButtonXpathWebElement);
        clickOnElement(quoteTodayButtonXpathWebElement);
        sleepFor(3);
        typeOnElement(numberOfBusinessLocationsCSSWebElement, randomNumber);
        typeOnElement(zipCodeCSSWebElement, vaZipCode);
        clickOnElement(continueButtonIDWebElement);
    }

    public void verifyFillOutBeginFormWithoutTypeOfBusiness(){
        Assert.assertTrue(elementIsDisplayed(pleaseSelectADescriptionForYourBusinessAlterXpathWebElement));
    }
}
