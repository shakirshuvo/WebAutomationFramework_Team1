package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homePage.HomeWebElements.*;

public class Home extends CommonAPI {
    @FindBy(how = How.XPATH,using = checkingButtonXP)
    public WebElement checkingButton;

    public void setCheckingButton() throws InterruptedException {
        checkingButton.click();
        sleepFor(3);
    }

}
