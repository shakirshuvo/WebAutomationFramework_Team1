package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MarriottHomePageTest extends CommonAPI {

    MarriottHomePage marriottHomePage;

    @BeforeMethod
    public void getInit(){
        marriottHomePage = PageFactory.initElements(driver, MarriottHomePage.class);
    }

//    /**
//     * test click on Find and reserve tab
//     */
//    @Test
//    public void testFindNReserve(){
//        marriottHomePage.clickOnFindNReserve();
//        marriottHomePage.validateFindNReserve();
//    }
//
//    /**
//     * test click on deals and exclusive packages
//     */
//    @Test
//    public void testClickOnDealsPackages(){
//        marriottHomePage.clickOnDealsPackages();
//        marriottHomePage.validateClickDealsPackages();
//    }
//
//    /**
//     * test click on explore all destinations
//     */
//    @Test
//    public void testClickOnExploreAll(){
//        marriottHomePage.clickOnExploreAll();
//        marriottHomePage.validateClickOnExploreAllDestinations();
//    }
//
//    /**
//     * test click on our brands
//     */
//    @Test
//    public void testClickOnOurBrands(){
//           marriottHomePage.clickOnOurBrands();
//        marriottHomePage.validateClickOnOurBrands();
//    }
//    /**
//     * test click on our credit cards
//     */
//    @Test
//    public void testClickOnOurCreditCards(){
//        marriottHomePage.clickOnOurCreditCards();
//        marriottHomePage.validateClickOnOurCreditCards();
//    }
//
//    /**
//     * test click on Ritz logo
//     */
//    @Test
//    public void testClickOnRitz(){
//        marriottHomePage.clickOnRitz();
//        marriottHomePage.validateClickOnRitz();
//    }



}
