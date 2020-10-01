package homePageRamdane;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static homePageRamdane.ElementsBOA.searchBoxLocator;
import static homePageRamdane.ElementsBOA.searchValidationLocator;

public class ActionClass extends CommonAPI {
    static String expectedResult;
    static String actualResult;

    @FindBy(how = How.XPATH, using = searchBoxLocator)
    public WebElement searchBoxElement;

    public static void searchProduct(String searchItems) {

    }

    public static void searchProduct() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        typeOnElementNEnter(searchBoxLocator, "Checking Accounts", driver);
        // clickByXpath(searchButton);

//        typeOnElement(searchBoxLocator,"Savings Accounts");


    }

    public static void validateSearchItems() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        expectedResult = "Checking Accounts";
        actualResult = getTextByXpath(searchValidationLocator);
        System.out.println("Actual Text  ="+ actualResult);
        Assert.assertEquals(actualResult,expectedResult,"Test Failed");

    }
}
