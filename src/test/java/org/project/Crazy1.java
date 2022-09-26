package org.project;

import java.io.IOException;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Crazy1 extends BaseClass {
	
	
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
	private void tc1() throws InterruptedException, IOException {
		//Invalid User Invalid Password
		PojoClass1 a = new PojoClass1();
		btnClick(a.getSignin());
		btnClick(a.getSign1());
		fill(a.getTxtUser(), getData(11,0));
		fill(a.getTxtpass(), getData(11,1));
		btnClick(a.getBtnlogin());
		Thread.sleep(2000);	
	}

	@Test
	//Invalid User Valid Password
	private void tc2() throws InterruptedException, IOException {
	PojoClass1 a = new PojoClass1();
	btnClick(a.getSignin());
	btnClick(a.getSign1());
	fill(a.getTxtUser(), getData(12,0));
	fill(a.getTxtpass(), getData(12,1));
	btnClick(a.getBtnlogin());
	Thread.sleep(2000);
     }
   
	@Test
	//Valid User Invalid Password
		private void tc3() throws InterruptedException, IOException {
		PojoClass1 a = new PojoClass1();
		btnClick(a.getSignin());
		btnClick(a.getSign1());
		fill(a.getTxtUser(), getData(13,0));
		fill(a.getTxtpass(), getData(13,1));
		btnClick(a.getBtnlogin());
		Thread.sleep(2000);
		
	}
	
	@Test
	// Valid User Valid Password
	private void tc4() throws InterruptedException, IOException {
		PojoClass1 a = new PojoClass1();
		btnClick(a.getSignin());
		btnClick(a.getSign1());
		fill(a.getTxtUser(), getData(14,0));
		fill(a.getTxtpass(), getData(14,1));
		btnClick(a.getBtnlogin());
		Thread.sleep(2000);
	}
	
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
