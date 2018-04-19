package ExerciseB;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QB2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://www.facebook.com/");
		
		WebElement txt = d.findElement(By.id("u_0_i"));
		System.out.println(txt.isEnabled());
		
				txt.sendKeys("Joseph");
		
	}

}
