package homeTest;

import base.CommonAPI;
import home.HomePageRam;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomePageRamTest extends CommonAPI {

    HomePageRam homePage;



    @BeforeMethod
    public void getInit() {

        homePage = PageFactory.initElements(driver, HomePageRam.class);
        driver.manage().window().maximize();
    }

    @Test(enabled = true)
    public void testCheckBooking(){
        homePage.checkBooking();
        homePage.validateCheckBooking();
    }
    @Test(enabled = true)
    public void testCheckCheckIn(){
        homePage.checkCheckIn();
        homePage.validatecheckCheckIn();
    }

    @Test(enabled = true)
    public void testCheckMyTrip(){
        homePage.checkMyTrip();
        homePage.validatecheckMyTrip();
    }
    @Test(enabled = true)
    public void testCheckFlightStatus(){
        homePage.checkFlightStatus();
        homePage.validateFlightStatus();
    }

    @Test(enabled = true)
    public void testSearchBoxCheck() throws InterruptedException {

        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        sleepFor(3);
        homePage.searchBoxCheck("Toronto");
        homePage.validateSearchBoxCheck();
    }

    @Test(enabled = true)

    public void testSearchBoxCheckUsingClassValues() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        sleepFor(3);
        homePage.searchBoxCheckUsingClassValues();
    }

//    @Test(enabled = true)
//
//    public void testSearchBoxCheckGetItemsListFromDB() throws Exception {
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
//        sleepFor(3);
//        homePage.searchBoxCheckGetItemsListFromDB();
//    }

}
