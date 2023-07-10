package freamhandaling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bluestonefreamhandle 
{
  public static void main(String[] args) throws InterruptedException 
  {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		
		Thread.sleep(2000);
		//using by string name or id 2
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		//1.use a frame by int index 1
	    //driver.switchTo().frame(5);
		driver.switchTo().frame("fc_widget");//
		//3.Webelement frameelement
		WebElement chatbox = driver.findElement(By.id("chat-icon"));
	    
	    driver.findElement(By.id("chat-icon")).click();
	    WebDriverWait web = new WebDriverWait(driver, Duration.ofSeconds(30));
	   // web.until(ExpectedConditions.elementToBeClickable("chat-icone")).click();
	    
	    
	    Thread.sleep(2000);
	    //switch the control again back the main webpage
	    driver.switchTo().defaultContent();
	    driver.findElement(By.id("chat-fc-name")).sendKeys("manjunath");
	    driver.findElement(By.id("chat-fc-email")).sendKeys("manju@123");
	    driver.findElement(By.id("chat-fc-mobile")).sendKeys("8788553852");
	    
	    
	    //switch the control again back the main webpage
	    
	    //driver.switchTo().defaultContent();
	    
}

}
