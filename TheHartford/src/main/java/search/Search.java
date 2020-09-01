package search;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static search.SearchWebElements.*;

public class Search extends CommonAPI {

    String expected;
    String actual;
    List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());

    @FindBy(how = How.XPATH, using = searchFieldWebElementXPATH)
    public WebElement searchField;
    @FindBy(how = How.XPATH, using = searchButtonHWebElementXPATH)
    public WebElement searchButton;
    @FindBy(how = How.XPATH, using = searchVerificationWebElementXPATH)
    public WebElement searchText;
    @FindBy(how = How.XPATH, using = findAgentWebElementXPATH)
    public WebElement findAnAgentButton;
    @FindBy(how = How.XPATH, using = validationElementFindAgentXPAT)
    public WebElement validateFIndAgent;
    @FindBy(how = How.XPATH, using = findHomeTab)
    public WebElement homeElement;
    @FindBy(how = How.XPATH, using = findBusinessTab)
    public WebElement businessElement;
    @FindBy(how = How.XPATH, using = findEmployeeBanifits)
    public WebElement webElementEmployeeBanifits;
    @FindBy(how = How.XPATH, using = findTheHartFordTopIMG)
    public WebElement theHartWebElement1;
    @FindBy(how = How.XPATH, using = findAboutUs)
    public WebElement aboutUsWebElement;
    @FindBy(how = How.XPATH, using = findAgentAndProducers)
    public WebElement agentAndProducersWebElement;
    @FindBy(how = How.XPATH, using = agentProducerValidateXPATH)
    public WebElement agentValidation;
    @FindBy(how = How.XPATH, using = findContactUsXPATH)
    public WebElement contactUsWebElement;
    @FindBy(how = How.XPATH, using = contactUsValidateXPATH)
    public WebElement contactUsValidateElement;
    @FindBy(how = How.XPATH, using = findReportClaimXPAT)
    public WebElement reportClaimXPATH;
    @FindBy(how = How.XPATH, using = reportClaimValidationXPATH)
    public WebElement reportClaimValidation;
    @FindBy (how=How.XPATH,using = findMobileAppXPATH)
    public WebElement mobileAPP;
    @FindBy(how = How.XPATH, using = mobileAppValidateXPATH)
    public WebElement validateMobileApp;
    @FindBy (how = How.XPATH, using = findSmallBizAheadXPATH)
    public WebElement smallBusiness;
    @FindBy (how = How.XPATH, using = smallBusinessValidateXPAT)
    public WebElement smallBizValidate;
    @FindBy(how =How.XPATH, using = findPrivacyPolicy)
    public WebElement privacyPolicy;
    @FindBy(how = How.XPATH,using = findLegalNotice)
    public WebElement legalNotice;
    @FindBy(how=How.XPATH,using = findAccsibilityStatment)
    public WebElement accissiblityStatement;
    @FindBy (how=How.XPATH,using = findProdCompensation)
    public WebElement ProducerCompensation;
    @FindBy(how=How.XPATH,using = findEEO)
    public WebElement eEO;
    @FindBy(how=How.XPATH,using = findFeedBack)
    public WebElement feedBack;
    @FindBy(how=How.XPATH,using= findCarInsurance)
    public WebElement carInsurance;
    @FindBy(how=How.XPATH, using =findHomeInsurance)
    public WebElement homeInsurance;





    /**
     *
     * @Author Raza, Syed
     *               Search Box Check
     */
    public void searchBoxCheck(String searchItem) {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchField.sendKeys(searchItem);
        searchButton.click();
    }
    /**
     * Validate Search Box
     */
    public void validateSearchBoxCheck() {

        String actualResult = searchText.getText();
        String expectedResult = "Life Insurance";
        Assert.assertEquals(actualResult, expectedResult, "Result did not Match");

    }
    /**
     * Find Agent Function Check
     */
    public void findAnAgentCheck() {
        findAnAgentButton.click();
    }
    /**
     * Validate Find Agent
     */
    public void validateFindAnAgentCheck() {
        expected = "Auto & Homeowners Agency Locator";
        actual = validateFIndAgent.getText();
        System.out.println(actual);
        Assert.assertEquals(actual, expected, " Validation Not Passed");
    }
    /**
     * Locating Home Tab on main Page
     */
    public void setHomeElementCheck() {
        homeElement.click();
    }
    /**
     * Validation Method for Home Tab
     */
    public void validateSetHomeElementCheck() {
        actual = driver.getTitle();
        System.out.println(actual);
        expected = "Business, Home & Car Insurance Quotes | The Hartford Insurance";
        Assert.assertEquals(actual, expected);
    }
    /**
     * Locate Business Tab from the Home Page
     */
    public void businessElementCheck() {

        businessElement.click();
    }
    /**
     * Validate Business Insurance Tab Functionality
     */
    public void validateBusinessTab() {

        actual = driver.getTitle();
        System.out.println(actual);
        expected = "Business, Home & Car Insurance Quotes | The Hartford Insurance";
        Assert.assertEquals(actual, expected);

    }
    /**
     * Locate Employee Banifits Tab
     */
    public void employeeBanifits() {
        webElementEmployeeBanifits.click();
    }
    /**
     * Employee Benefit Function Validation
     */
    public void validateEmpBanifits() {

        actual = driver.getTitle();
        System.out.println(actual);
        expected = "Business, Home & Car Insurance Quotes | The Hartford Insurance";
        Assert.assertEquals(actual, expected);
    }
    /**
     * Locate The HartFord home Page First Image
     */
    public void theHartFordImage() {
        theHartWebElement1.click();
    }
    /**
     * Validate the HardFord Function
     */
    public void validateHartFordImage1() {
        actual = driver.getTitle();
        System.out.println(actual);
        expected = "Business, Home & Car Insurance Quotes | The Hartford Insurance";
        Assert.assertEquals(actual, expected);
    }
    /**
     * Locate the About Us
     */
    public void findAboutUs() {
        aboutUsWebElement.click();
    }
    /**
     * Validate About Us Function
     */
    public void validateAboutUs() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        actual = driver.getTitle();
        System.out.println(actual);
        expected = "Business, Home & Car Insurance Quotes | The Hartford Insurance";
        Assert.assertEquals(actual, expected);
    }
    /**
     * Locate Agent and Producers Element
     */
    public void agentProducersCheck() {
        agentAndProducersWebElement.click();
    }
    /**
     * Validation Agent and Producers
     */
    public void validateAgentProducers() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        expected = "Agents & Producers";
        actual = agentValidation.getText();
        System.out.println(actual);
        Assert.assertEquals(actual, expected, "+++++++++++++Failed++++++++++++++++=");
    }
    /**
     * Locate Contact Us Element in the Footer
     */
    public void contactUsCheck() {
        contactUsWebElement.click();
    }
    /**
     * Validate Contact Us
     */
    public void validateContactUs() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        actual = contactUsValidateElement.getText();
        System.out.println(actual);
        expected = "Contact Us";
        Assert.assertEquals(actual, expected, "+++++++++==Failed++++++++++++++++");
    }
    /**
     * Locate Report Claim
     */
    public void reportClaimCheck() {

        reportClaimXPATH.click();
    }
    /**
     * Validate Report Claim Function
     */
    public void validateReportClaim() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        actual = reportClaimValidation.getText();
        System.out.println(actual);
        expected = "Claims";
        Assert.assertEquals(actual, expected, "++++++++++==Failed+++++++++++++++++");
    }
    /**
     * Locate Mobile App
     */
    public void mobileAppCheck(){
        mobileAPP.click();
    }
    /**
     * validate Mobile App Function
     */
    public void validateMobileApp(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // windowSwitch();
       actual=driver.getCurrentUrl();
//        actual=driver.getTitle();
        System.out.println(actual);
        expected="https://www.thehartford.com/mobile-tools";
        Assert.assertEquals(actual,expected,"++++++++=Failed++++++++++++++++");

    }
    /**
     * Locate Small Business
     */
    public void smallBusinessCheck(){
        smallBusiness.click();
    }
    /**
     * Validate small Business
     */
    public void validateSmallBusiness(){
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       expected="https://www.thehartford.com/";
       // System.out.println(expected);
        //driver.switchTo().window(browserTabs.get(1));
        //actual=driver.getTitle();
        actual=driver.getCurrentUrl();
        System.out.println(actual);
        Assert.assertEquals(actual,expected,"++++++++++++Failed+++++++++++++++");
    }
    /**
     * Locate Privacy Policy
     */
    public void privacyPolicyCheck(){
        privacyPolicy.click();
    }
    /**
     * Validate Privacy Policy Function
     */
    public void validatePrivacyPolicy(){
        actual= driver.getCurrentUrl();
        expected="https://www.thehartford.com/online-privacy-policy";
        Assert.assertEquals(actual,expected,"++++++++Failed++++++++++");
    }
    /**
     * Locate Legal Notice Element
     */
    public void legalNoticeCheck(){
        legalNotice.click();
    }
    /**
     * Validate Legal Notice
     */
    public void validateLegalNotice(){
        actual=driver.getCurrentUrl();
        expected="https://www.thehartford.com/legal-notice";
        Assert.assertEquals(actual,expected,"+++++++Failed++++++++++++=");
    }
    /**
     * locate Accessiblity Statement
     */
    public void accessiblityCehck(){
        accissiblityStatement.click();
    }
    /**
     * Validate Accessiblity Statement
     */
    public void validateAccessibilityStat(){
        actual=driver.getCurrentUrl();
        expected="https://www.thehartford.com/accessibility-statement";
        Assert.assertEquals(actual,expected,"+++++++++=failed++++++++++++");
    }
    /**
     * Locate Producers Compensations
     */
    public void producerCompendationCheck(){
        ProducerCompensation.click();
    }
    /**
     * Validate Producers Compensation
     */
    public void validateProdCompansation(){
        actual=driver.getCurrentUrl();
        expected="https://www.thehartford.com/producer-compensation";
        Assert.assertEquals(actual,expected,"++++++++failed++++++++++");
    }
    /**
     * Locate EEO
     */
    public void eEOCheck(){
        eEO.click();
    }
    /**
     * Validate EEO
     */
    public void validateEEO(){
        actual=driver.getCurrentUrl();
        expected="https://www.thehartford.com/eeo-statement";
        Assert.assertEquals(actual,expected,"+++++++Failed+++++++++++++++");
    }
    /**
     * Locate FeedBack
     */
    public void feedBackCheck(){
        feedBack.click();
    }
    /**
     * Validate FeedBack
     */
    public void validateFeedBack(){
        actual=driver.getCurrentUrl();
        expected="asdfasfd";
        Assert.assertEquals(actual,expected,"++++++Failed+++++++++++++");

    }
    /**
     * Car Insurance Function Check From main Body
     */
    public void carInsuranceCheck(){
        carInsurance.click();
    }
    /**
     * Validate Car Insurance
     */
    public void validateCarInsurance(){
        actual=driver.getCurrentUrl();
        System.out.println(actual);
        expected="https://www.thehartford.com/aarp/car-insurance";
        Assert.assertEquals(actual,expected,"++++++++Failed+++++++");
    }
    /**
     * Locate Home Insurance
     */
    public void homeInsuranceCheck(){
        homeInsurance.click();
    }
    /**
     * Validate Home Insurance
     */
    public void validateHomeInsurance(){
        actual=driver.getCurrentUrl();
        expected="https://www.thehartford.com/aarp/homeowners-insurance";
        Assert.assertEquals(actual,expected,"++++++++Failed++++++++");
    }



}
