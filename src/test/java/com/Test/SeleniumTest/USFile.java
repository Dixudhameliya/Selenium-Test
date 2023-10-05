package com.Test.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class USFile {
	public static void main(String[] args) {

		System.setProperty("Webdriver.Chorme.driver", "C:\\\\Program Files\\\\Eclipse\\\\Driver\\\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allows-origins=*");

		WebDriver driver = new ChromeDriver();

		driver.get("https://ais.usvisa-info.com/en-ca/niv/users/sign_in");

		driver.findElement(By.id("user_email")).sendKeys("uddhameliya@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("Patel@9535");
		driver.findElement(By.xpath("//body/div[5]/main[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[3]/label[1]/div[1]")).click();
		driver.findElement(By.name("commit")).click();
		driver.findElement(By.linkText("Continue")).click();
	}
}