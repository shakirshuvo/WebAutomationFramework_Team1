package testHome;


import base.CommonAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static home.HomePage.Destination;

public class HomePageTest extends CommonAPI {


    HomePage homePage;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


    @Test
    public void testVerifySignUpCheck() {
        homePage.clickOnSignUp();
        homePage.verifySignUpCheck();
    }

    @Test
    public void testVerifyClickLogin() throws InterruptedException {
        homePage.clickLogin();
        Thread.sleep(2000);
        homePage.verifyClickLogin();

    }
    @Test
    public void testVerifyClickBook(){
        homePage.clickBook();
        homePage.verifyClickBook();
    }
@Test
    public void testVerifyclickFlightStatus(){
        homePage.flightStatus();
        homePage.verifyFlightStatus();

    }
    @Test
    public void testVerifyBaggageTitle() throws InterruptedException {
        homePage.Baggage();
        Thread.sleep(2000);
        homePage.verifyBaggaeTitle();

    }
//@Test
//    public void testVerifySkyMiles() throws InterruptedException {
//        homePage.verifyClickSkyMiles();
//    Thread.sleep(2000);
//        homePage.verifyClickSkyMiles();
//}
@Test
    public void testCLickVerifyFlightDeals() throws InterruptedException {
        HomePage.clickFlightDeals();
    Thread.sleep(2000);
    HomePage.VerifyFlightDeals();
}
@Test
    public void testClickDestination(){
        homePage.Destinations();
}
  @Test
    public void testFlightProtection(){
        homePage.VerifyclickFlightProtection();

  }

    }














