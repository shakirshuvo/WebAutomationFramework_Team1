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
        clickByXpath(employeeBenfitsTabWebElementXpath);
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
     * validate Classic Car insurance element
     */
    public void validateAllVehiclesInsurance(){
        String actual = driver.getCurrentUrl();
        String expected = "https://www.thehartford.com/aarp/vehicles";
    }




}// ends class
