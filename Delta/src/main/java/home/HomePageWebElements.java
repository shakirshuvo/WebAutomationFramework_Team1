package home;

import org.seleniumhq.jetty9.server.PushBuilder;

import javax.xml.transform.sax.SAXResult;

public class HomePageWebElements {
    //public static final String vaccationDealsElementXpath = "//span[text()='Vacation Deals']"
    public static final String vaccationDealsElementXpath = "//span[text()='Vacation Deals']";
    public static final String bookElementCSS = "#headPrimary1";
    public static final String fromOriginElementCSS = "//a[@id=\"fromAirportName\"]/span[1]";

    //check in
    public static final String checkInElementCSS = "#headPrimary2";
    public static final String findtripByElementXpath = "//div[@id=\"primaryPanel2\"]//label[2]";

    //my trips
    public static final String myTripsCSS = "#headPrimary3";
    public static final String  myTripsDropDownElementXpath = "//div[@id=\"primaryPanel3\"]//*[@role='combobox']";
    public static final String searchTripfirstNameXpath = "//*[@id=\"firstName\"]";
    public static final String firstName = "Lionel";
    public static final String searchTripLastNameCss = "#lastName";
    public static final String lastName = "Messi";
    public static final String eTicketNumberXpath = "//input[@id='eTicketNo']";
    public static final String dropDownSelection = "Ticket Number";
    public static final String dropDownSelectionLocatorID = "ui-list-searchOption2";
    public static final String ticketNumber = "89160289160245";
    public static final String myTripSubmitBtnID = "btn-mytrip-submit";
    public static final String tripDetialsElementID = "bc-pg-tripDetails_current_top";

    //flight Status
    public static final String flightStatusXpath= "//*[@id=\"headPrimary4\"]";
    public static final String statusByDateCSS = "#searchBydateLbl";

    // sign up
    public static final String signUpElementXpath = "//a[text() = 'Sign Up']";




}
