package com.Test.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UrbanPlanet {
	public static void main(String[] args) {

		//System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\Eclipse\\Driver\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allows-origins=*");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://urban-planet.com/");

		//driver.findElement(By.id("Search-Query")).sendKeys("Tshirt");
		
		
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("q")).clear();*/
		/*driver.findElement(By.id("Search-Submit")).click();
		driver.findElement(By.linkText("Seamless Ribbed Lettuce Trim T-Shirt")).click();
		driver.findElement(By.id("ProductForm7113042264157-Add")).click();*/
		
		/*int links=driver.findElements(By.tagName("a")).size();
		System.out.println(links);*/
		/*int images=driver.findElements(By.tagName("img")).size();
		System.out.println(images);*/
		
		//driver.navigate().back();
		//driver.navigate().forward();
		/*String url=driver.getCurrentUrl();
		System.out.println(url);*/
		
		/*String j=driver.getPageSource();
		boolean result=driver.getPageSource().contains("Urban Planet");
		System.out.println(result);*/
		
		/*String j=driver.getTitle();
		System.out.println(j);*/
		
		
	}
}