package homePageRaza;

import base.CommonAPI;
import dataSource.DataSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static homePageRaza.ElementsDelta.*;

public class HomeDeltaRaza extends CommonAPI {
    public static String expectedResult;
    public static String actualResult;

    @FindBy(how = How.XPATH, using = searchBoxLocator)
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using = searchButtonXPATH)
    public WebElement searchButton;
    @FindBy(how = How.XPATH, using = mainPageAlertXpath)
    public WebElement homePageAlert;
    @FindBy(how = How.XPATH, using = searchFieldXpath)
    public WebElement homePageSearchFieldElement;


    public void searchBoxCheck(String searchItem) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchBox.click();
        homePageSearchFieldElement.sendKeys(searchItem);
        searchButton.click();
    }


    public void validateSearchBoxCheck() {

        expectedResult = "https://www.delta.com/dlsearch/index.jsp?searchText=Toronto&category=allresults&%3Acq_csrf_token=undefined";
        actualResult = driver.getCurrentUrl();
        System.out.println("Actual Url is " + actualResult);
        System.out.println("Expected Url is " + expectedResult);
        Assert.assertEquals(actualResult, expectedResult, "Result did not match");
    }

    public void handleHomePageAlert() {
        homePageAlert.click();
    }


    public void searchBoxCheckUsingClassValues() throws InterruptedException {


        List<String> products = dataSource.DataSource.getItemValue();
        for (String st : products) {
            searchBox.click();
            homePageSearchFieldElement.sendKeys(st);
            searchButton.click();
            //expectedResult = "https://www.delta.com/ca/en";
            expectedResult = "https://www.delta.com/dlsearch/index.jsp?searchText=" + st + "&category=allresults&%3Acq_csrf_token=undefined";
            actualResult = driver.getCurrentUrl();
            System.out.println("Actual Url is " + actualResult);
            System.out.println("Expected Url is " + expectedResult);
            Assert.assertEquals(actualResult, expectedResult, "Result did not match");
            navigateBack();

        }
    }

    public  void searchBoxCheckGetItemsListFromDB() throws Exception {
        DataSource.insertDataIntoSQLDB();
        driver.manage().window().maximize();
        List<String> products = dataSource.DataSource.getItemsListFromDB();
        for (String st : products) {
        searchBox.click();
        homePageSearchFieldElement.sendKeys(st);
        searchButton.click();
        expectedResult = "https://www.delta.com/dlsearch/index.jsp?searchText=" + st + "&category=allresults&%3Acq_csrf_token=undefined";
        actualResult = driver.getCurrentUrl();
        System.out.println("Actual Url is " + actualResult);
        System.out.println("Expected Url is " + expectedResult);
        Assert.assertEquals(actualResult, expectedResult, "Result did not match");
        navigateBack();

        }

    }


}
