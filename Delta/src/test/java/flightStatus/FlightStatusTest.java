package flightStatus;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static flightStatus.FlightStatusWebElements.canadaEnglishXpathWebElement;

public class FlightStatusTest extends CommonAPI {
    FlightStatus flightStatus;

    @BeforeMethod
    public void getInit() {
        flightStatus = PageFactory.initElements(driver, FlightStatus.class);
        driver.manage().window().maximize();
        if (elementIsDisplayed(canadaEnglishXpathWebElement)) {
            clickOnElementByXpath(canadaEnglishXpathWebElement);
        }
    }

    /**
     * This test verifies that user can check the flight status using flight number.
     *
     * @throws InterruptedException
     */
    @Test
    public void testValidateCheckFlightStatus() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String flightNumber = "DL4479";
        flightStatus.checkFlightStatus(flightNumber);
        flightStatus.validateCheckFlightStatus(flightNumber);
    }

    /**
     * This method tests that user can successfully check the flight status for December 30,2020.
     * @throws InterruptedException
     */
    @Test
    public void testValidateFlightStatusTwoDaysFromNow() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String flightNumber = "DL0409";
        flightStatus.flightStatusTwoDaysFromNow(flightNumber);
        flightStatus.validateFlightStatusTwoDaysFromNow("Wednesday, December 30, 2020| Modify Search");
    }

    /**
     * This test verifies that user can check flight statuses based on From and Destination airports.
     */
    @Test
    public void testValidateFlightStatusSearchByAirport(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        flightStatus.flightStatusSearchByAirport();
        flightStatus.validateFlightStatusSearchByAirport("Vancouver, BC (YVR) to New York-Kennedy, NY (JFK)");
    }

    /**
     * This test validates that the error "please correct the 1 item indicated" is displayed if the user does not
     * fill out either the flight number or the From and To airports.
     */
    @Test
    public void testValidateGenerateErrorByClickingOnSubmitButtonWithoutFlightNumberOrAirports() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        flightStatus.generateErrorByClickingOnSubmitButtonWithoutFlightNumberOrAirports();
        flightStatus.validateGenerateErrorByClickingOnSubmitButtonWithoutFlightNumberOrAirports("please correct the 1 item indicated");
    }

    /**
     * This test validates that the error "Please enter a valid Flight Number. If you do not know the flight number,
     * please enter the origin and destination." is displayed if the user does not fill out either the flight number
     * or the From and To airports.
     */
    @Test
    public void testValidateGenerateFlightNumberErrorByClickingOnSubmitButtonWithoutFlightNumberOrAirports() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        flightStatus.generateErrorByClickingOnSubmitButtonWithoutFlightNumberOrAirports();
        flightStatus.validateGenerateFlightNumberErrorByClickingOnSubmitButtonWithoutFlightNumberOrAirports("Please enter a valid Flight Number. If you do not know the flight number, please enter the origin and destination.");
    }

    /**
     * This test verifies that user receives an error 'Please enter a Departure City'
     * if user does not fill out departure airport.
     */
    @Test
    public void testValidateGenerateErrorForNotChoosingADepartureCity(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        flightStatus.generateErrorForNotChoosingADepartureCity();
        flightStatus.validateGenerateErrorForNotChoosingADepartureCity("Please enter a Departure City");
    }

    /**
     * This test verifies that user receives an error 'Please enter a Destination City'
     * if user does not fill out departure airport.
     */
    @Test
    public void testValidateGenerateErrorForNotChoosingADestinationCity(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        flightStatus.generateErrorForNotChoosingADestinationAirportOrCity();
        flightStatus.validateGenerateErrorForNotChoosingADepartureCity("Please enter a Destination City");
    }

    /**
     * This test verifies that user can swap departure and destination to check flight statuses.
     *
     * @throws InterruptedException
     */
    @Test
    public void testSwapDepartureAndDestinationAirports() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        flightStatus.swapDepartureAndDestinationAirports();
        flightStatus.validateFlightStatusSearchByAirport("New York-Kennedy, NY (JFK) to Vancouver, BC (YVR)");
    }


}
