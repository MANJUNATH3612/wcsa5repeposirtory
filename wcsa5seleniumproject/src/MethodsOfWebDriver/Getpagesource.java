package MethodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Getpagesource {
	

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.geckodriver.driver", "./drivers/geckodriver.exe");
		FireFoxDriver driver = new FireFoxDriver();	
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.switchTo().activeElement().sendKeys("omayo",Keys.ENTER);
		Thread.sleep(2000);
		//close to the parent browser
		//driver.close();
		driver.findElement("//a[text()=Open a popup window")).click();
		
		//Close parent as well as chaild browser
		driver.quit();
		
		
		
		
		}

}
