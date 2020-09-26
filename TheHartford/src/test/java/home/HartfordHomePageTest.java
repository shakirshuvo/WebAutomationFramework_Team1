package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HartfordHomePageTest extends CommonAPI {
    HartfordHomePage hartfordHomePage;
    @BeforeMethod
    public void getInit(){

        hartfordHomePage= PageFactory.initElements(driver,HartfordHomePage.class);
    }
    /**
     * click on auto tab elemnt
      */
    // @Test
    //    public void testValidateNavigateToMobile(){
    //        homePage.navigateToMobile();
    //        homePage.validateNavigateToMobile();
   @Test
    public void testClickOnAutoTab(){
       hartfordHomePage.clickOnAutoTab();
       hartfordHomePage.validateClickOnAutoTab();
   }
    @Test
    public void testClickOnAllVehicleInsurance(){
        hartfordHomePage.clickOnAutoTab();
        hartfordHomePage.validateClickOnAllVehicleInsurance();
    }


}
