package testExecute;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
	  WebDriver driver1=new EdgeDriver();
	  driver1.manage().window().maximize();
	  driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver1.get("https://www.selenium.dev/");
	  Thread.sleep(20);
	  Reporter.log("This is the demo class!!",true );
  }
}
