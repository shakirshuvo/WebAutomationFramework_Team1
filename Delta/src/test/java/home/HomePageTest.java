package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.concurrent.TimeUnit;

public class HomePageTest extends CommonAPI {
    HomePage homePage;

    @BeforeMethod
    public void getInit(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
/**
 * test click on Vaccation Deals
 */
@Test(enabled = false)
    public void testClickOnVaccationDeals() throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
   homePage.clickOnVaccationDeals();
    homePage.validateClickOnVaccationDeals();

}

/**
 * test click on book
 */
@Test(enabled = true)
    public void testClickOnBook() throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    homePage.clicKOnBook();
}

/**
 * test check IN
 */
@Test(enabled = true)
    public void testClickCheckIn(){
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    homePage.clickCheckIn();
    homePage.validateClickCheckIn();
}

    /**
     * test my trips element
     */
    @Test(enabled = false)
    public void testMyTrips(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickMyTrips();
        homePage.enterMyTripInfo();
        homePage.validateMyTrips();
    }

    /**
     * test flight status
     */
    @Test(enabled = true)
    public void testFlightStatus() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickFlightStatus();
        homePage.validateClickFlightStatus();
    }

}// end homePageTest
