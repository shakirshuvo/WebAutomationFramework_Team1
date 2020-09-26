package home;

public class UHomePageWebElements {
    // brokers tab
    public static final String forBrokersElement = "/html/body/div[1]/div/div[1]/header/div/div[1]/div[1]/div/div[1]/ul/li[4]/a";
    public static final String brokersTextElement = "//*[@id=\"main-content\"]/div[1]/div/div[1]/h1";
    public static final String brokersExpectedText = "Brokers: We're committed to helping you succeed. | UnitedHealthcare";

    //find a doctor tab
    public static final String searchBoxElement = "//*[@id=\"search-desktop\"]";
    public static final String searchButtonElement = "//*[@id=\"search__button\"]";
    public static final String searchString = "find a doctor";
    public static final String resultsElement = "//*[@id=\"search-results-count__header\"]/span";
    public static final String resultsExpectedText = "1-20 of 481 results for find a doctor";

    // medicare element
    public static final String medicareElementXPath = "/html/body/div[1]/div/div[1]/header/div/div[1]/div[1]/div/div[1]/ul/li[1]/a";
    public static final String medicareExpectedTitleText = "Medicare health insurance plans | UnitedHealthcare";

    //for Providers tab
    public static final String forProvidersElementXPath = "/html/body/div[1]/div/div[1]/header/div/div[1]/div[1]/div/div[1]/ul/li[2]/a";
    public static final String forProviderExpectedTitleText = "Health insurance plans for individuals & families, employers, medicare | UnitedHealthcare";

    //for employers tab
    public static final String forEmployersElementXPath = "/html/body/div[1]/div/div[1]/header/div/div[1]/div[1]/div/div[1]/ul/li[3]/a";
    public static final String forEmployersExpectedText = "Health insurance for employers | UnitedHealthcare";


    //header elements
    public static final String insuranceElementXpath = "//header//div[3]/div/div[1]/nav/ul/li[1]/button";
    public static final String verifierElementXpath = "//*[@id=\"flyoutId-0flyout-col-4\"]//div/p";

    // elements under insurance
    public static final String allBusinessElementXpath = "//*[@id=\"flyoutId-0flyout-col-2\"]//div/ul/li[1]/a";
    public static final String smallBusinessElementXpath = "//*[@id=\"flyoutId-0flyout-col-2\"]//ul/li[2]/a";
    public static final String nationalAccountsBusinessElementXpath = "//*[@id=\"flyoutId-0flyout-col-2\"]//div//li[4]/a";
    public static final String groupRetireeBusinessElementXpath = "//*[@id=\"flyoutId-0flyout-col-2\"]//div/ul/li[5]/a";




}
