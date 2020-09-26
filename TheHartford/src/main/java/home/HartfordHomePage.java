package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HartfordHomepageWebElements.*;

public class HartfordHomePage extends CommonAPI {
    @FindBy(how = How.XPATH, using = autoTabWebElementXpath)
    WebElement autoTab;

    /**
     * click on auto tab element
     */
    public void clickOnAutoTab(){
       // clickOnElement(autoTab);
        clickByXpath(autoTabWebElementXpath);
    }

    /**
     * validate click on AutoTab
     */
    public void validateClickOnAuto(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/aarp/car-insurance";
        Assert.assertEquals(actual, expected, "Test failed");
   }

    /**
     * click on home tab element
     */
    public void clickOnHomeTab(){

        clickByXpath(homeTabWebElementXpath);
    }

    /**
     * validate click on home tab
     */
    public void validateClickOnHomeTab(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/aarp/homeowners-insurance";
        Assert.assertEquals(actual, expected, "Test failed");
    }


    /**
     * click on business tab element
     */
    public void clickOnBusinessTab(){
        clickByXpath(businessTabWebElementXpath);
    }

    /**
     * validate about us click on business tab
     */
    public void validateClickOnBusinessTab(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/business-insurance";
        Assert.assertEquals(actual, expected, "Test failed");
    }

    /**
     * click on employee benefits tab element
     */
    public void clickOnEmployeeBenefits(){
        clickByXpath(employeeBenefitsTabWebElementXpath);
    }

    /**
     * validate about us click on employee benefits tab
     */
    public void validateClickOnEmployeeBenefits(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/employee-benefits";
        Assert.assertEquals(actual, expected, "Test failed");
    }

    /**
     * click on about us tab element
     */
    public void clickOnAboutUsTab(){

        clickByXpath(aboutUsTabWebElementXpath);
    }

    /**
     * validate click on about us tab
     */
    public void validateClickOnAboutUsTab(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/about-us";
        Assert.assertEquals(actual, expected, "Test failed");
    }

    //mouse over methods
    @FindBy(how = How.XPATH, using = homeTabWebElementXpath)
    WebElement homeTab;
    /**
     * mouse over home tab
     */
    public void homeTabMouseOver(){
        mouseHover(homeTab);
        waitUntilClickAble(By.xpath(condoInsurnaceElementXpath));
        clickOnElement(condoInsurnaceElementXpath);
    }

    /**
     * validate condo insurance element
     */
    public void validateHomeTabMouseOver(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/aarp/condo-insurance";
    }

    //mouse over methods elements under home tab
    /**
     * click on renters
     */
    public void clickOnRentersInsurance(){
        mouseHover(homeTab);
        waitUntilClickAble(By.xpath(rentersInsurnaceElementXpath));
        clickOnElement(rentersInsurnaceElementXpath);
    }

    /**
     * validate renters insurance element
     */
    public void validateRentersInsurance(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/aarp/renters-insurance";
    }

    /**
     * click on flood insurance Tab
     */
    public void clickOnFloodInsurance(){
        mouseHover(homeTab);
        waitUntilClickAble(By.xpath(floodInsurnaceElementXpath));
        clickOnElement(floodInsurnaceElementXpath);
    }

    /**
     * validate flood insurance element
     */
    public void validateFloodInsurance(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/aarp/flood-insurance";
    }

    /**
     * click on Umbrella insurance Tab
     */
    public void clickOnUmbrellaInsurance(){
        mouseHover(homeTab);
        waitUntilClickAble(By.xpath(umbrellaInsurnaceElementXpath));
        clickOnElement(umbrellaInsurnaceElementXpath);
    }

    /**
     * validate umbrella insurance element
     */
    public void validateUmbrellaInsurance(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/aarp/umbrella-insurance";
    }

    //auto tab mouse over methods
    /**
     * click on classic car insurance Tab under auto
     */
    public void clickOnClassicCarInsurance(){
        mouseHover(autoTab);
        waitUntilClickAble(By.xpath(classicCarInsurnaceElementXpath));
        clickOnElement(classicCarInsurnaceElementXpath);
    }

    /**
     * validate Classic Car insurance element
     */
    public void validateClassicCarInsurance(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/aarp/car-insurance/classic-car";
    }

    /**
     * click on All Vehicles insurance Tab under auto
     */
    public void clickOnAllVehiclesInsurance(){
        mouseHover(autoTab);
        waitUntilClickAble(By.xpath(allVehiclesInsurnaceElementXpath));
        clickOnElement(allVehiclesInsurnaceElementXpath);
    }

    /**
     * validate all vehicles insurance element
     */
    public void validateAllVehiclesInsurance(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/aarp/vehicles";
    }


    /**
     * click on homeowners insurance Tab under home
     */
    public void clickOnAllHomeOwners(){
        mouseHover(homeTab);
        waitUntilClickAble(By.xpath(homeownersInsurnaceElementXpath));
        clickOnElement(homeownersInsurnaceElementXpath);
    }

    /**
     * validate all homeowners element
     */
    public void validateClickOnHomeOwners(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/aarp/homeowners-insurance";
        Assert.assertEquals(actual, expected);
    }

    //elements under business tab for mouse hover actions
    @FindBy(how = How.XPATH, using = businessTabWebElementXpath)
    WebElement businessTab;
    /**
     * click on business owners policy Tab under business tab
     */
    public void clickOnBusinessOwnersPolicy(){
        mouseHover(businessTab);
        waitUntilClickAble(By.xpath(businessOwnersPolicyElementXpath));
        clickOnElement(businessOwnersPolicyElementXpath);
    }

    /**
     * validate business owners insurance element
     */
    public void validateClickOnBusinessOwnersPolicy(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/business-owners-policy";
        Assert.assertEquals(actual, expected);
    }

    /**
     * click on general liability Tab under business tab
     */
    public void clickOnGeneralLiability(){
        mouseHover(businessTab);
        waitUntilClickAble(By.xpath(generalLiabilityElementXpath));
        clickOnElement(generalLiabilityElementXpath);
    }

    /**
     * validate general liability insurance element
     */
    public void validateClickOnGeneralLiability(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/general-liability-insurance";
        Assert.assertEquals(actual, expected);
    }

    /**
     * click on workers compensation Tab under business tab
     */
    public void clickOnWorkersCompensation(){
        mouseHover(businessTab);
        waitUntilClickAble(By.xpath(workersCompensationElementXpath));
        clickOnElement(workersCompensationElementXpath);
    }

    /**
     * validate workers compensation insurance element
     */
    public void validateClickOnWorkersCompensation(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/workers-compensation";
        Assert.assertEquals(actual, expected);
    }

    /**
     * click on commercial auto insurance Tab under business tab
     */
    public void clickOnCommercialAutoInsurance(){
        mouseHover(businessTab);
        waitUntilClickAble(By.xpath(commercialAutoInsuranceElementXpath));
        clickOnElement(commercialAutoInsuranceElementXpath);
    }

    /**
     * validate commercial auto insurance insurance element
     */
    public void validateClickOnCommercialAutoInsurance(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/commercial-auto-insurance";
        Assert.assertEquals(actual, expected);
    }

    //elements under Employee benefits tab for mouse hover actions
    @FindBy(how = How.XPATH, using = employeeBenefitsTabWebElementXpath)
    WebElement employeeBenefitsTab;

    /**
     * click on for employers insurance Tab under employee benefits tab
     */
    public void clickOnForEmployers(){
        mouseHover(employeeBenefitsTab);
        waitUntilClickAble(By.xpath(forEmployersElementXpath));
        clickOnElement(forEmployersElementXpath);
    }

    /**
     * validate for employers insurance insurance element
     */
    public void validateClickOnForEmployers(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/employee-benefits/employers";
        Assert.assertEquals(actual, expected);
    }

    /**
     * click on  benefit plans under employee benefits tab
     */
    public void clickOnBenefitPlans(){
        mouseHover(employeeBenefitsTab);
        waitUntilClickAble(By.xpath(benefitPlansElementXpath));
        clickOnElement(benefitPlansElementXpath);
    }

    /**
     * validate benefit plans under employee benefits
     */
    public void validateClickOnBenefitPlans(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/employee-benefits/voluntary";
        Assert.assertEquals(actual, expected);
    }

    /**
     * click on  absence Management under employee benefits tab
     */
    public void clickOnAbsenceManagement(){
        mouseHover(employeeBenefitsTab);
        waitUntilClickAble(By.xpath(absenceManagementElementXpath));
        clickOnElement(absenceManagementElementXpath);
    }

    /**
     * validate absence management under employee benefits
     */
    public void validateClickOnAbsenceManagement(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/employee-benefits/employers/absence-management";
        Assert.assertEquals(actual, expected);
    }

    /**
     * click on  industry solutions under employee benefits tab
     */
    public void clickOnIndustrySolutions(){
        mouseHover(employeeBenefitsTab);
        waitUntilClickAble(By.xpath(industrySolutionsElementXpath));
        clickOnElement(industrySolutionsElementXpath);
    }

    /**
     * validate industry solutions under employee benefits
     */
    public void validateClickOnIndustrySolutions(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/employee-benefits/employers/specialty-insurance";
        Assert.assertEquals(actual, expected);
    }

    // elements under benefits for employers
    /**
     * click on insurance for employees under employee benefits tab
     */
    public void clickOnInsuranceForEmployees(){
        mouseHover(employeeBenefitsTab);
        waitUntilClickAble(By.xpath(insuranceForEmployeesElementXpath));
        clickOnElement(insuranceForEmployeesElementXpath);
    }

    /**
     * validate industry solutions under employee benefits
     */
    public void validateClickOnInsuranceForEmployees(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/employee-benefits/employees";
        Assert.assertEquals(actual, expected);
    }

    /**
     * click on value addes services employees under employee benefits tab
     */
    public void clickOnValueAddedServices(){
        mouseHover(employeeBenefitsTab);
        waitUntilClickAble(By.xpath(valueAddedServicesElementXpath));
        clickOnElement(valueAddedServicesElementXpath);
    }

    /**
     * validate value added services under employee benefits
     */
    public void validateClickOnValueAddedServices(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/employee-benefits/value-added-services";
        Assert.assertEquals(actual, expected);
    }

    /**
     * click on start a claim employees under employee benefits tab
     */
    public void clickOnStartAClaim(){
        mouseHover(employeeBenefitsTab);
        waitUntilClickAble(By.xpath(startAClaimElementXpath));
        clickOnElement(startAClaimElementXpath);
    }

    /**
     * validate start a claim under employee benefits
     */
    public void validateClickOnStartAClaim(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/employee-benefits/claims";
        Assert.assertEquals(actual, expected);
    }

    /**
     * click on state guide employees under employee benefits tab
     */
    public void clickOnStateGuide(){
        mouseHover(employeeBenefitsTab);
        waitUntilClickAble(By.xpath(stateGuideElementXpath));
        clickOnElement(stateGuideElementXpath);
    }

    /**
     * validate state guide under employee benefits
     */
    public void validateClickOnStateGuide(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/paid-family-medical-leave";
        Assert.assertEquals(actual, expected);
    }

    //for agents and producers
    /**
     * click on for agents and producers under employee benefits tab
     */
    public void clickOnForAgentsNProducers(){
        mouseHover(employeeBenefitsTab);
        waitUntilClickAble(By.xpath(forAgentsNProducersElementXpath));
        clickOnElement(forAgentsNProducersElementXpath);
    }

    /**
     * validate for agents and producers under employee benefits
     */
    public void validateClickOnForAgentsNProducers(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/employee-benefits/producers";
        Assert.assertEquals(actual, expected);
    }

    /**
     * click on resources under employee benefits tab
     */
    public void clickOnResources(){
        mouseHover(employeeBenefitsTab);
        waitUntilClickAble(By.xpath(resourcesElementXpath));
        clickOnElement(resourcesElementXpath);
    }

    /**
     * validate for agents and producers under employee benefits
     */
    public void validateClickOnResources(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/employee-benefits/producers/resources-tools";
        Assert.assertEquals(actual, expected);
    }

    /**
     * click on benefits technology under employee benefits tab
     */
    public void clickOnBenefitsTechnology(){
        mouseHover(employeeBenefitsTab);
        waitUntilClickAble(By.xpath(benefitsTechnologyElementXpath));
        clickOnElement(benefitsTechnologyElementXpath);
    }

    /**
     * validate for agents and producers under employee benefits
     */
    public void validateClickOnBenefitsTechnology(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/employee-benefits/producers/technology-partnerships-solutions";
        Assert.assertEquals(actual, expected);
    }



}// ends class
