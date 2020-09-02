package home;

import base.CommonAPI;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

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


    @FindBy(how=How.ID, using =needHelpElementID)
    WebElement needHelp;

    @FindBy(how = How.ID, using = petTravelElementID)
        WebElement petTravel;

    /**
     * Clicking on need help
     * @Author: Lemlem
     */
    public void clickOnNeedHelp(){
      needHelp.click();
}

    /**
     * click on pet travel
     */
    public void clickOnPetTravel(){
        petTravel.click();
    }

    /**
     * validate click on pet travel
     * @Author: Lemlem
     */
    public void validateClickOnPetTravel(){
        String actual = driver.getTitle();
        Assert.assertEquals(actual, petTravelExpectedText);
    }
@FindBy(how=How.XPATH ,using=vaccationDealsXpath)
WebElement VaccationDeals;
    /**
     * Clicking on Vaccation Deals
     * @Author Lemlem
     */
    public void clickonVaccationDeals(){
        VaccationDeals.click();

    }
    /**
     * validate click on vaccationDeals
     * @Author: Lemlem
     */
public void validateVaccationDeals(){
    String actual=driver.getTitle();
    String expected="Delta Vacations";
    Assert.assertEquals(actual,expected);

}
@FindBy(how=How.XPATH, using = deltaAmexCardsXpath)
WebElement deltaAmexCards;

    /**
     *  Clicking on DeltaAmexCards
     *   @Author Lemlem
     */
    public void clickonDeltaAmexCards(){
        deltaAmexCards.click();
    }
        /**
         * validating Click on DeltaAmexCards
         * @Author Lemlem
         */
        public void validateDeltaAmexCards(){
            String actual=driver.getTitle();
            String expected="Delta";
            Assert.assertEquals(actual,expected);
        }
@FindBy(how=How.ID,using =shopHotelsID )
WebElement shopHotels;
    /**
     * click on shop Hotels
     * @author Lemlem
     */
    public void clickOnShopHotels(){
        shopHotels.click();
    }

    /**
     * validating the SHopHotels
     * @Author Lemlem
     */
     public void validateShopHotels(){
         String actual=driver.getTitle();
         String expected="Delta - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations";
         Assert.assertEquals(actual,expected);
     }
    private void FlightProtection() {
    }

    public void Destinations() {
    }

    public void flightStatus() {
    }
}

