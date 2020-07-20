package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {

	
	public WebDriver driver;
	
	By signin=By.linkText("Login");
	By title=By.xpath("//*[@id=\"content\"]/div/div/h2");
    By navbar=By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav");
    
public Landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
this.driver=driver;
}

public WebElement login() {
	
	return driver.findElement(signin);
}

public WebElement title() {
	
	return driver.findElement(title);
}
public WebElement navbar() {
	
	return driver.findElement(navbar);
}
}
