package com.Test.SeleniumTest;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TwoFactorAuthenication {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote--allows--origins*=");

		WebDriver driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        Wait<WebDriver> mywait= new FluentWait<WebDriver> (driver)
        		.withTimeout(Duration.ofSeconds(30))
        		.pollingEvery(Duration.ofSeconds(5))
        		.ignoring(NoSuchElementException.class);        		
        
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("2266371230");
		driver.findElement(By.id("pass")).sendKeys("Dixita@583");
		
		WebElement element=wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//div[@id='passContainer']/following::div[1]/child::button[1]"));
			}
		});
		element.click();
		
		
		
		//Thread.sleep(1000);
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter your OTP :");
		String code=sc.next();
		driver.findElement(By.id("mfaCode")).sendKeys(code);
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();*/
		
		

	}

}
