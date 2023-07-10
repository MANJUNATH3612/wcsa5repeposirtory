package roboatAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AssingmentOnRobotAction
{
	public static void main(String[] args, WebElement target) throws InterruptedException, AWTException
	{
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.get("https://www.bluestone.com");
		    driver.findElement(By.id("denyBtn")).click();
		    //move to watch jewellery
		   
		    
		    driver.findElement(By.xpath("//a[text()='Watch Jewellery']")).click();
		  
		  
		   act.moveToElement(target).perform();
		   driver.findElement(By.xpath("//a[text()='Band']")).click();
		   Thread.sleep(2000);
		    driver.findElement(By.xpath("//div[text()='Fliter by']"));
		   //copy
		   Robot robot = new Robot();
		   robot.keyPress(KeyEvent.VK_CONTROL);
		   robot.keyPress(KeyEvent.VK_C);
		   
		   
		   robot.keyRelease(KeyEvent.VK_CONTROL);
		   robot.keyRelease(KeyEvent.VK_C);
		   
		   //IDENTIFY THE SEARCH BOX
		   
		   driver.findElement(By.id("search_query_top_elestic_search")).click();
		   
		   //hit enter button
		   
		   robot.keyPress(KeyEvent.VK_ENTER);
		   robot.keyRelease(KeyEvent.VK_ENTER);
		   Thread.sleep(2000);
		   
		   if(driver.findElement(By.xpath("//span[text()='Designs']"))).isDisplayed())
		   {
			   Thread.sleep(2000);
			   driver.quit();
		   }
		   else
		   {
			   System.out.println("exception");
		   }
		   
		   
		   
		   
		   
		   
	}

}
