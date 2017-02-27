package github.cappetta.testing_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class DashboardPageTest {
    WebDriver driver;
    PageObjects pageObjects;
    LaunchBrowser launchBrowser;
    String RECORDFIELDS = ".projectFields.projectFields.layout-row";
    String TERM = "input_0";

    @BeforeTest
    public WebDriver launchWebApp(){
        launchBrowser = new LaunchBrowser();
        driver = launchBrowser.launchChrome();
        return this.driver;

    }

    @Test
    public void checkForTitle(){
        String expectedTitle = "project dashboard";
        pageObjects = new PageObjects();
        Assert.assertEquals("this", "that");
        Assert.assertEquals(pageObjects.getPageTitle(driver),expectedTitle);
    }

    @Test //Verify Records exist on the page - Protractor would be nice for the this
    public void checkForRecords(){
        pageObjects = new PageObjects();
        Assert.assertTrue(pageObjects.recordsPresent(driver),"There not any records on the page FAILURE");
    }

    @Test //Verify that a MORE link or button exist on the page
    public void checkForMoreButton(){
        pageObjects = new PageObjects();
        Assert.assertTrue(pageObjects.moreButtonPresent(driver),"Someone forgot to add a MORE button FAILURE");
    }

    @Test //Verify Records exist on the page
    public void checkForStats(){
        pageObjects = new PageObjects();
        Assert.assertTrue(pageObjects.statsPresent(driver),"Cannot find a summary of stats on the page FAILURE");
    }
    @Test //verify search/filter is on UI
    public void checkForSearch(){
        pageObjects = new PageObjects();
        Assert.assertTrue(pageObjects.searchPresent(driver),"Cannot find a filter/search option the page FAILURE");
    }

    @Test //filter by Product owner
    public void enterFilterTermProjOwner() throws Exception{
        int count = 0;
        String query = "smith";//on a big scale this would be set elsewhere in config or pom
        WebElement element = driver.findElement(By.id(TERM));
        element.sendKeys(query);
        Thread.sleep(8000);
        List <WebElement> e = driver.findElements(By.cssSelector(RECORDFIELDS));
        int x = e.size();
        for(int i = 0; i<x;i++){
            String check = e.get(i).getText().toLowerCase();
            if(check.contains(query))count = count + 1;
        }
        int actual = count;
        int expected = e.size()/3; //total # of edit rows on page 3 must be project owner and contain query
        Assert.assertEquals(actual, expected);
    }


    @AfterTest
    public void closeApplication(){
        driver.quit();
    }


}