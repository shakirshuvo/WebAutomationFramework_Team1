package base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import reporting.ExtentManager;
import reporting.ExtentTestManager;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static WebDriver driver = null;
//    String url = "https://www.amazon.com";

    public String browserstack_username = "shakirjahangir1";
    public String browserstack_accesskey = "REz3o29QHkEXvcj7ausZ";
    public String saucelabs_username = "BugBuster";
    public String saucelabs_accesskey = "e68d96f6-4900-4dec-942b-1da200d5923c";

    @Parameters({"useCloudEnv", "cloudEnvName", "os", "os_version", "browserName", "browserVersion", "url"})

    @BeforeMethod
    public void setUp(@Optional("false") boolean useCloudEnv, @Optional("false") String cloudEnvName,
                      @Optional("OS X") String os, @Optional("10") String os_version, @Optional("chrome-options") String browserName, @Optional("34")
                              String browserVersion, @Optional("http://www.amazon.com") String url) throws IOException {
        //System.setProperty("webdriver.chrome.driver", "/Users/peoplentech/eclipse-workspace-March2018/SeleniumProject1/driver/chromedriver");
        if (useCloudEnv == true) {
            if (cloudEnvName.equalsIgnoreCase("browserstack")) {
                getCloudDriver(cloudEnvName, browserstack_username, browserstack_accesskey, os, os_version, browserName, browserVersion);
            } else if (cloudEnvName.equalsIgnoreCase("saucelabs")) {
                getCloudDriver(cloudEnvName, saucelabs_username, saucelabs_accesskey, os, os_version, browserName, browserVersion);
            }
        } else {
            getLocalDriver(os, browserName);
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.get(url);
        //driver.manage().window().maximize();
    }

    public WebDriver getLocalDriver(@Optional("mac") String OS, String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            if (OS.equalsIgnoreCase("OS X")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/src/main/driver/chromedriver");
            } else if (OS.equalsIgnoreCase("Windows")) {
                System.setProperty("webdriver.chrome.driver", "..\\Generic\\BrowserDriver\\windows\\chromedriver.exe");
            }
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("chrome-options")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            if (OS.equalsIgnoreCase("OS X")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/src/main/driver/chromedriver");
            } else if (OS.equalsIgnoreCase("Windows")) {
                System.setProperty("webdriver.chrome.driver", "..\\Generic\\BrowserDriver\\windows\\chromedriver.exe");
            }
            driver = new ChromeDriver(options);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            if (OS.equalsIgnoreCase("OS X")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/src/main/driver/geckodriver");
            } else if (OS.equalsIgnoreCase("Windows")) {
                System.setProperty("webdriver.gecko.driver", "..\\Generic\\BrowserDriver\\windows\\chromedriver.exe");
            }
            driver = new FirefoxDriver();

        } else if (browserName.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "..\\Generic\\BrowserDriver\\windows\\chromedriver.exe");
            driver = new InternetExplorerDriver();
        }
        return driver;

    }


    public WebDriver getCloudDriver(String envName, String envUsername, String envAccessKey, String os, String os_version, String browserName,
                                    String browserVersion) throws IOException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browser", browserName);
        cap.setCapability("browser_version", browserVersion);
        cap.setCapability("os", os);
        cap.setCapability("os_version", os_version);
        if (envName.equalsIgnoreCase("Saucelabs")) {
            //resolution for Saucelabs
            driver = new RemoteWebDriver(new URL("http://" + envUsername + ":" + envAccessKey +
                    "@ondemand.saucelabs.com:80/wd/hub"), cap);
        } else if (envName.equalsIgnoreCase("Browserstack")) {
            cap.setCapability("resolution", "1024x768");
            driver = new RemoteWebDriver(new URL("http://" + envUsername + ":" + envAccessKey +
                    "@hub-cloud.browserstack.com/wd/hub"), cap);
        }
        return driver;
    }

    @AfterMethod
    public void cleanUp(){
        //driver.close();
        driver.quit();
    }

    //ExtentReport
    public static ExtentReports extent;

    @BeforeSuite
    public void extentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }

    @BeforeMethod
    public void startExtent(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        String methodName = method.getName().toLowerCase();
        ExtentTestManager.startTest(method.getName());
        ExtentTestManager.getTest().assignCategory(className);
    }

    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }

    @AfterMethod
    public void afterEachTestMethod(ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));

        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);
        }

        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
        } else if (result.getStatus() == 2) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
        }
        ExtentTestManager.endTest();
        extent.flush();
        if (result.getStatus() == ITestResult.FAILURE) {
            captureScreenshot(driver, result.getName());
        }
        driver.quit();
    }

    @AfterSuite
    public void generateReport() {
        extent.close();
    }


    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }

    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        DateFormat df = new SimpleDateFormat("(yyMMddHHmmssZ");
        Date date = new Date();
        df.format(date);

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,
                    new File(System.getProperty("user.dir") + "/Screenshots/" + screenshotName + " " + df.format(date) + ".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
        }

    }
}