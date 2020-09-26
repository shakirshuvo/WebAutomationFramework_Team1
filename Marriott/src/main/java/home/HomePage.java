package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomeWebElements.*;

public class HomePage extends CommonAPI {

    @FindBy(how = How.XPATH,using = FindReserveXP)
    public WebElement findReserve;
    @FindBy(how = How.XPATH,using = findHotelXP)
    public WebElement findHotel;
    @FindBy(how = How.CSS,using = findReserveValidationCSS)
    public WebElement findReserveValidation;

    @FindBy(how = How.XPATH,using = specialOfferXP)
    public WebElement specialOffer;
    @FindBy(how = How.CSS,using = dealsCSS)
    public WebElement deals;
    @FindBy(how = How.CSS,using = dealsValidationCSS)
    public WebElement dealsValidation;

    public void setFindReserve() throws InterruptedException {
        findReserve.click();
        sleepFor(3);
        findHotel.click();
        sleepFor(3);
        String actualResult=findReserveValidation.getText();
        String expectedResult=" Find A Hotel ";
        Assert.assertEquals(actualResult,expectedResult,"************test failed**********");
    }
    public void setDeals() throws InterruptedException {
        specialOffer.click();
        sleepFor(2);
        deals.click();
        sleepFor(2);
        String actualResult=dealsValidation.getText();
        String expectedResult="Marriott Deals: Follow Your Heart";
        Assert.assertEquals(actualResult,expectedResult,"***********test failed************");
    }
}
