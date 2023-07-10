package jascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JE2
{
  public static void main(String[] args) throws InterruptedException
  {
	  System.setProperty("webdriver.geckodriver.driver", "./drivers/geckodriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://in.puma.com/in/en");
	    
	    
	    //identify webelement
	    driver.findElement(By.xpath("")).sendKeys("");
	    
	    //handle the disable web element
	    JavascriptExecutor jsc = (JavascriptExecutor)driver;
	    //scroll right
	    //hread.sleep(2000);
	   // jsc.executeScript("Window.ScrollBy(500,0)");
	    
	    //scroll left
	    Thread.sleep(2000);
	    jsc.executeScript("Window.scrollBy(0,-5000)");
	    
	    
	    
	    
	    
	    
	    
	
}
}
