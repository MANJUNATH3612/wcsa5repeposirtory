package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closemethod
{
   
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		 WebDriver pageTitle = driver.getTitle()
        System.out.println(pageTitle);
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
