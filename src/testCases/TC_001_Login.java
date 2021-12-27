package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.Util;

public class TC_001_Login extends Util
{
WebDriver driver;

public TC_001_Login(WebDriver d)
{
	d= driver;
}



@Test
public void loginHRM() throws Exception
{
	LaunchBrowser();
	
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Admin123");
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	
	
		
	
	
	CloseBrowser();	
	
}

}
