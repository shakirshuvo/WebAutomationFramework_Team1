package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomePageTest extends CommonAPI {

    HomePage homePage;
    @BeforeMethod
    public void init(){
        homePage= PageFactory.initElements(driver,HomePage.class);}

    @Test
    public void setBestSellerTest(){
        homePage.setBestSeller();
    }
    @Test
    public void setCustomerServiceTest(){
        homePage.setCustomerService();
    }
    @Test
    public void setTodayDealTest(){
        homePage.setTodayDeal();
    }
    @Test
    public void setNewReleaseTest(){
        homePage.setNewRelease();
    }
//    @Test
//    public void setFindGiftTest(){
//        homePage.setFindGift();
//    }
    @Test
    public void setWholeFoodTest(){
        homePage.setWholeFood();
    }
    @Test
    public void setGiftCardTest(){
        homePage.setGiftCard();
    }
    @Test
    public void setFreeShippingTest(){
        homePage.setFreeShipping();
    }

    @Test
    public void setSellButtonTest(){
        homePage.setSellButton();
    }
    @Test
    public void setCouponsTest(){
        homePage.setCoupons();
    }
    @Test
    public void setPrimeVideoTest() throws InterruptedException {
        homePage.setPrimeVideo();
    }



}
