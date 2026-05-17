package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\snehashri\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		String Apptitle = driver.getTitle();
		System.out.println(Apptitle);
		
		String AppUrl=driver.getCurrentUrl();
		System.out.println(AppUrl);
		
		if(Apptitle.length ()> AppUrl.length()) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		// 2 condition
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
		
		boolean logindisplayed= driver.findElement(By.id("loginbutton")).isDisplayed();
		
		boolean loginenabled= driver.findElement(By.id("loginbutton")).isEnabled();
		
		
		if(logindisplayed== true && loginenabled==true) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		//condition 3
		
		driver.findElement(By.className("_97w4")).click();
		Thread.sleep(2000);
		
		String Apptitle2=driver.getTitle();
		if(!Apptitle2.contains("password1")) {
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}
		
		//condition 4
		boolean searchdisplayed = driver.findElement(By.name("did_submit")).isDisplayed();
		System.out.println(searchdisplayed);
		boolean searchdenabled = driver.findElement(By.name("did_submit")).isEnabled();
		
		if(searchdisplayed ==true && searchdenabled==true ) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		driver.close();
	}

}
