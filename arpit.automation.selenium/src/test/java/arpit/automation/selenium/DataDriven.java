package arpit.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {

	
	@Test(dataProvider="datagiver")
	
	public void LoginWordPress(String username,String password)
	{
		System.setProperty("webdriver.chrome.driver","src\\test\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://wordpress.com/start/user");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(username);
		driver.close();
	}
	
	@DataProvider
	
	public Object[][] datagiver()
	{
		Object[][] data=new Object[3][2];
		
		data[0][0]="arpitkumarvaish";
		data[0][1]="aD";
		data[1][0]="VGFSD";
		data[1][1]="SDF";
		data[2][0]="S";
		data[2][1]="erg";
		
		return data;
		
	}
}
