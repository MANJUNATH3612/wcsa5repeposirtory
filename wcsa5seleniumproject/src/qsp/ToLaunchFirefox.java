package qsp;

import org.openqa.selenium.edge.EdgeDriver;


public class ToLaunchFirefox
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		new fireFoxDriver();
	}

}
