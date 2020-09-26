package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static home.HomePageWebElements.*;

public class HomePage extends CommonAPI {


     @FindBy(how = How.XPATH, using = vaccationDealsElementXpath)
     WebElement vaccationDeals;

/**
 * click on Vaccations deals
 */
public void clickOnVaccationDeals() throws InterruptedException {

  //  scrollUntilElementVisible(vaccationDealsElementXpath);
  //  waitUntilVisible(By.xpath(vaccationDealsElementXpath));
   clickOnElement(vaccationDealsElementXpath);
}

/**
 * validate clickOnVaccation Deals
 * Author: Waqas
 */
public void validateClickOnVaccationDeals(){
    //String actual = getTitle();
   // System.out.println(actual);
    String expected = "Delta Vacations";
    Assert.assertEquals(driver.getTitle(), expected);
}

/**
 * click on book on main page
 */
public void clicKOnBook() throws InterruptedException {
    clickOnElement(bookElementCSS);
    Thread.sleep(3000);
}

/**
 * validate click on book
 */
public void validateClickOnBook(){
    String actual = getTextByCss(fromOriginElementCSS);
    String expected = "From";
    Assert.assertEquals(actual, expected, "test failed");
}

/**
 * click on Check-In
 */
public void clickCheckIn(){
    clickOnElement(checkInElementCSS);
}

/**
 * validate check-in
 */
public void validateClickCheckIn(){
    String actual = getTextByXpath(findtripByElementXpath);
    String expected = "Find Your Trip By";
    Assert.assertEquals(actual, expected, "test failed");
}

/**
 * click on trips
 */
public void clickMyTrips(){
    clickOnElement(myTripsCSS);
}
/**
 * type required information into appropriate elements for search my trips to search my trips
 */
@FindBy(how = How.XPATH, using = myTripsDropDownElementXpath)
WebElement myTripsDropDown;
public void enterMyTripInfo(){
    //selectOptionByVisibleText(myTripsDropDown, dropDownSelection);
    clickOnElement(myTripsDropDownElementXpath);

    typeOnInputBox(searchTripfirstNameXpath, firstName);
    typeOnInputBox(searchTripLastNameCss,lastName);
   typeOnInputBox(eTicketNumberXpath,ticketNumber);
   // keysInput(searchTripLastNameCss);
    clickOnElement(myTripSubmitBtnID);
}

/**
 * validate my trips click
 */
public void validateMyTrips(){
    String actual = getTextById(tripDetialsElementID);
    String expted = "Trip Details";
    Assert.assertEquals(actual, expted, "test failed");
}

/**
 * click on flight status
 */
public  void clickFlightStatus() throws InterruptedException {
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    clickOnElement(flightStatusXpath);
}

/**
 * validate click flight status
 *
 */
public void validateClickFlightStatus(){
    String actual = getTextByCss(statusByDateCSS);
    String expect = "Search By Date (Required)";
    Assert.assertEquals(actual, expect, "test failed");
}








}// ends class HomePage
