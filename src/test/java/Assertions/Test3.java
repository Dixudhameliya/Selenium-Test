package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test3 {
	
	SoftAssert softassert=new SoftAssert();
	@Test
	public void demo1() {
		softassert.assertEquals("welcome", "wel");
		softassert.assertAll();
	}
	@Test
	public void demo2() {
		softassert.assertEquals("welcome", "welcome");
		softassert.assertAll();
	}

}
