package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Util
{
  public  WebDriver driver;
  
  public void launchBrowser()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashwini.More\\Downloads\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
  }
  
  public void closeBrowser() throws Exception
  {
	  Thread.sleep(3000);
	  driver.quit();
  }
  
}
