package Project.E2ESeleniumFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.Landingpage;
import pageobjects.Loginpage;
import resources.base;

public class Homepage extends base {
	
	@Test(dataProvider="getdata")
	public void basePagenavigation(String username,String Password,String text) throws IOException{
driver=InitializeDriver();
		System.out.println("dodked");
		
		driver.get(url);
	Landingpage l=new Landingpage(driver);
	l.login().click();
	Loginpage l2=new Loginpage(driver);
l2.getemail().sendKeys(username);
l2.getpassword().sendKeys(Password);
System.out.println(text);
l2.getloginbutton().click();

	
	}
@DataProvider()
public Object[][] getdata() {
	Object[][] d=new Object[2][3];
	d[0][0]="abcd@gmail.com";
	d[0][1]="def";
	d[0][2]="Restricted user";
	
d[1][0]="hhh@gmail.com";
	d[1][1]="jjwjw";
	d[1][2]="Non Restricted user";
return d;
}
}
