package readexceldata;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidTestCase 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedrier.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://127.0.0.1/login.do;jsessionid=5eu7mdunif6ko");
	    
	    
	}
	//to read the use to read the in excel
        public void readExceldata(String filepath,String sheetName,int  rowcount,int cellcount )
        {
        	FileInputStream fils = new FileInputStream(filepath );//provde path of the file
  		  Workbook Wb = WorkbookFactory.create(fils); //make the file the ready to read
  		  Sheet sheet = Wb.getSheet(sheetName);//get into the sheet
  		  Row row = sheet.getRow(rowcount );//get the row
  		  Cell cell = row.getCell(cellcount);//get the cell cell
  		  String vaild = cell.getStringCellValue();
  		  return data;
        }
        
        //get the count of last row
        
        public void getLastRowCount(String filepath,String sheetName,)
        {
        	FileInputStream fils = new FileInputStream(filepath );//provde path of the file
    		  Workbook Wb = WorkbookFactory.create(fils); //make the file the ready to read
    		  Sheet sheet = Wb.getSheet(sheetName);//get into the sheet
    		   int rc=sheet.getLastRowNum();
    		   return rc;
        }
        
        // to write data in excel file
        
        public void writeDataExcel(String filepath,String sheetName,int cellcount,String data)
        {
        	FileInputStream fils = new FileInputStream(filepath));//provde path of the file
  		  Workbook Wb = WorkbookFactory.create(fils); //make the file the ready to read
  		  Sheet sheet = Wb.getSheet(sheetName);//get into the sheet
  		  Row row = sheet.createRow(0);//get the row
  		  Cell cell = row.createCell(cellcount);
  		  cell.setCellValue(data);
  		  
  		  
  		FileInputStream fos = new FileInputStream(filepath );
  		Wb.write(fos);
        }
        
        
        
        
        
        
        
        
        
        
}
