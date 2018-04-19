package TESTNGGenPrac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver d;
  @Test
  public void f() {
	  String ET = "Facebook – log in or sign up";
	  String AT = d.getTitle();
	  
	  if(ET.contentEquals(AT)) System.out.println("PASS"+ AT);
	  else System.out.println("Fail"+ AT);
	  System.out.println(d.getTitle());
  }
  @BeforeClass
  public void beforeClass() {
  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	d = new ChromeDriver();
	d.get("https://www.facebook.com/");
  }

  @AfterClass
  public void afterClass() {
  }

}
