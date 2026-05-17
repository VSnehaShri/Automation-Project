package datadriven_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBCalling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\snehashri\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		PO_ByClass obj = new PO_ByClass();
		
		driver.findElement(obj.emailAdr).sendKeys("sneha14@gmail.com");
		Thread.sleep(3000);
		driver.findElement(obj.password).sendKeys("Sneha@12");
		Thread.sleep(3000);
		driver.close();
	}

}
