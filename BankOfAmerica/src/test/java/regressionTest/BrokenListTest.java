package regressionTest;


import base.CommonAPI;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.BrokenList;
import reporting.TestLogger;

import java.io.IOException;

class BrokenLinksTest extends CommonAPI {
    BrokenList brokenLinks;
    String url = "https://www.bankofamerica.com/";
    @BeforeMethod
    public void init(){
        brokenLinks= PageFactory.initElements(driver, BrokenList.class);
        driver.get(url);
    }
//
//    @Test
//    public void BrokenListTest() throws IOException {
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
//        brokenLinks.BrokenList();
//
//    }
}

