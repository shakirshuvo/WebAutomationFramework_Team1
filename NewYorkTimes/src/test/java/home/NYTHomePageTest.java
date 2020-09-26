package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import dataDriven.DataSource;

import java.util.concurrent.TimeUnit;
import static home.NYTHomePageWebElements.*;
public class NYTHomePageTest extends CommonAPI {
   NYTHomePage nytHomePage;

    @BeforeMethod
    public void getInit(){

        nytHomePage = PageFactory.initElements(driver , NYTHomePage.class);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    /**
     * test search functionality using data driven from same class
     */
    @Test(enabled = true)
    public void testSearchFunctinality() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        nytHomePage.searchBoxCheckUsingGetItemValue();
    }

    /**
     * test search functionality using data driven from Excel
     */
    @Test(enabled = true)
    public void testSearchFunctinalityDataFromExcel() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        nytHomePage.searchBoxCheckUsingValuesFromExcel();
    }

    /**
     * test search functionality using data driven from Database
     */
    @Test(enabled = true)
    public void testSearchFunctinalityDataFromSQLDB() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        nytHomePage.searchBoxCheckUsingValuesFromDB();
    }
    /**
     * test click world on tab
     */
    @Test(enabled = true)
    public void testClickOnWorldTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        nytHomePage.clickOnWorldTab();
        sleepFor(2);
        nytHomePage.validateClickOnWorldTab();

    }
    /**
     * test click on usa tab
     */
    @Test(enabled = true)
    public void testClickOnUSATab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        nytHomePage.clickOnUsaTab();
        driver.manage().window().maximize();
        sleepFor(2);
        nytHomePage.validateClickOnUsaTab();

    }
    /**
     * test click on politics tab
     */
    @Test(enabled = true)
    public void testClickOnPoliticsTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        nytHomePage.clickOnPoliticsTab();
        sleepFor(2);
        nytHomePage.validateClickOnPoliticsTab();

    }
    /**
     * test click on NY tab
     */
    @Test(enabled = true)
    public void testClickOnNYTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        nytHomePage.clickOnNYTab();
        sleepFor(2);
        nytHomePage.validateClickOnNYTab();

    }
    /**
     * test click on business tab
     */
    @Test(enabled = true)
    public void testClickOnBusinessTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        nytHomePage.clickOnBusinessTab();
        sleepFor(2);
        nytHomePage.validateClickOnBusinessTab();

    }
    /**
     * test click on opinion tab
     */
    @Test(enabled = true)
    public void testClickOnOpinionTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        nytHomePage.clickOnOpinionTab();
        sleepFor(2);
                nytHomePage.validateClickOnOpinionTab();

    }
    /**
     * test click on tech tab
     */
    @Test(enabled = true)
    public void testClickOnTechTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        nytHomePage.clickOnTechTab();
        sleepFor(2);
                nytHomePage.validateClickOnTechTab();

    }
    /**
     * test click on science tab
     */
    @Test(enabled = true)
    public void testClickOnScienceTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        nytHomePage.clickOnScienceTab();
        sleepFor(2);
        nytHomePage.validateClickOnScienceTab();

    }
    /**
     * test click on health tab
     */
    @Test(enabled = true)
    public void testClickOnHealthTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        nytHomePage.clickOnHealthTab();
        sleepFor(2);
        nytHomePage.validateClickOnHealthTab();

    }
    /**
     * test click on sports tab
     */
    @Test(enabled = true)
    public void testClickOnSportsTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        nytHomePage.clickOnSports();
        sleepFor(2);
        nytHomePage.validateClickOnSportsTab();

    }
    /**
     * test click on arts tab
     */
    @Test(enabled = true)
    public void testClickOnArtsTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        nytHomePage.clickOnArtsTab();
        sleepFor(2);
        nytHomePage.validateClickOnArtsTab();
    }
    /**
     * test click on books tab
     */
    @Test(enabled = true)
    public void testClickOnBooksTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        nytHomePage.clickOnBooksTab();
        sleepFor(2);
        nytHomePage.validateClickOnBooksTab();

    }
    /**
     * test click on style tab
     */
    @Test(enabled = true)
    public void testClickOnStyleTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        nytHomePage.clickOnStyleTab();
        sleepFor(2);
        nytHomePage.validateClickOnStyleTab();

    }
    /**
     * test click on food tab
     */
    @Test(enabled = true)
    public void testClickOnFoodTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        nytHomePage.clickOnFoodTab();
        sleepFor(2);
        nytHomePage.validateClickOnFoodTab();

    }
    /**
     * test click on  travel tab
     */
    @Test(enabled = true)
    public void testClickOnTravelTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        nytHomePage.clickOnTravelTab();
        sleepFor(2);
        nytHomePage.validateClickOnTravelTab();

    }
    /**
     * test click on magazine tab
     */
    @Test(enabled = true)
    public void testClickOnMagazineTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        nytHomePage.clickOnMagazine();
        sleepFor(2);
        nytHomePage.validateClickOnMagazineTab();

    }
    /**
     * test click on t-magazine tab
     */
    @Test(enabled = true)
    public void testClickOnTMagazineTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        nytHomePage.clickOnTMagazine();
        sleepFor(2);
        nytHomePage.validateClickOnTMagazineTab();

    }
    /**
     * test click on real estate tab
     */
    @Test(enabled = true)
    public void testClickOnRealEstateTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        nytHomePage.clickOnRealEstateTab();
        sleepFor(2);
        nytHomePage.validateClickOnRealEstateTab();

    }
    /**
     * test click on video tab
     */
    @Test(enabled = true)
    public void testClickOnVideoTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        nytHomePage.clickOnVideoTab();
        sleepFor(2);
        nytHomePage.validateClickOnVideoTab();

    }




}// ends class nytHomepage test
