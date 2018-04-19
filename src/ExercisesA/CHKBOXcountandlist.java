package ExercisesA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CHKBOXcountandlist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.spicejet.com/");
		
		d.manage().window().setPosition(new Point(2000,0));
		
		Thread.sleep(1000);
		
		d.manage().window().maximize();
				
		List<WebElement> chkboxes = d.findElements(By.cssSelector("input[type='checkbox']"));
				System.out.println(chkboxes.size());
		
		System.out.println("Check Boxes Present are = " + chkboxes.size());
		
		for(int i=0; i<chkboxes.size();i++)
			System.out.println(chkboxes.get(i).getAttribute("name"));
		
				
		
		}		
	}


