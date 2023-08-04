package testNGPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Rmo {
  @Test
  public void f()
  {
	  
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://pythontutor.com/render.html#mode=edit");
	  
	  Reporter.log("This is the demo class!!" ,true );
  } 
	  
	 
}

