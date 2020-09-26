package testSearchDataDriven;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import home.ActionClass;
import dataSource.DataDrivenAction;

import static home.ActionClass.*;
import static dataSource.DataDrivenAction.*;

public class TestSearch  extends CommonAPI {

    ActionClass search;
    DataDrivenAction searchByDataDriven;

    @BeforeMethod
    public void getInit() {

        searchByDataDriven = PageFactory.initElements(driver, DataDrivenAction.class);
    }

    @BeforeMethod
    public void getInit1() {

        search = PageFactory.initElements(driver, ActionClass.class);
    }

    @Test (enabled = true)
    public static void testSearchProduct() throws InterruptedException {
        searchProduct();
        validateSearchItems();
        // sleepFor(3);
    }

    @Test(enabled = true)
    public void testSearchBoxCheckUsingClassValues() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchByDataDriven.searchBoxCheckUsingClassValues();
    }
    @Test(enabled = true)
    public void testSearchBoxCheckGetItemsListFromDB() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchByDataDriven.searchBoxCheckGetItemsListFromDB();
    }
    @Test(enabled = true)
    public void testSearchBoxCheckGetItemsListFromExcel() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchByDataDriven.searchBoxCheckGetItemsListFromExcel();
    }

}