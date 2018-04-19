package GenPrac;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.irctc.co.in/");
		
		
		d.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		
		Alert a = d.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
		
		
		
	}

}
