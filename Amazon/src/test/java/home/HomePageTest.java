package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {

    HomePage homePage;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void testValidateHomePageTitle(){
        homePage.validateHomePageTitle();
    }

    @Test
    public void testValidateTodaysDealTabByTitle() {
        homePage.getTodaysDealTitle();
        homePage.validateTodaysDealTabByTitle();
    }

    @Test
    public void testValidateTodaysDealTabByDealsAndPromotionsText() {
        homePage.clickTodaysDealTab();
        homePage.validateTodaysDealTabByDealsAndPromotionsText();
    }

    @Test
    public void testValidateClickCustomerServiceTab(){
        homePage.clickCustomerServiceTab();
        homePage.validateClickCustomerServiceTabByTitle();
    }

    @Test
    public void testValidateClickCustomerServiceTabByText(){
        homePage.clickCustomerServiceTab();
        homePage.validateClickCustomerServiceTabByText();
    }

    @Test
    public void testValidateClickGiftCardsTabByTitle(){
        homePage.clickGiftCardsTab();
        homePage.validateClickGiftCardsTabByTitle();
    }

    @Test
    public void testverifyClickGiftCardsTabByText(){
        homePage.clickGiftCardsTab();
        homePage.verifyClickGiftCardsTabByText();
    }

}
