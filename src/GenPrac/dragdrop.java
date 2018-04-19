package GenPrac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class dragdrop {
	WebDriver d;
  @Test
  public void f() {
	  d.switchTo().frame(0);
	  WebElement drag = d.findElement(By.id("draggable"));
		WebElement drop = d.findElement(By.id("droppable"));
		Actions act = new Actions(d);
		act.dragAndDrop(drag, drop).build().perform();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		d = new ChromeDriver();
				d.get("http://jqueryui.com/droppable/");
				

		
  }

  @AfterClass
  public void afterClass() {
	  
  }

}
