package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime2 
{
	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 		WebDriver driver=new ChromeDriver();
	 		driver.manage().window().maximize();
	 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	 		driver.get("http://127.0.0.1/login.do;jsessionid=66eiuqc5uuoph");
	 		String loginpage = driver.getTitle();
	 		
	}

}
