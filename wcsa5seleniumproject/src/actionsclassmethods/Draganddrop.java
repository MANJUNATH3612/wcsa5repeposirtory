package actionsclassmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Draganddrop 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https.//demo.guru99.com/test/drag.drop.html");
		WebElement scr1=driver.findElement(By.xpath("//a[text()='SALES']"));
		WebElement src2=driver.findElement(By.xpath("//a[text()='BANK']"));
		WebElement scr3=driver.findElement(By.xpath("//a[text()='5000']"));
		WebElement scr4=driver.findElement(By.xpath("//a[text()='5000']"));
		
		
		//.................................................................................
		
		
		WebElement tar1=driver.findElement(By.xpath("//ol[@id='loan']/decendant::li"));
	    WebElement tar2=driver.findElement(By.xpath("//ol[@id='atm8']/decendant::li"));
	    WebElement tar3=driver.findElement(By.xpath("//ol[@id='bank']/decendant::li"));
		WebElement tar4=driver.findElement(By.xpath("//ol[@id='atm7']/decendant::li"));
		
		
	}
	
	
}
