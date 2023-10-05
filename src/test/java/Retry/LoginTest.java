package Retry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	@Test(retryAnalyzer =MyRetry.class)
	public void logintest() {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote--allows--origins-*");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement Usernametext = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement passwordtext = driver.findElement(By.xpath("//input[@id='pass']"));

		Usernametext.sendKeys("2266371230");

		passwordtext.sendKeys("Dixita@583");

		driver.findElement(By.xpath("//div[@id='passContainer']/parent::*/following::div[1]/child::button")).click();
		Assert.fail();

	}
}
