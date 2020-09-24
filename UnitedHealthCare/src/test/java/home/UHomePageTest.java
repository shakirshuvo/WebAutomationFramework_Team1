package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UHomePageTest extends CommonAPI {
    UHomePage homePage;

    @BeforeMethod
    public void getInit(){

        homePage = PageFactory.initElements(driver , UHomePage.class);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    /**
     * test search element
     */
    @Test
    public void testSearchBoxElement(){
        homePage.searchBox();
        homePage.clickOnSearchButton();
        homePage.validateSearch();
    }

    /**
     * test brokers tab
     *
     */
    @Test
    public void testBrokers(){
        homePage.clickOnBrokers();
        homePage.validateClickOnBrokers();
    }

    /**
     * test medicare tab
     */
    @Test
    public void testClickOnMedicare(){
        homePage.clickOnMedicare();
        homePage.validateClickOnMedicare();
    }

    /**
     * test for providers tab
     */
    @Test
    public void testClickOnForProviders(){
        homePage.clickOnForProviders();
        homePage.validateClickOnForProviders();
    }

    /**
     * test click on for employers tab
     */
    @Test
    public void testClickOnForEmployers(){
        homePage.clickOnForEmployersTab();
        homePage.validateClickOnForEmployers();
    }
}
