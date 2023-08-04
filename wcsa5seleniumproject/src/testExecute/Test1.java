package testExecute;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void parallel1() {
	  
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  WebDriver driver1=new ChromeDriver();
	  driver1.manage().window().maximize();
	  driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver1.get("https://www.gooogle.com/");
	  driver1.switchTo()
	  Thread.sleep(0);
	  Reporter.log("This is the demo class!!",true );
  }
}
