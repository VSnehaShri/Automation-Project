package automation_testing;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotBOA {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\snehashri\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\snehashri\\Desktop\\Output\\BOA.png"));
		
		driver.close();

	}

}
