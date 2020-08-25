package search;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;

import static search.SearchWebElements.*;

public class Search extends CommonAPI {

    @FindBy(how = How.ID, using = searchFieldIDWebElement)
    public WebElement searchField;

    @FindBy(how = How.XPATH, using = searchButtonXPATHWebElement)
    public WebElement searchButton;

    @FindBy(how = How.LINK_TEXT, using = searchVerificationPartialTextWebElement)
    public WebElement searchVerificationText;

    public String getVerificationIphoneText() {
        String myValue = searchVerificationText.getText();
        return myValue;

    }



    public void typeOnSearchField(String searchItem) {
        searchField.sendKeys(searchItem);
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }

    public void submitSearchButton() {
        searchField.submit();
    }

    public void searchIphone() {
        typeOnSearchField("iphone");
        submitSearchButton();
    }

    //    @Test
    public void validateIphoneSearch() {

        Assert.assertEquals(getVerificationIphoneText(), "iphone");
    }

}
