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

    @Test
    public void testValidateHomePageTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.validateHomePageTitle();
    }

    @Test
    public void testValidateTodaysDealTabByTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.getTodaysDealTitle();
        homePage.validateTodaysDealTabByTitle();
    }

    @Test
    public void testValidateTodaysDealTabByDealsAndPromotionsText() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickTodaysDealTab();
        homePage.validateTodaysDealTabByDealsAndPromotionsText();
    }

    @Test
    public void testValidateClickCustomerServiceTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickCustomerServiceTab();
        homePage.validateClickCustomerServiceTabByTitle();
    }

    @Test
    public void testValidateClickCustomerServiceTabByText() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickCustomerServiceTab();
        homePage.validateClickCustomerServiceTabByText();
    }

    @Test
    public void testValidateClickGiftCardsTabByTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickGiftCardsTab();
        homePage.validateClickGiftCardsTabByTitle();
    }

    @Test
    public void testverifyClickGiftCardsTabByText() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickGiftCardsTab();
        homePage.verifyClickGiftCardsTabByText();
    }

    @Test
    public void testValidateClickRegistryTabByTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickRegistryTab();
        homePage.validateClickRegistryTabByTitle();
    }

    @Test
    public void testvalidateClickSellTabByTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickSellTab();
        homePage.validateClickSellTabByTitle();
    }

    @Test
    public void testVerifySellVerificationTextIsDisplayed() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickSellTab();
        homePage.verifySellVerificationTextIsDisplayed();
    }

    @Test
    public void testVerifyClickOnMusicLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnMusicLink();
        homePage.verifyClickOnMusicLinkByURL();
    }

    @Test
    public void testVerifyClickOnMusicLinkByTitle() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnMusicLink();
        homePage.verifyClickOnMusicLinkByTitle();
    }

    @Test
    public void testVerifyClickOnAmazonAdvertisingByURL() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnAmazonAdvertisingLink();
        homePage.verifyClickOnAmazonAdvertisingByURL();
    }

    @Test
    public void testVerifyClickOnAmazonAdvertisingByTitle() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnAmazonAdvertisingLink();
        homePage.verifyClickOnAmazonAdvertisingByTitle();
    }

    @Test
    public void testVerifyClickOnAmazonAdvertisingByText() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnAmazonAdvertisingLink();
        homePage.verifyClickOnAmazonAdvertisingByText();
    }

    @Test
    public void testValidateNavigateToComputersAndTabletsWithShopByCategoryHamburger() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.navigateToComputersAndTabletsWithShopByCategoryHamburger();
        homePage.validateNavigateToComputersAndTabletsWithShopByCategoryHamburger();
    }

    @Test
    public void testVerifyClickOnHPFeaturedBrandSelection() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.selectHpFromFeaturedBrandsOnComputersAndTabletsPage();
        homePage.verifyClickOnHPFeaturedBrandSelection();
    }

    @Test
    public void testVerifyAmazonMusicByTitle() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnAmazonMusic();
        homePage.verifyAmazonMusicByTitle();
    }

    @Test
    public void testVerifyClickOnStartASellingAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnStartASellingAccount();
        homePage.verifyClickOnStartASellingAccount();
    }

}
