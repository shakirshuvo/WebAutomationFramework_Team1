package home;

import base.CommonAPI;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.concurrent.TimeUnit;
public class HartfordHomePageTest extends CommonAPI {

    HartfordHomePage hartfordHomePage;

    @BeforeMethod
    public void getInit(){
    hartfordHomePage = PageFactory.initElements(driver, HartfordHomePage.class);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

//    /**
//     * test click on auto tab element
//     */
//    @Test
//    public void testClickOnAutoTab() throws InterruptedException {
//        hartfordHomePage.clickOnAutoTab();
//        sleepFor(3);
//        hartfordHomePage.validateClickOnAuto();
//    }
//
//    /**
//     * test click on home tab element
//     */
//    @Test
//    public void testClickHomeTab() throws InterruptedException {
//        hartfordHomePage.clickOnHomeTab();
//        sleepFor(3);
//        hartfordHomePage.validateClickOnHomeTab();
//    }
//
//    /**
//     * test click on business tab element
//     */
//    @Test
//    public void testClickOnBusinessTab() throws InterruptedException {
//        hartfordHomePage.clickOnBusinessTab();
//        sleepFor(3);
//        hartfordHomePage.validateClickOnBusinessTab();
//    }
//
//    /**
//     * test click on employee benefits tab element
//     */
//    @Test
//    public void testClickOnEmployeeBenefitsTab() throws InterruptedException {
//        hartfordHomePage.clickOnEmployeeBenefits();
//        sleepFor(3);
//        hartfordHomePage.validateClickOnEmployeeBenefits();
//    }
//
//    /**
//     * test click on about us tab element
//     */
//    @Test
//    public void testClickOnAboutUs() throws InterruptedException {
//        hartfordHomePage.clickOnAboutUsTab();
//        sleepFor(3);
//        hartfordHomePage.validateClickOnAboutUsTab();
//    }

    //mouse over tests
    /**
     * test mouse over home tab
     */
    @Test
    public void testHomeMouseOver(){
        hartfordHomePage.homeTabMouseOver();
        hartfordHomePage.validateHomeTabMouseOver();
    }

    /**
     * test click on renters insurance
     */
    @Test
    public void testClickOnRentersInsurance(){
        hartfordHomePage.clickOnRentersInsurance();
        hartfordHomePage.validateRentersInsurance();
    }

    /**
     * test click on flood insurance
     */
    @Test
    public void testClickOnFloodInsurance(){
        hartfordHomePage.clickOnFloodInsurance();
        hartfordHomePage.validateFloodInsurance();
    }

    /**
     * test click on umbrella insurance
     */
    @Test
    public void testClickOnUmbrellaInsurance(){
        hartfordHomePage.clickOnUmbrellaInsurance();
        hartfordHomePage.validateUmbrellaInsurance();
    }




}
