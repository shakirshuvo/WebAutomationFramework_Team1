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

    /**
     * click on Coronavirus tab under search button
     */


    public void clickOnCoronavirusTab(){
        clickSearchBtn();
        waitUntilVisible(By.xpath(coronaVirusElement));
        clickOnElement(coronaVirusElement);
    }

    /**
     * validate  coronavirus tab
     */
    public void validateCoronavirusTab(){
        String actual = getTextByXpath(coronaUpdateCenterElement);
        String expect = "Coronavirus Update Center ";
        Assert.assertEquals(actual, expect, "test failed");
    }

    /**
     * click on face mask tab
     */
    public void clickOnFaceMaskTab(){
        clickSearchBtn();
        waitUntilVisible(By.xpath(faceMaskElementXpath));
        clickOnElement(faceMaskElementXpath);
    }

    /**
     * validate  coronavirus tab
     */
    public void validateFaceMaskTab(){
        String actual = getTitle();
        String expect = "Onboard Experience: Face Masks and Extra Space | Delta Air Lines";
        Assert.assertEquals(actual, expect, "test failed");
    }

    /**
     * click on face mask tab
     */
    public void clickOnECreditsTab(){
        clickSearchBtn();
        waitUntilVisible(By.xpath(eCreditsElementXpath));
        clickOnElement(eCreditsElementXpath);
    }

    /**
     * validate  coronavirus tab
     */
    public void validateECreditsTab(){
        String actual = getTitle();
        String expect = "How to Change or Cancel Flight | Delta Air Lines";
        Assert.assertEquals(actual, expect, "test failed");
    }

    /**
     * click on change flight tab
     */
    public void clickOnchangeFlightTab(){
        clickSearchBtn();
        waitUntilVisible(By.xpath(changeFlightElementXpath));
        clickOnElement(changeFlightElementXpath);
    }

    /**
     * validate change flight tab
     */
    public void validateChangeFlightTab(){
        String actual = getTextByXpath(changeFlightText);
        String expect = "Can I Cancel/Change My Flight Without Fees?";
        Assert.assertEquals(actual, expect, "test failed");
    }












}// ends class search
