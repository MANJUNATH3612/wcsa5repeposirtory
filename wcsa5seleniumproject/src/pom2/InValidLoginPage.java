package pom2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class InValidLoginPage extends BaseTest
{      static WebDriver driver;
	public static void main(String[] args) throws IOException 
	{
		//lunch to the browser and application 
		BaseTest bt=new BaseTest();
		bt.setUp();
		
		
		
		//perform invaLid login page 
		//go into the login page
		LoginPage lp = new LoginPage(driver);
		
		//read the data from the excelfile
		
		Flib flib =new Flib();
		 flib.getLastRowCount(EXCEL_PATH , "invalid");
		
		
		
		
	}

}
