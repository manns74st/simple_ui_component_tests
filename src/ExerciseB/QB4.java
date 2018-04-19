package ExerciseB;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QB4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://www.facebook.com/");
		
		List<WebElement> links = d.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		System.out.println(links.get(i).getText()+i);
		
		List<WebElement> imgs = d.findElements(By.tagName("img"));
		System.out.println(imgs.size());
		
		for(int i=0;i<imgs.size();i++);
		System.out.println(imgs.getClass().getInterfaces());
		
		
	}

}
