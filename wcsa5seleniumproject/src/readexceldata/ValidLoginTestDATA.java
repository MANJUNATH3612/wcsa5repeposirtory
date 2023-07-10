package readexceldata;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestDATA 
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("http://127.0.0.1/login.do;jsessionid=5eu7mdunif6ko");
		
		
		//reaad the data from excel file and test the login page
		
		Flib flib=new Flib();
		        flib.readExcelData("./data/ActiTime.xlsx","invalid",1,0);
		
		
		
	}

}
