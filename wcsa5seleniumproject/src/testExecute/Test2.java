package testExecute;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void parallel2() {
	  System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	  WebDriver driver1=new FirefoxDriver();
	  driver1.manage().window().maximize();
	  driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver1.get("https://www.selenium.dev/");
	  Reporter.log("This is the demo class!!",true );
  }
}
