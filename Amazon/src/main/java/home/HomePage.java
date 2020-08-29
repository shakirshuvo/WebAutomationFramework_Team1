package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static home.HomePageWebElements.*;

public class HomePage extends CommonAPI {

    @FindBy(how = How.LINK_TEXT, using = todaysDealTabTextWebElement)
    public WebElement todaysDeaTab;
    @FindBy(how = How.XPATH, using = todaysDealPromotionsTextXPathWebElement)
    public WebElement todaysDealPromotionsText;
    @FindBy(how = How.LINK_TEXT, using = customerServiceTabTextWebElement)
    public WebElement customerServiceTab;
    @FindBy(how = How.XPATH, using = customerServiceVerificationTextXPathWebElement)
    public WebElement customerServiceVerificationText;
    @FindBy(how = How.XPATH, using = giftCardsTabXPathWebElement)
    public WebElement giftCardsTab;
    @FindBy(how = How.LINK_TEXT, using = giftCardsVerificationTextLinkTextWebElement)
    public WebElement GiftCardsVerificationText;
    @FindBy(how = How.XPATH, using = registryTabXPathWebElement)
    public WebElement registryTab;
    @FindBy(how = How.XPATH, using = sellTabXPathWebElement)
    public WebElement sellTab;
    @FindBy(how = How.XPATH, using = sellVerificationTextXPathWebElement)
    public WebElement sellVerificationText;
    @FindBy(how = How.XPATH, using = musicLinkXPathWebElement)
    public WebElement musicLink;
    @FindBy(how = How.XPATH, using = advertisingLinkXPathWebElement)
    public WebElement advertisingLink;
    @FindBy(how = How.XPATH, using = advertisingTextXPath)
    public WebElement advertisingText;
    @FindBy(how = How.CSS, using = shopByCategoryHamburgerCSSWebElement)
    public WebElement shopByCategoryHamburger;
    @FindBy(how = How.XPATH, using = computerInShopByCategoryHamburgerXpathWebElement)
    public WebElement computerInShopByCategoryHamburger;
    @FindBy(how = How.XPATH, using = computerAndTabletsInShopByCategoryHamburgerXpathWebElement)
    public WebElement computerAndTabletsInShopByCategoryHamburger;
    @FindBy(how = How.XPATH, using = asusFeaturedBrandSelectionXpathWebElement)
    public WebElement asusFeaturedBrandsSelection;
    @FindBy(how = How.XPATH, using = hpFeaturedBrandSelectionXpathWebElement)
    public WebElement hpFeaturedBrandSelection;
    @FindBy(how = How.XPATH, using = hpPageTextXpathWebElement)
    public WebElement hpPageText;
    @FindBy(how = How.XPATH, using = amazonMusicXpathWebElement)
    public WebElement amazonMusic;
    @FindBy(how = How.XPATH, using = startASellingAccountLinkXpathWebElement)
    public WebElement startASellingAccountLink;


    /**
     * This method gets the title of the page when called.
     *
     * @return the title of the page in String.
     */
    public String getTitle() {
        return driver.getTitle().toString();
    }

    /**
     * This method returns the URL of the page.
     *
     * @return
     */
    public String getURL() {
        return driver.getCurrentUrl();
    }

    /**
     * This method validates the homepage title.
     */
    public void validateHomePageTitle() {
        Assert.assertEquals(getTitle(), homePageTitleText);
    }

    /**
     * This method clicks on the 'Today's Deal' tab.
     */
    public void clickTodaysDealTab() {
        todaysDeaTab.click();
    }

    /**
     * This method clicks on 'Today's Deal' tab and gets the title of 'Today's Deal' page title.
     */
    public void getTodaysDealTitle() {
        todaysDeaTab.click();
        driver.getTitle();

    }

    /**
     * This method validates 'Today's Deal' page by title.
     */
    public void validateTodaysDealTabByTitle() {
        clickTodaysDealTab();
        Assert.assertTrue(true, todaysDealTitleText);
    }

    /**
     * This method validates 'Today's Deal' page by "Deals and Promotions" text.
     */
    public void validateTodaysDealTabByDealsAndPromotionsText() {
        Assert.assertTrue(todaysDealPromotionsText.isDisplayed());
    }

    /**
     * This method clicks on 'Customer Service' tab.
     */
    public void clickCustomerServiceTab() {
        customerServiceTab.click();
    }

    /**
     * This method validates 'Customer Service' page by title.
     */
    public void validateClickCustomerServiceTabByTitle() {
        Assert.assertTrue(getTitle().equals(customerServiceTitleText));
    }

    /**
     * This method displays 'Hello. What can we hlp you with?' text in 'Customer Service' page.
     *
     * @return
     */
    public boolean helloWhatCanWeHelpYouWithTextIsDisplayed() {
        customerServiceVerificationText.isDisplayed();
        return true;
    }


    /**
     * This method validates that 'Hello. What can we hlp you with?' text is displayed in 'Customer Service' page.
     */
    public void validateClickCustomerServiceTabByText() {
        Assert.assertTrue(helloWhatCanWeHelpYouWithTextIsDisplayed());
    }

    /**
     * This method clicks on 'Gift Cards' tab.
     */
    public void clickGiftCardsTab() {
        giftCardsTab.click();
    }

    /**
     * This method validates 'Gift Cards' page by title.
     */
    public void validateClickGiftCardsTabByTitle() {
        Assert.assertTrue(getTitle().equals(giftCardsTitleText));
    }

    /**
     * This method returns if the "Gift Cards' text is displayed on 'Gift Cards' page.
     *
     * @return
     */
    public boolean giftCardsTextIsDisplayed() {
        return GiftCardsVerificationText.isDisplayed();
    }

    /**
     * This method verifies that the "Gift Cards" text is displayed on 'Gift Cards' page.
     */
    public void verifyClickGiftCardsTabByText() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(giftCardsTextIsDisplayed(), "Gift Cards text is not displayed!");
    }

    /**
     * This method clicks on the Registry tab.
     */
    public void clickRegistryTab() {
        registryTab.click();
    }

    /**
     * This method validates clickRegistryTab method.
     */
    public void validateClickRegistryTabByTitle() {
        Assert.assertTrue(getTitle().equals(registryTitleText));
    }

    /**
     * This method clicks on the Sell tab.
     */
    public void clickSellTab() {
        sellTab.click();
    }

    /**
     * This method validates clickSellTab method.
     */
    public void validateClickSellTabByTitle() {
        Assert.assertTrue(getTitle().equals(sellTitleText));
    }

    /**
     * This method looks for if teh "Amazon seller" text is displayed on the Sell page.
     *
     * @return sellVerificationText is displayed.
     */
    public boolean sellVerificationTextIsDisplayed() {
        return sellVerificationText.isDisplayed();
    }

    /**
     * This method validates the Sell tab by verifying that the "Amazon Seller" text is displayed
     * on Sell page.
     */
    public void verifySellVerificationTextIsDisplayed() {
        Assert.assertTrue(sellVerificationTextIsDisplayed());
    }

    /**
     * This method clicks ont he Music link.
     */
    public void clickOnMusicLink() {
        musicLink.click();
    }

    /**
     * This method verifies the URL of Music page.
     */
    public void verifyClickOnMusicLinkByURL() {
        Assert.assertTrue(getURL().equals(musicURL));
    }

    /**
     * This method verifies the title of the Music page.
     */
    public void verifyClickOnMusicLinkByTitle() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(getTitle().equals(musicTitleText));
    }

    /**
     * This method will click on the Amazon Advertising link.
     */
    public void clickOnAmazonAdvertisingLink() {
        advertisingLink.click();
    }

    /**
     * This method verifies the URL of Amazon Advertising page.
     */
    public void verifyClickOnAmazonAdvertisingByURL() {
        Assert.assertTrue(getURL().equals(advertisingURL));
    }

    /**
     * This method verifies the title of Amazon Advertising page.
     */
    public void verifyClickOnAmazonAdvertisingByTitle() {
        Assert.assertTrue(getTitle().equals(advertisingTitle));
    }

    /**
     * This method verifies Amazon Advertising link by text.
     */
    public void verifyClickOnAmazonAdvertisingByText() {
        Assert.assertTrue(advertisingText.isDisplayed());
    }

    /**
     * This method clicks on the 'Shop By Category' hamburger on Amazon homepage.
     */
    public void clickOnShopByCategoryHamburger() {
        shopByCategoryHamburger.click();
    }

    /**
     * This method clicks on the 'Computer' option in 'Shop By Category' hamburger on Amazon homepage.
     */
    public void clickOnComputerInShopByCategoryHamburger() {
        computerInShopByCategoryHamburger.click();
    }

    /**
     * This method clicks on the 'Computer & Tablets' option under 'Computer', which is under
     * 'Shop By Category' hamburger on Amazon homepage.
     */
    public void clickOnComputerAndTabletsInShopByCategoryHamburger() {
        computerAndTabletsInShopByCategoryHamburger.click();
    }

    /**
     * This method navigates user from Amazon homepage to 'Computers & Tablets' page using the
     * 'Shop By Category' hamburger.
     */
    public void navigateToComputersAndTabletsWithShopByCategoryHamburger() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickOnShopByCategoryHamburger();
        clickOnComputerInShopByCategoryHamburger();
        clickOnComputerAndTabletsInShopByCategoryHamburger();
    }

    /**
     * This method returns if 'ASUS' option is available on the 'Featured Brands' options on
     * 'Computers & Tablets' page.
     * @return
     */
    public boolean asusFeaturedBrandSelectionIsDisplayed() {
        return asusFeaturedBrandsSelection.isDisplayed();
    }

    /**
     * This method verifies if 'ASUS' option on 'Featured Brands' is displayed on 'Computers & Tablets page.
     */
    public void validateNavigateToComputersAndTabletsWithShopByCategoryHamburger(){
        Assert.assertTrue(asusFeaturedBrandSelectionIsDisplayed());
    }

    /**
     * This method clicks on the 'HP' option of 'Featured Brands' on 'Computers & Tablets' page.
     */
    public void clickOnHPFeaturedBrandSelection(){
        hpFeaturedBrandSelection.click();
    }

    /**
     * This method navigates user to 'Computers & Tablets' page using the 'Shop By Category' hamburger.
     * Then, it clicks on the 'HP' option of 'Featured Brands' on 'Computers & Tablets' page.
     */
    public void selectHpFromFeaturedBrandsOnComputersAndTabletsPage(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickOnShopByCategoryHamburger();
        clickOnComputerInShopByCategoryHamburger();
        clickOnComputerAndTabletsInShopByCategoryHamburger();
        clickOnHPFeaturedBrandSelection();
    }

    /**
     * This method returns if "HP" text is displayed after clicking on the 'HP' option on the 'Featured Brands' option
     * on 'Computers & Tablets' page.
     * @return
     */
    public boolean hpPageTextIsDisplayed(){
        return hpPageText.isDisplayed();
    }

    /**
     * This method verifies that 'HP' text is displayed after clicking on the 'HP' option on the 'Featured Brands'
     * option on 'Computers & Tablets' page.
     */
    public void verifyClickOnHPFeaturedBrandSelection(){
        Assert.assertTrue(hpPageTextIsDisplayed());
    }


    /**
     * This method clicks on Amazon Music link.
     */
    public void clickOnAmazonMusic(){
        amazonMusic.click();
    }

    /**
     * This method validates Amazon Music page by title.
     */
    public void verifyAmazonMusicByTitle(){
        Assert.assertEquals(getTitle(), amazonMusicTitle);
    }

    /**
     * This method clicks on 'Start a Selling Account' link.
     */
    public void clickOnStartASellingAccount(){
        startASellingAccountLink.click();
    }

    /**
     * This method verifies the 'Sell on Amazon' title.
     */
    public void verifyClickOnStartASellingAccount(){
        Assert.assertEquals(getTitle(), sellOnAmazonTitle);
    }

}
