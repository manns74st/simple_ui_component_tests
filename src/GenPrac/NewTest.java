package GenPrac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver d;
  @Test
  public void day() {
	  WebElement DA = d.findElement(By.id("day"));
	  Select da = new Select(DA);
	  da.selectByVisibleText("26");
  }
  
  @Test
  public void month(){
	  WebElement MO = d.findElement(By.id("month"));
	  Select mo = new Select(MO);
	  mo.selectByVisibleText("Aug");
  }
  
  @Test
  public void year(){
	  WebElement YR = d.findElement(By.id("year"));
	  Select ye = new Select(YR);
	  ye.selectByVisibleText("1974");
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("https://www.facebook.com/");
	d.manage().window().maximize();  			  		
  }

  @AfterClass
  public void afterClass() {
	  d.close();
  }

}
