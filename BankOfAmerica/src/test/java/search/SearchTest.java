//package search;
//
//import base.CommonAPI;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import reporting.TestLogger;
//import static home.HomePage.*;
//import static home.DataDrivenAction.*;
//public class SearchTest {
//
//
//
//
//    public class TestSearch  extends CommonAPI {
//
//        Search search;
//        DataDrivenAction searchByDataDriven;
//
//        @BeforeMethod
//        public void getInit() {
//
//            searchByDataDriven = PageFactory.initElements(driver, DataDrivenAction.class);
//        }
//
//        @BeforeMethod
//        public void getInit1() {
//
//            search = PageFactory.initElements(driver, ActionClass.class);
//        }
//
//        @Test (enabled = false)
//        public static void testSearchProduct() throws InterruptedException {
//            searchProduct();
//            validateSearchItems();
//            // sleepFor(3);
//        }
//
//        @Test(enabled = true)
//        public void testSearchBoxCheckUsingClassValues() throws Exception {
//            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//            }.getClass().getEnclosingMethod().getName()));
//            searchBoxCheckUsingClassValues();
//        }
//        @Test(enabled = true)
//        public void testSearchBoxCheckGetItemsListFromDB() throws Exception {
//            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//            }.getClass().getEnclosingMethod().getName()));
//            searchBoxCheckGetItemsListFromDB();
//        }
//        @Test(enabled = true)
//        public void testSearchBoxCheckGetItemsListFromExcel() throws Exception {
//            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//            }.getClass().getEnclosingMethod().getName()));
//            searchByDataDriven.searchBoxCheckGetItemsListFromExcel();
//        }
//
//
//    }
