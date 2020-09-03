package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search.Search;

public class HomePageTest extends CommonAPI {
    HomePage homePage;
    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
@Test
    public void testBestSellers(){
        homePage.bestSellersCheck();
        homePage.validateBestSellers();
}
//    @Test
//    public void testCustomerService(){
//        homePage.customerServiceCheck();
//        homePage.validateCustomerService();
//    }
//    @Test
//    public void testTodaysDeals(){
//        homePage.todaysDealsCheck();
//        homePage.validateTodaysDeals();
//    }
//    @Test
//    public void testNewReleases(){
//        homePage.newReleasesCheck();
//        homePage.validateNewReleases();
//    }
//    @Test
//    public void testFind_a_gift(){
//        homePage.find_a_giftCheck();
//        homePage.validatefind_a_gift();
//    }
//    @Test
//    public void testWholeFoods(){
//        homePage.find_a_giftCheck();
//    }
//    @Test
//    public void testGiftCards(){
//        homePage.giftCardsCheck();
//        homePage.validateGiftCards();
//    }
//    @Test
//    public void testFreeShipping(){
//        homePage.freeShippingCheck();
//        homePage.validateFreeShipping();
//    }
//    @Test
//    public void testRegistry(){
//        homePage.registryCheck();
//        homePage.validateRegistry();
//    }
//    @Test
//    public void testSell(){
//        homePage.sellCheck();
//        homePage.validateSell();
//    }
//    @Test
//    public void testCoupons(){
//        homePage.couponsCheck();
//        homePage.validateCoupons();
//    }
//    @Test
//    public void testAmazonBasics(){
//        homePage.amazonBasicsCheck();
//        homePage.validateAmazonBasics();
//    }
//    @Test
//    public void testFoundItOnAmazon(){
//        homePage.foundItOnAmazonCheck();
//        homePage.validateFoundItOnAmazon();
//    }
//    @Test
//    public void testAccountLists(){
//        homePage.accountListsCheck();
//        homePage.validateAccountLists();
//    }
//    @Test
//    public void testOrders(){
//        homePage.ordersCheck();
//        homePage.validateOrders();
//    }
//    @Test
//    public void testTryPrimes(){
//        homePage.tryPrimesCheck();
//        homePage.validateTryPrimes();
//    }
//    @Test
//    public void testCart(){
//        homePage.cartCheck();
//        homePage.validateCart();
//    }
//    @Test
//    public void testSelectAddress(){
//        homePage.selectYourAddressCheck();
//        homePage.validateSelectYourAddress();
//    }
//    @Test
//    public void testCareers(){
//        homePage.careersCheck();
//        homePage.validateCareers();
//    }
//    @Test
//    public void testBlog(){
//        homePage.blogCheck();
//        homePage.validateBlog();
//    }
//    @Test
//    public void testAmazonDevices(){
//        homePage.amazonDevicesCheck();
//        homePage.validateAmazonDevices();
//    }
//    @Test
//    public void testPressCenter(){
//        homePage.pressCenterCheck();
//        homePage.validatepressCenter();
//    }
//    @Test
//    public void testAmazonTours(){
//        homePage.amazonToursCheck();
//        homePage.validateAmazonTours();
//    }
//    @Test
//    public void testSellOnAmazon(){
//        homePage.sellOnAmazonCheck();
//        homePage.validateSellOnAmazon();
//    }
//    @Test
//    public void testBecomeAffiliate(){
//        homePage.becomeAffiliateCheck();
//        homePage.validateBecomeAffiliate();
//    }
//    @Test
//    public void testAdvertiseProducts(){
//        homePage.advertiseProductsCheck();
//        homePage.validateAdvertiseProducts();
//    }
//    @Test
//    public void testAmazonStoreCard(){
//        homePage.amazonStoreCardCheck();
//        homePage.validateAmazonStoreCard();
//    }
//    @Test
//    public void testShopWithPoints(){
//        homePage.shopWithPointsCheck();
//        homePage.validateShopWithPoints();
//    }
//    @Test
//    public void testCurrencyConverter(){
//        homePage.currencyConverterCheck();
//        homePage.validateCurrencyConverter();
//    }
//    @Test
//    public void testCreditCardMarketPlace(){
//        homePage.creditCardMarketPlaceCheck();
//        homePage.validateCreditCardMarketPlace();
//    }
}
