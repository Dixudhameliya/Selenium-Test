package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenshotTest {

	public static WebDriver driver;

	@BeforeMethod
	public void setUpClass(ITestContext context) {
		driver = new ChromeDriver();
		context.setAttribute("WebDriver", driver);
		driver.get(
				"https://www.amazon.ca/?tag=hydcaabkg-20&hvadid=317549713801&hvpos=&hvnetw=g&hvrand=10608384502112474240&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9001073&hvtargid=kwd-360364908397&ref=pd_sl_2g3jlg2slz_e&hydadcr=20061_10818755");

	}

	@Test
	public void TestCase1() {
		Assert.assertEquals(false, true);
	}

	@Test
	public void TestCase2() {
		Assert.assertEquals(true, false);
	}

	@Test
	public void TestCase3() {
		Assert.assertEquals(false, true);
	}

	@AfterMethod
	public void close() {
		driver.quit();
	}

}
