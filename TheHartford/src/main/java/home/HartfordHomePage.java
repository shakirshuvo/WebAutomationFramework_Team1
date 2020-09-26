package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HartfordHomePageWebElements.*;

public class HartfordHomePage extends CommonAPI {
    @FindBy(how= How.XPATH, using=autotabWebElementbyXpath )
    public WebElement autoTab;
    /**
     * click on autho tab Element
     * @author LemlemG
     */
public void clickOnAutoTab(){
    clickByXpath(autotabWebElementbyXpath);
}
public void validateClickOnAutoTab(){
    String actual= driver.getCurrentUrl();
    String expected="https://www.thehartford.com/aarp/car-insurance";
    Assert.assertEquals(actual,expected,"test failed");
}
    @FindBy(how= How.XPATH, using=allVehicleInsuranceByXpath )
    public WebElement allVehicleInsurance;
    /**
     * click on autho tab Element
     * @author LemlemG
     */
    public void clickOnAllVehicleInsurance(){
        clickByXpath(allVehicleInsuranceByXpath);
    }
    public void validateClickOnAllVehicleInsurance(){
        String actual= driver.getTitle();
        String expected="Vehicle Insurance | Get a Vehicle Insurance Quote | The Hartford";
        Assert.assertEquals(actual,expected,"test failed");
    }
}
