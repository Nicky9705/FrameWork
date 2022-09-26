package org.project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Crazy4 extends BaseClass {
	
	@BeforeMethod
	 private void start() {
     System.out.println("start");
     driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.manage().deleteAllCookies();
	 driver.get("https://www.crazysales.com.au/");
	 }
	
	
	@Test
	 public void verifyPageTitleTest() {
		 String title = driver.getTitle();
		 System.out.println("the page title is : "+ title);
		 Assert.assertEquals(title, "CrazySales® Official Site - Cheap Online Shopping Australia Store.");
	 }
	 
	 @Test
	 public void verifyLogoTest() {
		Boolean logo = driver.findElement(By.xpath("//img[@class='hani']")).isDisplayed();
		Assert.assertTrue(logo);
			
		 }
		 
			
	 @AfterMethod
	 private void end() {
	 System.out.println("end");
	 }


}
