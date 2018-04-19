package GenPrac;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Paraexcel {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		Workbook wb = Workbook.getWorkbook(new File("D:\\gosea.xls"));
		Sheet S = wb.getSheet(0);
		
		for(int i=0;i<S.getRows();i++){
			
			String Values = S.getCell(0,i).getContents();
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver");
			WebDriver d = new ChromeDriver();
			d.get("http://www.google.co.in");
			
			WebElement search = d.findElement(By.id("lst-ib"));
			search.sendKeys(Values);
			search.submit();
			d.close();		
			
			
	}

}
}
