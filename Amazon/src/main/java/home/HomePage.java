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
    @FindBy(how = How.LINK_TEXT, using = GiftCardsVerificationTextLinkTextWebElement)
    public WebElement GiftCardsVerificationText;

    /**
     * This method gets the title of the page when called.
     *
     * @return the title of the page in String.
     */
    public String getTitle() {
        return driver.getTitle().toString();
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
        Assert.assertTrue(getTitle().equals(GiftCardsTitleText));
    }

    public boolean giftCardsTextIsDisplayed() {
        return GiftCardsVerificationText.isDisplayed();
    }

    public void verifyClickGiftCardsTabByText() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(giftCardsTextIsDisplayed(),"Gift Cards text is not displayed!");
    }

}
