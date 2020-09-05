package search;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;

import static search.SearchWebElements.*;

public class Search extends CommonAPI {
    @FindBy(how = How.XPATH,using = searchFieldXP)
    public WebElement searchField;
    @FindBy(how = How.XPATH,using = searchButtonXP)
    public WebElement searchButton;
    @FindBy(how = How.XPATH,using = searchFieldValidationXP)
    public WebElement searchFieldValidation;

    public void setSearchField(){
        searchField.sendKeys(itemSearched);
        searchButton.click();
        String actualText=searchFieldValidation.getText();
        String expectedText="\"iphone 11\"";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }

}
