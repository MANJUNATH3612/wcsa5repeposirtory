package testNGPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class remo {
  @Test
  public void g() 
  {
	  
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  WebDriver driver1=new ChromeDriver();
	  driver1.manage().window().maximize();
	  driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver1.get("https://www.selenium.dev/");
	  Reporter.log("This is the demo class!!",true );
 }
}
