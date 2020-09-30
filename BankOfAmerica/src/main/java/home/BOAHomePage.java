package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.BOAHomePageWebElements.*;

public class BOAHomePage extends CommonAPI {

    // @FindBy(how = How.XPATH, using = destinationFromXPath) public WebElement destinationFrom;

    @FindBy(how = How.XPATH, using = checkingTabXPath) public WebElement checkingTab;
    @FindBy(how = How.XPATH, using = studentBankingTabXPath) public WebElement studentBankingTab;
    @FindBy(how = How.XPATH, using = savingsTabXPath) public WebElement savingsTab;
    @FindBy(how = How.XPATH, using = mobileBankingTabXPath) public WebElement mobileBankingTab;
    @FindBy(how = How.XPATH, using = creditCardTabXPath) public WebElement creditCardTab;
    @FindBy(how = How.XPATH, using = travelAndRewardCardTabXPath) public WebElement travelAndRewardCardTab;
    @FindBy(how = How.XPATH, using = investingTabXPath) public WebElement investingTab;
    @FindBy(how = How.XPATH, using = buildYourPortfolioTabXPath) public WebElement buildYourPortfolioTab;
    @FindBy(how = How.XPATH, using = betterMoneyHabbitTabXPath) public WebElement betterMoneyHabbitTab;
    @FindBy(how = How.XPATH, using = retirementBetterMoneyHabbitTabXPath) public WebElement retirementBetterMoneyHabbitTabX;
    @FindBy(how = How.XPATH, using = creditBMHTXPath) public WebElement creditBMHT;
    @FindBy(how = How.XPATH, using = debtBMHTXPath) public WebElement debtBMHT;
    @FindBy(how = How.XPATH, using = savingAndBudgetingBMHTXPath) public WebElement savingAndBudgetingBMHT;
    @FindBy(how = How.XPATH, using = homeownershipBMHTXPath) public WebElement homeownershipBMHT;
    @FindBy(how = How.XPATH, using = autoBMHTXPath) public WebElement autoBMHT;
    @FindBy(how = How.XPATH, using = retirementBMHTXPath) public WebElement retirementBMHT;
    @FindBy(how = How.XPATH, using = collegeBMHTXPath) public WebElement collegeBMHT;
    @FindBy(how = How.XPATH, using = privacyAndSecurityBMHTXPath) public WebElement privacyAndSecurityBMHT;
    @FindBy(how = How.XPATH, using = personalBankingBMHTXPath) public WebElement personalBankingBMHT;
    @FindBy(how = How.XPATH, using = taxAndIncomeBMHTXPath) public WebElement taxAndIncomeBMHT;
    @FindBy(how = How.XPATH, using = planningBMHTXPath) public WebElement planningBMHT;

    @FindBy(how = How.XPATH, using = prepAndFillingBMHTXPath) public WebElement prepAndFillingBMHT;
    @FindBy(how = How.XPATH, using = workPayAndBenifitsBMHTXPath) public WebElement workPayAndBenifitsBMHT;
    @FindBy(how = How.XPATH, using = howBanksWorkBMHTXPath) public WebElement howBanksWorkBMHT;
    @FindBy(how = How.XPATH, using = managingBankAccountsBMHTXPath) public WebElement managingBankAccountsBMHT;
    @FindBy(how = How.XPATH, using = teachingKidsAboutMoneyBMHTXPath) public WebElement teachingKidsAboutMoneyBMHT;
    @FindBy(how = How.XPATH, using = choosingACreditCardBMHTXPath) public WebElement choosingACreditCardBMHT;
    @FindBy(how = How.XPATH, using = creditReportBMHTXPath) public WebElement creditReportBMHTX;
    @FindBy(how = How.XPATH, using = creditScoreBMHTXPath) public WebElement creditScoreBMHT;
    @FindBy(how = How.XPATH, using = howCreditCardWorksBMHTXPath) public WebElement howCreditCardWorksBMHT;
    @FindBy(how = How.XPATH, using = manageingCreditCardsBMHTXPath) public WebElement manageingCreditCardsBMHT;

//    // Action Method
//    public void checkSkyMilesDropDownTab() throws InterruptedException {
//        mouseHoverByXpath(skyMilesXPath);
//        skyMilesCruises.click();
//    }
//
//    // Validation Method
//    public void validateSkyMilesDropDownTab(){
//        String actualResult = getCurrentPageUrl();
//        String expectedResult = "https://www.";
//        Assert.assertEquals(actualResult,expectedResult,"Test failed");
//    }
    //*********************************************

    // Action Method
    public void checkCheckingTab() {
        checkingTab.click();
        studentBankingTab.click();
    }

    // Validation Method
    public void validateCheckingTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.bankofamerica.com/student-banking/";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkSavingsTab() {
        savingsTab.click();
        mobileBankingTab.click();
    }

    // Validation Method
    public void validateSavingsTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.bankofamerica.com/online-banking/mobile-and-online-banking-features/";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkCreditCardTab() {
        creditCardTab.click();
        travelAndRewardCardTab.click();
    }

    // Validation Method
    public void validateCreditCardTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.bankofamerica.com/credit-cards/travel-credit-cards/";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkInvestingTab() {
        investingTab.click();
        buildYourPortfolioTab.click();
    }

    // Validation Method
    public void validateInvestingTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.merrilledge.com/investing/online-trading?src_cd=bac_hp_nav_mesd";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkPlanningTab() throws InterruptedException {
        sleepFor(1);
        betterMoneyHabbitTab.click();
        sleepFor(1);
        retirementBetterMoneyHabbitTabX.click();
        sleepFor(1);
        mouseHoverByXpath(creditBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(debtBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(savingAndBudgetingBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(homeownershipBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(autoBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(retirementBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(collegeBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(privacyAndSecurityBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(personalBankingBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(taxAndIncomeBMHTXPath);
        sleepFor(3);
        planningBMHT.click();
    }

    // Validation Method
    public void validatePlanningTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://bettermoneyhabits.bankofamerica.com/en/taxes-income?subTopicId=planning";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkPrepAndFillingTab() throws InterruptedException {
        sleepFor(1);
        betterMoneyHabbitTab.click();
        sleepFor(1);
        retirementBetterMoneyHabbitTabX.click();
        sleepFor(1);
        mouseHoverByXpath(creditBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(debtBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(savingAndBudgetingBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(homeownershipBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(autoBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(retirementBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(collegeBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(privacyAndSecurityBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(personalBankingBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(taxAndIncomeBMHTXPath);
        sleepFor(3);
        prepAndFillingBMHT.click();
    }

    // Validation Method
    public void validatePrepAndFillingTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://bettermoneyhabits.bankofamerica.com/en/taxes-income?subTopicId=prep-and-filing";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkWorkPayAndBenifitsTab() throws InterruptedException {
        sleepFor(1);
        betterMoneyHabbitTab.click();
        sleepFor(1);
        retirementBetterMoneyHabbitTabX.click();
        sleepFor(1);
        mouseHoverByXpath(creditBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(debtBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(savingAndBudgetingBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(homeownershipBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(autoBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(retirementBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(collegeBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(privacyAndSecurityBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(personalBankingBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(taxAndIncomeBMHTXPath);
        sleepFor(3);
        workPayAndBenifitsBMHT.click();
    }

    // Validation Method
    public void validateWorkPayAndBenifitsTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://bettermoneyhabits.bankofamerica.com/en/taxes-income?subTopicId=work-pay-benefits";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkHowBanksWorkTab() throws InterruptedException {
        sleepFor(1);
        betterMoneyHabbitTab.click();
        sleepFor(1);
        retirementBetterMoneyHabbitTabX.click();
        sleepFor(1);
        mouseHoverByXpath(creditBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(debtBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(savingAndBudgetingBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(homeownershipBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(autoBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(retirementBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(collegeBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(privacyAndSecurityBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(personalBankingBMHTXPath);
        sleepFor(3);
        howBanksWorkBMHT.click();
    }

    // Validation Method
    public void validateHowBanksWorkTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://bettermoneyhabits.bankofamerica.com/en/personal-banking?subTopicId=how-banks-work";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkManagingBankAccountsTab() throws InterruptedException {
        sleepFor(1);
        betterMoneyHabbitTab.click();
        sleepFor(1);
        retirementBetterMoneyHabbitTabX.click();
        sleepFor(1);
        mouseHoverByXpath(creditBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(debtBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(savingAndBudgetingBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(homeownershipBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(autoBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(retirementBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(collegeBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(privacyAndSecurityBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(personalBankingBMHTXPath);
        sleepFor(3);
        managingBankAccountsBMHT.click();
    }

    // Validation Method
    public void validateManagingBankAccountsTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://bettermoneyhabits.bankofamerica.com/en/personal-banking?subTopicId=managing-bank-accounts";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkTeachingKidsAboutMoneyTab() throws InterruptedException {
        sleepFor(1);
        betterMoneyHabbitTab.click();
        sleepFor(1);
        retirementBetterMoneyHabbitTabX.click();
        sleepFor(1);
        mouseHoverByXpath(creditBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(debtBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(savingAndBudgetingBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(homeownershipBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(autoBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(retirementBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(collegeBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(privacyAndSecurityBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(personalBankingBMHTXPath);
        sleepFor(3);
        teachingKidsAboutMoneyBMHT.click();
    }

    // Validation Method
    public void validateTeachingKidsAboutMoneyTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://bettermoneyhabits.bankofamerica.com/en/personal-banking?subTopicId=teaching-kids-about-money";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkChoosingACreditCardTab() throws InterruptedException {
        sleepFor(1);
        betterMoneyHabbitTab.click();
        sleepFor(1);
        retirementBetterMoneyHabbitTabX.click();
        sleepFor(1);
        mouseHoverByXpath(creditBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(debtBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(savingAndBudgetingBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(homeownershipBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(autoBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(retirementBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(collegeBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(privacyAndSecurityBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(personalBankingBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(taxAndIncomeBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(creditBMHTXPath);
        sleepFor(3);
        choosingACreditCardBMHT.click();
    }

    // Validation Method
    public void validateChoosingACreditCardTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://bettermoneyhabits.bankofamerica.com/en/credit?subTopicId=choosing-a-credit-card";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkCreditReportTab() throws InterruptedException {
        sleepFor(1);
        betterMoneyHabbitTab.click();
        sleepFor(1);
        retirementBetterMoneyHabbitTabX.click();
        sleepFor(1);
        mouseHoverByXpath(creditBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(debtBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(savingAndBudgetingBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(homeownershipBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(autoBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(retirementBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(collegeBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(privacyAndSecurityBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(personalBankingBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(taxAndIncomeBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(creditBMHTXPath);
        sleepFor(3);
        creditReportBMHTX.click();
    }

    // Validation Method
    public void validateCreditReportTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://bettermoneyhabits.bankofamerica.com/en/credit?subTopicId=credit-report";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkCreditScoreTab() throws InterruptedException {
        sleepFor(1);
        betterMoneyHabbitTab.click();
        sleepFor(1);
        retirementBetterMoneyHabbitTabX.click();
        sleepFor(1);
        mouseHoverByXpath(creditBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(debtBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(savingAndBudgetingBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(homeownershipBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(autoBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(retirementBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(collegeBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(privacyAndSecurityBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(personalBankingBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(taxAndIncomeBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(creditBMHTXPath);
        sleepFor(3);
        creditScoreBMHT.click();
    }

    // Validation Method
    public void validateCreditScoreTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://bettermoneyhabits.bankofamerica.com/en/credit?subTopicId=credit-score";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkHowCreditCardWorksTab() throws InterruptedException {
        sleepFor(1);
        betterMoneyHabbitTab.click();
        sleepFor(1);
        retirementBetterMoneyHabbitTabX.click();
        sleepFor(1);
        mouseHoverByXpath(creditBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(debtBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(savingAndBudgetingBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(homeownershipBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(autoBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(retirementBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(collegeBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(privacyAndSecurityBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(personalBankingBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(taxAndIncomeBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(creditBMHTXPath);
        sleepFor(3);
        howCreditCardWorksBMHT.click();
    }

    // Validation Method
    public void validateHowCreditCardWorksTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://bettermoneyhabits.bankofamerica.com/en/credit?subTopicId=how-credit-cards-work";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkManageingCreditCardsTab() throws InterruptedException {
        sleepFor(1);
        betterMoneyHabbitTab.click();
        sleepFor(1);
        retirementBetterMoneyHabbitTabX.click();
        sleepFor(1);
        mouseHoverByXpath(creditBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(debtBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(savingAndBudgetingBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(homeownershipBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(autoBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(retirementBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(collegeBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(privacyAndSecurityBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(personalBankingBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(taxAndIncomeBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(creditBMHTXPath);
        sleepFor(3);
        manageingCreditCardsBMHT.click();
    }

    // Validation Method
    public void validateManageingCreditCardsTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://bettermoneyhabits.bankofamerica.com/en/credit?subTopicId=managing-credit-cards";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

}
