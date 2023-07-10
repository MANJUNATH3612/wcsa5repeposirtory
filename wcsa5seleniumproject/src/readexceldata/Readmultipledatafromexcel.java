package readexceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readmultipledatafromexcel
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		//read dara from IPL sheet..
		   
		   //implmentaion of read the data from excel
		   //read multiple data from excel file
		   for(int i=1; i<=10;i++)
		   {
		  FileInputStream fils = new FileInputStream("./data/TestData.xlsx");//provde path of the file
		  Workbook Wb = WorkbookFactory.create(fils); //make the file the ready to read
		  Sheet sheet = Wb.getSheet("IPL");//get into the sheet
		  Row row = sheet.getRow(i);//get the row
		  Cell cell = row.getCell(0);//get the cell cell
		  
		  String data = cell.getStringCellValue();
		  Thread.sleep(2000);
		  System.out.println(data);
		  
		   }
		  
	}
	

}
