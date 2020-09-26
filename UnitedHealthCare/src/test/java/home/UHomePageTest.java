package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.concurrent.TimeUnit;

public class UHomePageTest extends CommonAPI {
    UHomePage homePage;

    @BeforeMethod
    public void getInit(){

        homePage = PageFactory.initElements(driver , UHomePage.class);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    /**
     * test search element
     */
    @Test(enabled = true)
    public void testSearchBoxElement(){
     TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        homePage.searchBox();
        homePage.clickOnSearchButton();
        homePage.validateSearch();
    }

    /**
     * test brokers tab
     *
     */
    @Test(enabled = true)
    public void testBrokers(){
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnBrokers();
        homePage.validateClickOnBrokers();
    }

    /**
     * test medicare tab
     */
    @Test(enabled = true)
    public void testClickOnMedicare(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnMedicare();
        homePage.validateClickOnMedicare();
    }

    /**
     * test for providers tab
     */
    @Test(enabled = true)
    public void testClickOnForProviders(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
  }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnForProviders();
        homePage.validateClickOnForProviders();
    }

    /**
     * test click on for employers tab
     */
    @Test(enabled = true)
    public void testClickOnForEmployers(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnForEmployersTab();
        homePage.validateClickOnForEmployers();
    }

    /**
     * test click on insurance tab
     */
    @Test(enabled = true)
    public void testClickOnInsurance(){
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
       }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnInsuranceTab();
        homePage.validateClickOnInsuranceTab();
    }

    /**
     * test click all business tab
     */
    @Test(enabled = true)
    public void testClickOnAllBusiness(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnAllBusinessTab();
        homePage.validateAllBusinessTab();
    }



    /**
     * test click small business tab
     */
    @Test(enabled = true)
    public void testClickOnSmallBusiness(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnSmallBusiness();
        homePage.validateClickSmallBuiness();
    }

    /**
     * test click national accounts tab
     */
    @Test(enabled = true)
    public void testClickNationalAccounts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnNationalAccounts();
        homePage.validateClickNationalAccounts();
    }

    /**
     * test click group retiree tab
     */
    @Test(enabled = true)
    public void testClickRetiree(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnGroupRetiree();
        homePage.validateClickGroupRetiree();
    }

}
