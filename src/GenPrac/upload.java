package GenPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://demo.guru99.com/selenium/upload/");
		d.manage().window().maximize();
		
		d.findElement(By.id("uploadfile_0")).sendKeys("F:\\B2K\\Bank documents\\AFOPJ7600Q_Q4_2016-17.pdf");
		d.findElement(By.name("terms")).click();;
		d.findElement(By.id("submitbutton")).click();
	}

}
