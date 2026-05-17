package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHowerActionClass {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\snehashri\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.naukri.com/");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement JobMenu = driver.findElement(By.xpath("//span[text()='Jobs']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(JobMenu).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()='IT jobs']")).click();
		
		System.out.println(driver.getTitle());
		
	}

}
