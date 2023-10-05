package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test2 {
	
	SoftAssert softassert=new SoftAssert();
	
	@Test
	public void demotest2() {
		
		softassert.assertTrue(true);
		softassert.assertEquals("welcome","Welcome");
		softassert.assertEquals("selenium","selenium");
		System.out.println("Successfully passed");
		softassert.assertAll();
		
	}

}
