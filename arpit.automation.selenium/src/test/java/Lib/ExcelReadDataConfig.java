package Lib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadDataConfig {
	
	XSSFWorkbook wb;XSSFSheet ws;
	
	public ExcelReadDataConfig(String excelpath)
	
	{
        try 
        {
			File src = new File(excelpath);
			FileInputStream fis = new FileInputStream(src);//In form of byte
			wb = new XSSFWorkbook(fis);
			ws = wb.getSheetAt(0);
		
        } 
        catch (Exception e) 
        {
			
        	System.out.println(e.getMessage());
		}
		
	}
	
	public String Excelpara(int sheetno,int rowno,int cellno )
	{
		ws = wb.getSheetAt(sheetno);
		String dataExcel=ws.getRow(rowno).getCell(cellno).getStringCellValue();
		
		return dataExcel;
		
	}
	

}
