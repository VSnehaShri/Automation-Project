package datadriven_framework;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class FacebookAPP {

public static void main(String[] args) throws Exception {
		
		FileInputStream f= new FileInputStream("C:\\Users\\snehashri\\Desktop\\OctoberBatch.xls");
		
		Workbook wb = Workbook.getWorkbook(f);
		
		Sheet s = wb.getSheet("Sheet3");
		
		System.setProperty("webdriver.chrome.driver", s.getCell(1, 17).getContents());

		WebDriver driver = new ChromeDriver();

		driver.get(s.getCell(1,1).getContents());

		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.name(s.getCell(1, 10).getContents())).sendKeys(s.getCell(1, 5).getContents());
		Thread.sleep(1000);
		
		driver.findElement(By.name(s.getCell(1, 11).getContents())).sendKeys(s.getCell(1, 6).getContents());
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(s.getCell(1, 12).getContents())).click();
		Thread.sleep(1000);

		

}

}
