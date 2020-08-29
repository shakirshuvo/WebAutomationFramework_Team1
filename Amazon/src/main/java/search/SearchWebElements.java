package search;

import com.github.javafaker.Faker;

public class SearchWebElements {

    static Faker faker = new Faker();

    public static final String randomBookSearch = faker.book().title();
    public static final String expectedRandomBookSearchURL = "https://www.amazon.com/s?k=" + randomBookSearch.replace(" ", "+") + "&i=stripbooks-intl-ship&ref=nb_sb_noss";
    public static final String expectedRandomBookSearchTitle = "Amazon.com : " + randomBookSearch;
    public static final String searchFieldIDWebElement = "twotabsearchtextbox";
    public static final String searchButtonXPathWebElement = "//*[@id=\"nav-search-submit-text\"]/input";
    public static final String searchVerificationTextXPathWebElement = "//span[text()='\"Hand Sanitizer\"']";
    public static final String allDropDownSearchIDWebElement = "searchDropdownBox";
    public static final String booksOnAllDropDownXpathWebElement = "//*[@id=\"searchDropdownBox\"]/option[6]";
    public static final String brandCheckBoxPurellXPathWebElement = "//span[text()='Purell']";
    public static final String purellAdvancedHandSanitizerPackOf250XPathWebElement = "//span[text()='PURELL Advanced Hand Sanitizer Refreshing Gel, Clean Scent, 1 fl oz Flip-Cap Bottle (Pack of 250) – 3901-2C-250']";


}
