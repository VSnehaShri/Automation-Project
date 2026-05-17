package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommands {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\snehashri\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		Thread.sleep(1000);

		boolean emaildisplay = driver.findElement(By.id("email")).isDisplayed();
		System.out.println(emaildisplay);

		boolean pwdisplay = driver.findElement(By.id("pass")).isDisplayed();
		System.out.println(pwdisplay);

		boolean loginclickable = driver.findElement(By.name("login")).isEnabled();
		
		if (loginclickable){
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		String title = driver.getTitle();
		System.out.println(" Application Tile " +title);
		
		String Url = driver.getCurrentUrl();
				System.out.println(" Application link " +Url);

				
		String attvalue	=	driver.findElement(By.id("email")).getAttribute("class");
		System.out.println(attvalue);
		
		String tagname	=driver.findElement(By.id("email")).getTagName();
		System.out.println(tagname);
		
		Dimension d = driver.findElement(By.id("pass")).getSize();
		System.out.println(d);
		String bname = driver.findElement(By.name("login")).getText();
		System.out.println(bname);
		
		driver.close();
	}

}
