package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:/Users/janak/Desktop/update/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		WebDriverManager.firefoxdriver().setup();
		//"webdriver.gecko.driver"
		driver = new FirefoxDriver();
		driver.get("https://www.bestbuy.com");
		
		//webdriver.edge.driver
		//webdriver.ie.driver
	}

}
