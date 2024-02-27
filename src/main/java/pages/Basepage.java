package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Basepage {

	WebDriver driver2;
	public Basepage(WebDriver driver) {
		this.driver2=driver;
	}
	
	public void clickElement(By locator) {
		driver2.findElement(locator).click();
	}
	
	
	
}
