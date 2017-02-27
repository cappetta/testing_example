package github.cappetta.testing_example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//a place to to handle launching the browsers - this test only chrome
public class LaunchBrowser {
private WebDriver driver;
private String url; 

public LaunchBrowser(){
		//path to chrome.exe on local machine TODO: <absolutepath>/resources
		System.setProperty("webdriver.chrome.driver","resources/chromedriver");
		driver = new ChromeDriver();
		url = "http://caffeinestate.com/qa/client/"; //can set in pom or xml put here for ease of use 
		}
//usually would provide switch statement with config file or @parameters or do something with grid or run multi browsers when running automation
	public WebDriver launchChrome(){
		driver.navigate().to(url);
		driver.manage().window().maximize(); // maximize window size
		return driver;
	  }	
	
}
