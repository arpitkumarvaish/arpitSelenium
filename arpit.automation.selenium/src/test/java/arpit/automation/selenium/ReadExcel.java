package arpit.automation.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	@Test
	public void readExcel() throws IOException 
	
	{
		File src=new File("C:\\Users\\xakumarvaish\\Desktop\\Testdata.xlsx");
		
		FileInputStream fis= new FileInputStream(src);//In form of byte
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheetAt(0);
		
		for(int i=0;i<ws.getLastRowNum();i++)
		{
		String sht=ws.getRow(i).getCell(0).getStringCellValue();
		
		System.out.println(sht);
		
		}
		}
}
