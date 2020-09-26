package home;

import base.CommonAPI;
import dataDriven.DataSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


import java.util.List;

import static home.NYTHomePageWebElements.*;

public class NYTHomePage extends CommonAPI {
    String actual, expected;
    @FindBy(how = How.XPATH, using = searchIconElementXpath)
    WebElement searchIcon;
    @FindBy(how = How.XPATH, using = searchBoxElementXpath)
    WebElement searchBox;
    @FindBy(how = How.XPATH, using = searchSubmitButtonElementXpath)
    WebElement searchSubmitBtn;
    @FindBy(how = How.XPATH, using = searchResultTextElementXpath)
    WebElement searchResult;

    /**
     * click On search icon tab
     */
    public void clickOnSeachIcon(){
        clickOnElement(searchIcon);
    }

    /**
     * search box action method
     */
    public void seachBoxCheck(String seachItem){
        typeOnElement(searchBoxElementXpath,seachItem);
    }
    /**
     * search box using itemValue from the same class
     */
    public void searchBoxCheckUsingGetItemValue() throws InterruptedException {
        List<String> itemList = DataSource.getItemValue();
        for (String st: itemList ) {
            clickOnSeachIcon();
            typeOnElement(searchBoxElementXpath,st);
            sleepFor(1);
            clickOnSearchSubmit();

            sleepFor(3);

           // validate search results
            actual = searchResult.getText();
            expected = st;
            System.out.println("actual: " + actual + " and expected:  " + expected);
            Assert.assertEquals(actual, expected, "test failed");

            //navigate back to the main page for another search
            navigateBack();
            driver.manage().deleteAllCookies();
        }

    }

    /**
     * search box using values from the excel file
     */
    public  void searchBoxCheckUsingValuesFromExcel() throws Exception {
        List<String> itemList = DataSource.getItemsListFromExcel();
        for(int i =1; i<itemList.size();i++){
            String st=itemList.get(i);
            //click on search icon
            clickOnSeachIcon();
            //type of search box
            typeOnElement(searchBoxElementXpath,st);
            sleepFor(1);
            //click on search box
            clickOnSearchSubmit();

            expected = st;
            sleepFor(3);
            actual = searchResult.getText();
            System.out.println("Expected Text:  " + expected + " and Actual Text: " + actual);
            Assert.assertEquals(actual, expected, "Test Failed");
             sleepFor(3);

            //navigate back
            navigateBack();
            driver.manage().deleteAllCookies();

        }
    }

    /**
     * search functionality using data from DB
     */
    public void searchBoxCheckUsingValuesFromDB() throws Exception {
        DataSource.insertDataIntoSQLDB();
        driver.manage().window().maximize();
        List<String> products = dataDriven.DataSource.getItemsListFromDB();
        for (String st : products) {
            //click on search icon
            clickOnSeachIcon();
            //type of search box
            typeOnElement(searchBoxElementXpath,st);
            sleepFor(1);
            //click on search box
            clickOnSearchSubmit();

            expected = st;
            sleepFor(3);
            actual = searchResult.getText();
            System.out.println("Expected Text:  " + expected + " and Actual Text: " + actual);
            Assert.assertEquals(actual, expected, "Test Failed");
            sleepFor(3);

            //navigate back
            navigateBack();
            driver.manage().deleteAllCookies();
        }

    }


    /**
     * click On search icon tab
     */
    public void clickOnSearchSubmit(){
        clickOnElement(searchSubmitBtn);
    }
    /**
     * validate click on search functionality
     */
    public void validateClickSearchFunctionality(){
        actual = driver.getTitle();
        expected = "World News - The New York Times";
        Assert.assertEquals(actual, expected, "Test case failed");
    }

    @FindBy(how = How.XPATH, using = worldTabElementXpath)
            WebElement worldTab;
    @FindBy(how = How.XPATH, using = usaTabElementXpath)
             WebElement usaTab;
    @FindBy(how = How.XPATH, using = politicsTabElementXpath)
            WebElement politicsTab;
    @FindBy(how = How.XPATH, using = nyTabElementXpath )
            WebElement nyTab;
    @FindBy(how = How.XPATH, using = businessTabElementXpath )
            WebElement businessTab;
    @FindBy(how = How.XPATH, using = opinionTabElementXpath )
            WebElement opinionTab;
    @FindBy(how = How.XPATH, using =techTabElementXpath )
            WebElement techTab;
    @FindBy(how = How.XPATH, using = scienceTabElementXpath )
            WebElement scienceTab;
    @FindBy(how = How.XPATH, using = healthTabElementXpath )
            WebElement healthTab;
    @FindBy(how = How.XPATH, using = sportsTabElementXpath )
            WebElement sportsTab;

    /**
     * click On world tab
     */
    public void clickOnWorldTab(){
        clickOnElement(worldTab);
    }

    /**
     * validate click on world tab
     */
    public void validateClickOnWorldTab(){
        actual = driver.getTitle();
        expected = "World News - The New York Times";
        Assert.assertEquals(actual, expected, "Test case failed");
    }

    /**
     * click On usa tab
     */
    public void clickOnUsaTab(){
        clickOnElement(usaTab);
    }

    /**
     * validate click on us tab
     */
    public void validateClickOnUsaTab(){
        actual = driver.getTitle();
        expected = "U.S. News - The New York Times";
        Assert.assertEquals(actual, expected, "Test case failed");
    }
    /**
     * click On politics tab
     */
    public void clickOnPoliticsTab(){
        clickOnElement(politicsTab);
    }

    /**
     * validate click on politics tab
     */
    public void validateClickOnPoliticsTab(){
        actual = driver.getTitle();
        expected = "Politics - The New York Times";
        Assert.assertEquals(actual, expected, "Test case failed");
    }
    /**
     * click On NY tab
     */
    public void clickOnNYTab(){
        clickOnElement(nyTab);
    }

    /**
     * validate click on NY tab
     */
    public void validateClickOnNYTab(){
        actual = driver.getTitle();
        expected = "New York - The New York Times";
        Assert.assertEquals(actual, expected, "Test case failed");
    }
    /**
     * click On business tab
     */
    public void clickOnBusinessTab(){
        clickOnElement(businessTab);
    }

    /**
     * validate click on business tab
     */
    public void validateClickOnBusinessTab(){
        actual = driver.getTitle();
        expected = "Business - The New York Times";
        Assert.assertEquals(actual, expected, "Test case failed");
    }
    /**
     * click On opinion tab
     */
    public void clickOnOpinionTab(){
        clickOnElement(opinionTab);
    }

    /**
     * validate click on opinion tab
     */
    public void validateClickOnOpinionTab(){
        actual = driver.getTitle();
        expected = "Opinion - The New York Times";
        Assert.assertEquals(actual, expected, "Test case failed");
    }
    /**
     * click On tech tab
     */
    public void clickOnTechTab(){
        clickOnElement(techTab);
    }

    /**
     * validate click on tech tab
     */
    public void validateClickOnTechTab(){
        actual = driver.getTitle();
        expected = "Technology - The New York Times";
        Assert.assertEquals(actual, expected, "Test case failed");
    }
    /**
     * click On science tab
     */
    public void clickOnScienceTab(){
        clickOnElement(scienceTab);
    }

    /**
     * validate click on science tab
     */
    public void validateClickOnScienceTab(){
        actual = driver.getTitle();
        expected = "Science - The New York Times";
        Assert.assertEquals(actual, expected, "Test case failed");
    }
    /**
     * click On health tab
     */
    public void clickOnHealthTab(){
        clickOnElement(healthTab);
    }

    /**
     * validate click on health tab
     */
    public void validateClickOnHealthTab(){
        actual = driver.getTitle();
        expected = "Health - The New York Times";
        Assert.assertEquals(actual, expected, "Test case failed");
    }
    /**
     * click On sports tab
     */
    public void clickOnSports(){
        clickOnElement(sportsTab);
    }

    /**
     * validate click on sports tab
     */
    public void validateClickOnSportsTab(){
        actual = driver.getTitle();
        expected = "Sports - The New York Times";
        Assert.assertEquals(actual, expected, "Test case failed");
    }
    /**
     * click On arts tab
     */
    public void clickOnArtsTab(){
        clickOnElement(artsTabElementXpath);
    }

    /**
     * validate click on arts tab
     */
    public void validateClickOnArtsTab(){
        actual = driver.getCurrentUrl();
        expected = "https://www.nytimes.com/section/arts";
        Assert.assertEquals(actual, expected, "Test case failed");
    }
    /**
     * click On books tab
     */
    public void clickOnBooksTab(){
        clickOnElement(booksTabElementXpath);
    }

    /**
     * validate click on Books tab
     */
    public void validateClickOnBooksTab(){
        actual = driver.getCurrentUrl();
        expected = "https://www.nytimes.com/section/books";
        Assert.assertEquals(actual, expected, "Test case failed");
    }
    /**
     * click On style tab
     */
    public void clickOnStyleTab(){
        clickOnElement(styleTabElementXpath);
    }

    /**
     * validate click on style tab
     */
    public void validateClickOnStyleTab(){
        actual = driver.getCurrentUrl();
        expected = "https://www.nytimes.com/section/style";
        Assert.assertEquals(actual, expected, "Test case failed");
    }
    /**
     * click On food tab
     */
    public void clickOnFoodTab(){
        clickOnElement(foodTabElementXpath);
    }

    /**
     * validate click on food tab
     */
    public void validateClickOnFoodTab(){
        actual = driver.getCurrentUrl();
        expected = "https://www.nytimes.com/section/food";
        Assert.assertEquals(actual, expected, "Test case failed");
    }
    /**
     * click On travel tab
     */
    public void clickOnTravelTab(){
        clickOnElement(travelTabElementXpath);
    }

    /**
     * validate click on travel tab
     */
    public void validateClickOnTravelTab(){
        actual = driver.getCurrentUrl();
        expected = "https://www.nytimes.com/section/travel";
        Assert.assertEquals(actual, expected, "Test case failed");
    }
    /**
     * click On magazine tab
     */
    public void clickOnMagazine(){
        clickOnElement(magazineTabElementXpath);
    }

    /**
     * validate click on magazine tab
     */
    public void validateClickOnMagazineTab(){
        actual = driver.getCurrentUrl();
        expected = "https://www.nytimes.com/section/magazine";
        Assert.assertEquals(actual, expected, "Test case failed");
    }
    /**
     * click On tMagazine tab
     */
    public void clickOnTMagazine(){
        clickOnElement(tMagazineTabElementXpath);
    }

    /**
     * validate click on tMagazine tab
     */
    public void validateClickOnTMagazineTab(){
        actual = driver.getCurrentUrl();
        expected = "https://www.nytimes.com/section/t-magazine";
        Assert.assertEquals(actual, expected, "Test case failed");
    }
    /**
     * click On real estate tab
     */
    public void clickOnRealEstateTab(){
        clickOnElement(realEstateTabElementXpath);
    }

    /**
     * validate click on real Estate tab
     */
    public void validateClickOnRealEstateTab(){
        actual = driver.getCurrentUrl();
        expected = "https://www.nytimes.com/section/realestate";
        Assert.assertEquals(actual, expected, "Test case failed");
    }
    /**
     * click On video tab
     */
    public void clickOnVideoTab(){
        clickOnElement(videoTabElementXpath);
    }

    /**
     * validate click on video tab
     */
    public void validateClickOnVideoTab(){
        actual = driver.getCurrentUrl();
        expected = "https://www.nytimes.com/video";
        Assert.assertEquals(actual, expected, "Test case failed");
    }

}// nyt homepage
