package Project.E2ESeleniumFramework;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Landingpage;
import resources.base;


public class Validatetitle extends base {
	@Test
	public void basePagenavigation() throws IOException{
driver=InitializeDriver();
		System.out.println("dodked");
		
		driver.get(url);
	Landingpage l=new Landingpage(driver);
	l.title().getText();
	Assert.assertEquals(l.title().getText(), "FEATURED COURSES");
	
	}
}