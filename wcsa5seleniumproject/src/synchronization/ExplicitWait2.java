package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	    driver.get("http://127.0.0.1/login.do;jsessionid=432mrcn4vs3");
	    String acutallogin = driver.getTitle();
	    if(acutallogin.equals("actiTIME - Login"))
	      {
		   System.out.println("tile is matched ,test case passed");
		   driver.findElement(By.name("username")).sendKeys("admin");
		   driver.findElement(By.name("pwd")).sendKeys("manager");
		   driver.findElement(By.id("loginbutton")).click();
	      }
		   else
		   {
			   System.out.println("we will get exceptio");
		   }
	        
			
			String homepage = driver.getTitle();
			
			
			if(homepage.equals("actiTIME - Enter Time-Track")
			{
				System.out.println("title is matched ,test case is pass");
			}
			else
			{
				System.out.println("we will get ecception");
			}
	   
		
	   
	   
		   
		   }
	   }
           public static void explicitewaitmethod(webDriver driver,int sec,String tiltle)
           {
        	   //To apply explicite wait
        	   WebDriverWait wait=ner WebDriverWait(driver,Duration.ofscenonds(sec));
        	   wait.until(ExpectedCondtions.titleCondition(title)); 
           }


