package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\snehashri\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[id='_R_oiqjbjb9pb6amH1_']")).sendKeys("sneha@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("Sneha@12");

	}

}
