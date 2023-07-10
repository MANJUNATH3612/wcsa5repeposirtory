package jascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollParaticullerweb 
{
	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.geckodriver.driver", "./drivers/geckodriver.exe");
		    WebDriver driver = new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.get("https://www.selenium.dev/");
		    
		    //identify webelement
		    WebElement newselement = driver.findElement(By.xpath("//h2[text()='News'])"));
		    
		    //to perform srcolling oprtion for a news
		    //location of weblement
		    Point loc = newselement .getLocation();
		    int xaxis=loc.getX();
		    int yaxis = loc.getY();
		    Thread.sleep(2000);
		    JavascriptExecutor jsc=(JavascriptExecutor)driver;
		    
		    //jsc.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		    
		    jsc.executeScript("arguments[0].scrollIntoview(true)",newselement);
		    
		 //   Thread.sleep(2000);
		    
		    //jsc.executeScript("Window.scrollBy(0,5000)");
		    //jsc.executeScript("Window.scrollBy(0,-500)");
		    
		    
		    
		    
		    
		    
		    
	}

}
