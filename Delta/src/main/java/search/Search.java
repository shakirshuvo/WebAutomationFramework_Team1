package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static search.SearchWebElements.*;
public class Search extends CommonAPI {
    @FindBy(how = How.XPATH, using = searchButtonElementXpath)
    WebElement searchButton;

    /**
     * click on search button
     */
    public void clickSearchBtn() {
        clickOnElement(searchButtonElementXpath);

    }

    /**
     * validate click on search
     */
    public void validateClickSearchBtn(){
        waitUntilClickAble(By.xpath(popularTopicsElementXpath));
        String actual = getTextByXpath(popularTopicsElementXpath);
        String expected  = "POPULAR TOPICS";
        Assert.assertEquals(actual, expected, "test failed" );
    }

    /**
     * enter keys into search box
     */
    public void typeInSearchBox(){
        clickSearchBtn();
        waitUntilVisible(By.xpath(searchBoxElementXpath));
        typeOnElement(searchBoxElementXpath, searchFlights);
        keysInput(searchBoxElementXpath);


    }

    /**
     * validate enter into search box
     */
    public void validateSearchBox(){
        String actual = getTextByXpath(searchResultsElement);
        System.out.println("Actual result is " + actual);
        String expected = "SEARCH RESULTS";
        Assert.assertEquals(actual, expected, "test failed");
        }

}
