package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BOAHomePageTest extends CommonAPI {

    BOAHomePage homePage;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, BOAHomePage.class);
    }

    @Test
    public void testValidateCheckingTab () throws InterruptedException {
        homePage.checkCheckingTab();
        homePage.validateCheckingTab();
    }

    @Test
    public void testValidateSavingsTab () throws InterruptedException {
        homePage.checkSavingsTab();
        homePage.validateSavingsTab();
    }

    @Test
    public void testValidateCreditCardTab () throws InterruptedException {
        homePage.checkCreditCardTab();
        homePage.validateCreditCardTab();
    }

    @Test
    public void testValidateInvestingTab () throws InterruptedException {
        homePage.checkInvestingTab();
        homePage.validateInvestingTab();
    }

    @Test
    public void testValidatePlanningTab () throws InterruptedException {
        homePage.checkPlanningTab();
        homePage.validatePlanningTab();
    }

    @Test
    public void testValidatePrepAndFillingTab () throws InterruptedException {
        homePage.checkPrepAndFillingTab();
        homePage.validatePrepAndFillingTab();
    }

    @Test
    public void testValidatePayAndBenifitsTab () throws InterruptedException {
        homePage.checkWorkPayAndBenifitsTab();
        homePage.validateWorkPayAndBenifitsTab();
    }

    @Test
    public void testValidateHowBanksWorkTab () throws InterruptedException {
        homePage.checkHowBanksWorkTab();
        homePage.validateHowBanksWorkTab();
    }

    @Test
    public void testValidateManagingBankAccountsTab () throws InterruptedException {
        homePage.checkManagingBankAccountsTab();
        homePage.validateManagingBankAccountsTab();
    }

    @Test
    public void testValidateTeachingKidsAboutMoneyTab () throws InterruptedException {
        homePage.checkTeachingKidsAboutMoneyTab();
        homePage.validateTeachingKidsAboutMoneyTab();
    }

    @Test
    public void testValidateChoosingACreditCardTab () throws InterruptedException {
        homePage.checkChoosingACreditCardTab();
        homePage.validateChoosingACreditCardTab();
    }

    @Test
    public void testValidateCreditReportTab () throws InterruptedException {
        homePage.checkCreditReportTab();
        homePage.validateCreditReportTab();
    }

    @Test
    public void testValidateCreditScoreTab () throws InterruptedException {
        homePage.checkCreditScoreTab();
        homePage.validateCreditScoreTab();
    }

    @Test
    public void testValidateHowCreditCardWorksTab () throws InterruptedException {
        homePage.checkHowCreditCardWorksTab();
        homePage.validateHowCreditCardWorksTab();
    }

    @Test
    public void testValidateManageingCreditCardsTab () throws InterruptedException {
        homePage.checkManageingCreditCardsTab();
        homePage.validateManageingCreditCardsTab();
    }

}
