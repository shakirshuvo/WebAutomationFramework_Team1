package search;

public class SearchWebElements {
    public static final String searchButtonElementXpath = "//app-home/ngc-global-nav//div/div[2]/ngc-search";
    public static final String popularTopicsElementXpath = "//span[text()='Popular Topics']";

    public static final String searchBoxElementXpath = "//input[@id=\"search_input\"]";
    public static final String searchFlights = "flights";
    public static final String searchResultsElement = "//div[@id=\"resultContWrap\"]//div[@class='searchPageHeader']";
   // public static final String chroPath = "//div[@class='searchPageHeader'][contains(text(),'Search Results')]";

    //search button sub selections
    //coronavirus tab
    public static final String coronaVirusElement = "//ngc-flyout-search//li/a[text()='Coronavirus']";
    public static final String coronaUpdateCenterElement = "//*[@id=\"maincontent\"]/div[1]/div/div/div/div/div[1]/span";

    //face mask tab
    public static final String faceMaskElementXpath = "//ngc-flyout-search//li/a[text()='Face Mask']";

    // eCredits
    public static final String eCreditsElementXpath = "//ngc-flyout-search//li/a[text()='eCredits']";
    // change flight
    public static final String changeFlightElementXpath = "//ngc-flyout-search//li/a[text()='Change Flight']";
    public static final String changeFlightText = "//*[@id=\"maincontent\"]/div[1]//span/h1";

    // cancel flight element
    public static final String cancelFlightElementXpath = "//ngc-flyout-search//li/a[text()='Cancel Flight']";

    // receipts element under search options
    public static final String recieptsElementXpath = "//ngc-flyout-search//li/a[text()='Receipts']";

    // refunds element
    public static final String refundsElement = "//ngc-flyout-search//li/a[text()='Refunds']";

    // baggage element
    public static final String baggageElement = "//ngc-flyout-search//li/a[text()='Baggage']";

    // pets under search button element
    public static final String petsElement = "//ngc-flyout-search//li/a[text()='Baggage']";



}
