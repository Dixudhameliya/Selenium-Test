package com.Test.SeleniumTest;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathAxes {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers");
		
		String text=driver.findElement(By.xpath("//a[contains(text(),'MRP Agro')]/self::a")).getText();//self
		System.out.println(text);
		
		text=driver.findElement(By.xpath("//a[contains(text(),'MRP Agro')]/parent::td")).getText();//parent
		System.out.println(text);
		
		List<WebElement> child=driver.findElements(By.xpath("//a[contains(text(),'MRP Agro')]/ancestor::tr/child::td"));//child
		System.out.println("Number of child elements:"+child.size());
		
		text=driver.findElement(By.xpath("//a[contains(text(),'MRP Agro')]/ancestor::tr")).getText();//ancestor
		System.out.println(text);
		
		text=driver.findElement(By.xpath("//a[contains(text(),'MRP Agro')]/ancestor::tr/descendant::td[4]")).getText();//descendant
		System.out.println(text);
		
		text=driver.findElement(By.xpath("//a[contains(text(),'MRP Agro')]/ancestor::tr/following::tr[1]")).getText();//following
		System.out.println(text);
		
		text=driver.findElement(By.xpath("//a[contains(text(),'MRP Agro')]/ancestor::tr/preceding::tr[3]")).getText();//preceding
		System.out.println(text);
		
		List<WebElement>fs=driver.findElements(By.xpath("//a[contains(text(),'MRP Agro')]/ancestor::tr/child::td[2]/following-sibling::td"));//following sibling
         System.out.println("No of following siblings:"+fs.size());
         
         List<WebElement> ps=driver.findElements(By.xpath("//a[contains(text(),'MRP Agro')]/ancestor::tr/child::td[3]/preceding-sibling::td"));//preceding sibling
         System.out.println("No of preceding siblings:"+ps.size());
         
         
	}

}
