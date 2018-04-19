package ExerciseB;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QB5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("http://www.spicejet.com/");
		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		List<WebElement> list = d.findElements(By.xpath("input"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i).getText());
		
	}

}
