package popupprograme;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopuphandle
{
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("file:///C:/Users/admin/Desktop/selenium%20data/web%20element/multiselecet.html");
	
	
	//handle alert popup
        Alert al = driver.switchTo().alert();
       //1 
        al.accept();
        //2 ways
        al.dismiss();
        //3 way we use but senkyes ask for the agrumment thats why not use
        al.sendKeys(null);
        //4 way store it overe here
        System.out.println(al.getText());
        
	}

}
