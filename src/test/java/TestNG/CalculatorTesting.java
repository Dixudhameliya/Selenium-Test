package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class CalculatorTesting {

	int a = 10;
	int b = 2;

	@Test(testName = "addition")
	public void addition() {
		Reporter.log("addition method start");
		int c = Calculator.add(a, b);
		Assert.assertEquals(c, 12);

	}

	@Test
	public void multipication() {
		Reporter.log("multipication method start");
		int c = Calculator.mul(a, b);
		Assert.assertEquals(c, 20);
	}

	@Test
	public void substaction() {
		int c = Calculator.sub(a, b);
		Assert.assertEquals(c,8);
	}

	@Test

	public void division() {
		int c = Calculator.div(a, b);
		Assert.assertEquals(c, 5);
	}

}
