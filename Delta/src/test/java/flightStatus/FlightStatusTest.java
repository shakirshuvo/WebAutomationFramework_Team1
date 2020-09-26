package flightStatus;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
     * @throws InterruptedException
     */
    @Test
    public void testValidateCheckFlightStatus() throws InterruptedException {
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
        String flightNumber = "DL0409";
        flightStatus.flightStatusTwoDaysFromNow(flightNumber);
        flightStatus.validateFlightStatusTwoDaysFromNow();
    }



}
