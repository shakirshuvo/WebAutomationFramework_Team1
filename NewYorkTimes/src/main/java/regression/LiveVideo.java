package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static regression.RegressionElements.liveVideoValidationXP;
import static regression.RegressionElements.liveVideoXP;

public class LiveVideo extends CommonAPI {
    @FindBy(how = How.XPATH,using = liveVideoXP)
    public WebElement liveVideo;
    @FindBy(how = How.XPATH,using = liveVideoValidationXP)
    public WebElement liveVideoValidation;

    public void setLiveVideo(){
        liveVideo.click();

    }
    public void setLiveVideoValidation() throws InterruptedException {
        String actualText=liveVideoValidation.getText();
        String expectedText="Watch Live: R.N.C. Night 3 Video and Analysis";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
        sleepFor(3);
    }
}
