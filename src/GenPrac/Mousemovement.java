package GenPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://jqueryui.com/draggable/");
		
		d.switchTo().frame(0);
		WebElement drag = d.findElement(By.id("draggable"));
		
		Actions act = new Actions(d);
		act.dragAndDropBy(drag, 100, 50).build().perform();
		
		
		
		
	}

}
