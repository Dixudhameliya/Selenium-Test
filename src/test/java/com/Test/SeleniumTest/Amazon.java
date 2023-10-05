package com.Test.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) {

		//System.setProperty("Webdriver.Chrome.driver", "C:\\Program Files\\Eclipse\\Driver\\chromedriver.exe");

		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allows-origins=*");*/
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.ca/");
		
		
	
		
		Select drpoption=new Select(driver.findElement(By.id("searchDropdownBox")));
		drpoption.selectByVisibleText("Books");
	
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("lipStick");
		
	/*driver.findElement(By.cssSelector("input[type=submit]")).click();
		
		driver.findElement(By.partialLinkText("New York")).click();
		Select num=new Select(driver.findElement(By.id("rcxsubsQuan")));
		num.selectByVisibleText("3");
		driver.findElement(By.id("rcx-subscribe-submit-button-announce")).click();
		driver.findElement(By.name("proceedToRetailCheckout")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		//driver.findElement(By.linkText("Home")).click();
		/*int link=driver.findElements(By.tagName("a")).size();
		System.out.println(link);
		int images=driver.findElements(By.tagName("img")).size();
		System.out.println(images);*/
		//String title=driver.getTitle();
		//System.out.println(title);
		
		/*String text=driver.getPageSource();
		boolean result=driver.getPageSource().contains("Amazon");
		System.out.println(result);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);*/
		

	}
}