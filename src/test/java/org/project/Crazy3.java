package org.project;

import java.io.IOException;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Crazy3 extends BaseClass{
	
	
	@BeforeClass
	private void browser() {
		launchChrome();
		winmax();
      }
	
	@AfterClass
	private void BrowserClose() {
		System.out.println("close"); 	
	}
	
	@Test
	private void tc1() throws InterruptedException {
		PojoClass a = new PojoClass();
		moveElement(a.getApp());
		btnClick(a.getHome());
	    btnClick(a.getS1());
		Thread.sleep(2000);
	}
	
	@Test
	private void tc2() throws InterruptedException {
		PojoClass a = new PojoClass();
		moveElement(a.getApp());
		btnClick(a.getS2());
		Thread.sleep(2000);
	}
	/*
	@Test
	private void tc3() throws InterruptedException {
		PojoClass a = new PojoClass();

		moveElement(a.getFurn());
		btnClick(a.getS3());
		Thread.sleep(2000);
		
	}
	
	
	@Test
	private void tc4() throws InterruptedException {
		PojoClass a = new PojoClass();
		
		moveElement(a.getGarden());
		btnClick(a.getS4());
		Thread.sleep(2000);
	
	}*/
	
	@BeforeMethod
	private void start() {
	System.out.println("start");
	loadUrl("https://www.crazysales.com.au/");

	}
    @AfterMethod
    private void end() {
	System.out.println("end");
}
}