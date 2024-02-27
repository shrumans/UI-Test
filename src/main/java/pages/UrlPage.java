package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UrlPage extends Basepage {

	public UrlPage(WebDriver driver) {
		super(driver);
	}

	 By firstLink=By.xpath("//a[@href='https://www.getcalley.com/']");
	 By secondlink=By.xpath("//a[@href='https://www.getcalley.com/calley-call-from-browser/']");
	 By thirdlink=By.xpath("//a[@href='https://www.getcalley.com/calley-pro-features/']");
	 By fourthlink=By.xpath("//a[@href='https://www.getcalley.com/best-auto-dialer-app/']");
	 By fifthlink=By.xpath("//a[@href='https://www.getcalley.com/how-calley-auto-dialer-app-works/']");
	
	public void clickOnFirstLink(){
		clickElement(firstLink);
	}
	public void clickOnSecondLink(){
		clickElement(secondlink);
	}
	public void clickOnThirdLink(){
		clickElement(thirdlink);
	}
	public void clickOnFourthLink(){
		clickElement(fourthlink);
	}
	public void clickOnFifthLink(){
		clickElement(fifthlink);
	}
	
}
