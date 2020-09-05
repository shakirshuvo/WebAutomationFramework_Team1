package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static home.HomeWebElements.*;

public class HomePage extends CommonAPI {

    @FindBy(how = How.XPATH,using = FindReserveXP)
    public WebElement findReserve;

    public void setFindReserve() throws InterruptedException {
        findReserve.click();
        sleepFor(3);
    }
}
