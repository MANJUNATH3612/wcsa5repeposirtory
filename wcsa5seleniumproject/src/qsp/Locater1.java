package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locater1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver .get("https://www.netflix.com/in/login");
		
		
		//To find webelement we use locaters
		driver.findElement(By.name("id_userLoginId"));.sendKeys("manjunathhattali36651@gmail.com");//Username Tesxt box
		
        
		driver.findElement(By.id("id_password")); .sendKeys("fddfbsdh");
		driver.findElement(By.xpath("//button@[=btn login-button btn-submit btn-small"));.click();
			
	}

}
