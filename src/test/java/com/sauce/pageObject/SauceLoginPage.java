package com.sauce.pageObject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLoginPage {
	
	// create object of webdriver
	
	WebDriver ldriver;
	
	// create constructor
	
	public SauceLoginPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy (id = "user-name")
	
	WebElement username;
	
   @FindBy (id = "password")
	
	WebElement password;
	
   
   
   @FindBy (id = "login-button")
	
	WebElement login;
   
   public void enterUsername() throws InterruptedException {
	   username.sendKeys("standard_user");
	   Thread.sleep(2000);
	   
   }
   public void enterPassword() throws InterruptedException {
	   password.sendKeys("secret_sauce");
	   Thread.sleep(2000);
   }
   
   public void clickOnLoginBtn() throws InterruptedException {
	  login.click();
	  Thread.sleep(1000);
   }
}
