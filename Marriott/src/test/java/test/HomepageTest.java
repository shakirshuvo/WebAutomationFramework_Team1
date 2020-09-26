package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomepageTest extends CommonAPI {

    Homepage homepage;

    @BeforeMethod
    public void getInit() {
        homepage = PageFactory.initElements(driver, Homepage.class);
    }


    @Test
    public void testAndValidateDeutsch() {
        homepage.checkDeutsch();
        homepage.validateDeutsch();
    }

    @Test
    public void testAndValidateEspanol() {
        homepage.checkEspanol();
        homepage.validateEspanol();
    }

    @Test
    public void testAndValidateDestinationBox() throws InterruptedException {
        homepage.checkDestinationBox();
        homepage.validateDestinationBox();
    }

    @Test
    public void testAndValidateCalendar() {
        homepage.checkCalendar();
        homepage.validateCalendar();
    }

    @Test
    public void testAndValidateNumberOfRooms() {
        homepage.checkNumberOfRooms();
        homepage.validateNumberOfRooms();
    }

    @Test
    public void testAndValidateAdultGuestNumber() {
        homepage.checkAdultGuestNumber();
        homepage.validateAdultGuestNumber();
    }

    @Test
    public void testAndValidateChildGuest() {
        homepage.checkChildGuest();
        homepage.validateChildGuest();
    }

    @Test
    public void testAndValidateSpecialRate() {
        homepage.checkSpecialRate();
        homepage.validateSpecialRate();
    }

    @Test
    public void testAndValidateUsePointCheckBox() {
        homepage.checkUsePointCheckBox();
        homepage.validateUsePointCheckBox();
    }

    @Test
    public void testAndValidateHotelFindingProcess() throws InterruptedException {
        homepage.checkHotelFindingProcess();
    }

}
