package GenPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FraWO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://toolsqa.com/iframe-practice-page/");

		d.switchTo().frame("IF2");
		WebElement Text = d.findElement(By.id("content"));
		System.out.println(Text.getText());
		
		WebElement intext = d.findElement(By.className("h1-size"));
		System.out.println(intext.getText());
		
	}

}
