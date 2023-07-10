import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowhandlesmethod
{
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		//get the handle or address of current or parent window
		String parent = driver.getWindowHandle();
		System.out.println("addres of parent window"+parent);		
		//lunch to the chaild window
		
		driver.findElement(By.partialLinkText("open a popup window")).click();
		//get the handle address of chaild window only
	      String chaildhandle = driver.getWindowHandle();
		System.out.println("adress of the chaild window"+chaildhandle);
		Thread.sleep(2000);
		//get the handle or address of chaild only
		Set<String> allhandle = driver.getWindowHandles();
		//read addres by using looping statemnt
		for(String wh:allhandle)
		{
			System.out.println();
	}				
		
		}

}
