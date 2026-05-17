package datadriven_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class POCalling {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\snehashri\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		PageObject p = PageFactory.initElements(driver, PageObject.class);
		
		p.EmailAdr.isDisplayed();
		p.pwd.isDisplayed();
		p.login.isEnabled();
		p.fd.isEnabled();
		
		p.EmailAdr.sendKeys("sneha@14@gmail.com");
		Thread.sleep(1000);
		p.pwd.sendKeys("Sneha@12");
		Thread.sleep(1000);
		p.login.click();
		Thread.sleep(1000);
		
		driver.close();
		
	}
}

