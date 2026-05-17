package testNG_FW;




import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstProgram {
	
	@Test
	public void ts1() {
		System.out.println(" this is 1 scenerio");

	}
	@Test
	public void ts2() {
		System.out.println(" this is 2 scenerio");
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
		System.out.println(" This is before test;ppppppppp;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
	}
	
	@AfterTest
	public void Aftertest() {
		System.out.println("This is after test");
	}
	  
	    }
		
	

