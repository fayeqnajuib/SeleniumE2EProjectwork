package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public WebDriver driver;
	public Properties prop;
	public String url;
public WebDriver InitializeDriver() throws IOException {
		
		prop=new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\nfaye\\git\\repository2\\E2ESeleniumFramework\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	   url= prop.getProperty("url");
		String BrowserName=prop.getProperty("browser");
		System.out.println(BrowserName);
		if(BrowserName.equals("chrome")) {
			System.setProperty("WebDriver.chrome.driver", "c:\\chromedriver.exe");
			driver=new ChromeDriver();
		}
	
		else if(BrowserName.equals("Firefox")){
			System.setProperty("WebDriver.gecko.driver", "c:\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}
	
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	
	return driver;
	}
public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source =ts.getScreenshotAs(OutputType.FILE);
	String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	FileUtils.copyFile(source,new File(destinationFile));
	return destinationFile;


}

}
