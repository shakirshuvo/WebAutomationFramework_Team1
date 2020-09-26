package homeTest;

import base.CommonAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {
    HomePage homePage;
    @BeforeMethod
    public void init(){
        homePage= PageFactory.initElements(driver,HomePage.class);
    }
    /**
     * Test logoSign
     */
    @Test
    public void setLogoSignTest() throws InterruptedException {
        homePage.setLogoSign();
    }
    @Test(enabled = false)
    public void setPlansTest() throws InterruptedException {
        homePage.setPlans();
    }
    @Test
    public void setPhoneDevisesTest() throws InterruptedException {
        homePage.setPhoneDevises();
    }
    @Test
    public void setDealsTest() throws InterruptedException {
        homePage.setDeals();
    }
//    @Test
//    public void setCoverageTest() throws InterruptedException {
//        homePage.setCoverage();
//    }
    @Test
    public void setBenefitsTest() throws InterruptedException {
        homePage.setBenefits();
    }
//    @Test
//    public void setFindStoreTest() throws InterruptedException {
//        homePage.setFindStore();
//    }
}
