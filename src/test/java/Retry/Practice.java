package Retry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice {
	@Test
	public void demo1() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void demo2() {
		Assert.assertEquals(true, false);
	}

}
