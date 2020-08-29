package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.sql.SQLOutput;

import static home.HomePageWebElements.*;

public class HomePage extends CommonAPI {
String expected;
String actual;
@FindBy(how= How.XPATH, using=bestSellersXPATH)
    public WebElement bestSellersElement;

public void bestSellersCheck(){
    bestSellersElement.click();
}
public void validateBestSellers(){
    actual= driver.getTitle();
    System.out.println(actual);
    expected="Amazon.com Best Sellers: The most popular items on Amazon";
    Assert.assertEquals(actual, expected, "failed");
}
    @FindBy(how= How.LINK_TEXT, using=customerServiceLinkTest)
    public WebElement customerService;

    public void customerServiceCheck(){
        customerService.click();
    }
    public void validateCustomerService(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected= "\n"+"Amazon.com Help: Help & Customer Service";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.LINK_TEXT, using=todaysDealsLinkTest)
    public WebElement todaysDeals;

    public void todaysDealsCheck(){
        todaysDeals.click();
    }
    public void validateTodaysDeals(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="\n" + "\n" + " Gold Box Deals | Today's Deals - Amazon.com\n";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.LINK_TEXT, using=newReleasesLinkTest)
    public WebElement newReleases;

    public void newReleasesCheck(){
        newReleases.click();
    }
    public void validateNewReleases(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Amazon.com New Releases: The best-selling new & future releases on Amazon";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.LINK_TEXT, using=find_a_giftLinkTest)
    public WebElement find_a_gift;

    public void find_a_giftCheck(){
        newReleases.click();
    }
    public void validatefind_a_gift(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Gifts for Everyone | Amazon.com Gift Finder";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.LINK_TEXT, using=wholeFoodsLinkTest)
    public WebElement wholeFoods;

    public void wholeFoodsCheck(){
        wholeFoods.click();
    }
    public void validateWholeFoods(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Whole Foods Market @ Amazon.com";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.LINK_TEXT, using=giftCardsLinkTest)
    public WebElement giftCards;

    public void giftCardsCheck(){
        giftCards.click();
    }
    public void validateGiftCards(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Amazon.com Gift Cards";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.LINK_TEXT, using=freeShippingLinkTest)
    public WebElement freeShipping;

    public void freeShippingCheck(){
        freeShipping.click();
    }
    public void validateFreeShipping(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Amazon.com: : FREE Shipping by Amazon";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.LINK_TEXT, using=registryLinkTest)
    public WebElement registry;

    public void registryCheck(){
        registry.click();
    }
    public void validateRegistry(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Amazon.com: : Registry";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.LINK_TEXT, using=sellLinkTest)
    public WebElement sell;

    public void sellCheck(){
        sell.click();
    }
    public void validateSell(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Amazon.com: Sell Products Online with Selling on Amazon.";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.LINK_TEXT, using=couponsLinkTest)
    public WebElement coupons;

    public void couponsCheck(){
        sell.click();
    }
    public void validateCoupons(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Amazon Coupons @ Amazon.com";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.LINK_TEXT, using=amazonBasicsLinkTest)
    public WebElement amazonBasics;

    public void amazonBasicsCheck(){
        amazonBasics.click();
    }
    public void validateAmazonBasics(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Amazon.com: AmazonBasics: AmazonBasics";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.LINK_TEXT, using=foundItOnAmazonLinkTest)
    public WebElement foundItOnAmazon;

    public void foundItOnAmazonCheck(){
        foundItOnAmazon.click();
    }
    public void validateFoundItOnAmazon(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="#FoundItOnAmazon";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.CLASS_NAME, using=account_listsByClassName)
    public WebElement accountLists;

    public void accountListsCheck(){
        accountLists.click();
    }
    public void validateAccountLists(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="\"\";\n";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.CSS, using=ordersByCSS)
    public WebElement orders;

    public void ordersCheck(){
        orders.click();
    }
    public void validateOrders(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="order:amazon";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.CLASS_NAME, using=tryPrimeByClassName)
    public WebElement tryPrimes;

    public void tryPrimesCheck(){
        tryPrimes.click();
    }
    public void validateTryPrimes(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Amazon.com: Amazon Prime";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.CLASS_NAME, using=cartByClassName)
    public WebElement cart;

    public void cartCheck(){
        cart.click();
    }
    public void validateCart(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Amazon.com Shopping Cart";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.ID, using=selectYourAddressID)
    public WebElement selectYourAddress;

    public void selectYourAddressCheck(){
        selectYourAddress.click();
    }
    public void validateSelectYourAddress(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="negative testing";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.ID, using=cartByClassName)
    public WebElement careers;

    public void careersCheck(){
        careers.click();
    }
    public void validateCareers(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Amazon.jobs: Help us build Earth’s most customer-centric company.";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.LINK_TEXT, using=blogByLinkTest)
    public WebElement blog;

    public void blogCheck(){
        blog.click();
    }
    public void validateBlog(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Day One: The Amazon Blog";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.LINK_TEXT, using=amazonBasicsLinkTest)
    public WebElement amazonDevices;

    public void amazonDevicesCheck(){
        amazonDevices.click();
    }
    public void validateAmazonDevices(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Amazon Devices - Official Site - Kindle, Fire, Echo devices";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.XPATH, using=pressCenterByCustomXPATH)
    public WebElement pressCenter;

    public void pressCenterCheck(){
        pressCenter.click();
    }
    public void validatepressCenter(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Press center | Amazon.com, Inc. - Press Room";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.XPATH, using=amazonToursByCustomXPATH)
    public WebElement amazonTours;

    public void amazonToursCheck(){
        amazonTours.click();
    }
    public void validateAmazonTours(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Amazon Fulfillment: Book a Warehouse Tour";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.XPATH, using=sellOnAmazonXPATH)
    public WebElement sellOnAmazon;

    public void sellOnAmazonCheck(){
        sellOnAmazon.click();
    }
    public void validateSellOnAmazon(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Sell on Amazon | Build Your Ecommerce Business";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.LINK_TEXT, using=becomeAffiliateByLinkTest)
    public WebElement becomeAffiliate;

    public void becomeAffiliateCheck(){
        becomeAffiliate.click();
    }
    public void validateBecomeAffiliate(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="\n" +
                "Amazon.com Associates Central";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.LINK_TEXT, using=advertiseProductsByLinkTest)
    public WebElement advertiseProducts;

    public void advertiseProductsCheck(){
        advertiseProducts.click();
    }
    public void validateAdvertiseProducts(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Amazon Advertising: Online advertising on Amazon";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.LINK_TEXT, using=amazonStoreCardLinkTest)
    public WebElement amazonStoreCard;

    public void amazonStoreCardCheck(){
        amazonStoreCard.click();
    }
    public void validateAmazonStoreCard(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Amazon Sign-In";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.LINK_TEXT, using=shopWithPointsLinkTest)
    public WebElement shopWithPoints;

    public void shopWithPointsCheck(){
        amazonStoreCard.click();
    }
    public void validateShopWithPoints(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Amazon.com: Credit & Payment Cards";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.LINK_TEXT, using=currencyConverterByLinkTest)
    public WebElement currencyConverter;

    public void currencyConverterCheck(){
        currencyConverter.click();
    }
    public void validateCurrencyConverter(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Amazon.com: Amazon Currency Converter";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.XPATH, using=creditCardMarketPlaceXPATH)
    public WebElement creditCardMarketPlace;

    public void creditCardMarketPlaceCheck(){
        creditCardMarketPlace.click();
    }
    public void validateCreditCardMarketPlace(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Credit Cards and Payment Cards: Compare and Review at Amazon.com";
        Assert.assertEquals(actual, expected, "failed");
    }
}
