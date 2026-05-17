package testNG_FW;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsBasic {
	
	@Test
	public void ts1() {
		System.out.println("this is 1 scenerio");

	}
	@Test
	public void ts2() {
		System.out.println("this is 2 scenerio");
	}
	
	@Test 
	public void ts3() {
		System.out.println("this is 3 scenerio");
	
	}
	@BeforeMethod
	
	public void beforeMethod() {
		System.out.println("this is before method");
	}
	
	@AfterMethod
	
	public void afterMethod() {
		System.out.println("this is after method");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println(" this is before class");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("this is after class");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println(" This is before test");
	}
	@AfterTest
	public void Aftertest() {
		System.out.println("This is after test");
	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println(" this is before suite");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("This is after suite");
	}
	  
}


