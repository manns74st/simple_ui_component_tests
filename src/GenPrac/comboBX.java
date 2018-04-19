package GenPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class comboBX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		WebElement DA = d.findElement(By.id("day"));
		Select da = new Select(DA);
		da.selectByVisibleText("9");
		
		WebElement MO = d.findElement(By.id("month"));
		Select mo = new Select(MO);
		mo.selectByVisibleText("Jun");
		
		WebElement YR = d.findElement(By.id("year"));
		Select ye = new Select(YR);
		ye.selectByVisibleText("2010");
		
	}

}
