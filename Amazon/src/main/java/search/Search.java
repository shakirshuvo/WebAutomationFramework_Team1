package search;

import base.CommonAPI;
//import datadriven.DataSource;
import dataSupply.DataSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static search.SearchWebElements.*;

public class Search extends CommonAPI {

    @FindBy(how = How.ID, using = searchFieldIDWebElement)
    public WebElement searchField;
    @FindBy(how = How.XPATH, using = searchButtonXPathWebElement)
    public WebElement searchButton;
    @FindBy(how = How.XPATH, using = searchVerificationTextXPathWebElement)
    public WebElement searchVerificationText;
    @FindBy(how = How.ID, using = allDropDownSearchIDWebElement)
    public WebElement allDropDownSearch;
    @FindBy(how = How.XPATH, using = booksOnAllDropDownXpathWebElement)
    public WebElement booksOnAllDropDown;
    @FindBy(how = How.XPATH, using = brandCheckBoxPurellXPathWebElement)
    public WebElement brandCheckBoxPurell;
    @FindBy(how = How.XPATH, using = purellTextXPathWebElement)
    public WebElement purellText;
    @FindBy(how = How.XPATH, using = moviesAndTVOnAllDropDownXpathWebElement)
    public WebElement moviesAndTVOnAllDropDown;
    @FindBy(how = How.XPATH, using = searchTextXpathWebElement)
    public WebElement searchText;


    /**
     * This method enters a String in Amazon search field.
     *
     * @param searchItem The user must provide a String value to be searched.
     */
    public void typeOnSearchField(String searchItem) {
        searchField.sendKeys(searchItem);
    }

    /**
     * This method clicks on the Amazon search button.
     */
    public void clickOnSearchButton() {
        searchButton.click();
    }

    /**
     * This method submits search without clicking on the search button.
     */
    public void submitSearch() {
        searchField.submit();
    }

    /**
     * This method searches "Hand Sanitizer" on Amazon search.
     */
    public void searchHandSanitizer() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        typeOnElementNEnter(searchFieldIDWebElement, "Hand Sanitizer");
        submitSearch();
    }

    /**
     * This method validates search input "Hand Sanitizer".
     */
    public void validateSearchHandSanitizerText() {
        String actualResult = searchVerificationText.getText();
        String expectedResult = "\"Hand Sanitizer\"";
        Assert.assertEquals(actualResult, expectedResult, "Search item do not match!");
    }

    /**
     * This method clears the Amazon search field.
     */
    public void clearSearchField() {
        searchField.clear();
    }

    /**
     * This method iterates the method 'getItems()'.
     * As it iterates, it types each value and enters it into the Amazon search.
     * Then, it submits the search. Once, the search is done, it types the next
     * item from the List into the search field and submits.
     */
    public void clearTypeAndClickOnSearch() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<String> list = DataSource.getItems();
        for (String item : list) {
            typeOnElementNEnter(searchFieldIDWebElement, item);
            String expectedURL = "https://www.amazon.com/s?k=" + item.replace(" ", "+") + "&ref=nb_sb_noss";
            sleepFor(3);
            Assert.assertEquals(getCurrentPageUrl(), expectedURL);
            clearField(searchFieldIDWebElement);
        }
    }


    /**
     * This method validates data-driven technique.
     * Values are iterated from a table on MySQL and are searched on Amazon sequentially.
     *
     * @throws Exception
     * @throws IOException
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public void validateSearchItemsFromMySQL() throws Exception, IOException, SQLException, ClassNotFoundException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<String> list = DataSource.getItemsListFromDB();
        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            typeOnSearchField(list.get(i));
            submitSearch();
            clearSearchField();
            String expectedURL = "https://www.amazon.com/s?k=" + item.replace(" ", "+") + "&ref=nb_sb_noss";
            sleepFor(3);
            Assert.assertEquals(getCurrentPageUrl(), expectedURL);
        }
    }

    /**
     * This method validates keyword-driven technique.
     * Values are iterated from a Excel sheet and are searched on Amazon sequentially.
     * @throws Exception
     */
    public void searchBoxCheckGetItemsListFromExcel() throws Exception {
        List<String> itemList = DataSource.getItemsListFromExcel();
        for (int i = 1; i < itemList.size(); i++) {
            String item = itemList.get(i);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            typeOnElementNEnter(searchFieldIDWebElement, item);
            String expectedURL = "https://www.amazon.com/s?k=" + item.replace(" ", "+") + "&ref=nb_sb_noss";;
            sleepFor(3);
            Assert.assertEquals(getCurrentPageUrl(), expectedURL);
            searchField.clear();
        }
    }

    /**
     * This method creates a list of values from a locator.
     *
     * @param locator requires an ID type locator.
     * @return list of values from the locator.
     */
    public List<WebElement> getListOfWebElementsById(String locator) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.id(locator));
        return list;
    }

    /**
     * This method iterates list from the getListOfWebElementsByID method.
     *
     * @param list list of values from the locator.
     * @return items from the list of getListOfWebElementsByID method.
     */
    public List<String> getListOfString(List<WebElement> list) {
        List<String> items = new ArrayList<String>();
        for (WebElement element : list) {
            items.add(element.getText());
        }
        return items;
    }

    /**
     * This method validates that all the values (items) were iterated from the locator.
     */
    public void validateAllDropDown() {
        List<WebElement> element = getListOfWebElementsById(allDropDownSearchIDWebElement);
        List<String> listOfText = getListOfString(element);
        for (String st : listOfText) {
            System.out.println(st);
        }
        List<String> expectedMenu = listOfText;
        Assert.assertEquals(listOfText, expectedMenu);
    }

    /**
     * This method clicks on 'Purell' on the 'Brand' checkbox after searching for 'Hand sanitizer'.
     */
    public void clickOnBrandCheckBoxPurell() {
        brandCheckBoxPurell.click();
    }


    /**
     * This method searches "Hand sanitizer" then clicks on 'Purell" option in 'Brand'checkbox.
     */
    public void searchByBrandPurellHandSanitizer() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchHandSanitizer();
        clickOnBrandCheckBoxPurell();
    }

    /**
     * This method returns if 'Purell' checkbox in 'Brand' selection is enabled.
     *
     * @return
     */
    public boolean purellCheckboxIsEnabled() {
        return brandCheckBoxPurell.isEnabled();
    }

    /**
     * This method verifies if 'Purell' text is displayed.
     */
    public void verifyPurellTextIsDisplayed() {
        Assert.assertTrue(purellCheckboxIsEnabled());
    }

    /**
     * This method searches random books.
     */
    public void searchRandomBook() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchField.sendKeys("books");
        searchField.submit();
        typeOnSearchField(randomBookSearch);
        searchField.submit();
    }

    /**
     * This method returns the URL of the page.
     * @return
     */
//    public String getURL(){
//        return driver.getCurrentUrl();
//    }

    /**
     * This method verifies the URL of the book being searched.
     */
    public void verifySearchRandomBookByURL() {
        Assert.assertEquals(getCurrentPageUrl(), expectedRandomBookSearchURL);
    }


    /**
     * This method verifies the book being searched using the title of the page.
     */
    public void verifySearchRandomBookByTitle() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(getTitle(), expectedRandomBookSearchTitle);
    }

}
