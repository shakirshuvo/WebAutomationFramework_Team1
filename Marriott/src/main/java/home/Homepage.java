package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static home.HomepageWebElements.*;
import static home.HomepageWebElements.findHotelXPath;

public class Homepage extends CommonAPI {

    @FindBy(how = How.CSS, using = languageButtonCSS)
    public WebElement languageButton;
    @FindBy(how = How.XPATH, using = languageCrossBoxXPath)
    public WebElement languageCrossBox;
    @FindBy(how = How.XPATH, using = languageDeutschXPath)
    public WebElement languageDeutsch;
    @FindBy(how = How.XPATH, using = languageEspanolXPath)
    public WebElement languageEspanol;
    @FindBy(how = How.XPATH, using = destinationInputBoxXPath)
    public WebElement destinationInputBox;
    @FindBy(how = How.XPATH, using = dateFromBoxXPath)
    public WebElement dateFromBox;
    @FindBy(how = How.XPATH, using = calendarNextXPath)
    public WebElement calendarNext;
    @FindBy(how = How.XPATH, using = dateFromXPath)
    public WebElement dateFrom;
    @FindBy(how = How.XPATH, using = dateToBoxXPath)
    public WebElement dateToBox;
    @FindBy(how = How.XPATH, using = dateToXPath)
    public WebElement dateTo;
    @FindBy(how = How.XPATH, using = roomsAndGuesXPath)
    public WebElement roomsAndGuest;
    @FindBy(how = How.XPATH, using = roomPlusXPath)
    public WebElement roomPlus;
    @FindBy(how = How.XPATH, using = roomMinusXPath)
    public WebElement roomMinus;
    @FindBy(how = How.XPATH, using = guestPlusXPath)
    public WebElement guestPlus;
    @FindBy(how = How.XPATH, using = guestMinusXPath)
    public WebElement guestMinus;
    @FindBy(how = How.XPATH, using = childPlusXPath)
    public WebElement childPlus;
    @FindBy(how = How.XPATH, using = childMinusXPath)
    public WebElement childMinus;
    @FindBy(how = How.XPATH, using = specialRateXPath)
    public WebElement specialRate;
    @FindBy(how = How.XPATH, using = corporatePromoXPath)
    public WebElement corporatePromo;
    @FindBy(how = How.XPATH, using = usePointCheckBoxXPath)
    public WebElement usePointCheckBox;
    @FindBy(how = How.XPATH, using = findHotelXPath)
    public WebElement findHotel;



    // Action Method
    public void checkDeutsch() {
        languageButton.click();
        languageDeutsch.click();
    }

    public void validateDeutsch(){

    }

    public void checkEspanol() {
        languageButton.click();
        languageEspanol.click();
    }

    public void validateEspanol(){

    }

    public void checkDestinationBox() throws InterruptedException {
        destinationInputBox.click();
        sleepFor(10);
        destinationInputBox.clear();
        destinationInputBox.sendKeys("Dhaka, Bangladesh");
    }

    public void validateDestinationBox(){

    }

    public void checkCalendar() {
        dateFromBox.click();
        calendarNext.click();
        calendarNext.click();
        dateFrom.click();
        dateTo.click();
    }

    public void validateCalendar(){

    }

    public void checkNumberOfRooms() {
        dateFromBox.click();
        roomsAndGuest.click();
        roomPlus.click();
        roomMinus.click();
    }

    // Validation Method
    public void validateNumberOfRooms(){

    }


    public void checkAdultGuestNumber() {
        dateFromBox.click();
        roomsAndGuest.click();
        guestPlus.click();
        guestMinus.click();
    }

    // Validation Method
    public void validateAdultGuestNumber(){

    }

    // Action Method
    public void checkChildGuest() {
        dateFromBox.click();
        roomsAndGuest.click();
        childPlus.click();
        childMinus.click();
    }

    // Validation Method
    public void validateChildGuest(){

    }
    //*********************************************

    // Action Method
    public void checkSpecialRate() {
        dateFromBox.click();
        roomsAndGuest.click();
        specialRate.click();
        corporatePromo.click();
    }

    // Validation Method
    public void validateSpecialRate(){

    }
    //*********************************************

    // Action Method
    public void checkUsePointCheckBox() {
        dateFromBox.click();
        roomsAndGuest.click();
        usePointCheckBox.click();
    }

    // Validation Method
    public void validateUsePointCheckBox(){

    }
    //*********************************************

    public void checkHotelFindingProcess() throws InterruptedException {

        dateFromBox.click();
        calendarNext.click();
        calendarNext.click();
        dateFrom.click();
        dateTo.click();
        roomsAndGuest.click();
        roomPlus.click();
        guestPlus.click();
        childPlus.click();
        specialRate.click();
        corporatePromo.click();
        usePointCheckBox.click();
        destinationInputBox.click();
        sleepFor(10);
        destinationInputBox.clear();
        destinationInputBox.sendKeys("Khulna, Bangladesh");
        findHotel.click();
    }

    public void validateHotelFindingProcess(){

    }

}
