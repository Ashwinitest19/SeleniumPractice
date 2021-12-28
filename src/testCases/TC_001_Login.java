package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utility.Util;

public class TC_001_Login extends Util

{ 
	@Test
	public void loginHRM() throws Exception
	{
		launchBrowser();
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		closeBrowser();
	}
	
}
