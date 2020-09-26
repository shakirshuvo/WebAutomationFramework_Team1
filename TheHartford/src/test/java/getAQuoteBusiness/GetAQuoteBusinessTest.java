package getAQuoteBusiness;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetAQuoteBusinessTest extends CommonAPI {

GetAQuoteBusiness getAQuoteBusiness;

    @BeforeMethod
    public void getInit(){
        getAQuoteBusiness = PageFactory.initElements(driver, GetAQuoteBusiness.class);
    }

    @BeforeMethod
    public void maximizeWindow(){
        driver.manage().window().maximize();
    }

    /**
     * This test verifies that the user can navigate to 'Begin' page by URL.
     */
    @Test
    public void testVerifyNavigateToBeginPage(){
        getAQuoteBusiness.navigateToBeginPage();
        getAQuoteBusiness.verifyNavigateToBeginPage();
    }

    @Test
    public void testVerifyFillOutBeginFormWithoutTypeOfBusiness() throws InterruptedException {
        getAQuoteBusiness.fillOutBeginFormWithoutTypeOfBusiness();
        getAQuoteBusiness.verifyFillOutBeginFormWithoutTypeOfBusiness();
    }
}
