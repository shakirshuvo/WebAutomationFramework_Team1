package search;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

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
    @Test(enabled = true)
    public  void testClickSearchBtn() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        search.clickSearchBtn();
        search.validateClickSearchBtn();
    }

    /**
     * validate search box
     */
    @Test(enabled = true)
    public void testSearchBox() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        search.typeInSearchBox();
        sleepFor(3);
        search.validateSearchBox();
    }

    /**
     * test on coronavirus tabe
     */
    @Test(enabled = true)
    public void testCoronavirus() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        search.clickOnCoronavirusTab();
        sleepFor(3);
        search.validateCoronavirusTab();
    }

    /**
     * test face mask tab
     */
    @Test(enabled = true)
    public void testFaceMaskTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        search.clickOnFaceMaskTab();
        sleepFor(5);
        search.validateFaceMaskTab();
    }

    /**
     * test eCredits tab
     */
    @Test(enabled = true)
    public void testECreditsTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        search.clickOnECreditsTab();
        sleepFor(5);
        search.validateECreditsTab();
    }

    /**
     * test change flight tab
     */
    @Test(enabled = true)
    public void testChangeFlight() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        search.clickOnChangeFlightTab();
        sleepFor(5);
        search.validateChangeFlightTab();
    }

    /**
     * test cancel flights element
     */
    @Test(enabled = true)
    public void testCanceFlights() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        search.clickCancelFlights();
        sleepFor(3);
        search.validateClickCancelFlights();
    }

    /**
     * test reciepts element
     */
    @Test(enabled = true)
    public void testReciepts() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        search.clickReciepts();
        sleepFor(3);
        search.validateClickReciepts();
    }


    /**
     * test baggage element
     */
    @Test(enabled = true)
    public void testRefunds() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        search.clickBaggage();
        sleepFor(3);
        search.validateClickBaggage();
    }

    /**
     * test pets element
     */
    @Test(enabled = true)
    public void testPetsElement() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        search.clickPets();
        sleepFor(3);
        search.validateClickPets();
    }

}
