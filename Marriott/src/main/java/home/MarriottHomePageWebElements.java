package home;

public class MarriottHomePageWebElements {

    //language selector
    public static final String languageSelectorElementXpath = "//span[text()='English']";
    public static final String selectLanguageVerifierElementXpath = "//h3[text()='Please select your preferred language']";

    //Find and Reserve
    //public static final String  findAndReserveLinkTextWebElement = "Find & Reserve";
    public static final String findAndReserveWebElementXPath = "//p[text()='Find & Reserve']";
    public static final String  destinationXPathWebElement = "//*[@id=\"edit-search-form\"]/div/div[1]/label";
    public static final String destinationExpectedText = "Hotels & Resorts | Book your Hotel directly with Marriott";

    // search under find and reserve
    public static final String searchBoxFindNReseveXpath = "//input[@id=\"FT8M1YER_search-location\"]";
    public static final String fromDateXpath = "//input[@id=\"FT8M1YER_hotel-fromDate\"]";
    //public static final String endDateXpath = "//input[@id=\"FT8M1YER_hotel-toDate\"]";
         public static final String startDay = "//*[@id=\"edit-search-form\"]//a[@aria-label='Add Rooms']";
         public static final String endDay = "//*[@id=\"edit-search-form\"]//td[@data-t-date='1604030400000']";
    public static final String roomNGuestsXpath = "//*[@id=\"edit-search-form\"]/div/div[5]/div[1]/a";

        public static final String roomsXpath = "//*[@id=\"edit-search-form\"]//a[@aria-label='Add Rooms']";
    public static final String  specialRatesXpath = "//*[@id=\"edit-search-form\"]/div/div[6]/a";
        public static final String seniorDiscountXpath = "//label[text()='Senior Discount' and @for='FT8M1YER_S9R']";
    public static final String  usePointsCheckBoxXpath = "//input[@name='useRewardsPoints' and @tabindex='0']";
    public static final String findHotelsButtonUnderFndNRsrveXpath = "//*[@id=\"edit-search-form\"]/div/div[8]/button";

    //validation element
    public static final String tryTheseFiletersXpath = "//p[text()=' Try these filters: ']";

    // meetings and events
    public static final String meetingsNEventsWebElementXPath = "//p[text()='Meetings & Events']";
    public static final String meetingsOverviewWebElementXPath = "//a[text()=' Meetings & Events Overview ']";
    public static final String businessMeetingsOverviewElementXpath = "//h3[text()='Business Meetings']";
    public static final String businessMeetingsElementXpath = "//a[text()=' Business Meetings ']";

    //weddings element
    public static final String weddingsElementXpath = "//a[text()=' Weddings ']";
    public static final String planningElementXpath = "//p/a[text()='Planning']";
    public static final String ceremoniesElementXpath = "//p/a[text()='Ceremonies']";
    public static final String receptionsElementXpath = "//p/a[text()='Receptions']";
    public static final String diningElementXpath = "//p/a[text()='Dining']";
    public static final String accomodationsElementXpath = "//p/a[text()='Accommodations']";

    //scroll right element
    public static final String scrollRightElementXpath = "//span[@class='l-padding-right-three-quarters t-icon-arrow-right']";
    public static final String destinationsUnderWeddingsElementXpath = "//p/a[text()='Destinations']";

    public static final String socialEventsElementXpath = "//a[text()=' Social Events ']";

    public static final String groupTravelElementXpath = "//a[text()=' Group Travel ']";



    // Deals & Packages
    public static final String dealsAndPackagesXPathWebElement = "//p[text()='Deals & Packages']";
    public static final String exclusiveGetAwaysElementXpath = "//*[@id=\"CardArticlec947\"]/section/div[2]/div[1]/h4";
    public static final String exclusiveExpectedText = " Exclusive getaways, member offers & more";

    // Explore Destinations
    public static final String exploreDestinationELementXpath = "//p[text()='Explore Destinations']";
    public static final String exploreAllElementXpath = "//*[@id=\"themeFilter6982\"]/div/div/div/ul/li[1]/a";
    public static final String exploreAllExpectedText = "Leisure Explore";

    //our brands
    public static final String ourBrandsELementXpath = "//p[text()='Our Brands']";
    public static final String ritzElementXpath = "//a[@href='https://www.ritzcarlton.com/']";
    public static final String ritzExpectedText = "The Ritz-Carlton";

    public static final String editionElementXpath = "//li/a[@href='https://www.editionhotels.com/']";
    public static final String stRegisElementXpath = "//li/a[@href='https://st-regis.marriott.com/']";
    public static final String wHotelsElementXpath = "//li/a[@href='https://w-hotels.marriott.com/']";

    public static final String jWHotelsElementXpath = "//li/a[@href='https://jw-marriott.marriott.com/']";
    public static final String deltaHotelsElementXpath = "https://delta-hotels.marriott.com/ ";
    public static final String leMeridienElementXpath = "//li/a[@href='https://le-meridien.marriott.com/']";
    public static final String westinElementXpath = "//li/a[@href='https://westin.marriott.com/']";

    public static final String aboutRitzCarltonElementXpath = "//a[text()='About The Ritz-Carlton']";
    public static final String aboutRitzExpectedText = "About The Ritz-Carlton";

    //our credit cards element
    public static final String ourCreditCardsElementXpath = "//p[text()='Our Credit Cards']";
    public static final String maximizeRewardsElementXpath = "//h2[text()='Maximize Your Rewards']";
    public static final String rewardsExpectedText = "Earn Points with Purchases";

    // My Trips element
    public static final String myTripslinKTextElement = "My Trips";

    //find hotels
   // destination/ attraction search bar
   public static final String searchBarXpath = "//input[@data-target='destination']";
   public static final String allFiltersXpath  = "//*[@id=\"SearchFilter227a\"]/div/a/span[2]";
   public static final String roomsAndGuestsXpath = "//a[@data-target='roomsAndGuests']";
   public static final String findHotelsButtonXpath = "/html/body/div[5]/div/div[1]/section[1]/div/div/div/div/div[1]/form/div[2]/div[6]/button";   //button[@type='submit']";
   public static final String searchKeys = "Paris, France";


   // footer elements
    //public static final String topDestination;

}
