package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePageTest extends CommonAPI {
    HomePage homePage;

    @BeforeMethod
    public void getInit(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
/**
 * test click on Vaccation Deals
 */
@Test(enabled = true)
    public void testClickOnVaccationDeals(){
   // homePage.clickOnVaccationDeals();
    homePage.validateClickOnVaccationDeals();

}

///**
// * test click on book
// */
//@Test
//    public void testClickOnBook() throws InterruptedException {
//    homePage.clicKOnBook();
//}

///**
// * test check IN
// */
//@Test
//    public void testClickCheckIn(){
//    homePage.clickCheckIn();
//    homePage.validateClickCheckIn();
//}

    /**
     * test my trips element
     */
//    @Test
//    public void testMyTrips(){
//        homePage.clickMyTrips();
//        homePage.enterMyTripInfo();
//        homePage.validateMyTrips();
//    }

    /**
     * test flight status
     */
//    @Test
//    public void testFlightStatus() throws InterruptedException {
//        homePage.clickFlightStatus();
//        homePage.validateClickFlightStatus();
//    }

}// end homePageTest
