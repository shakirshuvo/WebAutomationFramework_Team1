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
    public void setSearchFieldTest(){
        search.setSearchField();
    }

}
