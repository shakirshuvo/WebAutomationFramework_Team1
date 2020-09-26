package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static home.HomeWebElements.*;

public class Home extends CommonAPI {

    String actual;
    String expected;

    public void waitTimeForPageLoad(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7000, TimeUnit.MILLISECONDS);
    }

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
@FindBy(how = How.XPATH, using =worldByXpath)
    public WebElement world;
    public void worldCheck(){

        clickOnElement(worldByXpath);
    }
    public void validateWorld(){
        waitTimeForPageLoad();
        actual= driver.getTitle();
        expected="World News - The New York Times";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how = How.XPATH, using =USByXpath)
    public WebElement us;
    public void usCheck(){
        clickOnElement(USByXpath);
    }
    public void validateUs(){
        waitTimeForPageLoad();
        actual= driver.getTitle();
        expected="U.S. News - The New York Times";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how = How.XPATH, using =politicsByXpath)
    public WebElement politics;
    public void politicsCheck(){
        clickOnElement(politicsByXpath);
    }
    public void validatePolitics(){
        waitTimeForPageLoad();
        actual= driver.getTitle();
        expected="Politics - The New York Times";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how = How.XPATH, using =nyNewsByXpath)
    public WebElement nyNews;
    public void nyNewsCheck(){
        clickOnElement(nyNewsByXpath);
    }
    public void validateNyNews(){
        waitTimeForPageLoad();
        actual= driver.getTitle();
        System.out.println(actual);
        expected="New York - The New York Times";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how = How.XPATH, using =businessNewsByXpath)
    public WebElement businessNews;
    public void businessNewsCheck(){
        mouseHoverByXpath(businessNewsByXpath);
        clickOnElement(businessNewsByXpath);
    }
    public void validateBusinessNews(){
        waitTimeForPageLoad();
        actual= driver.getTitle();
        expected="Business - The New York Times";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how = How.XPATH, using =opinionByXpath)
    public WebElement opinion;
    public void opinionCheck(){
        mouseHoverByXpath(opinionByXpath);
        clickOnElement(opinionByXpath);
    }
    public void validateOpinion(){
        waitTimeForPageLoad();
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Opinion - The New York Times";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how = How.XPATH, using =techNewsByXpath)
    public WebElement techNews;
    public void techNewsCheck(){
        mouseHoverByXpath(techNewsByXpath);
        clickOnElement(techNewsByXpath);
    }
    public void validateTechNews(){
        waitTimeForPageLoad();
        actual= driver.getTitle();
        expected="Technology - The New York Times";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how = How.XPATH, using =scienceNewsByXpath)
    public WebElement scienceNews;
    public void scienceNewsCheck(){
        mouseHoverByXpath(scienceNewsByXpath);
        clickOnElement(scienceNewsByXpath);
    }
    public void validateScienceNews(){
        waitTimeForPageLoad();
        actual= driver.getTitle();
        expected="Science - The New York Times";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how = How.XPATH, using =healthNewsByXpath)
    public WebElement healthNews;
    public void healthNewsCheck(){
        mouseHoverByXpath(healthNewsByXpath);
        clickOnElement(healthNewsByXpath);
    }
    public void validateHealthNews(){
        waitTimeForPageLoad();
        actual= driver.getTitle();
        expected="Health - The New York Times";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how = How.XPATH, using =sportsNewsByXpath)
    public WebElement sportsNews;
    public void sportsNewsCheck(){
        mouseHoverByXpath(sportsNewsByXpath);
        clickOnElement(sportsNewsByXpath);
    }
    public void validateSportsNews(){
        waitTimeForPageLoad();
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Sports - The New York Times";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how = How.XPATH, using =artsNewsByXpath)
    public WebElement artsNews;
    public void artsNewsCheck(){
        mouseHoverByXpath(artsNewsByXpath);
        clickOnElement(artsNewsByXpath);
    }
    public void validateArtsNews(){
        waitTimeForPageLoad();
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Arts - The New York Times";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how = How.XPATH, using =booksNewsByXpath)
    public WebElement booksNews;
    public void booksNewsCheck(){
        mouseHoverByXpath(booksNewsByXpath);
        clickOnElement(booksNewsByXpath);
    }
    public void validateBooksNews(){
        waitTimeForPageLoad();
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Books - The New York Times";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how = How.XPATH, using =styleNewsByXpath)
    public WebElement styleNews;
    public void styleNewsCheck(){
        mouseHoverByXpath(styleNewsByXpath);
        clickOnElement(styleNewsByXpath);
    }
    public void validateStyleNews(){
        waitTimeForPageLoad();
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Style - The New York Times";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how = How.XPATH, using =foodNewsByXpath)
    public WebElement foodNews;
    public void foodNewsCheck(){
        mouseHoverByXpath(foodNewsByXpath);
        clickOnElement(foodNewsByXpath);
    }
    public void validateFoodNews(){
        waitTimeForPageLoad();
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Food - The New York Times";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how = How.XPATH, using =travelNewsByXpath)
    public WebElement travelNews;
    public void travelNewsCheck(){
        mouseHoverByXpath(travelNewsByXpath);
        clickOnElement(travelNewsByXpath);
    }
    public void validateTravelNews(){
        waitTimeForPageLoad();
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Travel - The New York Times";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how = How.XPATH, using =magazineByXpath)
    public WebElement magazine;
    public void magazineCheck(){
        mouseHoverByXpath(magazineByXpath);
        clickOnElement(magazineByXpath);
    }
    public void validateMagazine(){
        waitTimeForPageLoad();
        actual= driver.getTitle();
        System.out.println(actual);
        expected="The New York Times Magazine - The New York Times";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how = How.XPATH, using =t_MagazineByXpath)
    public WebElement t_magazine;
    public void t_magazineCheck(){
        mouseHoverByXpath(t_MagazineByXpath);
        clickOnElement(t_MagazineByXpath);
    }
    public void validate_t_Magazine(){
        waitTimeForPageLoad();
        actual= driver.getTitle();
        System.out.println(actual);
        expected="T Magazine - The New York Times";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how = How.XPATH, using =realEstateNewsByXpath)
    public WebElement realEstate;
    public void realEstateCheck(){
        mouseHoverByXpath(realEstateNewsByXpath);
        clickOnElement(realEstateNewsByXpath);
    }
    public void validateRealEstate(){
        waitTimeForPageLoad();
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Real Estate - The New York Times";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how = How.XPATH, using =videoWebElementsByXpath)
    public WebElement videoWebElements;
    public void videoWebElementsCheck(){
        mouseHoverByXpath(videoWebElementsByXpath);
        clickOnElement(videoWebElementsByXpath);
    }
    public void validateVideoWebElements(){
        waitTimeForPageLoad();
        actual= driver.getTitle();
        System.out.println(actual);
        expected="Video - The New York Times";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how = How.CLASS_NAME, using =todaysPaperByClassName)
    public WebElement todaysPaper;
    public void todaysPaperCheck(){
        waitUntilClickAble(By.className(todaysPaperByClassName));
        clickOnElement(todaysPaperByClassName);
    }
    public void validateTodaysPaper(){
        waitTimeForPageLoad();
        validateByText(validateTodaysPaperTextByXpath, "Today’s Paper");
    }
    @FindBy(how = How.ID, using =toggleMenuCheckingById)
    public WebElement toggleMenuChecking;
    public void toggleMenuCheck(){
        waitUntilSelectable(By.id(toggleMenuCheckingById));

        clickOnElement(toggleMenuCheckingById);
    }
    public boolean toggleMenuIsEnable(){
        return toggleMenuChecking.isEnabled();
    }
    public void validateClickToggleMenu(){
        Assert.assertTrue(toggleMenuIsEnable());
    }
    @FindBy(how = How.XPATH, using =logInButtonByXpath)
    public WebElement logInButton;
    public void logInButtonCheck(){
        mouseHoverByXpath(logInButtonByXpath);

        clickOnElement(logInButtonByXpath);
    }
    public void validateLogInButton(){
        waitTimeForPageLoad();

        validateByTextByClass(validateLogInButtonTextByClass, "Log in to your account");
    }
    @FindBy(how = How.LINK_TEXT, using =spanishLanguageByLinkTest)
    public WebElement spanishLanguage;
    public void spanishLanguageCheck() throws InterruptedException {
        waitUntilClickAble(By.linkText(spanishLanguageByLinkTest));
        clickOnElement(spanishLanguageByLinkTest);
    }
    public void validateSpanishLanguage(){
        waitTimeForPageLoad();
        actual= driver.getTitle();
        expected="The New York Times en Español - The New York Times";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how = How.LINK_TEXT, using =chineseLanguageByLinkTest)
    public WebElement chineseLanguage;
    public void chineseLanguageCheck(){
        waitUntilClickAble(By.linkText(chineseLanguageByLinkTest));
        clickOnElement(chineseLanguageByLinkTest);
    }
    public void validateChineseLanguage(){
        driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
        actual= driver.getTitle();
        System.out.println(actual);
        expected="纽约时报中文网 国际纵览";
        Assert.assertEquals(actual, expected, "failed");
    }
    @FindBy(how= How.NAME, using=subscribeNowByName)
    public WebElement subscribeNow;

    public void subscribeNowCheck(){

        clickOnElement(subscribeNowByName);
    }
    public void validateSubscribeNow(){
        waitTimeForPageLoad();
        actual= driver.getTitle();
        System.out.println(actual);
        expected="The New York Times: Digital and Home Delivery Subscriptions";
        Assert.assertEquals(actual, expected, "failed");
    }
}
