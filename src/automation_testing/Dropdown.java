package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\snehashri\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://demoqa.com/select-menu");
				
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				WebElement selectMenu = driver.findElement(By.id("oldSelectMenu"));
				//WebElement month = driver.findElement(By.id("_r_a_"));
				//WebElement year = driver.findElement(By.id("_r_g_"));
				
				Select obj1 = new Select(selectMenu);
				obj1.selectByValue("2");
				
				Thread.sleep(2000);
						
				//Select obj2 = new Select(month);
				//obj2.selectByIndex("1");
				
				//Select obj3 = new Select(selectMenu);
				//obj3.selectByVisibleText("Black");
			
	}

}
