package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomeWebElements.*;

public class Home extends CommonAPI {

    String actual;
    String expected;

    @FindBy(how = How.CSS, using = checkingWebElementCSS)
    public WebElement checking;

    public void clickChecking(){
        checking.click();
    }

    public boolean checkingIsEnable(){
        return checking.isEnabled();
    }

    public void verifyClickChecking(){
        Assert.assertTrue(checkingIsEnable());
    }

    @FindBy(how = How.CSS, using = savingWebElementCSS)
    public WebElement saving;

    public void clickSaving(){
        saving.click();
    }

    public boolean savingIsEnable(){
        return saving.isEnabled();
    }

    public void verifyClickSaving(){
        Assert.assertTrue(checkingIsEnable());
    }

    @FindBy(how = How.CSS, using = creditCardsWebElementsCSS)
    public WebElement creditCards;

    public void clickCreditCards(){
        creditCards.click();
    }

    public boolean creditCardsIsEnable(){
        return creditCards.isEnabled();
    }

    public void verifyClickCreditCards(){
        Assert.assertTrue(creditCardsIsEnable());
    }
    @FindBy(how = How.CSS, using = homeLoansWebElementsCSS)
    public WebElement homeLoans;

    public void clickHomeLoans(){
        homeLoans.click();
    }

    public boolean homeLoansIsEnable(){
        return homeLoans.isEnabled();
    }

    public void verifyHomeLoans(){
        Assert.assertTrue(homeLoansIsEnable());
    }
    @FindBy(how = How.CSS, using = autoLoansWebElementsCSS)
    public WebElement autoLoans;

    public void clickAutoLoans(){
        autoLoans.click();
    }

    public boolean autoLoansIsEnable(){
        return autoLoans.isEnabled();
    }

    public void verifyAutoLoans(){
        Assert.assertTrue(autoLoansIsEnable());
    }
    @FindBy(how = How.CSS, using = investingWebElementsCSS)
    public WebElement investing;

    public void clickInvesting(){
        investing.click();
    }

    public boolean investingIsEnable(){
        return investing.isEnabled();
    }

    public void verifyInvesting(){
        Assert.assertTrue(investingIsEnable());
    }
    @FindBy(how = How.CSS, using = betterMoneyWebElementsCSS)
    public WebElement betterMoney;

    public void clickBetterMoney(){
        betterMoney.click();
    }

    public boolean betterMoneyIsEnable(){
        return betterMoney.isEnabled();
    }

    public void verifyBetterMoney(){
        Assert.assertTrue(betterMoneyIsEnable());
    }
    @FindBy(how = How.ID, using = smallBusinessWebElementsID)
    public WebElement smallBusiness;

    public void clickSmallBusiness(){
        smallBusiness.click();
    }

    public boolean smallBusinessIsEnable(){
        return smallBusiness.isEnabled();
    }

    public void verifySmallBusiness(){
        Assert.assertTrue(smallBusinessIsEnable());
    }
    @FindBy(how = How.XPATH, using = wealthManagementWebElementsXPATH)
    public WebElement wealthManagement;

    public void clickWealthManagement(){
        mouseHoverByXpath(wealthManagementWebElementsXPATH);
        wealthManagement.click();
    }

    public void verifyWealthManagement(){

        validateByTitle("Wealth Management Services & Wealth Planning from Bank of America | Merrill Lynch");
    }

    @FindBy(how = How.CSS, using = businessAndInstitutionsWebElementsCSS)
    public WebElement businessAndInstitutions;

    public void clickBusinessAndInstitutions(){
        mouseHoverByCSS(businessAndInstitutionsWebElementsCSS);
        businessAndInstitutions.click();
    }

    public void verifyBusinessAndInstitutions(){
        validateByTitle("Bank of America Merrill Lynch is Now Bank of America & BofA Securities");
    }
    @FindBy(how = How.ID, using = securityWebElementsID)
    public WebElement security;

    public void clickSecurity(){
        mouseHoverByID(securityWebElementsID);
        security.click();
    }

    public void verifySecurity(){

        validateByURL("https://www.bankofamerica.com/security-center/overview/");
    }

    @FindBy(how = How.CSS, using =aboutUsWebElementsCSS)
    public WebElement aboutUs;

    public void clickAboutUs(){
        aboutUs.click();
    }

    public void verifyAboutUs(){
        actual= driver.getTitle();
        expected="About Bank of America- Our People, Our Passion, Our Purpose";
        Assert.assertEquals(actual,expected,"failed");
    }
    @FindBy(how = How.CSS, using =enEspanolWebElementsCSS)
    public WebElement enEspanol;

    public void clickEnEspanol(){
        enEspanol.click();
    }

    public boolean enEspanolIsEnable(){
        return enEspanol.isEnabled();
    }

    public void verifyEnEspanol(){
        Assert.assertTrue(enEspanolIsEnable());
    }

    @FindBy(how = How.CSS, using =contactUsWebElementsCSS)
    public WebElement contactUs;

    public void clickContactUs(){
        waitUntilClickAble(By.cssSelector(contactUsWebElementsCSS));
        contactUs.click();
    }

    public void verifyContactUs(){
        validateByTitle("Bank of America Customer Service & Contact Numbers");
    }
    @FindBy(how = How.CSS, using =helpWebElementsCSS)
    public WebElement help;

    public void clickHelp(){
        waitUntilSelectable(By.cssSelector(helpWebElementsCSS));
        help.click();
    }


    public void verifyHelp(){
        validateByTitle("Bank of America Help Center - Get Your Questions Answered");
    }
    @FindBy(how = How.ID, using =findClosestLocationWebElementsID)
    public WebElement findClosestLocation;

    public void clickFindClosest(){
        findClosestLocation.click();
    }

    public boolean findClosestLocationIsEnable(){
        return findClosestLocation.isEnabled();
    }

    public void verifyFindClosestLocation(){

    }
    @FindBy(how = How.ID, using =scheduleAppointmentWebElementsID)
    public WebElement scheduleAppointment;

    public void clickScheduleAppointment(){
        mouseHoverByID(scheduleAppointmentWebElementsID);
        scheduleAppointment.click();
    }

    public void verifyScheduleAppointment(){
        validateByTitle("Make an Appointment with a Specialist");
    }
    @FindBy(how = How.XPATH, using =dealsAllDayWebElementsXPATH)
    public WebElement dealsAllDay;

    public void clickDealsAllDay(){
        mouseHoverByXpath(dealsAllDayWebElementsXPATH);
        dealsAllDay.click();
    }

    public void verifyDealsAllDay(){
        validateByText(validateDealsAllDayTextByXPATH, "Sign In to Online Banking");
    }

    @FindBy(how = How.CSS, using =checkingWithRightFeaturesWebElementsCSS)
    public WebElement checkingWithRightFeatures;

    public void clickcheckingWithRightFeatures(){
        mouseHoverByCSS(checkingWithRightFeaturesWebElementsCSS);
        checkingWithRightFeatures.click();
    }

    public void verifycheckingWithRightFeatures(){
      validateByURL("https://promo.bankofamerica.com/advantage_banking/?cm_sp=DEP-Checking-_-Checking-_-DCTAQT3I01_Highlights_NH_CheckingFeb2020_G3HL_bauChkCtaHL");
    }
    @FindBy(how = How.ID, using =lifeServicesWebElementsID)
    public WebElement lifeServices;

    public void clickLifeServices(){
        mouseHoverByID(lifeServicesWebElementsID);
        lifeServices.click();
    }

    public void verifyLifeServices(){
        validateByTitle("Support Before, During and After Financial Life Events");
    }
}
