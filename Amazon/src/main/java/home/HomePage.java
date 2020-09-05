package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageWebElements.*;


public class HomePage extends CommonAPI {
    // Action Class: All the action methods and Validate methods

   // @FindBy(how = How.CSS, using = searchBoxCSS) public WebElement searchBox;
    @FindBy(how = How.CSS, using = searchButtonCSS) public WebElement searchButton;
    @FindBy(how = How.XPATH, using = searchTextXPath) public WebElement searchText;
    @FindBy(how = How.CSS, using = bestSellerCSS) public WebElement bestSeller;
    @FindBy(how = How.CSS, using = newReleasesCSS) public WebElement newReleases;
    @FindBy(how = How.CSS, using = moversAndShakersCSS) public WebElement moversAndShakers;
    @FindBy(how = How.CSS, using = mostWishedForCSS) public WebElement mostWishedFor;
    @FindBy(how = How.CSS, using = giftIdeasCSS) public WebElement giftIdeas;
    @FindBy(how = How.CSS, using = customerServiceCSS) public WebElement customerService;
    @FindBy(how = How.CSS, using = todaysDealCSS) public WebElement todaysDeal;
    @FindBy(how = How.CSS, using = newReleases1CSS) public WebElement newReleases1;
    @FindBy(how = How.CSS, using = newGamesCSS) public WebElement newGames;
    @FindBy(how = How.CSS, using = newPCGamesCSS) public WebElement newPCGamesv;
    @FindBy(how = How.CSS, using = newVideoGamesCSS) public WebElement newVideoGames;
    @FindBy(how = How.CSS, using = newPlayStation3CSS) public WebElement newPlayStation3;
    @FindBy(how = How.CSS, using = newXbox360CSS) public WebElement newXbox360;
    @FindBy(how = How.CSS, using = newNintendoDSCSS) public WebElement newNintendoDS;
    @FindBy(how = How.CSS, using = newWiiCSS) public WebElement newWii;
    @FindBy(how = How.CSS, using = newWiiUCSS) public WebElement newWiiU;
    @FindBy(how = How.CSS, using = newPlayStationVistaCSS) public WebElement newPlayStationVista;
    @FindBy(how = How.CSS, using = newNintendo3DSCSS) public WebElement newNintendo3DS;
    @FindBy(how = How.CSS, using = newXboxOneCSS) public WebElement newXboxOne;
    @FindBy(how = How.CSS, using = newPlayStation4CSS) public WebElement newPlayStation4;
    @FindBy(how = How.CSS, using = newSonyPSPCSS) public WebElement newSonyPSP;
    @FindBy(how = How.CSS, using = macGamesCSS) public WebElement macGames;
    @FindBy(how = How.CSS, using = moreSystemsCSS) public WebElement moreSystems;
    @FindBy(how = How.CSS, using = newNintendoSwitchCSS) public WebElement newNintendoSwitch;
    @FindBy(how = How.CSS, using = microconsolesCSS) public WebElement microconsoles;
    @FindBy(how = How.CSS, using = findAGiftCSS) public WebElement findAGift;
    @FindBy(how = How.CSS, using = wholeFoodCSS) public WebElement wholeFood;
    @FindBy(how = How.CSS, using = wholeFoodBeveragesCSS) public WebElement wholeFoodBeverages;
   //@FindBy(how = How.XPATH, using = wholeFoodXPath) public WebElement wholeFood1;
    @FindBy(how = How.CSS, using = giftCardsCSS) public WebElement giftCards;
//wholeFoodDealCSS

    /**
     * This method gets the title of the page when called.
     *
     * @return the title of the page in String.
     */
    //public String getTitle() { return driver.getTitle().toString(); }

    /**
     * This method returns the URL of the page.
     * @return
     */
    //public String getURL(){return driver.getCurrentUrl();  }

    // Action Method
    public void CheckSearchBox(String searchItem) throws InterruptedException {
        searchBox.sendKeys(searchItem);
        clearInputField(searchBoxCSS);
        clearInputBox(searchBox);
        sleepFor(5);
        searchBox.sendKeys(searchItem);
        searchBox.submit();
        //searchButton.click();
    }

    // Validate Method
    public void validateSearchBox(){
        String actualResult=searchText.getText();
        String expectedResult="\"Mask\"";
        Assert.assertEquals(actualResult,expectedResult,"Search Item not match");
    }
    //*********************************************

    // Action Method
    public void checkBestSeller(){
        bestSeller.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateBestSeller(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com Best Sellers: The most popular items on Amazon";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkNewReleases(){
        bestSeller.click();
        newReleases.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateNewReleases(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com New Releases: The best-selling new & future releases on Amazon";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkMoversAndShakers(){
        bestSeller.click();
        moversAndShakers.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateMoversAndShakers(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com Movers & Shakers: The biggest gainers in Amazon sales rank over the past 24 hours";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkMostWishedFor(){
        bestSeller.click();
        mostWishedFor.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateMostWishedFor(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com Best Sellers: The most popular items on Amazon";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkGiftIdeas(){
        bestSeller.click();
        giftIdeas.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateGiftIdeas(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com Gift Ideas: The most popular items ordered as gifts at Amazon";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkCustomerService(){
        customerService.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateCustomerService(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com Help: Help & Customer Service";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkTodaysDeal(){
        todaysDeal.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateTodaysDeal(){
        String actualResult = getTitle();
        String expectedResult = "Gold Box Deals | Today's Deals - Amazon.com";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkNewReleases1(){
        newReleases1.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateNewReleases1(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com New Releases: The best-selling new & future releases on Amazon";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkNewGames(){
        newReleases1.click();
        newGames.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateNewGames(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com New Releases: The best-selling new & future releases in Video Games";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkNewPCGamesv(){
        newReleases1.click();
        newGames.click();
        newPCGamesv.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateNewPCGamesv(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com New Releases: The best-selling new & future releases in PC Games & Accessories";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkNewVideoGames(){
        newReleases1.click();
        newGames.click();
        newVideoGames.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateNewVideoGames(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com New Releases: The best-selling new & future releases in Video Games";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkNewPlayStation3(){
        newReleases1.click();
        newGames.click();
        newPlayStation3.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateNewPlayStation3(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com New Releases: The best-selling new & future releases in PlayStation 3 Games, Consoles & Accessories";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkNewXbox360(){
        newReleases1.click();
        newGames.click();
        newXbox360.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateNewXbox360(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com New Releases: The best-selling new & future releases in Xbox 360 Games, Consoles & Accessories";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkNewNintendoDS(){
        newReleases1.click();
        newGames.click();
        newNintendoDS.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateNewNintendoDS(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com New Releases: The best-selling new & future releases in Nintendo DS Games, Consoles & Accessories";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkNewWii(){
        newReleases1.click();
        newGames.click();
        newWii.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateNewWii(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com New Releases: The best-selling new & future releases in Wii Games, Consoles & Accessories";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkNewWiiU(){
        newReleases1.click();
        newGames.click();
        newWiiU.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateNewWiiU(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com New Releases: The best-selling new & future releases in Wii U Games, Consoles & Accessories";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkNewPlayStationVista(){
        newReleases1.click();
        newGames.click();
        newPlayStationVista.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateNewPlayStationVista(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com New Releases: The best-selling new & future releases in PlayStation Vita Games, Consoles & Accessories";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkNewNintendo3DS(){
        newReleases1.click();
        newGames.click();
        newNintendo3DS.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateNewNintendo3DS(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com New Releases: The best-selling new & future releases in Nintendo 3DS & 2DS Consoles, Games & Accessories";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkNewXboxOne(){
        newReleases1.click();
        newGames.click();
        newXboxOne.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateNewXboxOne(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com New Releases: The best-selling new & future releases in Xbox One Games, Consoles & Accessories";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkNewPlayStation4(){
        newReleases1.click();
        newGames.click();
        newPlayStation4.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateNewPlayStation4(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com New Releases: The best-selling new & future releases in PlayStation 4 Games, Consoles & Accessories";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkNewSonyPSP(){
        newReleases1.click();
        newGames.click();
        newSonyPSP.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateNewSonyPSP(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com New Releases: The best-selling new & future releases in Sony PSP Games, Consoles & Accessories";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkMacGames(){
        newReleases1.click();
        newGames.click();
        macGames.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateMacGames(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com New Releases: The best-selling new & future releases in Mac Games & Accessories";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkMoreSystems(){
        newReleases1.click();
        newGames.click();
        moreSystems.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateMoreSystems(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com New Releases: The best-selling new & future releases in Legacy Systems";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkNewNintendoSwitch(){
        newReleases1.click();
        newGames.click();
        newNintendoSwitch.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateNewNintendoSwitch(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com New Releases: The best-selling new & future releases in Nintendo Switch Consoles, Games & Accessories";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkMicroconsoles(){
        newReleases1.click();
        newGames.click();
        microconsoles.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateMicroconsoles(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com New Releases: The best-selling new & future releases in Microconsoles";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkFindAGift(){
        findAGift.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateFindAGift(){
        String actualResult = getTitle();
        String expectedResult = "Gifts for Everyone | Amazon.com Gift Finder";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkWholeFood(){
        //wholeFood1.click();
        customerService.click();
        wholeFood.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateWholeFood(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com: Whole Foods Market";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkWholeFoodBeverages(){
        //wholeFood1.click();
        customerService.click();
        wholeFood.click();
        wholeFoodBeverages.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateWholeFoodBeverages(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com: Whole Foods Market";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkGiftCards(){
        customerService.click();
        giftCards.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    // Validation Method
    public void validateGiftCards(){
        String actualResult = getTitle();
        String expectedResult = "Amazon.com Gift Cards";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************



}
