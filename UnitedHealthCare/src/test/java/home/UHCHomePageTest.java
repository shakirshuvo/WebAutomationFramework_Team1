package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class UHCHomePageTest extends CommonAPI {

    UHCHomePage homePage;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, UHCHomePage.class);
    }

    @Test
    public void testValidateMedicare() throws InterruptedException{
        Thread.sleep(5000);
        homePage.checkMedicare();
        homePage.validateMedicare();
    }

    @Test
    public void testValidateForProviders() throws InterruptedException{
        Thread.sleep(5000);
        homePage.checkForProviders();
        homePage.validateForProviders();
    }

    @Test
    public void testValidateForEmployers() throws InterruptedException{
        Thread.sleep(5000);
        homePage.checkForEmployers();
        homePage.validateForEmployers();
    }

    @Test
    public void testValidateForBrokers() throws InterruptedException{
        Thread.sleep(5000);
        homePage.checkForBrokers();
        homePage.validateForBrokers();
    }

    @Test
    public void testValidateLanguageChange() throws InterruptedException{
        Thread.sleep(5000);
        homePage.checkLanguageChange();
        homePage.validateLanguageChange();
    }

    @Test
    public void testValidateFindADoctor() throws InterruptedException{
        Thread.sleep(5000);
        homePage.checkFindADoctor();
        homePage.validateFindADoctor();
    }

    @Test
    public void testValidateFindYourPlan() throws InterruptedException{
        Thread.sleep(5000);
        homePage.checkFindYourPlan();
        homePage.validateFindYourPlan();
    }

    @Test
    public void testValidateIndividualAndFamilyHealthPlan() throws InterruptedException{
        Thread.sleep(5000);
        homePage.checkIndividualAndFamilyHealthPlan();
        homePage.validateIndividualAndFamilyHealthPlan();
    }

    @Test
    public void testValidateMedicareHealthPlan() throws InterruptedException{
        Thread.sleep(5000);
        homePage.checkMedicareHealthPlan();
        homePage.validateMedicareHealthPlan();
    }

    @Test
    public void testValidateSmallBusinessHealthPlan() throws InterruptedException{
        Thread.sleep(5000);
        homePage.checkSmallBusinessHealthPlan();
        homePage.validateSmallBusinessHealthPlan();
    }

    @Test
    public void testValidateShortTermInsurenceHealthPlan() throws InterruptedException{
        Thread.sleep(5000);
        homePage.checkShortTermInsurenceHealthPlan();
        homePage.validateShortTermInsurenceHealthPlan();
    }

    @Test
    public void testValidateMedicaidHealthPlan() throws InterruptedException{
        Thread.sleep(5000);
        homePage.checkMedicaidHealthPlan();
        homePage.validateMedicaidHealthPlan();
    }

    @Test
    public void testValidateDentalHealthPlan() throws InterruptedException{
        Thread.sleep(5000);
        homePage.checkDentalHealthPlan();
        homePage.validateDentalHealthPlan();
    }

    @Test
    public void testValidateContactUs() throws InterruptedException{
        Thread.sleep(5000);
        homePage.checkContactUs();
        homePage.validateContactUs();
    }

    @Test
    public void testValidateCareer() throws InterruptedException{
        Thread.sleep(5000);
        homePage.checkCareer();
        homePage.validateCareer();
    }

    @Test
    public void testValidateNewsRoom() throws InterruptedException{
        Thread.sleep(5000);
        homePage.checkNewsRoom();
        homePage.validateNewsRoom();
    }

    @Test
    public void testValidateAboutUs() throws InterruptedException{
        Thread.sleep(5000);
        homePage.checkAboutUs();
        homePage.validateAboutUs();
    }

    @Test
    public void testValidateAccessibility() throws InterruptedException{
        Thread.sleep(5000);
        homePage.checkAccessibility();
        homePage.validateAccessibility();
    }

    @Test
    public void testValidateLegal() throws InterruptedException{
        Thread.sleep(5000);
        homePage.checkLegal();
        homePage.validateLegal();
    }

    @Test
    public void testValidatePrivacy() throws InterruptedException{
        Thread.sleep(5000);
        homePage.checkPrivacy();
        homePage.validatePrivacy();
    }

    @Test
    public void testValidateSigninError() throws InterruptedException{
        homePage.clickSignInButton();
        homePage.clickMyuhcSignInButton();
        homePage.insertMyuhcUserName("Donald Trump");
        homePage.insertMyuhcPassword("12345");
        homePage.checkMyuhcRememberMeCheckBox();
        homePage.clickMyuhcSignInSubmitButton();
        homePage.validateMyuhcSigninError();

    }






    @Test
    public void testSearchBoxCheckUsingClassValues() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.searchBoxCheckUsingClassValues();
    }

    @Test
    public void testSearchBoxCheckGetItemsListFromDB() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.searchBoxCheckGetItemsListFromDB();
    }

    @Test
    public void testSearchBoxCheckGetItemsListFromExcel() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.searchBoxCheckGetItemsListFromExcel();
    }


}
