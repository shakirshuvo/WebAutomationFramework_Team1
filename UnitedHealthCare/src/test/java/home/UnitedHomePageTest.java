package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UnitedHomePageTest extends CommonAPI {
Home home;
@BeforeMethod
public void getInIt(){
    home = PageFactory.initElements(driver, Home.class);
}

    @Test
    public void testClickOnAllBusinessPlans(){
    home.clickOnInsurance();
    home.clickOnAllBusinessPlans();
    home.validateClickOnAllBusinessPlans();

    }
    @Test
    public void testClickOnHealthInsurnac(){
    home.clickOnInsurance();
    home.clickOnHealthInsurance();
    home.validateClickOnHealthInsurance();

    }
    @Test
    public void testClickOnMedicare(){
    home.clickOnInsurance();
    home.clickOnMedicare();
    home.validateClickOnMedicare();
    }
    @Test
    public void testClickBehaviouralHealth(){
        home.ClickOnMemberResource();
        home.clickOnBehaviraolHealth();
        home.validateClickOnBehavioralHealth();
    }
    @Test
    public void testClickVirtualVisits(){
        home.ClickOnMemberResource();
        home.clickOnVirtualVisit();
        home.validateClickOnVirtualVisit();
    }
    @Test
    public void testClickUnitedHealthcareApp(){
        home.ClickOnMemberResource();
        home.clickOnUnitedHealthcareApp();
        home.validateClickOnUnitedHealthcareApp();
    }
    @Test
    public void testClickCaregiverResources(){
        home.ClickOnMemberResource();
        home.clickOnCaregiverResources();
        home.validateClickOnCaregiverResources();
    }
//    @Test
//    public void testClickUnderstandingMedicare(){
//        home.ClickOnMemberResource();
//        home.validateClickOnUnderstandingMedicare();
//        home.validateClickOnUnderstandingMedicare();
//    }

//    @Test
//    public void testClickPharmacyBenefits(){
//        home.ClickOnMemberResource();
//        home.validateClickOnPharmacyBenefits();
//        home.validateClickOnPharmacyBenefits();
//    }
    @Test
    public void testClickOnsSubstanceUseSupport(){
    home.ClickOnMemberResource();
    home.clickOnSubstanceUseSupport();
    home.validateClickOnSubstanceUseSupport();
    }
    @Test
    public void testClickOnDentalInsurancePlans(){
        home.clickOnInsurance();
        home.clickOnDentalInsurancePlans();
        home.validateClickOnDentalInsurancePlans();
    }

}
