package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathtext 
{
  public static void main(String[] args) 
  {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver .get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//input[@name='email' ]")).sendKeys("manju@123");
		driver.findElement(By.xpath("//input[@name='pass' ]")).sendKeys("878856123");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
  }
}
