package testNG_FW;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation2 {

	@Test
	public void ts1() {
		System.out.println("this is 1 scenerio");

	}
	@Test (invocationCount = 2)
	public void ts2() {
		System.out.println("this is 2 scenerio");
	}
	
	
	@Test (invocationCount = 3,priority = 1)
	public void ts3() {
		System.out.println("this is 3 scenerio");
	
	}
	
	@Test 
	public void ts4() {
		System.out.println("this is 4 scenerio");
	
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println(" This is before test");
	}
	@AfterTest
	public void Aftertest() {
		System.out.println("This is after test");
	}
	
	

}
