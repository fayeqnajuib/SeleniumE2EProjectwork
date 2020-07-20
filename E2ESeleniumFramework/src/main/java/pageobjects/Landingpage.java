package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {

	
	public WebDriver driver;
	
	By signin=By.linkText("Login");

public Landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
this.driver=driver;
}

public WebElement login() {
	
	return driver.findElement(signin);
}



}
