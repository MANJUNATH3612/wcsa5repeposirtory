package popupprograme;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Notificationpopup
{
	static WebDriver driver;
public static void main(String[] args) 
{
	
	
	
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	//handle notifi popup
	Scanner co = new Scanner(System.in);
	System.out.println("Enter Browservalue");
	String browservalue = co.next();
	
	if(browservalue.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co1=new ChromeOptions();
		driver=new ChromeDriver(co1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.easemytrip.com/");
		}
	else if(browservalue.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 FirefoxOptions co2 = new FirefoxOptions();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.easemytrip.com/");
}
	else
	{
		System.out.println("enter valid browser value");
	}
		
		
}

   








}
