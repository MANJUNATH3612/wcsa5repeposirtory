package screenshots;


import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import takescreenshot.RemoteWebDriver;

public class Screenshotway1 
{
	
   private static final String RemoteWebDriver = null;

public static void main(String[] args) 
   {
	   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.selenium.dev");
		Object rwd;
		Files ss = rwd.(RemoteWebDriver)
	
}
}
