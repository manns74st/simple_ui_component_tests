package GenPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class combo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		WebElement mday = d.findElement(By.id("day"));
		Select day = new Select(mday);
		day.selectByVisibleText("26");
		Thread.sleep(1000);
		
		WebElement mmon = d.findElement(By.id("month"));
		Select mont = new Select(mmon);
		mont.selectByVisibleText("Aug");
		
		WebElement yyear = d.findElement(By.id("year"));
		Select ye = new Select(yyear);
		ye.selectByVisibleText("1974");
				
	}

}
