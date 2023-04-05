package testutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFileData {
	
	public static String fetchDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		
	    String data="";
		String path="src"+File.separator+"test"+File.separator+"resources"+File.separator+"Testexcel"+File.separator+"velocity.xlsx";
	    FileInputStream file = new   FileInputStream(path);
	    
		Sheet s= WorkbookFactory.create(file).getSheet("Ashwini");
		Cell c= s.getRow(row).getCell(cell);
		CellType type  =c.getCellType();
		if(type==CellType.STRING)
		{
			data  = c.getStringCellValue();
		}
		else if(type==CellType.NUMERIC)
		{
			double number  = c.getNumericCellValue();
			data=Double.toString(number);
		}
		
		else if(type==CellType.BLANK)
		{
			  data="";
		}
			return  data;
	} 
	

	}


