package search;

import base.CommonAPI;
import org.testng.Assert;

import static search.SearchWebElements.*;
public class Search  extends CommonAPI {
        String actual, expected;

    /**
     * click on search button
     */
    public void clickOnSearchBtn(){
        clickOnElement(searchBtnWebElementXpath);
    }
    /**
     * send search keys
     */
    public void sendSearchKeys(){
            typeOnElementNEnter(searchBoxWebElementXpath,searchKeysWebElementXpath);
    }

    /**
     * validate search box
     */
    public void validateSearchBox(){
        actual = getTextByXpath("//p[text()='iPhone 11']");
        expected = "iPhone 11";
        Assert.assertEquals(actual, expected, "Test failed");
    }






}
