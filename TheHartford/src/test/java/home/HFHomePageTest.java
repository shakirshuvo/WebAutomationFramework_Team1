package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HFHomePageTest extends CommonAPI {

    HFHomePage homePage;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, HFHomePage.class);
    }

    @Test
    public void testValidateCarInsuranceTab () throws InterruptedException {
        homePage.checkCarInsuranceTab();
        homePage.validateCarInsuranceTab();
    }

    @Test
    public void testValidateCondoInsuranceTab () throws InterruptedException {
        homePage.checkCondoInsuranceTab();
        homePage.validateCondoInsuranceTab();
    }

    @Test
    public void testValidateBusinessInsuranceTab () throws InterruptedException {
        homePage.checkBusinessInsuranceTab();
        homePage.validateBusinessInsuranceTab();
    }

    @Test
    public void testValidateforEmployersTab () throws InterruptedException {
        homePage.checkforEmployersTab();
        homePage.validateforEmployersTab();
    }

    @Test
    public void testValidateNewsroomTab () throws InterruptedException {
        homePage.checkNewsroomTab();
        homePage.validateNewsroomTab();
    }

}
