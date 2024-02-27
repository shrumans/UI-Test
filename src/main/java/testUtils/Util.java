package testUtils;

public class Util {

	public static void hardWait(int seconds) {
		
		try {
			Thread.sleep(seconds *1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
