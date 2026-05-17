package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WbElement {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\snehashri\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement emailAddr= driver.findElement(By.id("email"));
		WebElement pwdtextbox=driver.findElement(By.id("pass"));
		WebElement loginbutton = driver.findElement(By.name("login"));
		
		System.out.println(emailAddr.isDisplayed());
		System.out.println(emailAddr.isEnabled());
		emailAddr.sendKeys("sneha@gail.com");
		Thread.sleep(1000);
		
		System.out.println(pwdtextbox.isDisplayed());
		System.out.println(pwdtextbox.isEnabled());
		pwdtextbox.sendKeys("Sneha@123");
		Thread.sleep(1000);
		
		emailAddr.clear();
		Thread.sleep(1000);
		pwdtextbox.clear();
		Thread.sleep(1000);
		
		System.out.println(loginbutton.isDisplayed());
		
		System.out.println(loginbutton.isEnabled());
		Thread.sleep(1000);
driver.close();
	}

}
