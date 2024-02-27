package testcases;

import org.testng.annotations.Test;

public class ScreenshotTest extends BaseTest{

	@Test
	public void screenShotWithDiffResolutionTest1() {
	
		urlpage.clickOnFirstLink();
		
		//device number is according to links i.e., for firstUrl:desktop1,Mobile1
		
		takeFullScreenShot("Desktop1",1920,1080);
		takeFullScreenShot("DeskTop1",1366,768);
		takeFullScreenShot("DeskTop1",1536,864);
		
		takeFullScreenShot("Mobile1",360,640);
		takeFullScreenShot("Mobile1",414,896);
		takeFullScreenShot("Mobile1",375,667);
	}
	
	
	@Test
	public void screenShotWithDiffResolutionTest2() {
		
		urlpage.clickOnSecondLink();
		
		takeFullScreenShot("Desktop2",1920,1080);
		takeFullScreenShot("DeskTop2",1366,768);
		takeFullScreenShot("DeskTop2",1536,864);
		
		takeFullScreenShot("Mobile2",360,640);
		takeFullScreenShot("Mobile2",414,896);
		takeFullScreenShot("Mobile2",375,667);
	}
	
	@Test
	public void screenShotWithDiffResolutionTest3() {
		
		urlpage.clickOnThirdLink();
		
		takeFullScreenShot("Desktop3",1920,1080);
		takeFullScreenShot("DeskTop3",1366,768);
		takeFullScreenShot("DeskTop3",1536,864);
		
		takeFullScreenShot("Mobile3",360,640);
		takeFullScreenShot("Mobile3",414,896);
		takeFullScreenShot("Mobile3",375,667);
		
	}
	
	@Test
	public void screenShotWithDiffResolutionTest4() {
		
		urlpage.clickOnFourthLink();
		
		takeFullScreenShot("Desktop4",1920,1080);
		takeFullScreenShot("DeskTop4",1366,768);
		takeFullScreenShot("DeskTop4",1536,864);
		
		takeFullScreenShot("Mobile4",360,640);
		takeFullScreenShot("Mobile4",414,896);
		takeFullScreenShot("Mobile4",375,667);
		
	}
	
	@Test
	public void screenShotWithDiffResolutionTest5() {
		
		urlpage.clickOnFifthLink();
		
		takeFullScreenShot("Desktop5",1920,1080);
		takeFullScreenShot("DeskTop5",1366,768);
		takeFullScreenShot("DeskTop5",1536,864);
		
		takeFullScreenShot("Mobile5",360,640);
		takeFullScreenShot("Mobile5",414,896);
		takeFullScreenShot("Mobile5",375,667);
		
	}
	
	
}
