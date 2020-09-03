package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends CommonAPI {

    Home home;

    @BeforeMethod
    public void getInit(){
        home = PageFactory.initElements(driver, Home.class);
    }

    @Test
    public void testVerifyClickChecking(){
        home.clickChecking();
        home.verifyClickChecking();
    }
//    @Test
//    public void testVerifyClickSaving(){
//        home.clickSaving();
//        home.verifyClickSaving();
//    }
//    @Test
//    public void testVerifyClickCreditCards(){
//        home.clickCreditCards();
//        home.verifyClickCreditCards();
//    }
//    @Test
//    public void testVerifyClickHomeLoans(){
//        home.clickHomeLoans();
//        home.verifyHomeLoans();
//    }
//    @Test
//    public void testVerifyClickAutoLoans(){
//        home.clickAutoLoans();
//        home.verifyAutoLoans();
//    }
//    @Test
//    public void testVerifyClickInvesting(){
//        home.clickInvesting();
//        home.verifyInvesting();
//    }
//    @Test
//    public void testVerifyClickBetterMoney(){
//        home.clickBetterMoney();
//        home.verifyBetterMoney();
//    }
//    @Test
//    public void testVerifySmallBusiness(){
//        home.clickSmallBusiness();
//        home.verifySmallBusiness();
//    }
//    @Test
//    public void testVerifyWealthManagement(){
//        home.clickWealthManagement();
//        home.verifyWealthManagement();
//    }
//    @Test
//    public void testVerifyBusinessAndInstitutions(){
//        home.clickBusinessAndInstitutions();
//        home.verifyBusinessAndInstitutions();
//    }
//    @Test
//    public void testVerifySecurity(){
//        home.clickSecurity();
//        home.verifySecurity();
//    }
//    @Test
//    public void testAboutUs(){
//        home.clickAboutUs();
//        home.verifyAboutUs();
//    }
//    @Test
//    public void testEnEspanol(){
//        home.clickEnEspanol();
//        home.verifyEnEspanol();
//    }
//    @Test
//    public void testContactUs(){
//        home.clickContactUs();
//        home.verifyContactUs();
//    }
//    @Test
//    public void testHelp(){
//        home.clickHelp();
//        home.verifyHelp();
//    }
//    @Test
//    public void testFindClosestLocation(){
//        home.clickFindClosest();
//        home.verifyFindClosestLocation();
//    }
//    @Test
//    public void testScheduleAppointment(){
//        home.clickScheduleAppointment();
//        home.verifyScheduleAppointment();
//    }
//    @Test
//    public void testDealsAllDay(){
//        home.clickDealsAllDay();
//        home.verifyDealsAllDay();
//    }
//    @Test
//    public void testCheckingWithRightFeatures(){
//        home.clickcheckingWithRightFeatures();
//        home.verifycheckingWithRightFeatures();
//    }
//    @Test
//    public void testLifeServices(){
//        home.clickLifeServices();
//        home.verifyLifeServices();
//    }
}
