package actionsclassmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		
		WebElement scr1=driver.findElement(By.xpath("//a[text()='SALES']"));
		WebElement tar1=driver.findElement(By.xpath("//ol[@id='loan']/decendant::li"));
	    WebElement src2=driver.findElement(By.xpath("//a[text()='BANK']"));
		WebElement tar2=driver.findElement(By.xpath("//ol[@id='atm8']/decendant::li"));
		WebElement scr3=driver.findElement(By.xpath("//a[text()='5000']"));
		WebElement tar3=driver.findElement(By.xpath("//ol[@id='bank']/decendant::li"));
		WebElement scr4=driver.findElement(By.xpath("//a[text()='5000']"));
		WebElement tar4=driver.findElement(By.xpath("//ol[@id='atm7']/decendant::li"));
		
		
		Actions act = new Actions(driver);
		act.dragAndDrop(scr1, tar1).perform();
		Thread.sleep(20000);
		act.dragAndDrop(src2, tar2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(scr3, tar3).perform();
		Thread.sleep(2000);
		act.dragAndDrop(scr4, tar4).perform();
		
		
		if(driver.findElement(By.xpath("//a[text()='perfect']")).isDisplayed())
		{
			System.out.println("drag and drop is done");
			Thread.sleep(2000);
			driver.quit();
			
		}
		else 
		{
			System.out.println("drag and drop is not done");
		}
	}

}
