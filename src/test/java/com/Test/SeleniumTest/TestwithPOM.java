package com.Test.SeleniumTest;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestwithPOM {
	
	@Test
	public void LogInTest() {

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote--allows--origins*=");

		WebDriver driver = new ChromeDriver();
		
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      
      
		driver.get("https://www.facebook.com/");
		
		
		LoginPage log=new LoginPage(driver);
		log.enteremail("2266371230");
		log.enterpassword("Dixita@583");
		log.clickbutton();
		

	}
}