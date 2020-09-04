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
    @Test(enabled = true)
    public void testValidateNavigateToImAnEmployerOrPlanAdministratorLogin(){
        myAccount.navigateToImAnEmployerOrPlanAdministrator();
        myAccount.validateNavigateToImAnEmployerOrPlanAdministratorLogin();
    }

    /**
     * This test validates that the user can navigate to 'I Am An Employee Or Plan Administrator' register page.
     */
    @Test
    public void testValidateNavigateToImAnEmployerOrPlanAdministratorRegister(){
        myAccount.navigateToImAnEmployerOrPlanAdministratorRegister();
        myAccount.validateNavigateToImAnEmployerOrPlanAdministratorRegister();
    }

    /**
     * This test validates that the user can enter a zip code from the homepage and be able to navigate to 'About You' form page
     * using URL.
     * @throws InterruptedException
     */
    @Test
    public void testValidateStartQuote() throws InterruptedException {
        myAccount.startQuote();
        myAccount.validateStartQuote();
    }

    /**
     * This test validates that the user can fill out 'About You' form. After filling out the form, the user should be able to see
     * 'Need Help? 1-800-333-9238'on the following page.
     * @throws InterruptedException
     */
    @Test
    public void testFillOutAboutYou() throws InterruptedException {
        myAccount.fillOutAboutYou();
        myAccount.validateAddVehiclePopUpIsDisplayed();
    }
}
