package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.DeltaHomePageWebElements.*;
import static home.DeltaHomePageWebElements.bookingSubmitButtonXPath;

public class DeltaHomePage extends CommonAPI {

    @FindBy(how = How.XPATH, using = destinationFromXPath) public WebElement destinationFrom;
    @FindBy(how = How.XPATH, using = destinationFromSearchInputBoxXPath) public WebElement destinationFromSearchInputBox;
    @FindBy(how = How.XPATH, using = selectJFKXPath) public WebElement selectJFK;
    @FindBy(how = How.XPATH, using = destinationToXPath) public WebElement destinationTo;
    @FindBy(how = How.XPATH, using = destinationToSearchInputBoxXPath) public WebElement destinationToSearchInputBox;
    @FindBy(how = How.XPATH, using = selectLAXXPath) public WebElement selectLAX;
    @FindBy(how = How.XPATH, using = dropDown1XPath) public WebElement dropDown1;
    @FindBy(how = How.XPATH, using = oneWayXPath) public WebElement oneWay;
    @FindBy(how = How.XPATH, using = calendarXPath) public WebElement deltaCalendar;
    @FindBy(how = How.XPATH, using = calendarNextButtonXPath) public WebElement calendarNextButton;
    @FindBy(how = How.XPATH, using = december1XPath) public WebElement december1;
    @FindBy(how = How.XPATH, using = calendarDoneButtonXPath) public WebElement calendarDoneButton;
    @FindBy(how = How.XPATH, using = dropDown2XPath) public WebElement dropDown2;
    @FindBy(how = How.XPATH, using = twoPassangersXPath) public WebElement twoPassangers;
    @FindBy(how = How.XPATH, using = myDatesAreFlexibleCheckBoxXPath) public WebElement myDatesAreFlexibleCheckBox;
    @FindBy(how = How.XPATH, using = shopWithMilesCheckBoxXPath) public WebElement shopWithMilesCheckBox;
    @FindBy(how = How.XPATH, using = refundableFaresCheckBoxXPath) public WebElement refundableFaresCheckBox;
    @FindBy(how = How.XPATH, using = bookingSubmitButtonXPath) public WebElement bookingSubmitButton;
    @FindBy(how = How.XPATH, using = continueButtonXPath) public WebElement continueButton;
    @FindBy(how = How.XPATH, using = selectOneOptionXPath) public WebElement selectOneOption;
    @FindBy(how = How.XPATH, using = travleInfoTabXPath) public WebElement travleInfoTab;
    @FindBy(how = How.XPATH, using = aircraftTabXPath) public WebElement aircraftTab;
    @FindBy(how = How.XPATH, using = skyMilesXPath) public WebElement skyMiles;
    @FindBy(how = How.XPATH, using = skyMilesCruisesXPath) public WebElement skyMilesCruises;
    @FindBy(how = How.XPATH, using = needHelpTabXPath) public WebElement needHelpTab;
    @FindBy(how = How.XPATH, using = petTravleTabXPath) public WebElement petTravleTab;

    // Action Method
    public void checkTravleInfoDropDownTab() throws InterruptedException {
        mouseHoverByXpath(travleInfoTabXPath);
        aircraftTab.click();
    }

    // Validation Method
    public void validateTravleInfoDropDownTab(){

    }
    //*********************************************

    // Action Method
    public void checkSkyMilesDropDownTab() throws InterruptedException {
        mouseHoverByXpath(skyMilesXPath);
        skyMilesCruises.click();
    }

    // Validation Method
    public void validateSkyMilesDropDownTab(){

    }
    //*********************************************

    // Action Method
    public void checkNeedHelpDropDownTab() throws InterruptedException {
        mouseHoverByXpath(needHelpTabXPath);
        petTravleTab.click();
    }

    // Validation Method
    public void validateNeedHelpDropDownTab(){

    }
    //*********************************************

    // Action Method
    public void checkFromTab() throws InterruptedException {
        destinationFrom.click();
        destinationFromSearchInputBox.clear();
        destinationFromSearchInputBox.sendKeys("JFK");
        selectJFK.click();
    }

    // Validation Method
    public void validateFromTab(){

    }
    //*********************************************

    // Action Method
    public void checkToTab() throws InterruptedException {
        destinationTo.click();
        destinationToSearchInputBox.clear();
        destinationToSearchInputBox.sendKeys("LAX");
        selectLAX.click();
    }

    // Validation Method
    public void validateToTab(){

    }
    //*********************************************

    // Action Method
    public void checkTripWay() throws InterruptedException {
        dropDown1.click();
        oneWay.click();
    }

    // Validation Method
    public void validatecheckTripWay(){

    }
    //*********************************************

    // Action Method
    public void checkCalendar() throws InterruptedException {
        deltaCalendar.click();
        calendarNextButton.click();
        calendarNextButton.click();
        december1.click();
        calendarDoneButton.click();
    }

    // Validation Method
    public void validateCalendar(){

    }
    //*********************************************

    // Action Method
    public void checkNumberOfPassangers() throws InterruptedException {
        dropDown2.click();
        twoPassangers.click();
    }

    // Validation Method
    public void validateNumberOfPassangers(){

    }
    //*********************************************

    // Action Method
    public void checkHomepageCheckBoxes() throws InterruptedException {
        myDatesAreFlexibleCheckBox.click();
        shopWithMilesCheckBox.click();
        refundableFaresCheckBox.click();
        myDatesAreFlexibleCheckBox.click();
        shopWithMilesCheckBox.click();
        refundableFaresCheckBox.click();
    }

    // Validation Method
    public void validateHomepageCheckBoxes(){

    }
    //*********************************************

    // Action Method
    public void testAllStepsOfBooking() throws InterruptedException {
        destinationFrom.click();
        destinationFromSearchInputBox.clear();
        destinationFromSearchInputBox.sendKeys("JFK");
        selectJFK.click();
        destinationTo.click();
        destinationToSearchInputBox.clear();
        destinationToSearchInputBox.sendKeys("LAX");
        selectLAX.click();
        dropDown1.click();
        oneWay.click();
        deltaCalendar.click();
        calendarNextButton.click();
        calendarNextButton.click();
        december1.click();
        calendarDoneButton.click();
        dropDown2.click();
        twoPassangers.click();
        myDatesAreFlexibleCheckBox.click();
        bookingSubmitButton.click();
        sleepFor(5);
        continueButton.click();
        sleepFor(5);

        selectOneOption.click();
        sleepFor(5);
    }

}
