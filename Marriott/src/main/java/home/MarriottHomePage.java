package home;

import base.CommonAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;





import static home.MarriottHomePageWebElements.*;

public class MarriottHomePage extends CommonAPI {

    @FindBy(how = How.XPATH,using = languageSelectorElementXpath)
    WebElement languageSelector;
    @FindBy(how = How.XPATH, using = selectLanguageVerifierElementXpath)
    WebElement selectLanguageVerifier;

    /**
     * click on language selector element
     */
    public void clickOnLanguageSelector(){

        clickOnElement(languageSelector);
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }

    /**
     * validate click on language selector
     */
    public void validateLanguageSelector(){
        String actual = getTextByWebElement(selectLanguageVerifier);
        String expected = "Please select your preferred language";
        Assert.assertEquals(actual, expected, "Test failed");
    }


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
       clickOnFindNReserve();
       String expectedText = destination.getText();
        String actual  = driver.getTitle();
       Assert.assertEquals(actual, destinationExpectedText);
    }

    /**
     * enter all information under find and reserve
     */
    public void bookHotelFindNReserve(){

        clickOnFindNReserve();
        enterSearchKeys();
        stayDates();
        selectRoomsNGuests();
        clickSpecialRates();
        clickFindHotelUnderFindNReserve();

    }

    /**
     * validate book hotels
     */
    public void validateBookHotelsFindNReserve(){
        String actual = getTextByXpath(tryTheseFiletersXpath);
        String expected = " Try these filters: ";
        Assert.assertEquals(actual, expected, "test failed");
    }

    /**
     * enter search keys into search box
     */
    public void enterSearchKeys(){
       // waitUntilVisible(By.xpath(searchBoxFindNReseveXpath));
        clearInputField(searchBoxFindNReseveXpath);
        typeOnElement(searchBoxFindNReseveXpath, searchKeys);
    }

    /**
     * select stay dates
     */
    public void stayDates(){
        clickOnElement(fromDateXpath);
        waitUntilVisible(By.xpath(startDay));
        clickOnElement(startDay);
        waitUntilVisible(By.xpath(endDay));
        clickOnElement(endDay);
    }

    /**
     * validate stayDates
     */

    /**
     * set rooms and guests
     */
    public void selectRoomsNGuests(){
        clickOnElement(roomNGuestsXpath);
        waitUntilVisible(By.xpath(roomsXpath));
        clickOnElement(roomsXpath);
    }

    /**
     * click on special rates
     */
    public void clickSpecialRates(){
        clickOnElement(specialRatesXpath);
        waitUntilVisible(By.xpath(seniorDiscountXpath));
        clickOnElement(seniorDiscountXpath);
    }

    /**
     * click on use points checkBox
     */
    public void usePointsCheckBox(){
        clickOnFindNReserve();
        waitUntilVisible(By.xpath(usePointsCheckBoxXpath));
        clickOnElement(usePointsCheckBoxXpath);

    }
    /**
     * validate use points checkbox
     */
    public void validateUsePointsCheckBox(){
        boolean expected = true;
        boolean actual = driver.findElement(By.xpath(usePointsCheckBoxXpath)).isSelected();
        System.out.println(actual);
        Assert.assertEquals(actual,expected);
    }

    /**
     * click on find Hotels under find and Reserve
     */
    public void  clickFindHotelUnderFindNReserve(){
        clickOnElement(findHotelsButtonUnderFndNRsrveXpath);
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

    /**
     * click on meetings and events
     */
    public void clickMeetingsNEvents(){
        clickOnElement(meetingsNEventsWebElementXPath);
    }

    /**
     * click on meetings overview element
     */
    public void clickMeetingsOverview(){
        clickOnElement(meetingsOverviewWebElementXPath);
    }

    /**
     * validate meetings and events element
     */
    public void validateMeetingNEvents(){
        clickMeetingsOverview();
        //waitUntilVisible(By.xpath(businessMeetingsElementXpath));
        String actual = getTextByXpath(businessMeetingsOverviewElementXpath);
        String expected = "Business Meetings";
        Assert.assertEquals(actual, expected);
    }

    /**
     * click on business Meetings element under meetings and events
     */
    public void clickOnBusinessMeetings(){
        clickMeetingsNEvents();
        clickOnElement(businessMeetingsElementXpath);
    }

    /**
     * validate business meetings element under meetings and events
     */
    public void validateBusinessMeetings(){
        String actual = driver.getTitle();
        String expected = "Business Meetings";
        Assert.assertEquals(actual, expected);
    }


    //weddings page elements
    /**
     * click on weddings element under meetings and events
     */
    public void clickOnWeddings(){
        clickMeetingsNEvents();
        clickOnElement(weddingsElementXpath);
    }

    /**
     * validate weddings element under meetings and events
     */
    public void validateWeddings(){
        String actual = driver.getTitle();
        String expected = "Weddings";
        Assert.assertEquals(actual, expected);
    }

    /**
     * click on planning element under weddings
     */
    public void clickOnPlanning(){
        clickMeetingsNEvents();
        clickOnWeddings();
        clickOnElement(planningElementXpath);
    }

    /**
     * validate planning element under weddings
     */
    public void validateClickPlanning(){
        String actual = driver.getTitle();
        String expected = "Expert Planning";
        Assert.assertEquals(actual, expected);
    }

    /**
     * click on ceremonies element under weddings
     */
    public void clickOnCeremonies(){
        clickMeetingsNEvents();
        clickOnWeddings();
        clickOnElement(ceremoniesElementXpath);
    }

    /**
     * validate ceremonies element under weddings
     */
    public void validateClickCeremonies(){
        String actual = driver.getTitle();
        String expected = "Unforgettable Ceremonies";
        Assert.assertEquals(actual, expected);
    }

    /**
     * click on receptions element under weddings
     */
    public void clickOnReceptions(){
        clickMeetingsNEvents();
        clickOnWeddings();
        clickOnElement(receptionsElementXpath);
    }

    /**
     * validate receptions element under weddings
     */
    public void validateClickReceptions(){
        String actual = driver.getTitle();
        String expected = "Receptions";
        Assert.assertEquals(actual, expected);
    }

    /**
     * click on dining element under weddings
     */
    public void clickOnDining(){
        clickMeetingsNEvents();
        clickOnWeddings();
        clickOnElement(diningElementXpath);
    }

    /**
     * validate dining element under weddings
     */
    public void validateClickDining(){
        String actual = driver.getTitle();
        String expected = "Dining";
        Assert.assertEquals(actual, expected);
    }

    /**
     * click on accomodations element under weddings
     */
    public void clickOnAccomodations(){
        clickMeetingsNEvents();
        clickOnWeddings();
        clickOnElement(accomodationsElementXpath);
    }

    /**
     * validate accomodations element under weddings
     */
    public void validateClickAccomodations(){
        String actual = driver.getTitle();
        String expected = "Accommodations";
        Assert.assertEquals(actual, expected);
    }

    /**
     * click on destinations element under weddings
     */
    public void clickOnDestinationsUnderWeddings(){
        clickMeetingsNEvents();
        clickOnWeddings();
        clickOnElement(scrollRightElementXpath);
        waitUntilVisible(By.xpath(destinationsUnderWeddingsElementXpath));
        clickOnElement(destinationsUnderWeddingsElementXpath);
    }

    /**
     * validate destinations element under weddings
     */
    public void validateClickDestionationsUnderWeddings(){
        String actual = driver.getTitle();
        String expected = "Destinations";
        Assert.assertEquals(actual, expected);
    }





    /**
     * click on social element under meetings and events
     */
    public void clickOnSocialEvents(){
        clickMeetingsNEvents();
        clickOnElement(socialEventsElementXpath);
    }

    /**
     * validate social events element under meetings and events
     */
    public void validateSocialEvents(){
        String actual = driver.getTitle();
        String expected = "Corporate & Social Event Planning";
        Assert.assertEquals(actual, expected);
    }

    /**
     * click on group travel element under meetings and events
     */
    public void clickOnGrouptTravels(){
        clickMeetingsNEvents();
        clickOnElement(groupTravelElementXpath);
    }

    /**
     * validate group travel element under meetings and events
     */
    public void validateGroupTravel(){
        String actual = driver.getTitle();
        String expected = "Plan Group Travel";
        Assert.assertEquals(actual, expected);
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
       //String actual = getTextByXpath(ritzElementXpath);
        clickOnElement(ritzElementXpath);
        String actual = driver.getTitle();
        String expected  = "Luxury Hotels and Resorts | The Ritz-Carlton";
       Assert.assertEquals(actual,expected);
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

    /**
     * click on edition logo under our Brands
     */
    public void clickOnEdition(){
        clickOnElement(ourBrandsELementXpath);
        clickOnElement(editionElementXpath);
    }

    /**
     * validate click on edition under our brands
     */
    public void validateClickOnEdition(){
        String actualUrl = getCurrentPageUrl();
        String expectedUrl = "https://www.editionhotels.com/";
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    /**
     * click on st Regis logo under our Brands
     */
    public void clickOnStRegis(){
        clickOnElement(ourBrandsELementXpath);
        clickOnElement(stRegisElementXpath);
    }

    /**
     * validate click on st Regis under our brands
     */
    public void validateClickOnStRegis(){
        String actualUrl = getCurrentPageUrl();
        String expectedUrl = "https://st-regis.marriott.com/";
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    /**
     * click on w hotels logo under our Brands
     */
    public void clickOnWHotels(){
        clickOnElement(ourBrandsELementXpath);
        clickOnElement(wHotelsElementXpath);
    }

    /**
     * validate click on w hotels under our brands
     */
    public void validateClickOnWHotels(){
        String actualUrl = getCurrentPageUrl();
        String expectedUrl = "https://w-hotels.marriott.com/";
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    /**
     * click on jw hotels logo under our Brands
     */
    public void clickOnJWHotels(){
        clickOnElement(ourBrandsELementXpath);
        clickOnElement(jWHotelsElementXpath);
    }

    /**
     * validate click on JW Hotels under our brands
     */
    public void validateClickOnJWHotels(){
        String actualUrl = getCurrentPageUrl();
        String expectedUrl = "https://jw-marriott.marriott.com/";
        Assert.assertEquals(actualUrl,expectedUrl);
    }


    /**
     * click on delta hotels logo under our Brands
     */
    public void clickOnDeltaHotels(){
        clickOnElement(ourBrandsELementXpath);
        clickOnElement(deltaHotelsElementXpath);
    }

    /**
     * validate click on delta hotels under our brands
     */
    public void validateClickOnDeltaHotels(){
        String actualUrl = getCurrentPageUrl();
        String expectedUrl = "https://delta-hotels.marriott.com/";
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    /**
     * click on le Meridien logo under our Brands
     */
    public void clickOnleMeridienHotels(){
        clickOnElement(ourBrandsELementXpath);
        clickOnElement(leMeridienElementXpath);
    }

    /**
     * validate click on le Meridien hotels under our brands
     */
    public void validateClickOnleMeridienHotels(){
        String actualUrl = getCurrentPageUrl();
        String expectedUrl = "https://le-meridien.marriott.com/";
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    /**
     * click on Westin logo under our Brands
     */
    public void clickOnWestinHotels(){
        clickOnElement(ourBrandsELementXpath);
        clickOnElement(westinElementXpath);
    }

    /**
     * validate click on Westin hotels under our brands
     */
    public void validateClickOnWestinHotels(){
        String actualUrl = getCurrentPageUrl();
        String expectedUrl = "https://westin.marriott.com/";
        Assert.assertEquals(actualUrl,expectedUrl);
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

    @FindBy(how = How.XPATH, using = allFiltersXpath)
    WebElement searchResults;
    @FindBy(how = How.XPATH, using = findHotelsButtonXpath)
    WebElement findHotelsButton;
    /**
     * seach box
     */
    public void searchBox() throws InterruptedException {
        //typeOnElementNEnter(searchBarXpath, "Paris,France");
       typeOnElement(searchBarXpath, searchKeys);
        sleepFor(3);
        findHotelsButton.click();
        sleepFor(3);

    }

    /**
     * validae search bar
     */
    public  void validateSearchBox(){
        String actualText = getTextByXpath(allFiltersXpath);
        String expectedText = "Destination";
        Assert.assertEquals(actualText,expectedText, "test failed");
        }



}
