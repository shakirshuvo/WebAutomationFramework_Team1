package search;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchTest extends CommonAPI {
    Search search;

    @BeforeMethod
    public void getInit(){
        search = PageFactory.initElements(driver, Search.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    /**
     * test click on search button
     */
//    @Test
//    public  void testClickSearch() throws InterruptedException {
//        search.clickSearchBtn();
//        search.validateClickSearchBtn();
//    }

    /**
     * validate search box
     */
    @Test
    public void testSearchBox() throws InterruptedException {
        search.typeInSearchBox();
        sleepFor(3);
        search.validateSearchBox();
    }

}
