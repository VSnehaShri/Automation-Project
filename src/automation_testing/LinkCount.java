package automation_testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\snehashri\\Downloads\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				
				driver.manage().window().maximize();
				Thread.sleep(8000);
				List<WebElement> Links = driver.findElements(By.tagName("a"));
				System.out.println("Total number of  Links :" + Links.size());
				
				List<WebElement> Images = driver.findElements(By.tagName("img"));
				System.out.println(" Total number of images : " + Images.size());
				driver.close();
				}

}
