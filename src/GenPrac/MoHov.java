package GenPrac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoHov {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		d.get("http://www.amazon.in/");
		//Thread.sleep(3000);
		WebElement link = d.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[2]/span"));
	    //Thread.sleep(2000);
		Actions act= new Actions(d);
		//Thread.sleep(2000);
		act.moveToElement(link).build().perform();
		//Thread.sleep(2000);
		WebElement inlink = d.findElement(By.xpath(".//*[@id='nav-flyout-yourAccount']/div[3]/a[1]/span"));
		inlink.click();
		//Thread.sleep(2000);
		
				
	}

}
