package readexceldata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writeexceldata
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		//read dara from IPL sheet..
		   
		   //implmentaion of read the data from excel
		   //read multiple data from excel file
		 
		   
		  FileInputStream fils = new FileInputStream("./data/TestData.xlsx");//provde path of the file
		  Workbook Wb = WorkbookFactory.create(fils); //make the file the ready to read
		  Sheet sheet = Wb.getSheet("IPL");//get into the sheet
		  Row row = sheet.getRow(2);//get the row
		  Cell cell = row.createCell(5);//create cell by using interface
		  
		  sheet.
		  
		  
		  //write the data in cell
		
		  cell.setCellValue("pune");
		  
		  FileOutputStream fos =new FileOutputStream("./data/TestData.xlsx");
		   Wb.write(fos);
		     
		 
	}	 
}
