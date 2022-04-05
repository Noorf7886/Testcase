package genericLib;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
public WebDriver driver;
public Propertyfile pdata=new Propertyfile();
public WebDriverUtitlities  driverutitlities= new WebDriverUtitlities();

@BeforeMethod
 public void openApp() throws IOException
 {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe" );
	 driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get(pdata.getPropertyData("url"));
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 }
 
 @AfterMethod
 public void closeApp(ITestResult result) throws IOException
 {
	 int status=result.getStatus();
	 String name=result.getName();
	 if(status==2)
	 {
		 Screenshot s =new Screenshot();
		 s.getScreenshot(driver, name);
	 }
	 
	 driver.quit();
 }
}
