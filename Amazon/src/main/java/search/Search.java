package search;

import base.CommonAPI;
import dataSupply.DataSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

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
    @FindBy(how = How.XPATH, using = purellAdvancedHandSanitizerPackOf250XPathWebElement)
    public WebElement purellAdvancedHandSanitizerPackOf250;
    @FindBy(how = How.XPATH, using = moviesAndTVOnAllDropDownXpathWebElement)
    public WebElement moviesAndTVOnAllDropDown;



    /**
     * This method enters a String in Amazon search field.
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
    public void searchHandSanitizer(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        typeOnSearchField("Hand Sanitizer");
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
     * This method returns a List of Strings.
     * @return list of String values.
     */
    public List<String> getItems(){
        List<String> itemsList = new ArrayList<>();
        itemsList.add("watch");
        itemsList.add("Rage Against The Machine");

        return itemsList;
    }

    /**
     * This method iterates the method 'getItems()'.
     * As it iterates, it types each value and enters it into the Amazon search.
     * Then, it submits the search. Once, the search is done, it types the next
     * item from the List into the search field and submits.
     */
    public void clearTypeAndClickOnSearch(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<String> list = getItems();
        for (int i = 0; i < list.size(); i++) {
            clearSearchField();
            typeOnSearchField(list.get(i));
            submitSearch();
        }
    }

    public void validateSearchMultipleItems(){
        clearSearchField();
        Assert.assertNotNull(getItems(), "watch");
        Assert.assertNotNull(getItems(), "Rage Against The Machine");
    }

    /**
     * This method validates data-driven technique.
     * Values are iterated from a table on MySQL and are searched on Amazon sequentially.
     * @throws Exception
     * @throws IOException
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public void validateSearchItemsFromMySQL() throws Exception, IOException, SQLException, ClassNotFoundException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<String> list = DataSource.getItemsListFromDB();
        for (int i = 0; i < list.size(); i++) {
            typeOnSearchField(list.get(i));
            submitSearch();
            clearSearchField();
        }
        List<String> expectedMenu = list;
        Assert.assertEquals(list, expectedMenu);
    }

    /**
     * This method creates a list of values from a locator.
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
    public void clickOnBrandCheckBoxPurell(){
        brandCheckBoxPurell.click();
    }


    /**
     * This method searches "Hand sanitizer" then clicks on 'Purell" option in 'Brand'checkbox.
     */
    public void searchByBrandPurellHandSanitizer(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchHandSanitizer();
        clickOnBrandCheckBoxPurell();
    }

    /**
     * This method returns if 'PURELL Advanced Hand Sanitizer Refreshing Gel,
     * Clean Scent, 1 fl oz Flip-Cap Bottle (Pack of 250) – 3901-2C-250' is displayed.
     * @return
     */
    public boolean purellAdvancedHandSanitizerPackOf250IsDisplayed(){
        return purellAdvancedHandSanitizerPackOf250.isDisplayed();
    }

    /**
     * This method verifies if 'PURELL Advanced Hand Sanitizer Refreshing Gel,
     * Clean Scent, 1 fl oz Flip-Cap Bottle (Pack of 250) – 3901-2C-250' is displayed.
     */
    public void verifyPurellAdvancedHandSanitizerPackOf250IsDisplayed(){
        Assert.assertTrue(purellAdvancedHandSanitizerPackOf250IsDisplayed());
    }

    /**
     * This method searches random books.
     */
    public void searchRandomBook() {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        searchField.sendKeys("books");
        searchField.submit();
        typeOnSearchField(randomBookSearch);
        searchField.submit();
    }

    /**
     * This method returns the URL of the page.
     * @return
     */
    public String getURL(){
        return driver.getCurrentUrl();
    }

    /**
     * This method verifies the URL of the book being searched.
     */
    public void verifySearchRandomBookByURL(){
        Assert.assertEquals(getURL(), expectedRandomBookSearchURL);
    }

    /**
     * This method returns the title of the page.
     * @return
     */
    public String getTitle() {
        return driver.getTitle();
    }

    /**
     * This method verifies the book being searched using the title of the page.
     */
    public void verifySearchRandomBookByTitle(){
        Assert.assertEquals(getTitle(), expectedRandomBookSearchTitle);
    }

}
