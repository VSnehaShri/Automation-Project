package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\snehashri\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='_R_64qjbjb9pb6amH1_']")).sendKeys("sneha14@gmail.com");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Sneha@14567");
		
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
	
		Thread.sleep(2000);
	
		driver.close();

	}

}
