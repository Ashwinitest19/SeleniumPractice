package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Util
{
  public  WebDriver driver;
  Properties po;
  public void launchBrowser()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashwini.More\\Downloads\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
  }
  
  public void Config()
  {
	  
	  //File src = new File ("C:\\Users\\Ashwini.More\\workspace\\Practice\\LoginHRM\\TestData\\config.properties");
	  
	  try {
		  File src = new File ("C:\\Users\\Ashwini.More\\workspace\\Practice\\LoginHRM\\TestData\\config.properties");
	  FileInputStream fi = new FileInputStream(src);
	  po = new Properties();
	  po.load(fi);
	  
	  }
	  catch (Exception e)
	  {
		  System.out.println(e);
	  }
  }
  public String getuserName(String Login_UserName)
  {
	 String value = po.getProperty(Login_UserName);
	return value;
	
	  
  }
  public String getpassword(String Login_Password)
  {
	 String value = po.getProperty(Login_Password);
	return value;
	  
  }
  public String clickbutton(String Button)
  {
	  String value = po.getProperty(Button);
  return value;
  }
  
  
  public void closeBrowser() throws Exception
  {
	  Thread.sleep(3000);
	  driver.quit();
  }
  
}
