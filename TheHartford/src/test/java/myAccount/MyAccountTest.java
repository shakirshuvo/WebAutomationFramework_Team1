package myAccount;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class MyAccountTest extends CommonAPI {

    MyAccount myAccount;

    @BeforeMethod
    public void getInit(){
        myAccount = PageFactory.initElements(driver, MyAccount.class);
        driver.manage().window().maximize();
    }

    /**
     * This test validates that the user can navigate to 'I Am An Employee Or Plan Administrator' login page.
     */
    @Test(enabled = true)
    public void testValidateNavigateToImAnEmployerOrPlanAdministratorLogin(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        myAccount.navigateToImAnEmployerOrPlanAdministrator();
        myAccount.validateNavigateToImAnEmployerOrPlanAdministratorLogin();
    }

    /**
     * This test validates that the user can navigate to 'I Am An Employee Or Plan Administrator' register page.
     */
    @Test
    public void testValidateNavigateToImAnEmployerOrPlanAdministratorRegister(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        myAccount.navigateToImAnEmployerOrPlanAdministratorRegister();
        myAccount.validateNavigateToImAnEmployerOrPlanAdministratorRegister();
    }

}
