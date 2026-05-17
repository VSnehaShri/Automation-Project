package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\snehashri\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.id("email")).sendKeys("sneha@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys("Sneha@123");
		Thread.sleep(1000);
		
		//driver.findElement(By.id("email")).clear();

		//driver.findElement(By.name("pass")).clear();
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		//driver.close();
		

}}
