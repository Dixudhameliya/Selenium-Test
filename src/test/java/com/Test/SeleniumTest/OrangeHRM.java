package com.Test.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM {
	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\Eclipse\\Driver\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		/*Select drpcountry=new Select(driver.findElement(By.name("country")));
		drpcountry.selectByVisibleText("CANADA");*/
		
		/*driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\dhame\\Desktop\\Dixita\\Shortcuts-for-windows-2.pdf");
		driver.findElement(By.id("terms")).click();*/
		
		driver.findElement(By.name("cusid")).sendKeys("53920");
		driver.findElement(By.name("submit")).submit();
		driver.switchTo().alert().accept();
		
}
}