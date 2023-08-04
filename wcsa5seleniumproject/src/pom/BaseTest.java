package pom;

import org.openqa.selenium.WebDriver;

import readexceldata.Flib;

public class BaseTest  extends Flib implements IautoConstant

{
	
	static WebDriver driver;
	
	//it is uae to open  and close the browser
	
	public void openBrowser()
	{
		Flib flib=new Flib();
		String broweserValue=flib.r("PROP_PATH","Browser");
		String url=flib.readPropertyData()
	}
	
}
