package actionsclassmethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextclickmethod
{

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("file:///C:/Users/admin/Desktop/selenium%20data/web%20element/singleselect%20dropdown.html");
			
			//to perform 
			Actions act=new Actions(driver);
			act.contextClick(target).perform();
			
			
	}

}
