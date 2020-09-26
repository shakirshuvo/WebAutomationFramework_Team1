package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
}
