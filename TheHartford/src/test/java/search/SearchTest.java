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
    @Test
    public void testSearchBoxCheck() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        search.searchBoxCheck("Life Insurance");
        search.validateSearchBoxCheck();
        /**
         * Test Find Agent Function
         */

    }
    @Test
    public void testFindAnAgentButton() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        search.findAnAgentCheck();
        search.validateFindAnAgentCheck();
    }
    /**
     * Test the Home Tab is Working or Not
     */
    @Test
    public void testHomeTab() {
        search.setHomeElementCheck();
        search.validateSetHomeElementCheck();
    }
    /**
     * Test Business Tab Function
     */
    @Test
    public void testBusinessTab() {
        search.businessElementCheck();
        search.validateBusinessTab();
    }
    /**
     * Test Employee Banifts Function
     */
    @Test
    public void testEmployeeBanifits() {
        search.employeeBanifits();
        search.validateEmpBanifits();
    }
    /**
     * Test The HartFord is Image is Location and Functioning
     */
    @Test
    public void testtheHartFordImage() {
        search.theHartFordImage();
        search.validateHartFordImage1();
    }
    /**
     * Test About Us Function
     */
    @Test
    public void testAboutUs() {
        search.findAboutUs();
        search.validateAboutUs();
    }
    /**
     * Test Agent and Producers Web Web Element Function
     */
    @Test
    public void testAgentAndProducers() {
        search.agentProducersCheck();
        search.validateAgentProducers();

    }
    /**
     * Test Report Claim Function
     * //
     */
    @Test
    public void testReportClaim() {
        search.reportClaimCheck();
        search.validateReportClaim();
    }
    /**
     * Test Mobile App
     */
    @Test
    public void testMobileApp() {
        search.mobileAppCheck();
        search.validateMobileApp();
    }
    /**
     * Test Contact Us
     */
    @Test
    public void TestContactUs() {
        search.contactUsCheck();
        search.validateContactUs();
    }
    /**
     * Test  SmallBusiness
     */
    @Test
    public void testSmallBiz() {
        search.smallBusinessCheck();
        search.validateSmallBusiness();
    }
    /**
     * Test Privacy Check
     */
    @Test
    public void testPrivacyPolicy() {
        search.privacyPolicyCheck();
        search.validatePrivacyPolicy();
    }
    /**
     * Test legal Notice
     */
    @Test
    public void testLegalNotice() {
        search.legalNoticeCheck();
        search.validateLegalNotice();
    }
    /**
     * Test Accessiblity Statement
     */
    @Test
    public void testAccessStat() {
        search.accessiblityCehck();
        search.validateAccessibilityStat();
    }
    /**
     * Test Producers Compensation
     */
    @Test
    public void testProdCompensation(){
        search.producerCompendationCheck();
        search.validateProdCompansation();
    }
    /**
     * Test EEO
     */
    @Test
    public void testEEO(){
        search.eEOCheck();
        search.validateEEO();

    }
    @Test
    public void testFeedBack(){
        search.feedBackCheck();
        //search.validateFeedBack();
    }

}
