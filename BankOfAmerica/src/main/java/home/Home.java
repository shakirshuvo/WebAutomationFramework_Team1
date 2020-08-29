package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomeWebElements.*;

public class Home extends CommonAPI {

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
        wealthManagement.click();
    }

    public boolean wealthManagementIsEnable(){
        return wealthManagement.isEnabled();
    }

    public void verifyWealthManagement(){
        Assert.assertTrue(wealthManagementIsEnable());
    }
    @FindBy(how = How.CSS, using = businessAndInstitutionsWebElementsCSS)
    public WebElement businessAndInstitutions;

    public void clickBusinessAndInstitutions(){
        businessAndInstitutions.click();
    }

    public boolean businessAndInstitutionsIsEnable(){
        return businessAndInstitutions.isEnabled();
    }

    public void verifyBusinessAndInstitutions(){
        Assert.assertTrue(businessAndInstitutionsIsEnable());
    }
    @FindBy(how = How.ID, using = securityWebElementsID)
    public WebElement security;

    public void clickSecurity(){
        security.click();
    }

    public boolean securityIsEnable(){
        return security.isEnabled();
    }

    public void verifySecurity(){
        Assert.assertTrue(securityIsEnable());
    }
    @FindBy(how = How.CSS, using =aboutUsWebElementsCSS)
    public WebElement aboutUs;

    public void clickAboutUs(){
        aboutUs.click();
    }

    public boolean aboutUsIsEnable(){
        return aboutUs.isEnabled();
    }

    public void verifyAboutUs(){
        Assert.assertTrue(aboutUsIsEnable());
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
        contactUs.click();
    }

    public boolean contactUsIsEnable(){
        return contactUs.isEnabled();
    }

    public void verifyContactUs(){
        Assert.assertTrue(contactUsIsEnable());
    }
    @FindBy(how = How.CSS, using =helpWebElementsCSS)
    public WebElement help;

    public void clickHelp(){
        help.click();
    }

    public boolean helpIsEnable(){
        return help.isEnabled();
    }

    public void verifyHelp(){
        Assert.assertTrue(helpIsEnable());
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
        Assert.assertTrue(helpIsEnable());
    }
    @FindBy(how = How.ID, using =scheduleAppointmentWebElementsID)
    public WebElement scheduleAppointment;

    public void clickScheduleAppointment(){
        scheduleAppointment.click();
    }

    public boolean scheduleAppointmentIsEnable(){
        return scheduleAppointment.isEnabled();
    }

    public void verifyScheduleAppointment(){
        Assert.assertTrue(scheduleAppointmentIsEnable());
    }
    @FindBy(how = How.CSS, using =dealsAllDayWebElementsCSS)
    public WebElement dealsAllDay;

    public void clickDealsAllDay(){
        dealsAllDay.click();
    }

    public boolean dealsAllDayIsEnable(){
        return dealsAllDay.isEnabled();
    }

    public void verifyDealsAllDay(){
        Assert.assertTrue(dealsAllDayIsEnable());
    }
    @FindBy(how = How.CSS, using =checkingWithRightFeaturesWebElementsCSS)
    public WebElement checkingWithRightFeatures;

    public void clickcheckingWithRightFeatures(){
        checkingWithRightFeatures.click();
    }

    public boolean checkingWithRightFeaturesIsEnable(){
        return checkingWithRightFeatures.isEnabled();
    }

    public void verifycheckingWithRightFeatures(){
        Assert.assertTrue(checkingWithRightFeaturesIsEnable());
    }
    @FindBy(how = How.CSS, using =lifeServicesWebElementsID)
    public WebElement lifeServices;

    public void clickLifeServices(){
        lifeServices.click();
    }

    public boolean lifeServicesIsEnable(){
        return lifeServices.isEnabled();
    }

    public void verifyLifeServices(){
        Assert.assertTrue(lifeServicesIsEnable());
    }
}
