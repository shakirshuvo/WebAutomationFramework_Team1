package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {

    HomePage homePage;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void testValidateSearchBox() {
        homePage.CheckSearchBox("Mask");
        homePage.validateSearchBox();
    }

    @Test
    public void testValidateBestSeller() {
        homePage.checkBestSeller();
        homePage.validateBestSeller();
    }

//    @Test
//    public void testValidateNewReleases() {
//        homePage.checkNewReleases();
//        homePage.validateNewReleases();
//    }
//
//    @Test
//    public void testValidateMoversAndShakers() {
//        homePage.checkMoversAndShakers();
//        homePage.validateMoversAndShakers();
//    }
//
//    @Test
//    public void testValidateMostWishedFor() {
//        homePage.checkMostWishedFor();
//        homePage.validateMostWishedFor();
//    }
//
//    @Test
//    public void testValidateGiftIdeas() {
//        homePage.checkGiftIdeas();
//        homePage.validateGiftIdeas();
//    }
//
//    @Test
//    public void testValidateCustomerService() {
//        homePage.checkCustomerService();
//        homePage.validateCustomerService();
//    }
//
//    @Test
//    public void testValidateTodaysDeal() {
//        homePage.checkTodaysDeal();
//        homePage.validateTodaysDeal();
//    }
//
//    @Test
//    public void testValidateNewReleases1() {
//        homePage.checkNewReleases1();
//        homePage.validateNewReleases1();
//    }
//
//    @Test
//    public void testValidateNewGames() {
//        homePage.checkNewGames();
//        homePage.validateNewGames();
//    }
//
//    @Test
//    public void testValidateNewPCGamesv() {
//        homePage.checkNewPCGamesv();
//        homePage.validateNewPCGamesv();
//    }
//
//    @Test
//    public void testValidateNewVideoGames() {
//        homePage.checkNewVideoGames();
//        homePage.validateNewVideoGames();
//    }
//
//    @Test
//    public void testValidateNewPlayStation3() {
//        homePage.checkNewPlayStation3();
//        homePage.validateNewPlayStation3();
//    }
//
//    @Test
//    public void testValidateNewXbox360() {
//        homePage.checkNewXbox360();
//        homePage.validateNewXbox360();
//    }
//
//    @Test
//    public void testValidateNewNintendoDS() {
//        homePage.checkNewNintendoDS();
//        homePage.validateNewNintendoDS();
//    }
//
//    @Test
//    public void testValidateNewWii() {
//        homePage.checkNewWii();
//        homePage.validateNewWii();
//    }
//
//    @Test
//    public void testValidateNewWiiU() {
//        homePage.checkNewWiiU();
//        homePage.validateNewWiiU();
//    }
//
//    @Test
//    public void testValidateNewPlayStationVista() {
//        homePage.checkNewPlayStationVista();
//        homePage.validateNewPlayStationVista();
//    }
//
//    @Test
//    public void testValidateNewNintendo3DS() {
//        homePage.checkNewNintendo3DS();
//        homePage.validateNewNintendo3DS();
//    }
//
//    @Test
//    public void testValidateNewXboxOne() {
//        homePage.checkNewXboxOne();
//        homePage.validateNewXboxOne();
//    }
//
//    @Test
//    public void testValidateNewPlayStation4() {
//        homePage.checkNewPlayStation4();
//        homePage.validateNewPlayStation4();
//    }
//
//    @Test
//    public void testValidateNewSonyPSP() {
//        homePage.checkNewSonyPSP();
//        homePage.validateNewSonyPSP();
//    }
//
//    @Test
//    public void testValidateMacGames() {
//        homePage.checkMacGames();
//        homePage.validateMacGames();
//    }
//
//    @Test
//    public void testValidateMoreSystems() {
//        homePage.checkMoreSystems();
//        homePage.validateMoreSystems();
//    }
//
//    @Test
//    public void testValidateNewNintendoSwitch() {
//        homePage.checkNewNintendoSwitch();
//        homePage.validateNewNintendoSwitch();
//    }
//
//    @Test
//    public void testValidateMicroconsoles() {
//        homePage.checkMicroconsoles();
//        homePage.validateMicroconsoles();
//    }
//
//    @Test
//    public void testValidateFindAGift() {
//        homePage.checkFindAGift();
//        homePage.validateFindAGift();
//    }
//
//    @Test
//    public void testValidateWholeFood() {
//        homePage.checkWholeFood();
//        homePage.validateWholeFood();
//    }
//
//    @Test
//    public void testValidateWholeFoodBeverages() {
//        homePage.checkWholeFoodBeverages();
//        homePage.validateWholeFoodBeverages();
//    }
//
//    @Test
//    public void testValidateGiftCards() {
//        homePage.checkGiftCards();
//        homePage.validateGiftCards();
//    }


}
