package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCart {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\snehashri\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.opencart.com/index.php?route=account/login");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/div/a[1]")).getText();
		
		
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[1]/div[2]/div/div/div[1]/div/div[3]/div/div/div/div/div/div/div/div/div[2]/form/div/div[1]/div/div[1]/div/div/div[1]/input")).sendKeys("sneha14@gmail.com");

		//Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[1]/div[2]/div/div/div[1]/div/div[3]/div/div/div/div/div/div/div/div/div[2]/form/div/div[1]/div/div[2]/div/div/div[1]/input")).sendKeys("Sneha@14567");
		
		//Thread.sleep(2000);
		
		
		
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div[2]/div/div/div[1]/div/div[3]/div/div/div/div/div/div/div/div/div[2]/form/div/div[1]/div/div[3]/div/div")).click();
	
		//Thread.sleep(2000);
	
		//driver.close();
	}

}
