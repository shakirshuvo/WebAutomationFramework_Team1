package homePageRamdane;

import base.CommonAPI;
import dataSource.DataSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;

import static homePageRamdane.ElementsBOA.*;


public class DataDrivenAction extends CommonAPI {

    static String expectedResult;
    static String actualResult;

    @FindBy(how = How.XPATH, using = searchBoxLocator)
    public static WebElement searchBoxElement;

    public static void searchBoxCheckUsingClassValues() throws InterruptedException {

        driver.manage().window().maximize();
        List<String> products = dataSource.DataSource.getItemValue();
        for (String st : products) {
            typeOnElementNEnter(searchBoxLocator, st, driver);
            System.out.println("Expected Text is =" + st);
            expectedResult = st;
            sleepFor(3);
            actualResult = getTextByXpath(searchValidationLocator);
            System.out.println("Actual Text  =" + actualResult);
            Assert.assertEquals(actualResult, expectedResult, "Test Failed");

            searchBoxElement.clear();

        }
    }
    public static void searchBoxCheckGetItemsListFromDB() throws Exception {
        DataSource.insertDataIntoSQLDB();
        driver.manage().window().maximize();
        List<String> products = dataSource.DataSource.getItemsListFromDB();
        for (String st : products) {
            typeOnElementNEnter(searchBoxLocator, st, driver);
            System.out.println("Expected Text is =" + st);
            expectedResult = st;
            sleepFor(3);
            actualResult = getTextByXpath(searchValidationLocator);
            System.out.println("Actual Text  =" + actualResult);
            Assert.assertEquals(actualResult, expectedResult, "Test Failed");
            // sleepFor(3);

            searchBoxElement.clear();

        }

    }
    public void searchBoxCheckGetItemsListFromExcel() throws Exception {
        driver.manage().window().maximize();
        List<String> itemList = DataSource.getItemsListFromExcel();
        for(int i =1; i<itemList.size();i++){
            String st=itemList.get(i);
            typeOnElementNEnter(searchBoxLocator, st, driver);
            System.out.println("Expected Text is =" + st);
            expectedResult = st;
            sleepFor(3);
            actualResult = getTextByXpath(searchValidationLocator);
            System.out.println("Actual Text  =" + actualResult);
            Assert.assertEquals(actualResult, expectedResult, "Test Failed");
            // sleepFor(3);

            searchBoxElement.clear();

        }
    }
}
