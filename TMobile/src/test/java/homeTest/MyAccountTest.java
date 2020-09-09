package homeTest;

import base.CommonAPI;
import home.MyAccount;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountTest extends CommonAPI {
    MyAccount object;
    @BeforeMethod
    public void init(){
        PageFactory.initElements(driver,MyAccount.class);
    }
//    @Test
//    public void setMyAccountTest() throws InterruptedException {
//        object.setMyAccount();
//
//    }

}