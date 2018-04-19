package TESTNGGenPrac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LocateElem {
	WebDriver d;
  @Test
  public void f() {
	  d.findElement(By.name("firstname")).sendKeys("Joseph");
	  d.findElement(By.name("lastname")).sendKeys("Manns");
	  d.findElement(By.id("u_0_n")).sendKeys("444537825");
	  
  }
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		Thread.sleep(2000);
  }

  @AfterClass
  public void afterClass() {
  }

}
