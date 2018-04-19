package ExercisesA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("http://www.spicejet.com/");
	d.manage().window().maximize();
	
	List<WebElement> chkbox = d.findElements(By.cssSelector("input[type='checkbox']"));
	System.out.println(chkbox.size());
	
	for(int i=0;i<chkbox.size();i++)
		System.out.println(chkbox.get(i).getAttribute("name"));
	
	d.findElement(By.id("ctl00_mainContent_chk_Unmr")).click();;
	
	if(chkbox.isEmpty()) System.out.println("Pass");
	else System.out.println("Fail");
	}

}
