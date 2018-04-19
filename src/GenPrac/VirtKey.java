package GenPrac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VirtKey {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.google.co.in");
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		
	}

}
