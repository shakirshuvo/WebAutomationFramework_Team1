package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeltaHomePageTest extends CommonAPI {

    DeltaHomePage homepage;

    @BeforeMethod
    public void getInit() {
        homepage = PageFactory.initElements(driver, DeltaHomePage.class);
    }


    @Test
    public void testAndValidateFromTab() throws InterruptedException {
        homepage.checkFromTab();
        homepage.validateFromTab();
    }

    @Test
    public void testAndValidateToTab() throws InterruptedException {
        homepage.checkToTab();
        homepage.validateToTab();
    }

    @Test
    public void testAndValidateTripWay() throws InterruptedException {
        homepage.checkTripWay();
        homepage.validatecheckTripWay();
    }

    @Test
    public void testAndValidateCalendar() throws InterruptedException {
        homepage.checkCalendar();
        homepage.validateCalendar();
    }

    @Test
    public void testAndValidateNumberOfPassangers() throws InterruptedException {
        homepage.checkNumberOfPassangers();
        homepage.validateNumberOfPassangers();
    }

    @Test
    public void testAndValidateHomepageCheckBoxes() throws InterruptedException {
        homepage.checkHomepageCheckBoxes();
        homepage.validateHomepageCheckBoxes();
    }

    @Test
    public void testAndValidateAllStepsOfBooking() throws InterruptedException {
        homepage.testAllStepsOfBooking();
    }

    @Test
    public void testAndValidateTravleInfoDropDownTab() throws InterruptedException {
        homepage.checkTravleInfoDropDownTab();
        homepage.validateTravleInfoDropDownTab();
    }

    @Test
    public void testAndValidateSkyMilesDropDownTab() throws InterruptedException {
        homepage.checkSkyMilesDropDownTab();
        homepage.validateSkyMilesDropDownTab();
    }

    @Test
    public void testAndValidateNeedHelpDropDownTab() throws InterruptedException {
        homepage.checkNeedHelpDropDownTab();
        homepage.validateNeedHelpDropDownTab();
    }

}
