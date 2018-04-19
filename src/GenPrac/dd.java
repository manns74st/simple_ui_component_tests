package GenPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");

		
		d.switchTo().frame(0);
		WebElement drag = d.findElement(By.id("draggable"));
		WebElement drop = d.findElement(By.id("droppable"));
		
		Actions a = new Actions(d);
		a.dragAndDrop(drag, drop).build().perform();
		

	}

}
