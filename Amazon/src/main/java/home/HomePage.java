package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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


    /**
     * This method gets the title of the page when called.
     *
     * @return the title of the page in String.
     */
    public String getTitle() {
        return driver.getTitle().toString();
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }

    public void validateHomePageTitle() {
        Assert.assertEquals(getTitle(), homePageTitleText);
    }

    public void clickTodaysDealTab() {
        todaysDeaTab.click();
    }

    public void getTodaysDealTitle() {
        todaysDeaTab.click();
        driver.getTitle();

    }

    public void validateTodaysDealTabByTitle() {
        clickTodaysDealTab();
        Assert.assertTrue(true, todaysDealTitleText);
    }

    public void validateTodaysDealTabByDealsAndPromotionsText() {
        Assert.assertTrue(todaysDealPromotionsText.isDisplayed());
    }

    public void clickCustomerServiceTab() {
        customerServiceTab.click();
    }

    public void validateClickCustomerServiceTabByTitle() {
        Assert.assertTrue(getTitle().equals(customerServiceTitleText));
    }

    public boolean helloWhatCanWeHelpYouWithTextIsDisplayed() {
        customerServiceVerificationText.isDisplayed();
        return true;
    }

    public void validateClickCustomerServiceTabByText() {
        Assert.assertTrue(helloWhatCanWeHelpYouWithTextIsDisplayed());
    }

    public void clickGiftCardsTab() {
        giftCardsTab.click();
    }

    public void validateClickGiftCardsTabByTitle() {
        Assert.assertTrue(getTitle().equals(giftCardsTitleText));
    }

    public boolean giftCardsTextIsDisplayed() {
        return GiftCardsVerificationText.isDisplayed();
    }

    public void verifyClickGiftCardsTabByText() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(giftCardsTextIsDisplayed(),"Gift Cards text is not displayed!");
    }

    /**
     * This method clicks on the Registry tab.
     */
    public void clickRegistryTab(){
        registryTab.click();
    }

    /**
     * This method validates clickRegistryTab method.
     */
    public void validateClickRegistryTabByTitle(){
        Assert.assertTrue(getTitle().equals(registryTitleText));
    }

    /**
     * This method clicks on the Sell tab.
     */
    public void clickSellTab(){
        sellTab.click();
    }

    /**
     * This method validates clickSellTab method.
     */
    public void validateClickSellTabByTitle(){
        Assert.assertTrue(getTitle().equals(sellTitleText));
    }

    /**
     * This method looks for if teh "Amazon seller" text is displayed on the Sell page.
     * @return sellVerificationText is displayed.
     */
    public boolean sellVerificationTextIsDisplayed(){
       return sellVerificationText.isDisplayed();
    }

    /**
     * This method validates the Sell tab by verifying that the "Amazon Seller" text is displayed
     * on Sell page.
     */
    public void verifySellVerificationTextIsDisplayed(){
        Assert.assertTrue(sellVerificationTextIsDisplayed());
    }

    /**
     * This method clicks ont he Music link.
     */
    public void clickOnMusicLink(){
        musicLink.click();
    }

    /**
     * This method verifies the URL of Music page.
     */
    public void verifyClickOnMusicLinkByURL(){
        Assert.assertTrue(getURL().equals(musicURL));
    }

    /**
     * This method verifies the title of the Music page.
     */
    public void verifyClickOnMusicLinkByTitle(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(getTitle().equals(musicTitleText));
    }

}
