package readexceldata;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericReusableMethod 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedrier.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://127.0.0.1/login.do;jsessionid=5eu7mdunif6ko");
	    
	    
	    //read the data from excel file and test the login page
	    
	     Flib flib=new Flib();
		  driver.findElement(By.name("USERNAME")).sendKeys(flib.readExcelData("./data/ActiTime.xlsx"));
		  
		  driver.findElement(By.name("PASSWORD")).sendKeys(flib.readExcelData("./data/ActiTime.xlsx"));
		  driver.findElement(By.id("LoginButton")).click();
		  
		
	}

}
