package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TMobHomePageTest extends CommonAPI {

    TMobHomePage homePage;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, TMobHomePage.class);
    }

    @Test
    public void testValidateWirelessTab () throws InterruptedException {
        homePage.checkWirelessTab();
        homePage.validateWirelessTab();
    }

    @Test
    public void testValidateBusinessTab () throws InterruptedException {
        homePage.checkBusinessTab();
        homePage.validateBusinessTab();
    }

    @Test
    public void testValidatePrepaidTab () throws InterruptedException {
        homePage.checkPrepaidTab();
        homePage.validatePrepaidTab();
    }

    @Test
    public void testValidateTvTab () throws InterruptedException {
        homePage.checkTvTab();
        homePage.validateTvTab();
    }

    @Test
    public void testValidateBankingTab () throws InterruptedException {
        homePage.checkBankingTab();
        homePage.validateBankingTab();
    }

}
