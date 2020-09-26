package home;

import base.CommonAPI;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.concurrent.TimeUnit;

public class HomePageTest extends CommonAPI {
    HomePage homePage;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    /**
     * test click on customer service
     */
    @Test(enabled = true)
    public void testClickOnCustomerService(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnCustomerService();
        homePage.validateClickOnCustomerService();
    }

    @Test(enabled = true)
    public void testNewReleases(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnNewRelease();
        homePage.validateClickOnNewRelease();
    }

    @Test(enabled = true)
    public void testClickOnTodaysDeals(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnTodaysDeals();
        homePage.validateClickOnTodysDeals();
    }




}