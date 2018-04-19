package TESTNGGenPrac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTab {
  @Test
  public void f() throws AWTException {
	  Robot r = new Robot();
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_T);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  r.keyRelease(KeyEvent.VK_T);
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.google.co.in");
		
  }

  @AfterClass
  public void afterClass() {
  }

}
