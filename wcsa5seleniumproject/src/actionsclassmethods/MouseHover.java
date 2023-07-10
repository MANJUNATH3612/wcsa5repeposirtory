package actionsclassmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover 
{
  private static WebElement target;

public static void main(String[] args) throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("goldcoins")).click();
		driver.findElement(By.id("denyBtn")).click();
		driver.findElement(By.xpath("//a[text()='coins']"));
		
		//to perform mouse action
		 Actions act = new Actions(driver);
		 
		 //to perform mousehover
	
		act.moveToElement(target).perform();
		
		driver.findElement(By.xpath("//span[text()='1gram'and @data-p='gold-coins-weight-1gms,m]")).click();
	    WebElement coin=driver.findElement(By.id("5920"));
	    if(coin.isDisplayed())
	    {
	    	Thread.sleep(2000);
	    	driver.quit();
	    }
	    else
	    {
	    	System.out.println("exception");
	    }
	    System.out.println();
		 
		
  }
}
