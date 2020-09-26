package test;

import base.CommonAPI;
import home.Home;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {

    Home home;

    @BeforeMethod
    public void getInit() {
        home = PageFactory.initElements(driver, Home.class);
    }

//    @Test
//    public void testVerifyClickSearchBox(){
//        home.clickSearchBox();
//        home.verifyClickSearchBox();
//    }
    @Test
    public void testVerifyClickWorld(){
        home.worldCheck();
        home.validateWorld();
    }
    @Test
    public void testVerifyClickUs(){
        home.usCheck();
        home.validateUs();
    }
    @Test
    public void testVerifyClickPolitics(){
        home.politicsCheck();
        home.validatePolitics();
    }
    @Test
    public void testVerifyClickNyNews(){
        home.nyNewsCheck();
        home.validateNyNews();
    }
    @Test
    public void testVerifyClickBusinessNews(){
        home.businessNewsCheck();
        home.validateBusinessNews();
    }
    @Test
    public void testVerifyClickOpinionNews(){
        home.opinionCheck();
        home.validateOpinion();
    }
    @Test
    public void testVerifyClickTechNews(){
        home.techNewsCheck();
        home.validateTechNews();
    }
    @Test
    public void testVerifyClickScienceNews(){
        home.scienceNewsCheck();
        home.validateScienceNews();
    }
    @Test
    public void testVerifyClickHealthNews(){
        home.healthNewsCheck();
        home.validateHealthNews();
    }
    @Test
    public void testVerifyClickSportsNews(){
        home.sportsNewsCheck();
        home.validateSportsNews();
    }
    @Test
    public void testVerifyClickArtsNews(){
        home.artsNewsCheck();
        home.validateArtsNews();
    }
    @Test
    public void testVerifyClickBooksNews(){
        home.booksNewsCheck();
        home.validateBooksNews();
    }
    @Test
    public void testVerifyClickStyleNews(){
        home.styleNewsCheck();
        home.validateStyleNews();
    }
    @Test
    public void testVerifyClickFoodNews(){
        home.foodNewsCheck();
        home.validateFoodNews();
    }
    @Test
    public void testVerifyClickTravelNews(){
        home.travelNewsCheck();
        home.validateTravelNews();
    }
    @Test
    public void testVerifyClickMagazine(){
        home.magazineCheck();
        home.validateMagazine();
    }
    @Test
    public void testVerifyClick_t_Magazine(){
        home.t_magazineCheck();
        home.validate_t_Magazine();
    }
    @Test
    public void testVerifyClickRealEstate(){
        home.realEstateCheck();
        home.validateRealEstate();
    }
    @Test
    public void testVerifyClickVideoWebElement(){
        home.videoWebElementsCheck();
        home.validateVideoWebElements();
    }
    @Test
    public void testVerifyClickTodaysPaper(){
        home.todaysPaperCheck();
        home.validateTodaysPaper();
    }
    @Test
    public void testVerifyClickToggleMenu(){
        home.toggleMenuCheck();
        home.validateClickToggleMenu();
    }
    @Test
    public void testVerifyClickLogInButton(){
        home.logInButtonCheck();
        home.validateLogInButton();
    }
    @Test
    public void testVerifyClickSpanishLanguage() throws InterruptedException {
        home.spanishLanguageCheck();
        home.validateSpanishLanguage();
    }
    @Test
    public void testVerifyClickChineseLanguage(){
        home.chineseLanguageCheck();
        home.validateChineseLanguage();
    }
    @Test
    public void testVerifyClickSubscribeNow(){
        home.subscribeNowCheck();
        home.validateSubscribeNow();
    }



}
