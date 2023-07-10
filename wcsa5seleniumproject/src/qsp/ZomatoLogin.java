package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoLogin {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver .get("https://www.zomato.com/india");
		driver.findElement(By.linkText("sign up")).click();
		driver.findElement(By.linkText("sc-rbbb40-1 iFnyeo sc-dXfzlN eRZIZz"))
		
	}

}
