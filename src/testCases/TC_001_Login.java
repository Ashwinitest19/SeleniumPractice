package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utility.Util;

public class TC_001_Login extends Util

{ 
	
	@Test
	public void loginHRM()throws Exception
	{
		launchBrowser();
		Config();
		driver.findElement(By.xpath(getuserName("Login_UserName"))).sendKeys("admin");
		driver.findElement(By.xpath(getpassword("Login_Password"))).sendKeys("Admin123");
		driver.findElement(By.xpath(clickbutton("Button"))).click();
		
		closeBrowser();
	}
	
	
}
