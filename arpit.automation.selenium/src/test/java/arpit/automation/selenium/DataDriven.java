package arpit.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Lib.ExcelReadDataConfig;

public class DataDriven {

	WebDriver driver;
	@Test(dataProvider="datagiver")
	
	public void LoginWordPress(String username,String password)
	{
		System.setProperty("webdriver.chrome.driver","src\\test\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://wordpress.com/start/user");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(username);
		driver.close();
	}
	
	@AfterMethod
	
	public void teardown()
	{
		driver.quit();
		
	}
	@DataProvider
	
	public Object[][] datagiver()
	{
		ExcelReadDataConfig excel=new ExcelReadDataConfig("C:\\Users\\xakumarvaish\\Desktop\\Testdata.xlsx");
	    int row=excel.RowCount(0);
	    Object[][] data=new Object[row][2];
	    
	    for(int i=0;i<row; i++)
	    {
	    	data[i][0]=excel.Excelpara(0, i, 0);
	    	data[i][1]=excel.Excelpara(0, i, 1);
	    }
	    
		
		return data;
		
	}
}
