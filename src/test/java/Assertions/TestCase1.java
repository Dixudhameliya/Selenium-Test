package Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {
	@Test
	public void logintest() {
	WebDriverManager.chromedriver().setup();
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote--allows--origins-*");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	WebElement Usernametext=driver.findElement(By.xpath("//input[@id='email']"));
	WebElement passwordtext=driver.findElement(By.xpath("//input[@id='pass']"));
	
	Assert.assertTrue(Usernametext.isDisplayed());
	Usernametext.sendKeys("2266371230");
	Assert.assertTrue(passwordtext.isDisplayed());
	passwordtext.sendKeys("Dixita@583");
	
	driver.findElement(By.xpath("//div[@id='passContainer']/parent::*/following::div[1]/child::button")).click();
	
    
	
	}
}
