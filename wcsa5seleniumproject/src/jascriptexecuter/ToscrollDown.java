package jascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToscrollDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.geckodriver.driver", "./drivers/geckodriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.selenium.dev");
	    
	    //scrolling opretion 
	    
	   JavascriptExecutor jsc = (JavascriptExecutor)driver;
	   
	   //scrolldown
	   
	   Thread.sleep(2000);
	   //scroll right
	   jsc.executeScript("Window.ScrollBy(500,0)");
	   
	   //perform Scrollleft
	   
	   jsc.executeScript("window.srollBy(0,-500)");
	   
	   
	
	
	}

}
