package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.concurrent.TimeUnit;

public class MarriottHomePageTest extends CommonAPI {

    MarriottHomePage marriottHomePage;

    @BeforeMethod
    public void getInit(){
        marriottHomePage = PageFactory.initElements(driver, MarriottHomePage.class);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    /**
     * test langauge selector in the header
     */
    @Test(enabled = true)
    public void testLanguageSelector() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnLanguageSelector();
        sleepFor(3);
        marriottHomePage.validateLanguageSelector();
    }

    /**
     * test sign in functionality
     */
    @Test(enabled = true)
    public void testSignInFunctionality() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickSignInOrJoinBtn();
        sleepFor(3);
        marriottHomePage.enterEmailNPassword();
        marriottHomePage.clickOnSignInSubmitBtn();
        sleepFor(1);
        marriottHomePage.validateSignInFunctionality();
    }



    /**
     * test click on Find and reserve tab
     */
    @Test(enabled = true)
    public void testFindNReserve() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
       }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnFindNReserve();
        sleepFor(3);
        marriottHomePage.validateFindNReserve();
    }

    /**
     * test bookHotelFindNReserve
     */
    @Test(enabled = false)
    public void testBookHotelFindNReserve(){
     TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.bookHotelFindNReserve();
        marriottHomePage.validateBookHotelsFindNReserve();
    }
    /**
     * test use points checkbox
     */
    @Test(enabled = true)
    public void testUsePointsCheckBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.usePointsCheckBox();
        marriottHomePage.validateUsePointsCheckBox();

    }
//
    /**
     * test click on deals and exclusive packages
     */
    @Test(enabled = true)
    public void testClickOnDealsPackages(){
        marriottHomePage.clickOnDealsPackages();
        marriottHomePage.validateClickDealsPackages();
    }

    /**
     * test click on explore all destinations
     */
    @Test(enabled = true)
    public void testClickOnExploreAll(){
        marriottHomePage.clickOnExploreAll();
        marriottHomePage.validateClickOnExploreAllDestinations();
    }
//
    /**
     * test meetings and events
     */
    @Test(enabled = true)
    public void testClickMeetingsNEvents(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickMeetingsNEvents();
        marriottHomePage.validateMeetingNEvents();
    }
    /**
     * test business meetings
     */
    @Test(enabled = true)
    public void testClickBusinessMeetings(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnBusinessMeetings();
        marriottHomePage.validateBusinessMeetings();
    }

    /**
     * test weddings element under meetings and events
     */
    @Test(enabled = true)
    public void testClicKWeddings(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnWeddings();
        marriottHomePage.validateWeddings();
    }

    /**
     * test social events element under meetings and events
     */
    @Test(enabled = true)
    public void testClicKSocialEvents(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnSocialEvents();
        marriottHomePage.validateSocialEvents();
    }

    /**
     * test planning element under weddings
     */
    @Test(enabled = true)
    public void testClicKPlanning(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnPlanning();
        marriottHomePage.validateClickPlanning();
    }

    /**
     * test ceremonies element under weddings
     */
    @Test(enabled = true)
    public void testClickCeremonies(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnCeremonies();
        marriottHomePage.validateClickCeremonies();
    }

    /**
     * test receptions element under weddings
     */
    @Test(enabled = true)
    public void testClicKOnReceptions() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnReceptions();
        sleepFor(3);
        marriottHomePage.validateClickReceptions();
    }

    /**
     * test dining element under weddings
     */

    @Test(enabled = true)
    public void testClicKOnDining() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnDining();
        sleepFor(3);
        marriottHomePage.validateClickDining();
    }

    /**
     * test accomodations under weddings element
     */
    @Test(enabled = true)
    public void testClicKOnAccomodations(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnAccomodations();
        marriottHomePage.validateClickAccomodations();
    }

    /**
     * test accomodations under weddings element
     */
    @Test(enabled = true)
    public void testClicKOnDestinationsUnderWeddings(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnDestinationsUnderWeddings();
        marriottHomePage.validateClickDestionationsUnderWeddings();
    }

    /**
     * test group travel element under meetings and events
     */
    @Test(enabled = true)
    public void testClickOnGrouptTravels(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnGrouptTravels();
        marriottHomePage.validateGroupTravel();
    }
    /**
     * test click on our brands
     */
    @Test(enabled = true)
    public void testClickOnOurBrands() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
           marriottHomePage.clickOnOurBrands();
           sleepFor(3);
        marriottHomePage.validateClickOnOurBrands();
    }

    /**
     * test click on edition element under our brands
     */
    @Test(enabled = true)
    public void testClickOnEdition() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
           marriottHomePage.clickOnEdition();
           marriottHomePage.validateClickOnEdition();
    }

    /**
     * test click on st Regis hotels element under our brands
     */
    @Test(enabled = true)
    public void testClickOnRegis() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnStRegis();
        marriottHomePage.validateClickOnStRegis();
    }
    /**
     * test click on st Regis hotels element under our brands
     */
    @Test(enabled = true)
    public void testClickOnWHotels() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnWHotels();
        marriottHomePage.validateClickOnWHotels();
    }

    /**
     * test click on JW hotels element under our brands
     */
    @Test(enabled = true)
    public void testClickOnJWHotels() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnJWHotels();
        marriottHomePage.validateClickOnJWHotels();
    }
    /**
     * test click on delta hotels element under our brands
     */
    @Test(enabled = true)
    public void testClickOnDeltaHotels() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnDeltaHotels();
        sleepFor(3);
        marriottHomePage.validateClickOnDeltaHotels();
    }

    /**
     * test click on le meridien hotels element under our brands
     */
    @Test(enabled = true)
    public void testClickOnleMeridienHotels()  {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnleMeridienHotels();
        marriottHomePage.validateClickOnleMeridienHotels();
    }

    /**
     * test click on Westin hotels element under our brands
     */
    @Test(enabled = true)
    public void testClickOnWestin()  {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnWestinHotels();
        marriottHomePage.validateClickOnWestinHotels();
    }

    /**
     * test click on our credit cards
     */
    @Test(enabled = true)
    public void testClickOnOurCreditCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnOurCreditCards();
        marriottHomePage.validateClickOnOurCreditCards();
    }

    /**
     * test click on Ritz logo
     */
    @Test(enabled = true)
    public void testClickOnRitz(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnRitz();
        marriottHomePage.validateClickOnRitz();
    }

    /**
     * test search box
     */
    @Test(enabled = true)
    public void testSearchBox() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.searchBox();
        marriottHomePage.validateSearchBox();
        sleepFor(3);
    }



}
