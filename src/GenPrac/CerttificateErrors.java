package GenPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CerttificateErrors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https:\\secweb.rbi.org.in");
		d.manage().window().maximize();
		
		DesiredCapabilities dc = DesiredCapabilities.chrome();
				dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	}

}
