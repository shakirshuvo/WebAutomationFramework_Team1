package myAccount;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountTest extends CommonAPI {

    MyAccount myAccount;

    @BeforeMethod
    public void getInit(){
        myAccount = PageFactory.initElements(driver, MyAccount.class);
    }

    /**
     * This test validates that the user can navigate to 'I Am An Employee Or Plan Administrator' login page.
     */
    @Test(enabled = false)
    public void testValidateNavigateToImAnEmployerOrPlanAdministratorLogin(){
        myAccount.navigateToImAnEmployerOrPlanAdministrator();
        myAccount.validateNavigateToImAnEmployerOrPlanAdministratorLogin();
    }

    /**
     * This test validates that the user can navigate to 'I Am An Employee Or Plan Administrator' register page.
     */
    @Test
    public void testvalidateNavigateToImAnEmployerOrPlanAdministratorRegister(){
        myAccount.navigateToImAnEmployerOrPlanAdministratorRegister();
        myAccount.validateNavigateToImAnEmployerOrPlanAdministratorRegister();
    }
}
