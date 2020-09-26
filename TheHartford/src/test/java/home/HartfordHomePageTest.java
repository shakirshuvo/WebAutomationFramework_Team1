package home;

import base.CommonAPI;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.concurrent.TimeUnit;
public class HartfordHomePageTest extends CommonAPI {

    HartfordHomePage hartfordHomePage;

    @BeforeMethod
    public void getInit(){
    hartfordHomePage = PageFactory.initElements(driver, HartfordHomePage.class);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    /**
     * test click on auto tab element
     */
    @Test(enabled = true)
    public void testClickOnAutoTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.clickOnAutoTab();
        sleepFor(3);
        hartfordHomePage.validateClickOnAuto();
    }

    /**
     * test click on home tab element
     */
    @Test(enabled = true)
    public void testClickHomeTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.clickOnHomeTab();
        sleepFor(3);
        hartfordHomePage.validateClickOnHomeTab();
    }

    /**
     * test click on business tab element
     */
    @Test(enabled = true)
    public void testClickOnBusinessTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.clickOnBusinessTab();
        sleepFor(3);
        hartfordHomePage.validateClickOnBusinessTab();
    }

    /**
     * test click on employee benefits tab element
     */
    @Test(enabled = true)
    public void testClickOnEmployeeBenefitsTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.clickOnEmployeeBenefits();
        sleepFor(3);
        hartfordHomePage.validateClickOnEmployeeBenefits();
    }

    /**
     * test click on about us tab element
     */
    @Test(enabled = true)
    public void testClickOnAboutUs() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.clickOnAboutUsTab();
        sleepFor(3);
        hartfordHomePage.validateClickOnAboutUsTab();
    }

    //mouse over tests
    /**
     * test mouse over home tab
     */
    @Test(enabled = true)
    public void testHomeMouseOver(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.homeTabMouseOver();
        hartfordHomePage.validateHomeTabMouseOver();
    }

    /**
     * test click on renters insurance
     */
    @Test(enabled = true)
    public void testClickOnRentersInsurance(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.clickOnRentersInsurance();
        hartfordHomePage.validateRentersInsurance();
    }

    /**
     * test click on flood insurance
     */
    @Test(enabled = true)
    public void testClickOnFloodInsurance(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.clickOnFloodInsurance();
        hartfordHomePage.validateFloodInsurance();
    }

    /**
     * test click on umbrella insurance
     */
    @Test(enabled = true)
    public void testClickOnUmbrellaInsurance(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.clickOnUmbrellaInsurance();
        hartfordHomePage.validateUmbrellaInsurance();
    }


    /**
     * test click on homeowners under auto tab
     */
    @Test(enabled = true)
    public void testClickOnHomeOwners(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.clickOnAllHomeOwners();
        hartfordHomePage.validateClickOnHomeOwners();
    }

    /**
     * test click on business owners policy tab under business tab
     */
    @Test(enabled = true)
    public void testClickBusinessOwnersPolicy(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.clickOnBusinessOwnersPolicy();
        hartfordHomePage.validateClickOnBusinessOwnersPolicy();
    }

    /**
     * test click on general liability tab under business tab
     */
    @Test(enabled = true)
    public void testClickOnGeneralLiability(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.clickOnGeneralLiability();
        hartfordHomePage.validateClickOnGeneralLiability();
    }

    /**
     * test click on workers compensation  tab under business tab
     */
    @Test(enabled = true)
    public void testClickOnWorkersCompensation(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.clickOnWorkersCompensation();
        hartfordHomePage.validateClickOnWorkersCompensation();
    }

    /**
     * test click on commercial auto tab under business tab
     */
    @Test(enabled = true)
    public void testClickOnCommercialAutoInsurance(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.clickOnCommercialAutoInsurance();
        hartfordHomePage.validateClickOnCommercialAutoInsurance();
    }

    /**
     * test click on for employers tab under employee benefits tab
     */
    @Test(enabled = true)
    public void testClickOnForEmployers(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.clickOnForEmployers();
        hartfordHomePage.validateClickOnForEmployers();
    }

    /**
     * test click on benefits plans tab under for employee benefits tab
     */
    @Test(enabled = true)
    public void testClickOnBenefitPlans(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.clickOnBenefitPlans();
        hartfordHomePage.validateClickOnBenefitPlans();
    }

    /**
     * test click on absence management tab under employee benefits tab
     */
    @Test(enabled = true)
    public void testClickOnAbsenceManagement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.clickOnAbsenceManagement();
        hartfordHomePage.validateClickOnAbsenceManagement();
    }

    /**
     * test click on industry solutions tab under employee benefits tab
     */
    @Test(enabled = true)
    public void testClickOnIndustrySolutions(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.clickOnIndustrySolutions();
        hartfordHomePage.validateClickOnIndustrySolutions();
    }

    /**
     * test click on insurance for employees tab under  employee benefits tab
     */
    @Test(enabled = true)
    public void testClickOnInsuranceForEmployees(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.clickOnInsuranceForEmployees();
        hartfordHomePage.validateClickOnInsuranceForEmployees();
    }

    /**
     * test click on value added tab under employee benefits tab
     */
    @Test(enabled = true)
    public void testClickOnValueAdded(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.clickOnValueAddedServices();
        hartfordHomePage.validateClickOnValueAddedServices();
    }

    /**
     * test click on start a claim employee benefits tab
     */
    @Test(enabled = true)
    public void testClickOnStartAClaim(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.clickOnStartAClaim();
        hartfordHomePage.validateClickOnStartAClaim();
    }

    /**
     * test click on state guide employee empoyee benefits tab
     */
    @Test(enabled = true)
    public void testClickOnStateGuide(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.clickOnStateGuide();
        hartfordHomePage.validateClickOnStateGuide();
    }

    /**
     * test click on for agents and producers employee benefits tab
     */
    @Test(enabled = true)
    public void testClickOnForAgentsNProducers(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.clickOnForAgentsNProducers();
        hartfordHomePage.validateClickOnForAgentsNProducers();
    }

    /**
     * test click on resources employee benefits tab
     */
    @Test(enabled = true)
    public void testClickOnResources(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.clickOnResources();
        hartfordHomePage.validateClickOnResources();
    }
    /**
     * test click on benefits technology employee benefits tab
     */
    @Test(enabled = true)
    public void testClickOnBenefitsTechnology(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hartfordHomePage.clickOnBenefitsTechnology();
        hartfordHomePage.validateClickOnBenefitsTechnology();
    }

}
