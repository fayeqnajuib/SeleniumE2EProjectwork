package Project.E2ESeleniumFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.Landingpage;
import resources.base;

public class Homepage extends base {
	@Test
	public void basePagenavigation() throws IOException{
driver=InitializeDriver();
		System.out.println("dodked");
		
		driver.get("http://www.qaclickacademy.com");
	Landingpage l=new Landingpage(driver);
	l.login().click();
	
	}
}
