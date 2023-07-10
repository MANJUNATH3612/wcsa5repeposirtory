package actionsclassmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Doubleclickmethod
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=3jol459ea912o");
		
		
		//to perform login opration
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	
		//home page
		//new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedCondition.)
		
		//clcik on setting module
		
		driver.findElement(By.xpath("//div[text()='settings']/ancestor::a")).click();
		//click on image
		driver.findElement(By.xpath("//a[.='log & color scheme']")).click();
		
		//click on costum logo
		driver.findElement(By.id("uploadNewLogiOption")).click();
		
		//click to buttton and selelect choose file
		
		driver.findElement(By.name("fromCustomInterfaceLogo.logo")).click();
		
		
		
		
		
		
		
	}
}
