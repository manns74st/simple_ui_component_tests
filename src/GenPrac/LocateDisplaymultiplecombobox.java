package GenPrac;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateDisplaymultiplecombobox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		d.get("http://.www.facebook.com");
		WebElement combox= d.findElement(By.id("day"));
		List<WebElement> opt =combox.findElements(By.tagName("option"));
		for (int i=0; i<opt.size();i++)
		System.out.println(opt.get(i).getText());


	}

}
