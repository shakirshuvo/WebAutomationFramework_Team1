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

        homePage = PageFactory.initElements(driver , HomePage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    /**
     * test clink on Checking
     * @throws InterruptedException
     */
//    @Test
//    public void testClickOnChecking() throws InterruptedException {
//        homePage.clickOnChecking();
//        homePage.validateAdvantageBanking();
//       // Thread.sleep(5000);
//    }

    /**
     * test click On personal element
     */
    @Test
    public void testClickOnPersonal() throws InterruptedException {
        homePage.clickOnPersonal();
       // homePage.validateClickOnPersonal();
    }

    /**
     * test Open account
     */
//    @Test
//    public void testClickOpenAcount(){
//        homePage.clickOpenAccount();
//        homePage.validateClickOpenAccount();
//    }

    /**
     * test small business element
     */
//    @Test
//    public void testClickOnSmallBusiness(){
//        homePage.clickOnSmallBusiness();
//        homePage.validateSmallBusinessElement();
//    }

    /**
     * test clink on Wealth management tag
     */
   // @Test
//    public void testClickOnWealthManagement(){
//        homePage.clickOnWealthMangement();
//        homePage.validateClickOnWealthManagement();
//    }

    /**
     * test click on business institutions
     */
//    @Test
//    public void testClickOnBusinessInstitutions(){
//        homePage.clickOnBusinessInstitutions();
//        homePage.validateClickBusinessInstitutions();
//    }

    /**
     * test about us element
     */
//    @Test
//    public void testAboutUs(){
//        homePage.clickOnAboutUs();
//        homePage.validateAboutUs();
//    }

}
