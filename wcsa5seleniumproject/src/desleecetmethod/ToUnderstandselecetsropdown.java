package desleecetmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandselecetsropdown 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)));
	    driver.get("file:///C:/Users/admin/Desktop/selenium%20data/web%20element/multiselecet.html");
	    
		
	    
	    //identify dropdown on webpage
	    WebElement dropdownElemet = driver.findElement(By.id("menu"));
	    
	    
	    //handle a dropdown by create object
	    
	    Select sel = new Select(dropdownElemet);
	    
	    
	    //select the option from dropdown..
	     //use selection() method
	    Thread.sleep(20000);
	    sel.selectByIndex(2);
	    Thread.sleep(2000);
	    //
	    sel.deselectByIndex(3);
	    
	    
	}

}
