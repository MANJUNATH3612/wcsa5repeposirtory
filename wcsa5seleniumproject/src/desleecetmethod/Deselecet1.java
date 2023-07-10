package desleecetmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deselecet1
{
   public static void main(String[] args) 
   {
	
	   System.setProperty("webdriver.geckodriver.driver", "./drivers/geckodriver.exe");
	   WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	   
   }
}
