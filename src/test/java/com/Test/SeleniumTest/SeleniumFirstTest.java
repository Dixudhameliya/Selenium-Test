package com.Test.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumFirstTest {
	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\Eclipse\\Driver\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.facebook.com/");

		/*WebElement emailelement = driver.findElement(By.id("email"));
		emailelement.sendKeys("dixudhameliya@gmail.com");

		WebElement passwordelement = driver.findElement(By.name("pass"));
		passwordelement.sendKeys("Dixita@266");

		WebElement loginelement = driver.findElement(By.name("login"));
		loginelement.click();*/
		
		driver.findElement(By.xpath("//*[text()='Create a Page']")).click();
		
      
		

	}
}