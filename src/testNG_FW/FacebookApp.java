package testNG_FW;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookApp {
	
	WebDriver driver;
	
	@BeforeTest
public void LaunchApp()throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\snehashri\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	@Test
	public void ts1() {
		
	boolean emaildisplay = driver.findElement(By.name("email")).isDisplayed();
	if(emaildisplay) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	}
	
	@Test
	public void ts2() {
	boolean password=driver.findElement(By.name("pass")).isDisplayed();
		if(password) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}
	
	@Test
	public void ts3() throws Exception {
		driver.findElement(By.name("email")).sendKeys("manas123@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys("Sneha123");
		Thread.sleep(1000);
	}

 @AfterTest
 public  void CloseApp(){
		driver.close();
	}
	}