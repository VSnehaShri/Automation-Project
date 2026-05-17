package automation_testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OracleDoc {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\snehashri\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://docs.oracle.com/javase/7/docs/api/");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement f1= driver.findElement(By.name("packageListFrame"));
		
		driver.switchTo().frame(f1).findElement(By.xpath("//*[@href='java/awt/package-frame.html']")).click();
		
		List<WebElement> Linksf1 =driver.switchTo().frame(f1).findElements(By.tagName("a"));
		Thread.sleep(2000);
		
		System.out.println("Total number of links in frame 1 : " +Linksf1.size());
		

	}

}