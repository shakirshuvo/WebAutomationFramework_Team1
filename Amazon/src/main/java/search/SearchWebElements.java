package search;

import base.CommonAPI;
import com.github.javafaker.Faker;

public class SearchWebElements extends CommonAPI {

    static Faker faker = new Faker();

    public static final String randomBookSearch = faker.book().title();
    public static final String expectedRandomBookSearchURL = "https://www.amazon.com/s?k=" + randomBookSearch.replace(" ", "+") + "&i=stripbooks-intl-ship&ref=nb_sb_noss";
    public static final String expectedRandomBookSearchTitle = "Amazon.com : " + randomBookSearch;
    public static final String searchFieldIDWebElement = "twotabsearchtextbox";
    public static final String searchButtonXPathWebElement = "//*[@id=\"nav-search-submit-text\"]/input";
    public static final String searchTextXpathWebElement = "//span[@class='a-color-state a-text-bold']\"";
    public static final String searchVerificationTextXPathWebElement = "//span[text()='\"Hand Sanitizer\"']";
    public static final String allDropDownSearchIDWebElement = "searchDropdownBox";
    public static final String booksOnAllDropDownXpathWebElement = "//*[@id=\"searchDropdownBox\"]/option[6]";
    public static final String brandCheckBoxPurellXPathWebElement = "//span[text()='Purell']";
    public static final String purellTextXPathWebElement = "//span[@class='a-color-base a-text-bold' and text()='Purell']";
    public static final String moviesAndTVOnAllDropDownXpathWebElement = "//span[text()='Movies & TV']";


}
