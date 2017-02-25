package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSearchFilter {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://caffeinestate.com/qa/client/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSearchFilter() throws Exception {
    driver.get(baseUrl + "/qa/client/");
    driver.findElement(By.id("input_0")).clear();
    driver.findElement(By.id("input_0")).sendKeys("delivered");

driver.findElement(By.xpath("(//img[@id='editIcon'])[2]")).click();
driver.findElement(By.xpath("(//img[@id='editIcon'])[5]")).click();
driver.findElement(By.xpath("(//img[@id='editIcon'])[5]")).click();
driver.findElement(By.id("input_38")).clear();
driver.findElement(By.id("input_38")).sendKeys("1200.00");
driver.findElement(By.xpath("(//img[@id='editIcon'])[6]")).click();
driver.findElement(By.id("input_39")).clear();
driver.findElement(By.id("input_39")).sendKeys("delivered - status");
driver.findElement(By.xpath("(//img[@id='editIcon'])[3]")).click();
driver.findElement(By.xpath("(//button[@id='moreInfoButton'])[3]")).click();
driver.findElement(By.id("input_0")).clear();
driver.findElement(By.id("input_0")).sendKeys("");
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
