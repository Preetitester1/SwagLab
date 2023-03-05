package com.sauce.testCases;

import java.io.IOException;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauce.pageObject.SauceCartPage;
import com.sauce.pageObject.SauceCompletePage;
import com.sauce.pageObject.SauceInformationPage;
import com.sauce.pageObject.SauceLoginPage;
import com.sauce.pageObject.SauceOverviewPage;
import com.sauce.pageObject.SauceProductPage;





public class SauceCompletePageTest extends BaseClass{
	

	 @Test
	 public void login() throws IOException, InterruptedException{
	  
	  driver.get(url);
	  logger.info("URL Opened");
	  
	  SauceLoginPage sauceLogin = new SauceLoginPage(driver); 
	  sauceLogin.enterUsername();
	  logger.info("Username entered");
	  sauceLogin.enterPassword();
	  logger.info("Password entered");
	  sauceLogin.clickOnLoginBtn();
	  logger.info("Clicked on Login button.");
	  
	  String title = driver.getTitle();
	  System.out.println("Product page title is :" + title);
	  
	  if(title.equals("Swag Labs"))
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
	  
	  SauceProductPage productPage =  new SauceProductPage(driver);
	  
	  productPage.clickOnProductName();
	  Thread.sleep(2000);
	  productPage.clickOnAddToCartBtn();
	  
	  String url = driver.getCurrentUrl();
	  System.out.println("Product page url is :" + url);
	  
	  if(url.equals("https://www.saucedemo.com/inventory-item.html?id=4"))
	  {
	   logger.info("VerifyProductP- Passed");
	   Assert.assertTrue(true);
	  }
	  else
	  {
	   logger.info("VerifyProductF - Failed");
	   captureSreenShot(driver,"VerifyProduct");
	   Assert.assertTrue(false);
	
	  }
	  
	  SauceCartPage cartPage = new SauceCartPage(driver);
	cartPage.clickOnCartBtn();
	cartPage.clickCheckOutBtn();

	String checkOuturl = driver.getCurrentUrl();
	  System.out.println("Product page url is :" +  checkOuturl);
	  
	  if( checkOuturl.equals("https://www.saucedemo.com/checkout-step-one.html"))
		  
		  
	  {
	   logger.info("VerifycartProductP- Passed");
	   Assert.assertTrue(true);
	  }
	  else
	  {
	   logger.info("VerifycartProductF - Failed");
	   captureSreenShot(driver,"VerifyProduct");
	   Assert.assertTrue(false);

	  }
	 
	  
	  SauceInformationPage infoPage =  new SauceInformationPage (driver);
	  infoPage.enterfirstName();
	  infoPage.enterlastName();
	  infoPage.enterPostCode();
	     Thread.sleep(2000);
	  infoPage.clickOnContinue();
	  
	  String  overviewurl = driver.getCurrentUrl();
	  System.out.println("Product page url is :" + overviewurl);
	  
	  
if(  overviewurl.equals("https://www.saucedemo.com/checkout-step-two.html"))
		  
		  
	  {
	   logger.info("VerifycartProductP- Passed");
	   Assert.assertTrue(true);
	  }
	  else
	  {
	   logger.info("VerifycartProductF - Failed");
	   captureSreenShot(driver,"VerifyProduct");
	   Assert.assertTrue(false);

	  }
	  
	  
	  
	  
	  SauceOverviewPage overviewPage = new SauceOverviewPage(driver);
	  
	  overviewPage.clickOnFinishBtn();
	  
	  SauceCompletePage sComPage = new  SauceCompletePage(driver);
	  sComPage.getSuccessMsg();
	  
	  
	
	  
	     Thread.sleep(2000);
	  logger.info("Browser Closed.");

}
	 

}
