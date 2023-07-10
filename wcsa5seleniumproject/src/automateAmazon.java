import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automateAmazon
{
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=Cj0KCQjwnf-kBhCnARIsAFlg493jAp_EWHP7nyZkYflo2ViixOdu_n1cwmfMrEcBUvbZ6KRhrO_HNKcaAnXWEALw_wcB");
		driver.findElement(By.id("denyBtn")).click();
		driver.findElement(By.id("//span[text()='Not now']")).click();
		Thread.sleep(2000);
		`
		
	}

}
