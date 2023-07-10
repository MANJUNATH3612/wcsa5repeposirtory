package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firefox {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("which browser we want to open");
		String browserValue=sc.next();
		if(browserValue.equalsIgnoreCase("chrome"));
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();;
			Thread.sleep(2000);
			driver.close();
		}
		else if
		{
			
		}

	}

}
