package getAQuoteBusiness;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static getAQuoteBusiness.GetAQuoteBusinessWebElements.*;

public class GetAQuoteBusiness extends CommonAPI {

    @FindBy(how = How.CSS, using = describeBusinessFieldCSSWebElement)
    public WebElement describeBusinessField;
    /**
     * This method navigates user to 'Begin' page for Business Quote.
     */
    public void navigateToBeginPage() {
        clickOnElement(businessButtonXpathWebElement);
        clickOnElement(quoteTodayButtonXpathWebElement);
    }

    /**
     * This method verifies the 'Begin' page by URL.
     */
    public void verifyNavigateToBeginPage() {
        Assert.assertEquals(getCurrentPageUrl(), beginURL);
    }

    public void fillOutBeginFormWithoutTypeOfBusiness() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickOnElementByXpath(businessButtonXpathWebElement);
        clickOnElementByXpath(quoteTodayButtonXpathWebElement);
        sleepFor(3);

//        typeOnElementNDownKey(describeBusinessFieldCSSWebElement, "Computer Consultant");
        clickOnElementByCSS(itRelatedAdviceAndConsultationRadioCSSWebElement);
        clickOnElementByCSS(additionalServiceNoCSSWebElement);
        typeOnElement(numberOfBusinessLocationsCSSWebElement, randomNumberOfBusinessLocations);
        typeOnElement(numberOfEmployeesCSSWebElement, randomNumberOfEmployees);
        clickOnElementByCSS(doAnyOfYourEmployeesWorkInADifferentStateNoCSSWebElement);
        typeOnElement(yearBusinessEstablishedCSSWebElement, year);
        typeOnElement(businessZipCodeCSSWebElement, vaZipCode);
        clickOnElementByID(continueButtonIDWebElement);
    }

    public void verifyFillOutBeginFormWithoutTypeOfBusiness() {
        validateByURL(productURL);
    }
}
