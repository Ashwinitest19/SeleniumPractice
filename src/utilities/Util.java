package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Util 
{
WebDriver driver;
	
public void LaunchBrowser()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashwini.More\\Downloads\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	
}
public void CloseBrowser()throws Exception
{
	Thread.sleep(3000);
	driver.close();
}
}
