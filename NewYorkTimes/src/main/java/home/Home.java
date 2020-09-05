package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomeWebElements.*;

public class Home extends CommonAPI {

    String actual;
    String expected;

//    @FindBy(how = How.ID, using = searchBoxById)
//    public WebElement searchBox;
//
//    public void clickSearchBox(){
//        searchBox.click();
//    }
//
//    public boolean searchBoxIsEnable(){
//        return searchBox.isEnabled();
//    }
//
//    public void verifyClickSearchBox(){
//        Assert.assertTrue(searchBoxIsEnable());
//    }
    public WebElement world;
    public void worldCheck(){
        clickOnElement(worldByXpath);
    }
    public void validateWorld(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public WebElement us;
    public void usCheck(){
        clickOnElement(USByXpath);
    }
    public void validateUs(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public WebElement politics;
    public void politicsCheck(){
        clickOnElement(politicsByXpath);
    }
    public void validatePolitics(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public WebElement nyNews;
    public void nyNewsCheck(){
        clickOnElement(nyNewsByXpath);
    }
    public void validateNyNews(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public WebElement businessNews;
    public void businessNewsCheck(){
        clickOnElement(businessNewsByXpath);
    }
    public void validateBusinessNews(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public WebElement opinion;
    public void opinionCheck(){
        clickOnElement(opinionByXpath);
    }
    public void validateOpinion(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public WebElement techNews;
    public void techNewsCheck(){
        clickOnElement(techNewsByXpath);
    }
    public void validateTechNews(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public WebElement scienceNews;
    public void scienceNewsCheck(){
        clickOnElement(scienceNewsByXpath);
    }
    public void validateScienceNews(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public WebElement healthNews;
    public void healthNewsCheck(){
        clickOnElement(healthNewsByXpath);
    }
    public void validateHealthNews(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public WebElement sportsNews;
    public void sportsNewsCheck(){
        clickOnElement(sportsNewsByXpath);
    }
    public void validateSportsNews(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public WebElement artsNews;
    public void artsNewsCheck(){
        clickOnElement(artsNewsByXpath);
    }
    public void validateArtsNews(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public WebElement booksNews;
    public void booksNewsCheck(){
        clickOnElement(booksNewsByXpath);
    }
    public void validateBooksNews(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public WebElement styleNews;
    public void styleNewsCheck(){
        clickOnElement(styleNewsByXpath);
    }
    public void validateStyleNews(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public WebElement foodNews;
    public void foodNewsCheck(){
        clickOnElement(foodNewsByXpath);
    }
    public void validateFoodNews(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public WebElement travelNews;
    public void travelNewsCheck(){
        clickOnElement(travelNewsByXpath);
    }
    public void validateTravelNews(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public WebElement magazine;
    public void magazineCheck(){
        clickOnElement(magazineByXpath);
    }
    public void validateMagazine(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public WebElement t_magazine;
    public void t_magazineCheck(){
        clickOnElement(t_MagazineByXpath);
    }
    public void validate_t_Magazine(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public WebElement realEstate;
    public void realEstateCheck(){
        clickOnElement(realEstateNewsByXpath);
    }
    public void validateRealEstate(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public WebElement videoWebElements;
    public void videoWebElementsCheck(){
        clickOnElement(videoWebElementsByXpath);
    }
    public void validateVideoWebElements(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public WebElement todaysPaper;
    public void todaysPaperCheck(){
        clickOnElement(todaysPaperByClassName);
    }
    public void validateTodaysPaper(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public WebElement toggleMenuChecking;
    public void toggleMenuCheck(){
        clickOnElement(toggleMenuCheckingById);
    }
    public boolean toggleMenuIsEnable(){
        return toggleMenuChecking.isEnabled();
    }
    public void validateClickToggleMenu(){
        Assert.assertTrue(toggleMenuIsEnable());
    }
    public WebElement logInButton;
    public void logInButtonCheck(){
        clickOnElement(logInButtonByXpath);
    }
    public void validateLogInButton(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public WebElement spanishLanguage;
    public void spanishLanguageCheck(){
        clickByLinkText(spanishLanguageByLinkTest);
    }
    public void validateSpanishLanguage(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public WebElement chineseLanguage;
    public void chineseLanguageCheck(){
        clickByLinkText(chineseLanguageByLinkTest);
    }
    public void validateChineseLanguage(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.NAME, using=subscribeNowByName)
    public WebElement subscribeNow;

    public void subscribeNowCheck(){
        subscribeNow.click();
    }
    public void validateSubscribeNow(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
}
