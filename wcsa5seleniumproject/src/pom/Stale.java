package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=3ie850jdnro0j");
		
		
		
		WebElement usnTB= driver.findElement(By.name("username"));
		usnTB.sendKeys("admin");
		
		WebElement pwdTB= driver.findElement(By.id("pwd"));
		pwdTB.sendKeys("manager");
		
		
	}

}
