package flightStatus;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

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
    public void validateFlightStatusTwoDaysFromNow() throws InterruptedException {
        sleepFor(3);
        validateByText(flightDateXpathWebElement, "Wednesday, December 30, 2020| Modify Search");
    }


}
