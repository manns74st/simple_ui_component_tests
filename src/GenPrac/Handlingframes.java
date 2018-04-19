package GenPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://toolsqa.com/iframe-practice-page/");
		d.switchTo().frame("IF2");
		WebElement text= d.findElement(By.xpath(".//*[@id='ui-id-1']"));
		System.out.println(text.getText());
		d.switchTo().defaultContent();
		WebElement text1= d.findElement(By.xpath(".//*[@id='content']/h1"));
		System.out.println(text1.getText());
	}

}
