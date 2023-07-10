package readexceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib 
{
	//to stote generic reusable methods
	//all th eare no static 
	
	public String readExcelData(String excelPath,String ) throws EncryptedDocumentException, IOException
	{
		
		
		FileInputStream file = new FileInputStream(excelPath );
		Workbook Wb = WorkbookFactory.create(file);
		Sheet sheet = Wb.getSheet(excelPath); //get into the sheet
		
		sheet.getRow(sheetcount);
		
		
		
	}

}
