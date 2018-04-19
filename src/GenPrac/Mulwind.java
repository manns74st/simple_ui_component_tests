package GenPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mulwind {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		d.findElement(By.linkText("Create a Page")).click();
		Thread.sleep(1000);
		System.out.println(d.getTitle());
		d.navigate().back();
		System.out.println(d.getTitle()+""+"again");
		Thread.sleep(1000);
		d.navigate().forward();
		System.out.println(d.getTitle());
		
		

	}

}
