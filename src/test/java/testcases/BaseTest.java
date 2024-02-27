package testcases;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import pages.UrlPage;

public abstract class BaseTest {

	WebDriver driver;
	UrlPage urlpage;
	
	@Parameters("browser")
	@BeforeMethod
	public void openBrowserAndSetUp(String Browser) {
		
		if(Browser.equalsIgnoreCase("chrome")) {
			
		System.out.println("========== ChromeBrowser started ==========");
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		}
		
		if(Browser.equalsIgnoreCase("firefox")) {
			
		System.out.println("========== FireFoxBrowser started ==========");
	    System.setProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		urlpage=new UrlPage(driver);
	
	}
	
	@AfterMethod()
	public void tearDown() {
		driver.close();
	}
	
	public void takeFullScreenShot(String device,int w,int h) {
		
	String resolution=w+","+h;	
    driver.manage().window().setSize(new Dimension(w,h));
	Shutterbug.shootPage(driver,Capture.FULL,true).save(device+File.separator+resolution+File.separator+"screenshot.png");
	
	}
	
	
	
}
