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

    @Test
    public void testSearchSingleItem() {
        search.searchHandSanitizer();
        search.validateSearchHandSanitizerText();
    }

    @Test
    public void testSearchMultipleItems(){
        search.clearTypeAndClickOnSearch();
        search.validateSearchMultipleItems();
    }

    @Test
    public void testValidateSearchItemsFromMySQL() throws Exception {
        search.validateSearchItemsFromMySQL();
    }

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

    @Test
    public void testVerifySearchRandomBooksByURL() {
        search.searchRandomBook();
        search.verifySearchRandomBookByURL();
    }

    @Test
    public void testVerifySearchRandomBooksByTitle() {
        search.searchRandomBook();
        search.verifySearchRandomBookByTitle();
    }

}
