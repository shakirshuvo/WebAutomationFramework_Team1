package homeTest;

import base.CommonAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {

    HomePage homePage;
    @BeforeMethod
    public void init(){
        homePage= PageFactory.initElements(driver,HomePage.class);
    }
    @Test
    public void setAutoButtonTest() throws InterruptedException {
        homePage.setAutoButton();
    }
    @Test
    public void setClassicCarInsuranceTest() throws InterruptedException {
        homePage.setClassicCarInsurance();
    }
    @Test
    public void setAllVehiclesTest() throws InterruptedException {
        homePage.setAllVehicles();
    }
    @Test
    public void setHomeButtonTest() throws InterruptedException {
        homePage.setHomeButton();
    }
    @Test
    public void setHomeownersInsuranceTest() throws InterruptedException {
        homePage.setHomeownersInsurance();
    }
//    @Test
//    public void setCondoInsuranceTest() throws InterruptedException {
//        homePage.setCondoInsurance();
//    }
    @Test
    public void setFloodInsuranceTest() throws InterruptedException {
        homePage.setFloodInsurance();
    }
    @Test
    public void setUmbrellaInsuranceTest() throws InterruptedException {
        homePage.setUmbrellaInsurance();
    }
    @Test
    public void setBusinessInsuranceTest() throws InterruptedException {
        homePage.setBusinessInsurance();
    }
    @Test
    public void setSmallBusinessInsuranceTest() throws InterruptedException {
        homePage.setSmallBusinessInsurance();
    }
    @Test
    public void setGeneralLiabilityInsuranceTest() throws InterruptedException {
        homePage.setGeneralLiabilityInsurance();
    }
    @Test
    public void setWorkerCompensationInsuranceValidationTest() throws InterruptedException {
        homePage.setWorkerCompensationInsuranceValidation();
    }
    @Test
    public void setAllBusinessCoveragesTest() throws InterruptedException {
        homePage.setAllBusinessCoverages();
    }
//    @Test
//    public void setAllIndustriesTest() throws InterruptedException {
//        homePage.setAllIndustries();
//    }
//    @Test
//    public void setEmployeeBenefitsTest() throws InterruptedException {
//        homePage.setEmployeeBenefits();
//    }
//    @Test
//    public void setVoluntaryBenefitsTest() throws InterruptedException {
//        homePage.setVoluntaryBenefits();
//    }
    @Test
    public void setAbsenceManagementTest() throws InterruptedException {
        homePage.setAbsenceManagement();
    }
//    @Test
//    public void setForEmployeesTest() throws InterruptedException {
//        homePage.setForEmployees();
//    }
    @Test
    public void setAboutTheHeartFordTest() throws InterruptedException {
        homePage.setAboutTheHeartFord();
    }

}
