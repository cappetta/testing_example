package github.cappetta.testing_example;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestProjectDashboard {


    public RemoteWebDriver driver;
    public static String appURL = "http://caffeinestate.com/qa/client/";

    @BeforeTest
    public void  launchWebApp() throws Exception {
        driver = new RemoteWebDriver(
                new URL("http://lab:4444/wd/hub"),
                DesiredCapabilities.firefox());
//                DesiredCapabilities.chrome());
        System.out.println("*** Navigation to Application ***");
        driver.navigate().to(appURL);

    }

    //        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
//        WebDriver driver = new ChromeDriver();
//
//        driver = new RemoteWebDriver(
//                new URL("http://lab:4444/wd/hub"),
//                DesiredCapabilities.firefox());
//                DesiredCapabilities.chrome());



    @Test
    public void checkTitle() throws Exception {
        String strPageTitle = driver.getTitle();
        System.out.println("*** Verifying page title ***");
        Assert.assertTrue(strPageTitle.equalsIgnoreCase("Project Dashboard"), "Page title doesn't match");
    }

    @Test
    public void checkStats() throws Exception {
        System.out.println("*** Verifying Stats Row exists ***");
        Assert.assertTrue(driver.findElements(By.id("statsRow")).size() > 0);

    }

    @Test
    public void checkSearchExists() throws Exception {
        System.out.println("*** Verifying Search Container Exists ***");
        Assert.assertTrue(driver.findElements(By.id("searchContainer")).size() > 0);
    }


    @Test
    public void checkMoreButtong() throws Exception {
        System.out.println("*** Verifying Search Container Exists ***");
        Assert.assertTrue(driver.findElements(By.xpath("//*[@id=\"moreInfoButton\"]")).size() > 0);
        //*[@id="moreInfoButton"]
    }


    @Test
    public void checkEditIcon() throws Exception {
        System.out.println("*** Verifying EditIcons Exists ***");
        Assert.assertTrue(driver.findElements(By.xpath("//*[@id=\"editIcon\"]")).size() > 3);
    }


    @Test
    public void checkRecordExists() throws Exception {
        System.out.println("*** Verifying Record Container Exists ***");
        Assert.assertTrue(driver.findElements(By.id("record")).size() > 0);
    }

    @Test
    public void checkRecordAttributes() throws Exception {
        System.out.println("*** Verifying Record attributes Exists ***");
        Assert.assertTrue(driver.findElements(By.xpath("//*[@id=\"projSpan\"]")).size() > 0);
    }





    @AfterTest
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }


}