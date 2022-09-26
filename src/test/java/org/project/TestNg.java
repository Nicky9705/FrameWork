package org.project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg {
	
	
	@BeforeClass
	private void browser() {
		System.out.println("chrome");
      }
	
	@AfterClass
	private void BrowserClose() {
		System.out.println("close");
	}
	
	
	@Test(priority = -5,enabled = false)
	private void tc3() {
		System.out.println("test3");

	}
	
	@Test(priority = 2 ,invocationCount = 3)
	private void tc2() {
		System.out.println("test2");

	
	}
		
	@Test(priority = -3)
	private void tc1() {
		System.out.println("test1");

	
	}
	
	@Test(priority = 4)
	private void tc4() {
		System.out.println("test4");
		
	}
		
		
	@BeforeMethod
	private void start() {
		System.out.println("start");

	}
	
	@BeforeMethod
	private void end() {
		System.out.println("end");

	}
	
	
	
	
	

	}


