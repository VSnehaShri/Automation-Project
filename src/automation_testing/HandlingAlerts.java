package automation_testing;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\snehashri\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='signin-btn']")).click();
		
		// importing the alert interface
		
		Alert a = driver.switchTo().alert();
		
		System.out.println(a.getText());
		
		Thread.sleep(3000);
		
		a.dismiss();
		
		driver.close();
		
		
	}

}
