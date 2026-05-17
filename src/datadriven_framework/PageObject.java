package datadriven_framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObject {

	@FindBy (name  = "email") WebElement EmailAdr;
	@FindBy(name = "pass") WebElement pwd;
	@FindBy(xpath = "//span[text()='Log in']") WebElement login;
	@FindBy(xpath = "//span[text()='Forgotten password?']") WebElement fd;
	
	
}
