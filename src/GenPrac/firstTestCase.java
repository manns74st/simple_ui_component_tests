package GenPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://.www.facebook.com");
		System.out.println(d.getTitle());
		String ET="Facebook – log in or sign up";
		String AT=d.getTitle();
		
		if (ET.contentEquals(AT))
			System.out.println("Pass" + ET + "" + AT);
		else
			System.out.println("Fail" + ET + "" + AT);

	}

}
