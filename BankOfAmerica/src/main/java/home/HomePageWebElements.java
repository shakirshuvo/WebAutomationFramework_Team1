package home;

import com.mysql.cj.util.DnsSrv;

public class HomePageWebElements {

    // sign in
    public static final String onlineIdTextWebElementXPath = "//*[@id=\"onlineId1\"]";
    public static final String passcodeTextWebElementXPath = "//*[@id=\"passcode1\"]";
    public static final String signInBtnWebElementXPath = "//*[@id=\"signIn\"]";
    public static final String saveOnlineIdCheckboxElementXPath = "//*[@id=\"saveOnlineId\"]";

    public static final String fakeOnlineId = "chaddhar";
    public static final String fakePassword = "1227Chaddhar";


    public static final String advantageBankingTextWebElementXPath = "//a[text()='Bank of America Advantage Banking']";
    public static final String advantageBankingExpectedText = "Bank of America Advantage Banking";

    public static final String exploreCheckingSolutionsWebElementID = "exploreCheckingSolutions";
    public static final String enterZipCoderWebElementXPath = "//*[@id=\"zipCodeModalInputField\"]";
    public static final String goZipCodeButtonWebElementID = "go-button-zip-modal";
    public static final String exploreCheckingExpectedText = "Bank of America Advantage Banking - A Flexible Checking Account";

    // personal
    public static final String personalWebElementID = "NAV_PERSONAL";
    public static final String hereToHelpWebElementXPath ="//div[@id=\"bmhModule\"]/div[1]/h2";
    public static final String heretoHelpExpectedText = "We’re here to help with what's next.";

    //open personal/ open account
    public static final String openAccountWEXPath = "//*[@id=\"DCTAHZ5O\"]/div/div[2]/div/span/span";
    public static final String safeBalanceBankingXPath = "//*[@id=\"product-details\"]/div/div[1]/div[1]/h2[2]";
    public static final String safeBalanceExpectedText = "SafeBalance Banking®";

    //small Business elements
    public static final String smallBusinessWEXPath = "//*[@id=\"NAV_BUSINESS_ADVANTAGE\"]";
    public static final String yourNewsWBECss = "#newsInformationModule > div.row > div > h2";
    public static final String smExpectedText = "Your news and information";

    // wealth management
    public static final String wealthManagementElementXPath = "//*[@id=\"NAV_WEALTH_MANAGEMENT\"]";
    public static final String wmTagXPath = "/html/body/header/div[3]/div/span";
    public static final String wmExpectedText = "Wealth Management";

    // business and institutions
    public static final String businessInstElementXPath = "//*[@id=\"NAV_BUSINESS_INSTITUTIONS\"]";
    public static final String economicsOfReopeningXPath = "//*[@id=\"full_click\"]/a/div/div/h1";
    public static final String erExpectedText  = "The Economics of Reopening";

    // security tab on homepage
    public static final String securityElementXPath = "//a[@id=\"NAV_SECURITY\"]";


    //about us
    public static final String aboutUsElementXPath = "//*[@id=\"NAV_ABOUT_US\"]";
    public static final String whoWeArElementID = "\"who-we-are\"";
    public static final String whoExpectedText = "Who we are";


    // Checking
    public static final String checkingWebElementXPath = "//*[@id=\"navChecking\"]";
    public static final String stayFlexibleTextWebElementXPath = "//p[text()='Stay flexible with Bank of']";
    public static final String stayFlexibleExpectedText = "Stay flexible with Bank of";
    //public static final String stayFlexibleTextWebElementID = "advantageBanking";
    // public static final String checkingExpectedText = "Bank of America - Banking, Credit Cards, Loans and Merrill Investing";


    //Savings
    public static final String savingsWebElementXPath = "//a[@id=\"navSavings\"]";











}
