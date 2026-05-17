package automation_testing;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\snehashri\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		String w1 = driver.getWindowHandle();
		
		
		
		driver.findElement(By.xpath("//*[text() ='Meta Pay']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[text() ='Meta Store']")).click();
		Thread.sleep(3000);
		
		Set<String> wc = driver.getWindowHandles();
		
		System.out.println(wc.size());
		
		System.out.println(w1);
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
