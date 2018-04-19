package ExercisesA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.spicejet.com/");
		d.manage().window().maximize();
		d.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();;
		System.out.println(d.getTitle());
	}

}
