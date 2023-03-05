package com.sauce.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SauceCompletePage {
	
	
	// create object of webdriver
	
				WebDriver ldriver;
				
				// create constructor
				
				public  SauceCompletePage(WebDriver rdriver) {
					
					ldriver = rdriver;
					
					PageFactory.initElements(rdriver, this);
					
				}
				
				
				@FindBy(xpath="// h2 [text()= 'Thank you for your order!']")
				WebElement successMsg;

				
				
				public void getSuccessMsg() {
					
					
					String msg = successMsg.getText();
					System.out.println("Product page title is:"+msg);
					
					
					if(msg.equals("Thank you for your order!")) {
						
						Assert.assertTrue(true);
					}
					
					else {
						
						Assert.assertTrue(false);
						System.out.println("Success msg  not displayed.");
					}
					
					
				}
}
