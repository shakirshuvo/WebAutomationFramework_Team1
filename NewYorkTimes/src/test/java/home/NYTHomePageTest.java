package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NYTHomePageTest extends CommonAPI{

    NYTHomePage homePage;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, NYTHomePage.class);
    }

    @Test
    public void testValidateWorldTab () throws InterruptedException {
        homePage.checkWorldTab();
        homePage.validateWorldTab();
    }

    @Test
    public void testValidateUSTab () throws InterruptedException {
        homePage.checkUSTab();
        homePage.validateUSTab();
    }

    @Test
    public void testValidatePoliticsTab () throws InterruptedException {
        homePage.checkPoliticsTab();
        homePage.validatePoliticsTab();
    }

    @Test
    public void testValidateNYTab () throws InterruptedException {
        homePage.checkNYTab();
        homePage.validateNYTab();
    }

    @Test
    public void testValidateBusinessTab () throws InterruptedException {
        homePage.checkBusinessTab();
        homePage.validateBusinessTab();
    }

}
