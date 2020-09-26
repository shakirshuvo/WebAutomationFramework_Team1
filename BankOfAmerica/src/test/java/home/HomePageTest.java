package home;

import base.CommonAPI;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.concurrent.TimeUnit;

public class HomePageTest extends CommonAPI {
    HomePage homePage;

    @BeforeMethod
    public void getInit(){

        homePage = PageFactory.initElements(driver , HomePage.class);

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    /**
     * test account sign in
     * since a fake id and password are provided
     * this test is not expected to pass
     * @Autor: Waqas
     */
    @Test(enabled = true)
    public void testClickAccountSignIn() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.enterOnlineID();
        homePage.enterPassword();
        sleepFor(3);
        homePage.clickOnSignInBtn();
        sleepFor(3);
        homePage.validateClickOnSignInBtn();
    }

    /**
     * validate save online check box
     */
    @Test(enabled = true)
    public void testSaveOnlineIdCheckbox(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnSaveOnlineIdCheckBox();
        homePage.validateclickOnSaveOnlineIdCheckBox();
    }

    /**
     * test click On personal element
     */
    @Test(enabled = true)
    public void testClickOnPersonal() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnPersonal();
       // homePage.validateClickOnPersonal();
    }

    /**
     * test Open account
     */
    @Test(enabled = true)
    public void testClickOpenAcount() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOpenAccount();
        sleepFor(3);
        homePage.validateClickOpenAccount();
    }

    /**
     * test small business element
     */
    @Test(enabled = true)
    public void testClickOnSmallBusiness(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnSmallBusiness();
        homePage.validateSmallBusinessElement();
    }

    /**
     * test clink on Wealth management tag
     */
    @Test(enabled = true)
    public void testClickOnWealthManagement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnWealthMangement();
        homePage.validateClickOnWealthManagement();
    }

    /**
     * test click on business institutions
     */
    @Test(enabled = false)
    public void testClickOnBusinessInstitutions(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnBusinessInstitutions();
        homePage.validateClickBusinessInstitutions();
    }

    /**
     * test click on security tab
     */
    @Test(enabled = true)
    public void testClickOnSecurityTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnSecurityTab();
        homePage.validateClickOnSecurityTab();
    }

    /**
     * test about us element
     */
    @Test(enabled = true)
    public void testAboutUs(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnAboutUs();
        homePage.validateAboutUs();
    }

    /**
     * test clink on Checking
     * @throws InterruptedException
     */
    @Test(enabled = true)
    public void testClickOnChecking() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.clickOnChecking();
        homePage.validateAdvantageBanking();
       // Thread.sleep(5000);
    }

}
