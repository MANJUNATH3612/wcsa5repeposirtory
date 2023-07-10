package readexceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readfromexcel 
{
   public static void main(String[] args) throws EncryptedDocumentException, IOException 
   {
	//read dara from IPL sheet..
	   
	   //implmentaion of read the data from excel
	   
	  FileInputStream fils = new FileInputStream("./data/TestData.xlsx");
	  Workbook Wb = WorkbookFactory.create(fils);  // MAKE THE FILE READ TO READ 
	  
	  Sheet sheet = Wb.getSheet("IPL"); //get into sheet
	   Row row = sheet.getRow(4);  //get in to the desired row
	  Cell cell = row.getCell(4);  //get into the desired cell/column
	  String data = cell.getStringCellValue();  //read the data ffrom the cell
	  System.out.println(data);
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }   
	
}
