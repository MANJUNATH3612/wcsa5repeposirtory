import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loacter {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver .get("file:///C:/Users/admin/Desktop/selenium%20data/web%20element/username.html");
		WebElement username = driver.findElement(By.tagName("input"));
		username.sendKeys("qspider");
		Thread.sleep(1000000);
		driver.close();

	}

}
