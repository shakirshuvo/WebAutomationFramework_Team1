package myAccount;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static myAccount.MyAccountWebElements.*;

public class MyAccount extends CommonAPI {

    @FindBy(how = How.XPATH, using = myAccountTabXpathWebElement)
    public WebElement myAccountTab;
    @FindBy(how = How.XPATH, using = imAnEmployerOrPlanAdministratorLoginButtonXPathWebElement)
    public WebElement imAnEmployerOrPlanAdministratorLoginButton;
    @FindBy(how = How.XPATH, using = imAnEmployerOrPlanAdministratorRegisterButtonXPathWebElement)
    public WebElement imAnEmployerOrPlanAdministratorRegisterButton;

    /**
     * This method overs over 'My Account' tab and then click on 'I Am An Employee Or Plan Administrator' login button.
     */
    public void navigateToImAnEmployerOrPlanAdministrator(){
        driver.manage().window().maximize();
        mouseHoverByXpath(myAccountTabXpathWebElement);
        clickOnElement(imAnEmployerOrPlanAdministratorLoginButtonXPathWebElement);
        handleNewTab(driver);
    }

    /**
     * This method validates 'I Am An Employee Or Plan Administrator' login page with URL.
     */
    public void validateNavigateToImAnEmployerOrPlanAdministratorLogin(){
        Assert.assertEquals(getCurrentPageUrl(), imAnEmployerOrPlanAdministratorLoginPageURL);
    }

    /**
     * This method overs over 'My Account' tab and then click on 'I Am An Employee Or Plan Administrator' register button.
     */
    public void navigateToImAnEmployerOrPlanAdministratorRegister(){
        driver.manage().window().maximize();
        mouseHoverByXpath(myAccountTabXpathWebElement);
        clickOnElement(imAnEmployerOrPlanAdministratorRegisterButtonXPathWebElement);
        handleNewTab(driver);
    }

    /**
     * This method validates 'I Am An Employee Or Plan Administrator' register page with URL.
     */
    public void validateNavigateToImAnEmployerOrPlanAdministratorRegister(){
        Assert.assertEquals(getCurrentPageUrl(), imAnEmployerOrPlanAdministratorRegisterPageURL);
    }
}
