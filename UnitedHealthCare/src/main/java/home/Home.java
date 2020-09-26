package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomeWebElement.*;

public class Home extends CommonAPI {
//    public class HartfordHomePage extends CommonAPI {
//        @FindBy(how= How.XPATH, using=autotabWebElementbyXpath )
//        public WebElement autoTab;
//        /**
//         * click on autho tab Element
//         * @author LemlemG
//         */
//        public void clickOnAutoTab(){
//            clickByXpath(autotabWebElementbyXpath);
//        }
//        public void validateClickOnAutoTab(){
//            String actual= driver.getCurrentUrl();
//            String expected="https://www.thehartford.com/aarp/car-insurance";
//            Assert.assertEquals(actual,expected,"test failed");

 @FindBy(how=How.XPATH, using=allBusinessplansByXpath)
         public WebElement AllBusinessplans;
    /**
     * click on insurance
     */
    public void clickOnInsurance(){
        clickByXpath(insuranceByXpath);
    }
    /**
     * click on allBussinessplans
     */
 public void clickOnAllBusinessPlans(){
     clickByXpath(allBusinessplansByXpath);
 }
 public void validateClickOnAllBusinessPlans(){
     String actual=driver.getTitle();
     String expected="Health insurance for employers | UnitedHealthcare";
     Assert.assertEquals(actual,expected,"failed");

}
@FindBy(how=How.XPATH, using=healthInsuranceByXpath)
    public WebElement healthInsurance;
 public void clickOnHealthInsurance(){
     clickByXpath(healthInsuranceByXpath);
 }
 public void validateClickOnHealthInsurance(){
     String actual=driver.getTitle();
     String expected="Health insurance for individuals & families | UnitedHealthcare";
     Assert.assertEquals(actual,expected,"failed");
 }
 @FindBy(how=How.XPATH, using=medicareByXpath)
    public WebElement medicare;
 public void clickOnMedicare(){
     clickByXpath(medicareByXpath);
 }
 public void validateClickOnMedicare(){
     String actual=driver.getTitle();
     String expected="Medicare health insurance plans | UnitedHealthcare";
     Assert.assertEquals(actual,expected,"failed");
 }
    @FindBy(how=How.XPATH, using=behaviouralHealthByXpath)
    public WebElement behavioralHealth;

    public void ClickOnMemberResource(){
        clickByXpath(memberResourceByXPATH);
    }
    public void clickOnBehaviraolHealth(){
        clickByXpath(behaviouralHealthByXpath);
    }

    public void validateClickOnBehavioralHealth(){
        String actual=driver.getTitle();
        String expected="Behavioral health | UnitedHealthcare";
        Assert.assertEquals(actual,expected,"failed");
    }
    @FindBy(how=How.XPATH, using=virtualVisitByXpath)
    public WebElement virtualVisit;
    public void clickOnVirtualVisit(){
        clickByXpath(virtualVisitByXpath);
    }
    public void validateClickOnVirtualVisit(){
        String actual=driver.getTitle();
        String expected="Virtual Visits | UnitedHealthcare";
        Assert.assertEquals(actual,expected,"failed");
    }
    @FindBy(how=How.XPATH, using=unitedHealthcareAppByXpath)
    public WebElement unitedHealthcareApp;
    public void clickOnUnitedHealthcareApp(){
        clickByXpath(unitedHealthcareAppByXpath);
    }
    public void validateClickOnUnitedHealthcareApp(){
        String actual=driver.getTitle();
        String expected="UnitedHealthcare app | UnitedHealthcare";
        Assert.assertEquals(actual,expected,"failed");
    }
    @FindBy(how=How.XPATH, using=caregiverResourcesByXpath)
    public WebElement caregiverResources;
    public void clickOnCaregiverResources(){
        clickByXpath(caregiverResourcesByXpath);
    }
    public void validateClickOnCaregiverResources(){
        String actual=driver.getTitle();
        String expected="Caregiver resources | UnitedHealthcare";
        Assert.assertEquals(actual,expected,"failed");
    }

    @FindBy(how=How.XPATH, using=substanceUseSupportByXpath)
    public WebElement substanceUseSupport;
    public void clickOnSubstanceUseSupport(){
        clickByXpath(substanceUseSupportByXpath);
    }
    public void validateClickOnSubstanceUseSupport(){
        String actual=driver.getTitle();
        String expected="Substance Use Helpline | UnitedHealthcare";
        Assert.assertEquals(actual,expected,"failed");
    }

    @FindBy(how=How.XPATH, using=dentalInsurancePlansByXpath)
    public WebElement dentalInsurancePlans;
    public void clickOnDentalInsurancePlans(){
        clickByXpath(dentalInsurancePlansByXpath);
    }
    public void validateClickOnDentalInsurancePlans(){
        String actual=driver.getTitle();
        String expected="Dental insurance plans | UnitedHealthcare";
        Assert.assertEquals(actual,expected,"failed");
    }

}
