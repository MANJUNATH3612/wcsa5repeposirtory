package desleecetmethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exeptionhandle {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("file:///C:/Users/admin/Desktop/selenium%20data/web%20element/multiselecet.html");



		//identify dropdown on webpage
		WebElement dropdownElemet = driver.findElement(By.id("menu"));


		//handle a dropdown by create object

		Select sel = new Select(dropdownElemet);

		//read all the option of dropdown
		List<WebElement> allops = sel.getOptions();

		//to read list useing looping statement 

		for(WebElement op:allops)
		{
			if(op.getText().equals("cake"))
			{
				Thread.sleep(2000);
				op.click();
				break;
			}
		}


	}

}
