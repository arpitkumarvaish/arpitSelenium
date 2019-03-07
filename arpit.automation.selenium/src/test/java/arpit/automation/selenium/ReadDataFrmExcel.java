package arpit.automation.selenium;

import Lib.ExcelReadDataConfig;

public class ReadDataFrmExcel {

	public static void main(String[] args) {
		
		ExcelReadDataConfig excelnew=new ExcelReadDataConfig("C:\\Users\\xakumarvaish\\Desktop\\Testdata.xlsx");
		
		System.out.println(excelnew.Excelpara(0, 0, 0));
		
	}

}
