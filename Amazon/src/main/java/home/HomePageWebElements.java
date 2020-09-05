package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageWebElements {

    public static final String searchBoxCSS = "#twotabsearchtextbox";
    public static final String searchButtonCSS = "#nav-search > form > div.nav-right > div > input";
    public static final String searchTextXPath = "//*[text()='\"Mask\"']";
    public static final String bestSellerCSS = "#nav-xshop > a:nth-child(2)";
    public static final String newReleasesCSS = "#zg_tabs > ul > li:nth-child(2) > div > a";
    public static final String moversAndShakersCSS ="#zg_tabs > ul > li:nth-child(3) > div > a";
    public static final String mostWishedForCSS = "#zg_tabs > ul > li.zg_selected > div > a";
    public static final String giftIdeasCSS = "#zg_tabs > ul > li:nth-child(5) > div > a";
    public static final String customerServiceCSS = "#nav-xshop > a:nth-child(3)";
    public static final String todaysDealCSS = "#nav-xshop > a:nth-child(4)";
    public static final String newReleases1CSS ="#nav-xshop > a:nth-child(5)";
    public static final String newGamesCSS = "#zg_left_col1 > div:nth-child(1) > div.zg_homeListLink > a";
    public static final String newPCGamesCSS = "#zg_browseRoot > ul > ul > li:nth-child(1) > a";
    public static final String newVideoGamesCSS = "#zg_browseRoot > ul > li > span";
    public static final String newPlayStation3CSS = "#zg_browseRoot > ul > ul > li:nth-child(2) > a";
    public static final String newXbox360CSS = "#zg_browseRoot > ul > ul > li:nth-child(3) > a";
    public static final String newNintendoDSCSS = "#zg_browseRoot > ul > ul > li:nth-child(4) > a";
    public static final String newWiiCSS = "#zg_browseRoot > ul > ul > li:nth-child(5) > a";
    public static final String newWiiUCSS = "#zg_browseRoot > ul > ul > li:nth-child(6) > a";
    public static final String newPlayStationVistaCSS = "#zg_browseRoot > ul > ul > li:nth-child(7) > a";
    public static final String newNintendo3DSCSS = "#zg_browseRoot > ul > ul > li:nth-child(8) > a";
    public static final String newXboxOneCSS = "#zg_browseRoot > ul > ul > li:nth-child(9) > a";
    public static final String newPlayStation4CSS = "#zg_browseRoot > ul > ul > li:nth-child(10) > a";
    public static final String newSonyPSPCSS = "#zg_browseRoot > ul > ul > li:nth-child(11) > a";
    public static final String macGamesCSS = "#zg_browseRoot > ul > ul > li:nth-child(12) > a";
    public static final String moreSystemsCSS = "#zg_browseRoot > ul > ul > li:nth-child(13) > a";
    public static final String newNintendoSwitchCSS = "#zg_browseRoot > ul > ul > li:nth-child(14) > a";
    public static final String microconsolesCSS = "#zg_browseRoot > ul > ul > li:nth-child(15) > a";
    public static final String findAGiftCSS = "#nav-xshop > a:nth-child(6)";
    public static final String wholeFoodCSS = "#nav-xshop > a:nth-child(7)";
    public static final String wholeFoodBeveragesCSS = "#nav-subnav > a:nth-child(6) > span.nav-a-content";
    public static final String giftCardsCSS = "#nav-xshop > a:nth-child(8)";


    @FindBy(how = How.CSS, using = searchBoxCSS) public static WebElement searchBox;
}


