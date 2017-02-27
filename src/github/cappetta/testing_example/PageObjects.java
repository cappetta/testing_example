package github.cappetta.testing_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjects {
	
private By stats; 
private By record;
private By moreInfo; 
private By recordFields; 
private By search; 	

	public PageObjects() {
		stats = By.id("recordStats");
		record = By.cssSelector(".col-sm-3.projCard.ng-scope");
		moreInfo = By.id("moreInfoButton");
		recordFields = By.className("projectFields");
		search = By.id("input_0");	

	}
	public String getPageTitle(WebDriver driver){
		String actualTitle = driver.getTitle().toLowerCase();
		return actualTitle;
		}
	public boolean statsPresent(WebDriver driver){
		Boolean isPresent = driver.findElements(stats).size() > 0;
		return isPresent;
		}
	public boolean recordsPresent(WebDriver driver){
		Boolean isPresent = driver.findElements(record).size() > 0;
		return isPresent;
		}
	public boolean moreButtonPresent(WebDriver driver){
		Boolean isPresent = driver.findElements(moreInfo).size() > 0;
		return isPresent;
		}
	public boolean searchPresent(WebDriver driver){
		Boolean isPresent = driver.findElements(search).size() > 0;
		return isPresent;	
		
	}
	
}


