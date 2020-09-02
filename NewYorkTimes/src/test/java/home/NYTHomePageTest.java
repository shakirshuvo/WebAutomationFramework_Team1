package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class NYTHomePageTest extends CommonAPI {
   NYTHomePage homePage;

    @BeforeMethod
    public void getInit(){

        homePage = PageFactory.initElements(driver , NYTHomePage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
