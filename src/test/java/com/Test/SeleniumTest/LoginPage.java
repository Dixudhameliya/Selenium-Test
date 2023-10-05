package com.Test.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
		WebDriver driver;
		
       @FindBy(xpath="//input[@id='email']")
		WebElement emailid;
       
       @FindBy(xpath="//input[@id='pass']")
		WebElement password;
       
       @FindBy(xpath="//div[@id='passContainer']/parent::*/following::div[1]/child::button")
		WebElement login;
		

		public LoginPage(WebDriver driver) {
			
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}
		
		public void enteremail(String id) {
			emailid.sendKeys(id);
		}
		
		public void enterpassword(String pass) {
			password.sendKeys(pass);
		}
		
		public void clickbutton() {
			login.click();
		}
		
		
		
		
		
		
		

	}


