package search;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends CommonAPI {

    Search search;

    @BeforeMethod
    public void getInit() {
        search = PageFactory.initElements(driver, Search.class);
    }

    /**
     * This test searches a single item, 'Hand sanitizer' and verifies it with "Hand sanitizer" text on the page.
     */
    @Test
    public void testSearchSingleItem() {
        search.searchHandSanitizer();
        search.validateSearchHandSanitizerText();
    }

    /**
     * This test searches multiple items.
     */
    @Test
    public void testSearchMultipleItems(){
        search.clearTypeAndClickOnSearch();
        search.validateSearchMultipleItems();
    }

    /**
     * This data-driven tests searches items stored on MySQL.
     * @throws Exception
     */
    @Test
    public void testValidateSearchItemsFromMySQL() throws Exception {
        search.validateSearchItemsFromMySQL();
    }

    /**
     * This test validates all the items on 'All' dropdown on search.
     */
    @Test
    public void testValidateAllDropDown(){
        search.validateAllDropDown();
    }

    /**
     * This test verifies that the user will find the product (PURELL Advanced Hand Sanitizer Refreshing Gel,
     * Clean Scent, 1 fl oz Flip-Cap Bottle (Pack of 250) – 3901-2C-250) after searching for "Hand sanitizer", then,
     * click on the 'Purell' option on teh 'Brand' checkbox.
     */
    @Test
    public void testVerifyPurellAdvancedHandSanitizerPackOf250IsDisplayed(){
        search.searchByBrandPurellHandSanitizer();
        search.verifyPurellAdvancedHandSanitizerPackOf250IsDisplayed();
    }

    /**
     * This test searches random book and validates it by URL.
     */
    @Test
    public void testVerifySearchRandomBooksByURL() {
        search.searchRandomBook();
        search.verifySearchRandomBookByURL();
    }

    /**
     * This test searches random book and validates it by title.
     */
    @Test
    public void testVerifySearchRandomBooksByTitle() {
        search.searchRandomBook();
        search.verifySearchRandomBookByTitle();
    }


}
