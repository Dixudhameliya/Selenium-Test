package TestNG;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(CustomListener.class)
public class ReadPropertiesData {
	
	Properties p;
	
	public void LoadProperties() throws Exception {
		
		FileReader reader=new FileReader("Test.properties");
		p=new Properties();
		p.load(reader);
	}
	@BeforeClass
	public void testloading() {
		try {
			LoadProperties();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test1() {
		
		WebDriver driver=new ChromeDriver();
		String driverName=p.getProperty("driverName");
		System.out.println(driverName);
		
		String user=p.getProperty("user");
		System.out.println(user);
		
		String password=p.getProperty("password");
		System.out.println(password);
		
		driver.get(p.getProperty("url"));
		Assert.assertEquals(false, true);
		
		
		
	}

}
