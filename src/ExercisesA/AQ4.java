package ExercisesA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AQ4 {

	private static Object List;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.spicejet.com/");
		d.manage().window().maximize();
		
		
		
		
		List<WebElement> cb = d.findElements(By.cssSelector("input[type='checkbox']"));
		
		if(cb.isEmpty()) System.out.println("Pass");
		else System.out.println("Fail");
	
		System.out.println(cb.size());
		
		
		
		for(int i=0; i<cb.size(); i++)
			System.out.println(cb.get(i).getAttribute("name"));
	}

}
