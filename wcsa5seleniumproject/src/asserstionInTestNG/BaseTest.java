package asserstionInTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest
{
	static WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" http://laptop-knl22f4g/login.do");
	}
	
	
	
	//Implimitation of take screenshoot
	
	         public void failedmethod()
	         {
	        	 @SuppressWarnings("unchecked")
				TakeScreenshot ts = (TakeScreenshot) driver;
	        	
	        	 
	         }
	
	
	
	
	
	
  @AfterMethod
  public void tearDown()
  {
	  driver.quit();
  }
}