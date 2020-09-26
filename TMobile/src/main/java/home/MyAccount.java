package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageWebElements.*;

public class MyAccount extends CommonAPI {
    @FindBy(how = How.XPATH,using = myAccountButtonXP)
    public WebElement myAccountButton;
    @FindBy(how = How.XPATH,using = logInButtonXP)
    public WebElement logInButton;
    @FindBy(how = How.ID,using = logInFieldID)
    public WebElement logInField;
    @FindBy(how = How.ID,using = nextButtonID)
    public WebElement nextButton;
    @FindBy(how = How.XPATH,using = myAccountValidationXP)
    public WebElement myAccountValidation;

    public void setMyAccount() throws InterruptedException {
        myAccountButton.click();
        sleepFor(4);
        logInButton.click();
        sleepFor(2);
        logInField.sendKeys("9293167769");
        nextButton.click();
        String actualText=myAccountValidation.getText();
        String expectedText="Email or Phone Number or Username";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");


    }
}
