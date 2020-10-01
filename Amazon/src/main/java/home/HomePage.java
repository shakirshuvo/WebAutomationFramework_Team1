package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;

import static home.HomePageWebElements.*;

public class HomePage extends CommonAPI {

    @FindBy(how = How.XPATH, using = bestSellerXP)
    public WebElement bestSeller;
    @FindBy(how = How.ID, using = bestSellerValidationID)
    public WebElement bestSellerValidation;

    @FindBy(how = How.XPATH, using = customerServiceButtonXP)
    public WebElement customerService;
    @FindBy(how = How.XPATH, using = customerServiceValidationXp)
    public WebElement customerServiceValidation;

    @FindBy(how = How.XPATH, using = todayDealXP)
    public WebElement todayDeal;
    @FindBy(how = How.XPATH, using = todayDealValidationXP)
    public WebElement todayDealValidation;

    @FindBy(how = How.XPATH, using = newReleaseXP)
    public WebElement newRelease;
    @FindBy(how = How.ID, using = newReleaseValidationID)
    public WebElement newReleaseValidation;

    @FindBy(how = How.XPATH, using = findGiftXP)
    public WebElement findGift;
    @FindBy(how = How.XPATH, using = findGiftValidationXP)
    public WebElement findGiftValidation;

    @FindBy(how = How.CSS, using = wholeFoodCSS)
    public WebElement wholeFood;
    @FindBy(how = How.XPATH, using = wholeFoodValidationXP)
    public WebElement wholeFoodValidation;

    @FindBy(how = How.XPATH, using = giftCardXP)
    public WebElement giftCard;
    @FindBy(how = How.XPATH, using = giftCardValidationXP)
    public WebElement giftCardValidation;

    @FindBy(how = How.XPATH, using = freeShippingXP)
    public WebElement freeShipping;
    @FindBy(how = How.XPATH, using = freeShippingValidationXP)
    public WebElement freeShippingValidation;

    @FindBy(how = How.XPATH, using = sellButtonXP)
    public WebElement sellButton;
    @FindBy(how = How.XPATH, using = sellButtonValidationXP)
    public WebElement sellButtonValidation;

    @FindBy(how = How.XPATH, using = couponsXP)
    public WebElement coupons;
    @FindBy(how = How.XPATH, using = couponsValidationXP)
    public WebElement couponsValidation;

    @FindBy(how = How.XPATH, using = menuButtonXP)
    public WebElement menuButton;
    @FindBy(how = How.XPATH, using = primeVideoXP)
    public WebElement primeVideo;
    @FindBy(how = How.XPATH, using = rentBuyXP)
    public WebElement rentBuy;
    @FindBy(how = How.XPATH, using = rentBuyValidationXP)
    public WebElement rentBuyValidation;



    public void setBestSeller() {
        bestSeller.click();
        String actualText = bestSellerValidation.getText();
        String expectedText = "Amazon Best Sellers";
        Assert.assertEquals(actualText, expectedText, "text doesn't match");
    }

    public void setCustomerService() {
        customerService.click();
        String actualText = customerServiceValidation.getText();
        String expectedText = "Hello. What can we help you with?";
        Assert.assertEquals(actualText, expectedText, "text doesn't match");
    }

    public void setTodayDeal() {
        todayDeal.click();
        String actualText = todayDealValidation.getText();
        String expectedText = "Today's Deals";
        Assert.assertEquals(actualText, expectedText, "text doesn't match");
    }

    public void setNewRelease() {
        newRelease.click();
        String actualText = newReleaseValidation.getText();
        String expectedText = "Amazon Hot New Releases";
        Assert.assertEquals(actualText, expectedText, "text doesn't match");
    }

    public void setFindGift() {
        findGift.click();
        String actualText = findGiftValidation.getText();
        String expectedText = "Who are you shopping for?";
        Assert.assertEquals(actualText, expectedText, "text doesn't match");
    }

    public void setWholeFood() {
        wholeFood.click();
        String actualText = wholeFoodValidation.getText();
        String expectedText = "Popular near you";
        Assert.assertEquals(actualText, expectedText, "text doesn't match");
    }

    public void setGiftCard() {
        giftCard.click();
        String actualText = giftCardValidation.getText();
        String expectedText = "Gift Cards";
        Assert.assertEquals(actualText, expectedText, "text doesn't match");
    }

    public void setFreeShipping() {
        freeShipping.click();
        String actualText = freeShippingValidation.getText();
        String expectedText = "Order $25 or more to qualify for\n" +
                "FREE Shipping on over 100 million items.";
        Assert.assertEquals(actualText, expectedText, "text doesn't match");
    }

    public void setSellButton() {
        sellButton.click();
        String actualText = sellButtonValidation.getText();
        String expectedText = "Sell on Amazon";
        Assert.assertEquals(actualText, expectedText, "text doesn't match");
    }

    public void setCoupons() {
        coupons.click();
        String actualText = couponsValidation.getText();
        String expectedText = "Amazon Coupons";
        Assert.assertEquals(actualText, expectedText, "text doesn't match");
    }

    public void setPrimeVideo() throws InterruptedException {
        menuButton.click();
        sleepFor(3);
        primeVideo.click();
        sleepFor(2);
        rentBuy.click();
        sleepFor(2);
        String actualResult = rentBuyValidation.getText();
        String expectedResult = "Prime Video Cinema";
        Assert.assertEquals(actualResult, expectedResult, "***********test failed********");
    }


}
