package testNGPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f()
  {
	  
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.google.com/search?q=java&oq=java&aqs=chrome..69i57j69i59l3j69i60l3j69i65.486j0j7&sourceid=chrome&ie=UTF-8");
	  
	  Reporter.log("This is the demo class!!" ,true );
  } 
	  
	 
}
