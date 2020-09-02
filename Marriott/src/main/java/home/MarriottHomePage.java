package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;


import static home.MarriottHomePageWebElements.*;

public class MarriottHomePage extends CommonAPI {

    @FindBy(how = How.XPATH, using = findAndReserveWebElementXPath)
        public WebElement findNReserve;

    @FindBy(how = How.XPATH, using =destinationXPathWebElement)
    public WebElement destination;

    /**
     * test Find and Reserve link
     * Author: Waqas
     */
    public void clickOnFindNReserve(){
        findNReserve.click();
    }

    public void getDestinationText(){
        destination.getText();
    }

    /**
     * Validate clicking on the find and reserve link
     * Waqas
     */
    public void validateFindNReserve(){
       //clickOnFindNReserve();
       //String expectedText = destination.getText();
        String actual  = driver.getTitle();
        Assert.assertEquals(actual, destinationExpectedText);
    }

    // deals and packages
    @FindBy(how = How.XPATH, using = dealsAndPackagesXPathWebElement)
    WebElement dealsNPackages;
    @FindBy(how = How.XPATH, using = exclusiveGetAwaysElementXpath)
    WebElement exclusiveGetAway;
    /**
     * click on deals and packages
     */
    public void clickOnDealsPackages(){
        dealsNPackages.click();
    }

    /**
     * validate click on deals
     */
    public void validateClickDealsPackages(){
        String actual  = exclusiveGetAway.getText();
        Assert.assertEquals(actual,exclusiveExpectedText);
    }

    //explore desitnation
    @FindBy(how = How.XPATH, using = exploreDestinationELementXpath)
    WebElement exploreDestinations;
    @FindBy(how = How.XPATH, using = exploreAllElementXpath)
    WebElement exploreAll;

    /**
     * click on explore all
     */
    public void clickOnExploreAll(){
        exploreDestinations.click();
    }
    /**
     * validate click on explore all destinations
     */
    public void validateClickOnExploreAllDestinations(){
        String actual =  driver.getTitle();//exploreAll.getText();
        Assert.assertEquals(actual, exploreAllExpectedText);
    }

    //our brands
    @FindBy(how = How.XPATH, using = ourBrandsELementXpath)
    WebElement ourBrands;
    @FindBy(how = How.XPATH, using = ritzElementXpath)
    WebElement ritz;
    @FindBy(how = How.XPATH,using = aboutRitzCarltonElementXpath)
    WebElement aboutRitzCarlton;

    /**
     * click on our brands
     */
    public void clickOnOurBrands(){
        ourBrands.click();
    }
    /**
     * validate click on our brands
     */
    public void validateClickOnOurBrands(){
       String actual = ritz.getText();
       Assert.assertEquals(actual,ritzExpectedText);
    }

    /**
     * click on ritz logo
     */
    public void clickOnRitz(){
        ritz.click();
    }

    /**
     * validate click on ritz
     */
    public void validateClickOnRitz(){
        String actual = aboutRitzCarlton.getText();
        Assert.assertEquals(actual, aboutRitzExpectedText);
    }


    // our credit cards
    @FindBy(how = How.XPATH,using = ourCreditCardsElementXpath)
    WebElement ourCreditCards;
    @FindBy(how = How.XPATH, using = maximizeRewardsElementXpath)
    WebElement maximizeRewards;

    /**
     * click on our credit cards
     */
    public void clickOnOurCreditCards(){
        ourCreditCards.click();
    }
    /**
     * validate
     */
    public void validateClickOnOurCreditCards(){
        String actual = driver.getTitle();//maximizeRewards.getText();
        Assert.assertEquals(actual,rewardsExpectedText);

    }



}
