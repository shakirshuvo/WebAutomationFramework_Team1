package homeTest;

import base.CommonAPI;
import home.Home;
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
    public void setPersonalButtonTest() throws InterruptedException {
        object.setPersonalButton();
    }
    @Test
    public void setSmallBusinessTest() throws InterruptedException {
        object.setSmallBusiness();
    }
    @Test
    public void setWealthManagementTest() throws InterruptedException {
        object.setWealthManagement();
    }
    @Test
    public void setBusinessesInstitutionsTest() throws InterruptedException {
        object.setBusinessesInstitutions();
    }
    @Test
    public void setSecurityTest() throws InterruptedException {
        object.setSecurity();
    }

}
