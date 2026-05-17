package automation_testing;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookSignUpPage {

    public static void main(String[] args) throws Exception {

        System.setProperty(
            "webdriver.chrome.driver",
            "C:\\Users\\snehashri\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"
        );

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);

        driver.get("https://www.facebook.com/r.php?entry_point=login");
        driver.manage().window().maximize();

        // First Name
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.id("_R_1cl2p4jikacppb6amH1_")
        )).sendKeys("sneha");

        // Last Name
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.id("_R_1kl2p4jikacppb6amH1_")
        )).sendKeys("Jana");
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(
               By.xpath("//div[@role='combobox' and @aria-label='Select day']")
            )).click();
        
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@role='combobox' and @aria-label='Select day']")
             )).sendKeys("20" + Keys.ENTER);
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@role='combobox' and @aria-label='Select day']")
             )).sendKeys("20" + Keys.ENTER);
        
       // Actions a = new Actions(driver);
        //a.doubleClick("//div[@role='listbox' and @aria-hidden='true']//div[@role='option' and @aria-selected and text()='2']").perform();
        
        
       ////div[@role='listbox' and @aria-hidden='true']//div[@role='option' and @aria-selected and text()='2'] wait.until(ExpectedConditions.elementToBeClickable(
        	   // By.xpath("//div[@role='listbox' and @aria-hidden='true']//div[@role='option' and @aria-selected and text()='2']")
        	//)).sendKeys(args));
        
    }
    }