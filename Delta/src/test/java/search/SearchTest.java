package search;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchTest extends CommonAPI {
    Search search;

//    @BeforeMethod
//    public void getInit(){
//        search = PageFactory.initElements(driver, Search.class);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }
//
//    /**
//     * test click on search button
//     */
////    @Test
////    public  void testClickSearch() throws InterruptedException {
////        search.clickSearchBtn();
////        search.validateClickSearchBtn();
////    }
//
//    /**
//     * validate search box
//     */
////    @Test
//////    public void testSearchBox() throws InterruptedException {
//////        search.typeInSearchBox();
//////        sleepFor(3);
//////        search.validateSearchBox();
//////    }
//
//    /**
//     * test on coronavirus tabe
//     */
//    @Test
//    public void testCoronavirus() throws InterruptedException {
//
//        search.clickOnCoronavirusTab();
//        sleepFor(3);
//        search.validateCoronavirusTab();
//    }
//
//    /**
//     * test face mask tab
//     */
//    @Test
//    public void testFaceMaskTab() throws InterruptedException {
//
//        search.clickOnFaceMaskTab();
//        sleepFor(5);
//        search.validateFaceMaskTab();
//    }
//
//    /**
//     * test eCredits tab
//     */
//    @Test
//    public void testECreditsTab() throws InterruptedException {
//
//        search.clickOnECreditsTab();
//        sleepFor(5);
//        search.validateECreditsTab();
//    }
//
//    /**
//     * test change flight tab
//     */
//    @Test
//    public void testChangeFlight() throws InterruptedException {
//        search.clickOnchangeFlightTab();
//        sleepFor(5);
//        search.validateChangeFlightTab();
//    }
//



}
