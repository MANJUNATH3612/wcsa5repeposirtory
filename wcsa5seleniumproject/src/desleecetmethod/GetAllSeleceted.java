package desleecetmethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class GetAllSeleceted 
{

    public static void main(String[] args) throws InterruptedException
  {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    driver.get("file:///C:/Users/admin/Desktop/selenium%20data/web%20element/multiselecet.html");
    
    //identify the dropdown
    WebElement dropdownElemet = driver.findElement(By.id("menu"));
    
    //handle  the dropdown
    Select sel = new Select(dropdownElemet);
    
    //select multiple option from dropdown
    
    for(int i=0;i<=5;i++)
    {
    	Thread.sleep(2000);
    	sel.selectByIndex(i);
    	
    }
	//to read all seleceted  options from dropdown
    
    List<WebElement> allopts=new sel.getAllSelectedOptions();
    
    //To read the list of the webelement we use loops..
    for(WebElement op:allopts)
    {
    	Thread.sleep(2000);
    	System.out.println(op.getText());
    	
    }

    
    for(int i=0;i<=;i++)
    {
    	Thread.sleep(2000);
    	System.out.println(allopts.get(i).getText());
    }
   
    
   
	
}
}
