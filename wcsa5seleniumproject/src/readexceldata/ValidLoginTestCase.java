package readexceldata;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedrier.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://127.0.0.1/login.do;jsessionid=5eu7mdunif6ko");
	    
	    
	    //read the data from excel file and test the logi page
	    
	      FileInputStream fils = new FileInputStream("./data/ActiTime.xlsx");//provde path of the file
		  Workbook Wb = WorkbookFactory.create(fils); //make the file the ready to read
		  Sheet sheet = Wb.getSheet("valids");//get into the sheet
		  Row row = sheet.getRow(1);//get the row
		  Cell cell = row.getCell(0);//get the cell cell
		  String vaild = cell.getStringCellValue();
		  
		  
		  
		  FileInputStream fils1 = new FileInputStream("./data/ActiTime.xlsx");//provde path of the file
		  Workbook Wb1 = WorkbookFactory.create(fils1); //make the file the ready to read
		  Sheet sheet1 = Wb1.getSheet("valids");//get into the sheet
		  Row row1 = sheet1.getRow(1);//get the row
		  Cell cell1 = row.getCell(0);//get the cell cell
		  String vaild1 = cell.getStringCellValue();
		  
		  
		  
		  driver.findElement(By.name("USERNAME")).sendKeys("admin");
		  
		  driver.findElement(By.name("PASSWORD")).sendKeys("manager");
		  driver.findElement(By.id("LoginButton")).click();
		  
	    
		
	}

}
