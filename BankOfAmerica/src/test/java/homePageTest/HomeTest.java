package homePageTest;

import base.CommonAPI;
import homePage.Home;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends CommonAPI {
    Home object;
    @BeforeMethod
    public void init(){
        object=PageFactory.initElements(driver,Home.class);
    }
    @Test
    public void setCheckingButtonTest() throws InterruptedException {
        object.setCheckingButton();
    }

}
