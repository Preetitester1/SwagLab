package com.sauce.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.sauce.pageObject.SauceLoginPage;

public class SauceLogin extends BaseClass {
	
	@Test
	
	public void login() throws InterruptedException, IOException {
		
		driver.get(url);
		
	logger.info("URL opened");
		
	
		
		SauceLoginPage sauceLogin = new  SauceLoginPage (driver);
		
	sauceLogin.enterUsername();
	logger.info("enterUsername");
		
		sauceLogin.enterPassword();
		logger.info("enterPassword");
		
		sauceLogin.clickOnLoginBtn();
		logger.info("clickOnLoginBtn");
		
		logger.info("browser closed");
		
		  
		  String title = driver.getTitle();
		  System.out.println("Product page title is :" + title);
		  
		  if(title.equals("Swag Labs "))
		  {
		   logger.info("VerifyLogin - Passed");
		   Assert.assertTrue(true);
		  }
		  else
		  {
		   logger.info("VerifyLogin - Failed");
		   
		  captureSreenShot(driver,"VerifyLogin");
		 
		   Assert.assertTrue(false);

		  }
		  
	}
	

}

//System.out.println("edge browser has launched");
		//logger.info("Browser closed");
