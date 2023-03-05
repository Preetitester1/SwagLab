package com.sauce.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceCartPage {
	
	
	// create object of webdriver
	
			WebDriver ldriver;
			
			// create constructor
			
			public  SauceCartPage(WebDriver rdriver) {
				
				ldriver = rdriver;
				
				PageFactory.initElements(rdriver, this);
				
			}
			
			
			@FindBy(xpath = "// a [@Class= 'shopping_cart_link']")
			WebElement CartIcon;
			
			
			@FindBy (id="checkout")
			WebElement  checkOutBtn;
			
			
			public void clickOnCartBtn() {
				CartIcon.click();
				
			}
			
			public void clickCheckOutBtn() {
				 checkOutBtn.click();
				
			}

}
