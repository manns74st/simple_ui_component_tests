package TESTNGGenPrac;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class parametri {
  @Test(dataProvider = "dp")
  public void f(String s) {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.co.in/");
		WebElement Search = d.findElement(By.id("lst-ib"));
			  Search.sendKeys(s);
			  Search.submit();
			  Search.clear();
			  d.close();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "india" },
      new Object[] { "japan" },
      new Object[] { "CSK vs KKR" },
    };
  }
}
