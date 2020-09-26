package search;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static search.SearchWebElements.*;

public class Search extends CommonAPI {

    @FindBy(how = How.ID, using =searchHandSanitizer)
    public WebElement searchField;

    @FindBy(how = How.XPATH, using = handSanitizerActualText)
    public WebElement searchButton;


    public void getVerificationIphoneText() {
        validateByTitle("Amazon.com : iphone");
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
        typeByID(searchFieldIDWebElement, "iphone");
        submitOnElementByID(searchFieldIDWebElement);
    }

}
