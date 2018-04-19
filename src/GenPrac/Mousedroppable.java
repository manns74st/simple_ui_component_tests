package GenPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousedroppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://jqueryui.com/droppable/");
	d.manage().window().maximize();
		d.switchTo().frame(0);
	WebElement drop = d.findElement(By.id("droppable"));
	WebElement drag = d.findElement(By.id("draggable"));
	Actions act = new Actions(d);
	
	act.dragAndDrop(drag, drop).build().perform();
	
	
		
	}

}
