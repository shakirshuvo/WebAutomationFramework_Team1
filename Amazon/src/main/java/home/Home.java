package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Home extends CommonAPI {


    public String searchBox = "twotabsearchtextbox";
    public String searchHandSanitizer = "Hand sanitizer";
    public String searchButton = "nav-input";
    public String handSanitizerActualText = "//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]";
    public String handSanitizerExpectedText = "\"Hand sanitizer\"";

    @FindBy(how = How.ID, using = "searchDropdownBox")
    public static WebElement allDropDown;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-link-accountList\"]/div/span")
    public static WebElement helloSignIn;

    @FindBy(how = How.CLASS_NAME, using = "nav-action-inner")
    public static WebElement signInMain;

    @FindBy(how = How.ID, using = "ap_email")
    public static WebElement signInEmailAddress;

    @FindBy(how = How.CLASS_NAME, using = "a-button-input")
    public static WebElement continueSignIn;

    @FindBy(how = How.ID, using = "ap_password")
    public static WebElement signInPassword;

    @FindBy(how = How.ID, using = "signInSubmit")
    public static WebElement signIn;

    @FindBy(how = How.CLASS_NAME, using = "a-alert-heading")
    public static WebElement invalidEmailSignIn;

    @FindBy(linkText = "We will email you a One Time Password (OTP) to authenticate your request.")
    public static WebElement captcha;

    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[7]/ul/li[8]/a")
    public static WebElement helpLink;

    @FindBy(partialLinkText = "Hello. What can we help you with?")
    public static WebElement helloWhatCanWeHelpYouWith;

    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[1]")
    public static WebElement todaysDealTab;



    public List<String> getItems() {
        List<String> itemsList = new ArrayList<>();
        itemsList.add("watch");
        itemsList.add("Rage Against The Machine");
        return itemsList;
    }

    public void typeItemName(String value) {
        driver.findElement(By.id(searchBox)).sendKeys(value);
    }

    public void clearTypeAndClickOnSearch() {
        List<String> list = getItems();
        for (int i = 0; i < list.size(); i++) {
            driver.findElement(By.id(searchBox)).clear();
            typeItemName(list.get(i));
            driver.findElement(By.id(searchBox)).submit();
        }
    }

    public List<String> getListOfString(List<WebElement> list) {
        List<String> items = new ArrayList<String>();
        for (WebElement element : list) {
            items.add(element.getText());
        }
        return items;
    }

    public List<WebElement> getListOfWebElementsById(String locator) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.id(locator));
        return list;
    }

    public void mouseOverSignIn() throws InterruptedException {
        Actions action = new Actions(driver);
        WebElement features = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
        action.moveToElement(features).build().perform();
        driver.findElement(By.className("nav-action-inner")).click();
    }


    public void signIn(String email, String password) throws InterruptedException {
        mouseOverSignIn();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("ap_email")).sendKeys(email);
        Thread.sleep(1000);
        driver.findElement(By.className("a-button-input")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("ap_password")).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(1000);
    }

    public static void clickHelpLink(){
        helpLink.click();
    }

    public static void clickTodaysDeal(){
        todaysDealTab.click();
    }




}
