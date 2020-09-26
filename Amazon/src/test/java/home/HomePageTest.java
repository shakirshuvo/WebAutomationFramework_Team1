package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomePageTest extends CommonAPI {

    HomePage homePage;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    /**
     * This test validates user can reach Amazon homepage.
     */
    @Test
    public void testValidateHomePageTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.validateHomePageTitle();
    }

    /**
     * This test verifies that user can navigate to 'Today's Deal' page using the page title.
     */
    @Test
    public void testValidateTodaysDealTabByTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.getTodaysDealTitle();
        homePage.validateTodaysDealTabByTitle();
    }

    /**
     * This test verifies that user can navigate to 'Today's Deal' page using "Today's Deal" text.
     */
    @Test
    public void testValidateTodaysDealTabByDealsAndPromotionsText() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickTodaysDealTab();
        homePage.validateTodaysDealTabByDealsAndPromotionsText();
    }

    /**
     * This test verifies that user can navigate to 'Customer Service' page using title.
     */
    @Test
    public void testValidateClickCustomerServiceTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickCustomerServiceTab();
        homePage.validateClickCustomerServiceTabByTitle();
    }

    /**
     * This test verifies that user can navigate to 'Customer Service' page using text.
     */
    @Test
    public void testValidateClickCustomerServiceTabByText() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickCustomerServiceTab();
        homePage.validateClickCustomerServiceTabByText();
    }

    /**
     * This test verifies that user can navigate to 'Gift Cards' page using title.
     */
    @Test
    public void testValidateClickGiftCardsTabByTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickGiftCardsTab();
        homePage.validateClickGiftCardsTabByTitle();
    }

    /**
     * This test verifies that user can navigate to 'Gift Cards' page using text.
     */
    @Test
    public void testverifyClickGiftCardsTabByText() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickGiftCardsTab();
        homePage.verifyClickGiftCardsTabByText();
    }

    /**
     * This test verifies that user can navigate to 'Registry' page using title.
     */
    @Test
    public void testValidateClickRegistryTabByTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickRegistryTab();
        homePage.validateClickRegistryTabByTitle();
    }

    /**
     * This test verifies that user can navigate to 'Sell' page using title.
     */
    @Test
    public void testValidateClickSellTabByTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickSellTab();
        homePage.validateClickSellTabByTitle();
    }

    /**
     * This test verifies that user can navigate to 'Seller' page using text.
     */
    @Test
    public void testVerifySellVerificationTextIsDisplayed() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickSellTab();
        homePage.verifySellVerificationTextIsDisplayed();
    }

    /**
     * This test verifies that user can navigate to 'Music' page using URL.
     */
    @Test
    public void testVerifyClickOnMusicLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnMusicLink();
        homePage.verifyClickOnMusicLinkByURL();
    }

    /**
     * This test verifies that user can navigate to 'Music' page using title.
     */
    @Test
    public void testVerifyClickOnMusicLinkByTitle() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnMusicLink();
        homePage.verifyClickOnMusicLinkByTitle();
    }

    /**
     * This test verifies that user can navigate to 'Amazon Advertising' page using URL.
     */
    @Test
    public void testVerifyClickOnAmazonAdvertisingByURL() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnAmazonAdvertisingLink();
        homePage.verifyClickOnAmazonAdvertisingByURL();
    }

    /**
     * This test verifies that user can navigate to 'Amazon Advertising' page using Title.
     */
    @Test
    public void testVerifyClickOnAmazonAdvertisingByTitle() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnAmazonAdvertisingLink();
        homePage.verifyClickOnAmazonAdvertisingByTitle();
    }

    /**
     * This test verifies that user can navigate to 'Amazon Advertising' page by text.
     */
    @Test
    public void testVerifyClickOnAmazonAdvertisingByText() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnAmazonAdvertisingLink();
        homePage.verifyClickOnAmazonAdvertisingByText();
    }

    /**
     * This test verifies that user can navigate to 'Computers & Tablets'.
     */
    @Test
    public void testValidateNavigateToComputersAndTabletsWithShopByCategoryHamburger() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.navigateToComputersAndTabletsWithShopByCategoryHamburger();
        homePage.validateNavigateToComputersAndTabletsWithShopByCategoryHamburger();
    }

    /**
     * This test verifies that user can navigate to 'Amazon Advertising' and check on 'HP'.
     */
    @Test
    public void testVerifyClickOnHPFeaturedBrandSelection() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.selectHpFromFeaturedBrandsOnComputersAndTabletsPage();
        homePage.verifyClickOnHPFeaturedBrandSelection();
    }

    /**
     * This test verifies that user can navigate to 'Amazon Music' page using Title.
     */
    @Test
    public void testVerifyAmazonMusicByTitle() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnAmazonMusic();
        homePage.verifyAmazonMusicByTitle();
    }

    /**
     * This test verifies that user can navigate to 'Start A Selling Account' page.
     */
    @Test
    public void testVerifyClickOnStartASellingAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnStartASellingAccount();
        homePage.verifyClickOnStartASellingAccount();
    }

}
