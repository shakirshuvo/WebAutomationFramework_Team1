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
    @Test
    public void testLanguageSelector() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnLanguageSelector();
        sleepFor(3);
        marriottHomePage.validateLanguageSelector();
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
    @Test
    public void testBookHotelFindNReserve(){
     TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.bookHotelFindNReserve();
        marriottHomePage.validateBookHotelsFindNReserve();
    }
    /**
     * test use points checkbox
     */
    @Test
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
    @Test
    public void testClickOnDealsPackages(){
        marriottHomePage.clickOnDealsPackages();
        marriottHomePage.validateClickDealsPackages();
    }

    /**
     * test click on explore all destinations
     */
    @Test
    public void testClickOnExploreAll(){
        marriottHomePage.clickOnExploreAll();
        marriottHomePage.validateClickOnExploreAllDestinations();
    }
//
    /**
     * test meetings and events
     */
    @Test
    public void testClickMeetingsNEvents(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickMeetingsNEvents();
        marriottHomePage.validateMeetingNEvents();
    }
    /**
     * test business meetings
     */
    @Test
    public void testClickBusinessMeetings(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnBusinessMeetings();
        marriottHomePage.validateBusinessMeetings();
    }

    /**
     * test weddings element under meetings and events
     */
    @Test
    public void testClicKWeddings(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnWeddings();
        marriottHomePage.validateWeddings();
    }

    /**
     * test social events element under meetings and events
     */
    @Test
    public void testClicKSocialEvents(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnSocialEvents();
        marriottHomePage.validateSocialEvents();
    }

    /**
     * test planning element under weddings
     */
    @Test
    public void testClicKPlanning(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnPlanning();
        marriottHomePage.validateClickPlanning();
    }

    /**
     * test ceremonies element under weddings
     */
    @Test
    public void testClickCeremonies(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnCeremonies();
        marriottHomePage.validateClickCeremonies();
    }

    /**
     * test receptions element under weddings
     */
    @Test
    public void testClicKOnReceptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnReceptions();
        marriottHomePage.validateClickReceptions();
    }

    /**
     * test dining element under weddings
     */

    @Test
    public void testClicKOnDining(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnDining();
        marriottHomePage.validateClickDining();
    }

    /**
     * test accomodations under weddings element
     */
    @Test
    public void testClicKOnAccomodations(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnAccomodations();
        marriottHomePage.validateClickAccomodations();
    }

    /**
     * test accomodations under weddings element
     */
    @Test
    public void testClicKOnDestinationsUnderWeddings(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnDestinationsUnderWeddings();
        marriottHomePage.validateClickDestionationsUnderWeddings();
    }

    /**
     * test group travel element under meetings and events
     */
    @Test
    public void testClickOnGrouptTravels(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marriottHomePage.clickOnGrouptTravels();
        marriottHomePage.validateGroupTravel();
    }
    /**
     * test click on our brands
     */
    @Test
    public void testClickOnOurBrands() throws InterruptedException {
           marriottHomePage.clickOnOurBrands();
           sleepFor(3);
        marriottHomePage.validateClickOnOurBrands();
    }

    /**
     * test click on edition element under our brands
     */
    @Test
    public void testClickOnEdition() throws InterruptedException {
           marriottHomePage.clickOnEdition();
           marriottHomePage.validateClickOnEdition();
    }

    /**
     * test click on st Regis hotels element under our brands
     */
    @Test
    public void testClickOnRegis() throws InterruptedException {
        marriottHomePage.clickOnStRegis();
        marriottHomePage.validateClickOnStRegis();
    }
    /**
     * test click on st Regis hotels element under our brands
     */
    @Test
    public void testClickOnWHotels() throws InterruptedException {
        marriottHomePage.clickOnWHotels();
        marriottHomePage.validateClickOnWHotels();
    }

    /**
     * test click on JW hotels element under our brands
     */
    @Test
    public void testClickOnJWHotels() {
        marriottHomePage.clickOnJWHotels();
        marriottHomePage.validateClickOnJWHotels();
    }
    /**
     * test click on delta hotels element under our brands
     */
    @Test
    public void testClickOnDeltaHotels()  {
        marriottHomePage.clickOnDeltaHotels();
        marriottHomePage.validateClickOnDeltaHotels();
    }

    /**
     * test click on le meridien hotels element under our brands
     */
    @Test
    public void testClickOnleMeridienHotels()  {
        marriottHomePage.clickOnleMeridienHotels();
        marriottHomePage.validateClickOnleMeridienHotels();
    }

    /**
     * test click on Westin hotels element under our brands
     */
    @Test
    public void testClickOnWestin()  {
        marriottHomePage.clickOnWestinHotels();
        marriottHomePage.validateClickOnWestinHotels();
    }

    /**
     * test click on our credit cards
     */
    @Test
    public void testClickOnOurCreditCards(){
        marriottHomePage.clickOnOurCreditCards();
        marriottHomePage.validateClickOnOurCreditCards();
    }

    /**
     * test click on Ritz logo
     */
    @Test
    public void testClickOnRitz(){
        marriottHomePage.clickOnRitz();
        marriottHomePage.validateClickOnRitz();
    }

    /**
     * test search box
     */
    @Test
    public void testSearchBox() throws InterruptedException {
        marriottHomePage.searchBox();
        marriottHomePage.validateSearchBox();
        sleepFor(3);
    }



}
