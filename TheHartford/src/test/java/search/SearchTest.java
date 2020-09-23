package search;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchTest extends CommonAPI {
    Search search;
    @BeforeMethod
    public void getInit() {

        // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        search = PageFactory.initElements(driver, Search.class);
    }
    /**
     * Test SearchBox
     */
    @Test(enabled = true)
    public void testSearchBoxCheck() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        search.searchBoxCheck("Life Insurance");
        search.validateSearchBoxCheck();
        /**
         * Test Find Agent Function
         */

    }
    @Test(enabled = true)
    public void testFindAnAgentButton() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        search.findAnAgentCheck();
        search.validateFindAnAgentCheck();
    }
    /**
     * Test the Home Tab is Working or Not
     */
    @Test(enabled = true)
    public void testHomeTab() {
        search.setHomeElementCheck();
        search.validateSetHomeElementCheck();
    }
    /**
     * Test Business Tab Function
     */
    @Test(enabled = true)
    public void testBusinessTab() {
        search.businessElementCheck();
        search.validateBusinessTab();
    }
    /**
     * Test Employee Banifts Function
     */
    @Test(enabled = true)
    public void testEmployeeBanifits() {
        search.employeeBanifits();
        search.validateEmpBanifits();
    }
    /**
//     * Test The HartFord is Image is Location and Functioning
//     */
    @Test(enabled = true)
    public void testtheHartFordImage() {
        search.theHartFordImage();
        search.validateHartFordImage1();
    }
    /**
     * Test About Us Function
     */
    @Test (enabled = true)
    public void testAboutUs() {
        search.findAboutUs();
        search.validateAboutUs();
    }
    /**
     * Test Agent and Producers Web Web Element Function
     */
    @Test (enabled = true)
    public void testAgentAndProducers() {
        search.agentProducersCheck();
        search.validateAgentProducers();

    }
    /**
     * Test Report Claim Function
     * //
     */
    @Test (enabled = true)
    public void testReportClaim() {
        search.reportClaimCheck();
        search.validateReportClaim();
    }
    /**
     * Test Mobile App
     */
    @Test (enabled = true)
    public void testMobileApp() {
        search.mobileAppCheck();
        search.validateMobileApp();
    }
    /**
     * Test Contact Us
     */
    @Test (enabled = true)
    public void TestContactUs() {
        search.contactUsCheck();
        search.validateContactUs();
    }
    /**
     * Test  SmallBusiness
     */
    @Test (enabled = true)
    public void testSmallBiz() {
        search.smallBusinessCheck();
        search.validateSmallBusiness();
    }
    /**
     * Test Privacy Check
     */
    @Test (enabled = true)
    public void testPrivacyPolicy() {
        search.privacyPolicyCheck();
        search.validatePrivacyPolicy();
    }
    /**
     * Test legal Notice
     */
    @Test (enabled = true)
    public void testLegalNotice() {
        search.legalNoticeCheck();
        search.validateLegalNotice();
    }
    /**
//     * Test Accessiblity Statement
//     */
    @Test (enabled = true)
    public void testAccessStat() {
        search.accessiblityCehck();
        search.validateAccessibilityStat();
    }
    /**
     * Test Producers Compensation
     */
    @Test (enabled = true)
    public void testProdCompensation(){
        search.producerCompendationCheck();
        search.validateProdCompansation();
    }
    /**
     * Test EEO
     */
    @Test(enabled = true)
    public void testEEO(){
        search.eEOCheck();
        search.validateEEO();

    }
    /**
     * Test FeedBack
     */
    @Test (enabled = true)
    public void testFeedBack(){
        search.feedBackCheck();
        //search.validateFeedBack();
    }
    /**
     * Test Car Insurance Form Main Body
     */
    @Test (enabled = true)
    public void testCarInsurance(){
        search.carInsuranceCheck();
        search.validateCarInsurance();
    }
    /**
     * Test Home Insuracne From Main Body
     */
    @Test (enabled = true)
    public void testHomeInsurance(){
        search.homeInsuranceCheck();
        search.validateHomeInsurance();
    }

}