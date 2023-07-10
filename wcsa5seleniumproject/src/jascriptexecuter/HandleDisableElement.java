package jascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableElement
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.geckodriver.driver", "./drivers/geckodriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("file:///C:/Users/admin/Documents/disableEle.html");
	    //identify webelement
	    driver.findElement(By.id("i1")).sendKeys("admin");
	    
	    //handle thedisable web element
	    
	  JavascriptExecutor jsc= (JavascriptExecutor)driver;
	  jsc.executeScript("document.getElementById('i2').value='manager'");
	  
	  
	  //generate alert pop up
	  
	  driver.switchTo().alert().accept();
	  Thread.sleep(2000);
	  
	  jsc.executeScript("alert(Hello There.!!)");
	}

}
