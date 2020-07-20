package Project.E2ESeleniumFramework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Landingpage;
import resources.base;


public class Validatenavbar extends base {
	@Test
	public void basePagenavigation() throws IOException{
driver=InitializeDriver();
		System.out.println("dodked");
		
		driver.get(url);
	Landingpage l=new Landingpage(driver);

Assert.assertTrue(l.navbar().isDisplayed());
	}
}