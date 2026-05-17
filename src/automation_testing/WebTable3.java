package automation_testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3 {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\snehashri\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://money.rediff.com/sectors");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	WebElement	table = driver.findElement(By.xpath("//table[@class='dataTable']"));
	
	WebElement	row = driver.findElement(By.xpath("//table[@class='dataTable']//tr[3]//td[2]"));
	
	System.out.println(row.getText());
	
	
	
	driver.close();
	}

	}


