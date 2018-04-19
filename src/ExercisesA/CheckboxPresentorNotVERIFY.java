package ExercisesA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxPresentorNotVERIFY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("http://www.spicejet.com/");
	d.manage().window().maximize();
	WebElement chkbox = d.findElement(By.cssSelector("input[type='checkbox']"));
	System.out.println(chkbox.isEnabled());
	System.out.println(chkbox.isSelected());
	
	if(chkbox.isSelected()) System.out.println("Fail");
	else System.out.println("Pass");
	
	
	System.out.println("Check Boxes Present are"+""+chkbox.getText());
	
	d.findElement(By.id("ctl00_mainContent_rbtnl_Trip_2")).click();
	System.out.println(d.getCurrentUrl());
	System.out.println(d.getTitle());
	}

}
