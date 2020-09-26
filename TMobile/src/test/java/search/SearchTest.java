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
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    /**
     * test search box functionality
     */
    @Test
    public void testSearchBox(){
        search.clickOnSearchBtn();
        search.sendSearchKeys();
        search.validateSearchBox();
    }
}
