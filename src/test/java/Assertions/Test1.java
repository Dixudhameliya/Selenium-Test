package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void demoTest() {
	Assert.assertTrue(true);
	Assert.assertEquals("welcome" ,"welcome");
	Assert.assertEquals("selenium","Selenium");
	System.out.println("successfully passed");
		
	}

}
