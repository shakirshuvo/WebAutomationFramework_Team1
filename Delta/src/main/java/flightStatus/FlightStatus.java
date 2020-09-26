package flightStatus;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

import static flightStatus.FlightStatusWebElements.*;

public class FlightStatus extends CommonAPI {

    @FindBy(how = How.ID, using = searchByDateCalenderIDWebElement)
    public WebElement searchByDateCalender;

    /**
     * This method checks the flight status using flight number.
     *
     * @param flightNumber
     * @throws InterruptedException
     */
    public void checkFlightStatus(String flightNumber) throws InterruptedException {
        clickOnElementByID(flightStatusTabIDWebElement);
        typeByCss(flightNumberFieldCSSWebElement, flightNumber);
        clickOnElementByID(flightStatusSubmitButtonIDWebElement);
    }

    /**
     * This method validates that user can check the flight status using flight number.
     *
     * @param flightNumber
     * @throws InterruptedException
     */
    public void validateCheckFlightStatus(String flightNumber) throws InterruptedException {
        sleepFor(2);
        validateByText(flightNumberTextXpathWebElement, flightNumber);
    }

    /**
     * This method checks the flight status for the date of December 30, 2020.
     * @param flightNumber
     */
    public void flightStatusTwoDaysFromNow(String flightNumber) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickOnElementByID(flightStatusTabIDWebElement);
        clickOnElementByID(searchByDateCalenderIDWebElement);
        String getCurrentMonth = getTextByXpath(monthXpathWebElement);
        System.out.println(getCurrentMonth);
        if (getCurrentMonth.equals("September")) {
            clickOnElementByXpath(nextArrowXpathWebElement);
            clickOnElementByXpath(nextArrowXpathWebElement);
        } else {
            clickOnElementByXpath(nextArrowXpathWebElement);
        }
        clickOnElementByXpath(december302020XpathWebElement);
        clickOnElementByCSS(doneButtonCSSWebElement);
        typeByCss(flightNumberFieldCSSWebElement, flightNumber);
        clickOnElementByID(flightStatusSubmitButtonIDWebElement);
    }

    /**
     * This validates that user can check the flight status for December 30, 2020.
     * @throws InterruptedException
     */
    public void validateFlightStatusTwoDaysFromNow(String date) throws InterruptedException {
        sleepFor(3);
        validateByText(flightDateXpathWebElement, date);
    }

    /**
     * This method checks flight statuses based on home airport to destination airport.
     */
    public void flightStatusSearchByAirport(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickOnElementByID(flightStatusTabIDWebElement);
        clickOnElementByXpath(fromFieldXpathWebElement);
        typeByCss(searchCityOrAirportFieldCSSWebElement, "YVR");
        clickOnElementByXpath(yvrXpathWebElement);
        clickOnElementByXpath(toFieldXpathWebElement);
        typeByCss(searchCityOrAirportFieldCSSWebElement, "JFK");
        clickOnElementByXpath(jfkXpathWebElement);
        clickOnElementByID(submitArrowButtonIDWebElement);
    }

    /**
     * This method verifies that user can check flight statuses based on From and Destination airports.
     */
    public void validateFlightStatusSearchByAirport(String text){
        validateByText(departureToDestinationTextXpathWebElement, text);
    }

    /**
     * This method generates an error "please correct the 1 item indicated"  and "Please enter a valid Flight Number.
     * If you do not know the flight number, please enter the origin and destination."
     * by not filling out either the flight number or the From and To airports.
     */
    public void generateErrorByClickingOnSubmitButtonWithoutFlightNumberOrAirports(){
        clickOnElementByID(flightStatusTabIDWebElement);
        clickOnElementByID(submitArrowButtonIDWebElement);
    }

    /**
     * This method validates that the error "please correct the 1 item indicated" is displayed if the user does not
     * fill out either the flight number or the From and To airports.
     * @param alert
     */
    public void validateGenerateErrorByClickingOnSubmitButtonWithoutFlightNumberOrAirports(String alert){
        validateByTextWithClass(pleaseCorrectThe1ItemIndicatedAlertClassWebElement, alert);
    }

    /**
     * This method validates that the error "Please enter a valid Flight Number. If you do not know the flight number,
     * please enter the origin and destination." is displayed if the user does not fill out either the flight number
     * or the From and To airports.
     * @param alert
     */
    public void validateGenerateFlightNumberErrorByClickingOnSubmitButtonWithoutFlightNumberOrAirports(String alert){
        validateByTextWithCSS(flightNumberErrorCSSWebElement, alert);
    }

    /**
     * This method generates an error "Please enter a Departure City' if user does not fill out departure airport.
     */
    public void generateErrorForNotChoosingADepartureCity(){
        clickOnElementByID(flightStatusTabIDWebElement);
        clickOnElementByXpath(toFieldXpathWebElement);
        typeByCss(searchCityOrAirportFieldCSSWebElement, "JFK");
        clickOnElementByXpath(jfkXpathWebElement);
        clickOnElementByID(submitArrowButtonIDWebElement);
    }

    /**
     * This method validates that user receives an error "Please enter a Departure City'
     * if user does not fill out departure airport.
     * @param error
     */
    public void validateGenerateErrorForNotChoosingADepartureCity(String error){
        validateByTextWithCSS(airportErrorCSSWebElement, error);
    }

    /**
     * This method generates an error "Please enter a Departure City' if user does not fill out departure airport.
     */
    public void generateErrorForNotChoosingADestinationAirportOrCity(){
        clickOnElementByID(flightStatusTabIDWebElement);
        clickOnElementByXpath(fromFieldXpathWebElement);
        typeByCss(searchCityOrAirportFieldCSSWebElement, "YVR");
        clickOnElementByXpath(yvrXpathWebElement);
        clickOnElementByID(submitArrowButtonIDWebElement);
    }

    /**
     * This method checks that user can swap departure and destination to check flight statuses.
     */
    public void swapDepartureAndDestinationAirports() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickOnElementByID(flightStatusTabIDWebElement);
        clickOnElementByXpath(fromFieldXpathWebElement);
        typeByCss(searchCityOrAirportFieldCSSWebElement, "YVR");
        clickOnElementByXpath(yvrXpathWebElement);
        clickOnElementByXpath(toFieldXpathWebElement);
        typeByCss(searchCityOrAirportFieldCSSWebElement, "JFK");
        clickOnElementByXpath(jfkXpathWebElement);
        sleepFor(2);
        clickOnElementByXpath(swapAirportsXpathWebElement);
        clickOnElementByID(submitArrowButtonIDWebElement);
    }

}
