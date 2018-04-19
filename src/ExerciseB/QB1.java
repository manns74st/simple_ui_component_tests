package ExerciseB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.co.in/");
		System.out.println(d.getTitle());
		d.manage().window().maximize();
		
		String ET = "Google";
		String AT = d.getTitle();
		
		if(ET.contentEquals(AT)) System.out.println("Pass");
		else System.out.println("Fail");
				
		
	}

}
