package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleRightclick {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\snehashri\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://demoqa.com/buttons");
				
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				WebElement DC = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
				
				WebElement RC = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
				
				Actions a= new Actions(driver);
				
				a.doubleClick(DC).perform();
				
				Thread.sleep(2000);
				
				a.contextClick(RC).perform();
				
				Thread.sleep(2000);
	}
}
