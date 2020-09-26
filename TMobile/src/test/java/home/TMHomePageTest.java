package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.concurrent.TimeUnit;

public class TMHomePageTest extends CommonAPI {
    TMobileHomepage tMobileHomepage;
    @BeforeMethod
    public void getInit(){
        tMobileHomepage = PageFactory.initElements(driver, TMobileHomepage.class);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }


    /**
     * test click on Wireless element
     */
    @Test(enabled = true)
    public void testClickOnWirelessTab()  {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tMobileHomepage.clickOnWirelessTab();
        tMobileHomepage.validateClickOnWirelessTab();
    }

    /**
     * test click on business tab element
     */
    @Test(enabled = true)
    public void testClickBusinessTab()  {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tMobileHomepage.clickOnBusinessTab();
        tMobileHomepage.validateClickOnBusinessTab();
    }

    /**
     * test click on prepaid tab element
     */
    @Test(enabled = true)
    public void testClickOnPrePaidTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tMobileHomepage.clickOnPrePaidTab();
        sleepFor(3);
        tMobileHomepage.validateClickOnPrePaidTab();
    }

    /**
     * test click on tv element
     */
    @Test(enabled = true)
    public void testClickOnTvTab()  {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tMobileHomepage.clickOnTvTab();
        tMobileHomepage.validateClickOnTv();
    }

    /**
     * test click on Banking element
     */
    @Test(enabled = true)
    public void testClickOnBankingTab()  {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tMobileHomepage.clickOnBankingTab();
        tMobileHomepage.validateClickOnBanking();
    }




}// ends class homepage test
