package home;

import base.CommonAPI;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.print.attribute.standard.Destination;

import static home.HomePageWebElements.*;
import static org.testng.Assert.assertEquals;

public class HomePage<webElementSearchBox, webElementSearch, webElement> extends CommonAPI {


    @FindBy (how = How.XPATH, using =webelementSignUpXPATH )
    public WebElement signUp;

    @FindBy(how=How.XPATH, using=webelementLoginXpath)
    public WebElement login;
    @FindBy(how=How.XPATH,using=bookWebElementXpath)
    public WebElement book;
    @FindBy(how=How.XPATH,using= flightStatusTitle)
    public webElement flightStatus;
    @FindBy(how=How.XPATH, using="//*[@id=\"navPrimary\"]/li[6]/a[2]")
    public WebElement Baggage;
    @FindBy(how=How.XPATH, using="//a[@id=\"headSectab2\"]")
    public webElement Skymiles;
    @FindBy(how=How.XPATH, using="Flight Deals: Find Cheap Airfare & Discounts on Airline Tickets : Delta")
    public webElement FlightDeals;
    @FindBy(how=How.XPATH, using = "//*[@id=\"headPrimary2\"]")
    public webElement Destinations;
    @FindBy(how=How.XPATH ,using= flightProtection)
    public webElement FlightProtection;
    @FindBy(how=How.XPATH , using = feed)
    public webElement Feed;

    Public ObjectClick;
    private Object Click;
    public static Object Destination;

    public static void VerifyFlightDeals() {
    }

    public static void clickFlightDeals() {
    }

    public void clickOnSignUp(){
        signUp.click();
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public void verifySignUpCheck(){
        assertEquals(getTitle(),signUpTitle);
    }

    public void clickLogin(){
        login.click();
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }

    public void verifyClickLogin(){
        assertEquals(getURL(), logingURL);
    }
    public void  clickBook(){
        book.click();
    }

    public void verifyClickBook(){
        assertEquals(getTitle(), bookTitle );
    }
    public void clickFlighStatus(){
        flightStatus.getClass();
    }
public void verifyFlightStatus(){

}
public void verifyBaggaeTitle(){
        driver.getTitle();
}

    public void setBaggage(WebElement baggage) {
       baggage.getClass();
    }
    public void verifyClickSkyMiles(){
       verifyClickSkyMiles();
    }
    public void VerifyClickflightDealsTitle(){
         VerifyClickflightDealsTitle();
    }
    public void clickVerifyDestinations(){
       clickVerifyDestinations();

       
    }
    public void VerifyclickFlightProtection(){
        FlightProtection();
    
}


    private void FlightProtection() {
    }

    public void Destinations() {
    }

    public void flightStatus() {
    }
}

