package home;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static home.HomePageWebElements.*;

public class HomePage extends CommonAPI {
    @FindBy(how = How.CSS, using = autoButtonCSS)
    public WebElement autoButton;
    @FindBy(how = How.XPATH, using = carInsuranceXP)
    public WebElement carInsurance;
    @FindBy(how = How.CSS, using = autoButtonValidationCSS)
    public WebElement autoButtonValidation;

    @FindBy(how = How.XPATH, using = classicCarInsuranceXP)
    public WebElement classicCarInsurance;
    @FindBy(how = How.XPATH, using = classicCarInsuranceValidationXP)
    public WebElement classicCarInsuranceValidation;

    @FindBy(how = How.XPATH, using = allVehiclesXP)
    public WebElement allVehicles;
    @FindBy(how = How.XPATH, using = allVehiclesValidationXP)
    public WebElement allVehiclesValidation;

    @FindBy(how = How.CSS, using = homeWebElementsButtonCSS)
    public WebElement homeButton;
    @FindBy(how = How.XPATH, using = homeownersInsuranceXP)
    public WebElement homeownersInsurance;
    @FindBy(how = How.CSS, using = homeownersInsuranceValidationCSS)
    public WebElement homeownersInsuranceValidation;

    @FindBy(how = How.XPATH, using = rentersInsuranceXP)
    public WebElement rentersInsurance;
    @FindBy(how = How.XPATH, using = rentersInsuranceValidationXP)
    public WebElement rentersInsuranceValidation;

    @FindBy(how = How.XPATH, using = condoInsuranceXP)
    public WebElement condoInsurance;
    @FindBy(how = How.XPATH, using = condoInsuranceValidationXP)
    public WebElement condoInsuranceValidation;

    @FindBy(how = How.XPATH, using = floodInsuranceXP)
    public WebElement floodInsurance;
    @FindBy(how = How.XPATH, using = floodInsuranceValidationXP)
    public WebElement floodInsuranceValidation;

    @FindBy(how = How.XPATH, using = umbrellaInsuranceXP)
    public WebElement umbrellaInsurance;
    @FindBy(how = How.CSS, using = umbrellaInsuranceValidationCSS)
    public WebElement umbrellaInsuranceValidation;

    @FindBy(how = How.XPATH, using = businessButtonXP)
    public WebElement businessButton;
    @FindBy(how = How.XPATH, using = businessInsuranceXP)
    public WebElement businessInsurance;
    @FindBy(how = How.CSS, using = businessInsuranceValidationCSS)
    public WebElement businessInsuranceValidation;

    @FindBy(how = How.XPATH, using = smallBusinessInsuranceXP)
    public WebElement smallBusinessInsurance;
    @FindBy(how = How.CSS, using = smallBusinessInsuranceValidationCSS)
    public WebElement smallBusinessInsuranceValidation;

    @FindBy(how = How.XPATH, using = generalLiabilityInsuranceXP)
    public WebElement generalLiabilityInsurance;
    @FindBy(how = How.CSS, using = generalLiabilityInsuranceValidationCSS)
    public WebElement generalLiabilityInsuranceValidation;

    @FindBy(how = How.XPATH, using = workerCompensationInsuranceXP)
    public WebElement workerCompensationInsurance;
    @FindBy(how = How.CSS, using = workerCompensationInsuranceValidationCSS)
    public WebElement workerCompensationInsuranceValidation;

    @FindBy(how = How.XPATH, using = allBusinessCoveragesXP)
    public WebElement allBusinessCoverages;
    @FindBy(how = How.CSS, using = allBusinessCoveragesValidationCSS)
    public WebElement allBusinessCoveragesValidation;

    @FindBy(how = How.XPATH, using = allIndustriesXP)
    public WebElement allIndustries;
    @FindBy(how = How.CSS, using = allIndustriesValidationCSS)
    public WebElement allIndustriesValidation;

    @FindBy(how = How.CSS, using = EmployeeBenefitsCSS)
    public WebElement EmployeeBenefits;
    @FindBy(how = How.CSS, using = employeesBenefitsCSS)
    public WebElement employeesBenefits;
    @FindBy(how = How.CSS, using = employeeBenefitsValidationCSS)
    public WebElement employeeBenefitsValidation;

    @FindBy(how = How.XPATH, using = voluntaryBenefitsXP)
    public WebElement voluntaryBenefits;
    @FindBy(how = How.CSS, using = voluntaryBenefitsValidationCSS)
    public WebElement voluntaryBenefitsValidation;

    @FindBy(how = How.XPATH, using = absenceManagementXP)
    public WebElement absenceManagement;
    @FindBy(how = How.CSS, using = absenceManagementValidationCSS)
    public WebElement absenceManagementValidation;

    @FindBy(how = How.XPATH, using = forEmployeesXP)
    public WebElement forEmployees;
    @FindBy(how = How.XPATH, using = forEmployeesValidationXP)
    public WebElement forEmployeesValidation;

    @FindBy(how = How.CSS, using = aboutUsCSS)
    public WebElement aboutUs;
    @FindBy(how = How.XPATH, using = aboutTheHeartFordXP)
    public WebElement aboutTheHeartFord;
    @FindBy(how = How.CSS, using = aboutTheHeartFordValidationCSS)
    public WebElement aboutTheHeartFordValidation;




    public void setAutoButton() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(autoButton).build().perform();
        sleepFor(3);
        carInsurance.click();
        sleepFor(3);
        String actualResult = autoButtonValidation.getText();
        String expectedResult = "AARP Auto Insurance From The Hartford";
        Assert.assertEquals(actualResult, expectedResult, "text doesn't match");
    }

    public void setClassicCarInsurance() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(autoButton).build().perform();
        sleepFor(3);
        classicCarInsurance.click();
        sleepFor(3);
        String actualResult = classicCarInsuranceValidation.getText();
        String expectedText = "Classic Car Insurance";
        Assert.assertEquals(actualResult, expectedText, "result doesn't match");
    }

    public void setAllVehicles() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(autoButton).build().perform();
        sleepFor(3);
        allVehicles.click();
        String actualResult = allVehiclesValidation.getText();
        String expectedResult = "Vehicle Insurance";
        Assert.assertEquals(actualResult, expectedResult, "result doesn't match");
    }

    public void setHomeButton() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(homeButton).build().perform();
        sleepFor(3);
        homeownersInsurance.click();
        String actualResult = homeownersInsuranceValidation.getText();
        String expectedResult = "AARP Homeowners Insurance Program From The Hartford";
        Assert.assertEquals(actualResult, expectedResult, "text doesn't match");
    }

    public void setHomeownersInsurance() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(homeButton).build().perform();
        sleepFor(3);
        rentersInsurance.click();
        String actualResult = rentersInsuranceValidation.getText();
        String expectedResult = "Renters Insurance";
        Assert.assertEquals(actualResult, expectedResult, "result doesn't match");
    }

    public void setCondoInsurance() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(homeButton).build().perform();
        sleepFor(3);
        condoInsurance.click();
        String actualResult = condoInsuranceValidation.getText();
        String expectedResult = "Condo Insurance";
        Assert.assertEquals(actualResult, expectedResult, "test is failed");
        sleepFor(3);
    }

    public void setFloodInsurance() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(homeButton).build().perform();
        sleepFor(3);
        floodInsurance.click();
        String actualResult = floodInsuranceValidation.getText();
        String expectedResult = "Flood Insurance";
        Assert.assertEquals(actualResult, expectedResult, "result failed");
        sleepFor(3);
    }

    public void setUmbrellaInsurance() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(homeButton).build().perform();
        sleepFor(3);
        umbrellaInsurance.click();
        String actualResult = umbrellaInsuranceValidation.getText();
        String expectedResult = "Umbrella Insurance Policy";
        Assert.assertEquals(actualResult, expectedResult, "result failed");
    }

    public void setBusinessInsurance() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(businessButton).build().perform();
        sleepFor(3);
        businessInsurance.click();
        String actualResult = businessInsuranceValidation.getText();
        String expectedResult = "Business Insurance";
        Assert.assertEquals(actualResult, expectedResult, "test failed");
        sleepFor(3);
    }

    public void setSmallBusinessInsurance() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(businessButton).build().perform();
        sleepFor(3);
        smallBusinessInsurance.click();
        String actualResult = smallBusinessInsuranceValidation.getText();
        String expectedResult = "Small Business Insurance";
        Assert.assertEquals(actualResult, expectedResult, "**********test Failed***********");
    }

    public void setGeneralLiabilityInsurance() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(businessButton).build().perform();
        sleepFor(3);
        generalLiabilityInsurance.click();
        String actualResult = generalLiabilityInsuranceValidation.getText();
        String expectedResult = "General Liability Insurance";
        Assert.assertEquals(actualResult, expectedResult, "**********test failed*******");
    }

    public void setWorkerCompensationInsuranceValidation() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(businessButton).build().perform();
        sleepFor(3);
        workerCompensationInsurance.click();
        String actualResult = workerCompensationInsuranceValidation.getText();
        String expectedText = "Workers' Compensation Insurance";
        Assert.assertEquals(actualResult, expectedText, "***********test failed*********");
    }

    public void setAllBusinessCoverages() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(businessButton).build().perform();
        sleepFor(3);
        allBusinessCoverages.click();
        String actualResult = allBusinessCoveragesValidation.getText();
        String expectedResult = "Business Insurance Coverages";
        Assert.assertEquals(actualResult, expectedResult, "*********test failed*******");
    }

    public void setAllIndustries() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(businessButton).build().perform();
        sleepFor(3);
        allIndustries.click();
        String actualResult = allIndustriesValidation.getText();
        String expectedResult = "Business Insurance Solutions by Industry";
        Assert.assertEquals(actualResult, expectedResult, "***********test failed************");
    }

    public void setEmployeeBenefits() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(EmployeeBenefits).build().perform();
        sleepFor(3);
        employeesBenefits.click();
        String actualResult = employeeBenefitsValidation.getText();
        String expectedResult = "Employee Benefits Help Give You the Power to Prevail";
        Assert.assertEquals(actualResult, expectedResult, "****************test failed****************");
    }

    public void setVoluntaryBenefits() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(EmployeeBenefits).build().perform();
        sleepFor(3);
        voluntaryBenefits.click();
        String actualResult = voluntaryBenefitsValidation.getText();
        String expectedResult = "Voluntary Benefits";
        Assert.assertEquals(actualResult, expectedResult, "***********test failed***********");
    }

    public void setAbsenceManagement() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(EmployeeBenefits).build().perform();
        sleepFor(3);
        absenceManagement.click();
        String actualResult = absenceManagementValidation.getText();
        String expectedResult = "Absence Management";
        Assert.assertEquals(actualResult, expectedResult, "***********test failed***********");
    }

    public void setForEmployees() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(EmployeeBenefits).build().perform();
        sleepFor(3);
        forEmployees.click();
        String actualResult = forEmployeesValidation.getText();
        String expectedResult = "Insurance for Employees";
        Assert.assertEquals(actualResult, expectedResult, "********test Failed*********");
    }

    public void setAboutTheHeartFord() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(aboutUs).build().perform();
        sleepFor(3);
        aboutTheHeartFord.click();
        String actualResult = aboutTheHeartFordValidation.getText();
        String expectedResult = "About Us";
        Assert.assertEquals(actualResult, expectedResult, "***********test failed***********");
    }


}

