package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IncludeExclude {
	
	@AfterClass
	public void PrintBefore() {
		System.out.println("AfterClass");
	}
	
	@Test(groups={"A"})
	public void test1() {
		System.out.println("Testing 1");
	}
	
	@Test(groups={"A","B"})
	public void test2() {
		System.out.println("Testing 2");
	}
	
	@Test(groups={"B"})
	public void test3() {
		System.out.println("Testing 3");
	}
	
	@Test
	public void test4() {
		System.out.println("Testing 4");
	}

}
