package GenPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MuLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.google.co.in");
		
		List<WebElement> links = d.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++){
			System.out.println(links.get(i).getAttribute("class"));
			
		}
			
		
		
		

	}

}
