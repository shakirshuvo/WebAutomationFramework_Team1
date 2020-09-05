package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static home.MarriottHomePageWebElements.*;

public class MarriottHomePage extends CommonAPI {

    @FindBy(how = How.XPATH, using = languageButtonXPath) public WebElement languageButton;
    @FindBy(how = How.XPATH, using = languageDeutschXPath) public WebElement languageDeutsch;
    @FindBy(how = How.XPATH, using = languageEspanolXPath) public WebElement languageEspanol;
    @FindBy(how = How.CSS, using = destinationInputBoxXPath) public WebElement destinationInputBox;
    @FindBy(how = How.XPATH, using = dateFromBoxXPath) public WebElement dateFromBox;
    @FindBy(how = How.XPATH, using = calendarNextXPath) public WebElement calendarNext;
    @FindBy(how = How.XPATH, using = dateFromXPath) public WebElement dateFrom;
    @FindBy(how = How.XPATH, using = dateToBoxXPath) public WebElement dateToBox;
    @FindBy(how = How.XPATH, using = dateToXPath) public WebElement dateTo;
    @FindBy(how = How.XPATH, using = roomsAndGuesXPath) public WebElement roomsAndGues;
    @FindBy(how = How.XPATH, using = roomPlusXPath) public WebElement roomPlus;
    @FindBy(how = How.XPATH, using = roomMinusXPath) public WebElement roomMinus;
    @FindBy(how = How.XPATH, using = guestPlusXPath) public WebElement guestPlus;
    @FindBy(how = How.XPATH, using = guestMinusXPath) public WebElement guestMinus;
    @FindBy(how = How.XPATH, using = childPlusXPath) public WebElement childPlus;
    @FindBy(how = How.XPATH, using = childMinusXPath) public WebElement childMinus;
    @FindBy(how = How.XPATH, using = specialRateXPath) public WebElement specialRate;
    @FindBy(how = How.XPATH, using = corporatePromoXPath) public WebElement corporatePromo;
    @FindBy(how = How.XPATH, using = usePointCheckBoxXPath) public WebElement usePointCheckBox;
    @FindBy(how = How.XPATH, using = findHotelXPath) public WebElement findHotel;



    // Action Method
    public void checkDeutsch() {
        languageButton.click();
        languageDeutsch.click();
    }

    // Validation Method
    public void validateDeutsch(){

    }
    //*********************************************

    // Action Method
    public void checkEspanol() {
        languageButton.click();
        languageEspanol.click();
    }

    // Validation Method
    public void validateEspanol(){

    }
    //*********************************************

    // Action Method
    public void checkDestinationBox() throws InterruptedException {
        destinationInputBox.click();
        sleepFor(9);
        destinationInputBox.clear();
        destinationInputBox.sendKeys("Dhaka, Bangladesh");
    }

    // Validation Method
    public void validateDestinationBox(){

    }
    //*********************************************

    // Action Method
    public void checkCalendar() {
        dateFromBox.click();
        calendarNext.click();
        calendarNext.click();
        dateFrom.click();
        dateTo.click();
    }

    // Validation Method
    public void validateCalendar(){

    }
    //*********************************************

    // Action Method
    public void checkNumberOfRooms() {
        dateFromBox.click();
        roomsAndGues.click();
        roomPlus.click();
        roomMinus.click();
    }

    // Validation Method
    public void validateNumberOfRooms(){

    }
    //*********************************************

    // Action Method
    public void checkAdultGuestNumber() {
        dateFromBox.click();
        roomsAndGues.click();
        guestPlus.click();
        guestMinus.click();
    }

    // Validation Method
    public void validateAdultGuestNumber(){

    }
    //*********************************************

    // Action Method
    public void checkChildGuest() {
        dateFromBox.click();
        roomsAndGues.click();
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
        roomsAndGues.click();
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
        roomsAndGues.click();
        usePointCheckBox.click();
    }

    // Validation Method
    public void validateUsePointCheckBox(){

    }
    //*********************************************

    // Action Method
    public void checkHotelFindingProcess() throws InterruptedException {

//        destinationInputBox.click();
//        sleepFor(9);
//        destinationInputBox.clear();
//        destinationInputBox.sendKeys("Dhaka, Bangladesh");
        dateFromBox.click();
        calendarNext.click();
        calendarNext.click();
        dateFrom.click();
        dateTo.click();
        roomsAndGues.click();
        roomPlus.click();
        guestPlus.click();
        childPlus.click();
        specialRate.click();
        corporatePromo.click();
        usePointCheckBox.click();
        findHotel.click();
    }

    // Validation Method
    public void validateHotelFindingProcess(){

    }
    //*********************************************
}
