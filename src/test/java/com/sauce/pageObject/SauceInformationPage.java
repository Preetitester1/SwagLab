package com.sauce.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceInformationPage {
	
	

	// create object of webdriver
	
			WebDriver ldriver;
			
			// create constructor
			
			public  SauceInformationPage(WebDriver rdriver) {
				
				ldriver = rdriver;
				
				PageFactory.initElements(rdriver, this);
				
			}
			
			
			@FindBy(id="first-name")
			WebElement firstName;
			
                
			@FindBy(id="last-name")
			WebElement lastName;
			
			@FindBy(id="postal-code")
			WebElement postalPin;
			
			
			@FindBy(id="continue")
			WebElement continuebtn;
			
			
			public void enterfirstName() {
				firstName.sendKeys("preeti");
				
			}
			
			public void enterlastName() {
				lastName.sendKeys("patil");
				
			}
			public void enterPostCode() {
				 postalPin.sendKeys("415203");
				
			}
			
			public void clickOnContinue() {
				continuebtn.click();	;
				
			}
			
			
}
