package ExerciseB;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QB3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			d.get("http://www.spicejet.com/");
			
			d.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
			
			WebElement rad = d.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
			
			if(rad.isSelected()) System.out.println("RadioButton is ON");
			else System.out.println("RadioButton is OFF");
			
			d.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).click();
			
			WebElement chk = d.findElement(By.name("ctl00$mainContent$chk_friendsandfamily"));
			
			if(chk.isSelected()) System.out.println("CHK BOX is ON");
			else System.out.println("CHK BOX is OFF");
			
			
			
		
		
	}

}
