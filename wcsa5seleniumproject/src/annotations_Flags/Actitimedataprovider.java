package annotations_Flags;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

public class Actitimedataprovider {
	
	@Test (dataProvider="actiTimeData")
	public void invaliloginMethod(String usn,String pass)
	{
		
		//AVOIDE ILLEGALE EXECPTION
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" http://laptop-knl22f4g/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("manager");
		driver.findElement(By.id("logButton")).click();
		driver.findElement(By.name("username")).clear();
		
		
		
	}
	

	
	@DataProvider(name="actiTimeData")
	public Object[][] testData()
	{
		Object[][] testData1 = new Object[5][2];
		testData1[0] [0]="ad_min";
		testData1[0] [1]= "man_ger";

		testData1[2] [0]="manager";
		testData1[2] [1]="admin";
		
		
		testData1[3] [0]="admin123";
		testData1[3] [1]="manager123";

	    testData1[4] [0]="@admin";
	    testData1[4] [1]="@manager";

	    		
	    testData1[5] [0]="123admin";
	    testData1[5] [1]="123manager";
		return testData1;
	}
}
