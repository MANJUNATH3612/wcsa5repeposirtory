package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase4 {

	public static void main(String[] args) throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'me')]")).sendKeys("manju@123");
		driver.findElement(By.xpath("//input[contains(@type,'word')]")).sendKeys("742342377");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Log in')])]")).click();
	    
	

	}

}
