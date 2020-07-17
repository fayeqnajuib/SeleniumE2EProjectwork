package Project.E2ESeleniumFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homepage extends base {
	@Test
	public void basePagenavigation() throws IOException{
driver=InitializeDriver();
		System.out.println("dodked");
		
		driver.get("http://the-internet.herokuapp.com/");
	}
}
