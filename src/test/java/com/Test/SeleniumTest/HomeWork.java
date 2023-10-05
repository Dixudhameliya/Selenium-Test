package com.Test.SeleniumTest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.collect.Lists;

public class HomeWork {
	public static void main(String[] args) throws MalformedURLException {

		System.setProperty("Webdriver.Chrome.driver", "C:\\Program Files\\Eclipse\\Driver\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote--allows--origins=*");

		WebDriver driver = new ChromeDriver();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter website url:");
		String website = sc.next();
		driver.get(website);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links:" + links.size());

		Set<String> uniquelink = new HashSet<String>();

		for (WebElement element : links) {
			String url = element.getAttribute("href");
			if (url == null || url.isEmpty()) {
				System.out.println("URL is empty");
			}
			uniquelink.add(url);
		}
		System.out.println("Total no. of uniqelinks: " + uniquelink.size());

		int brokenlinks = 0;
		int validlinks = 0;

		for (String url : uniquelink) {

			URL link = new URL(url);

			try {
				HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
				httpconn.connect();
				if (httpconn.getResponseCode() > 400) {
					System.out.println(url + " is " + " broken link");
					brokenlinks++;
				} else {
					System.out.println(url + " is " + " valid link");
					validlinks++;
				}
			} catch (Exception e) {

			}

		}System.out.println("Total no. of broken link: "+ brokenlinks);
		System.out.println("Total no. of valid link: "+ validlinks);

	}
}
