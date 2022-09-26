package org.project;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Crazy2 extends BaseClass{
	
	@BeforeClass
	private void browser() {
		launchChrome();
		winmax();
      }
	
	@AfterClass
	private void BrowserClose() {
		System.out.println("close"); 	
	}
	
	@Test(priority = 3)
	private void tc1() throws IOException, InterruptedException {
	PojoClass2 a = new PojoClass2();
	fill(a.getSearch(),getData(1,4));
	btnClick(a.getSearchbtn());
	btnClick(a.getProduct1());
	btnClick(a.getAddCart1());
	
	}
	
	@Test(priority = 1, invocationCount = 2)
	private void tc2() throws IOException, InterruptedException {
	PojoClass2 a = new PojoClass2();
	fill(a.getSearch(),getData(2,4));
	btnClick(a.getSearchbtn());
	btnClick(a.getProduct2());
	btnClick(a.getAddCart1());
	}
	
	@Test(priority = 2)
	private void tc3() throws IOException, InterruptedException {
	PojoClass2 a = new PojoClass2();
	fill(a.getSearch(),getData(3,4));
	btnClick(a.getSearchbtn());
	btnClick(a.getProduct3());
	btnClick(a.getAddCart1());
	}
	
	@Test
	private void tc4() throws IOException, InterruptedException {
    PojoClass2 a = new PojoClass2();
    fill(a.getSearch(),getData(4,4));
	btnClick(a.getSearchbtn());
	btnClick(a.getProduct4());
	btnClick(a.getAddCart1());

	
    }
	
	@Test
	private void tc5() throws IOException, InterruptedException {
	PojoClass2 a = new PojoClass2();
	fill(a.getSearch(),getData(5,4));
	btnClick(a.getSearchbtn());
	btnClick(a.getProduct11());
	btnClick(a.getAddCart1());
	
	}
	
	@Test(priority = 4)
	private void tc6() throws IOException, InterruptedException {
	PojoClass2 a = new PojoClass2();
	fill(a.getSearch(),getData(6,4));
	btnClick(a.getSearchbtn());
	btnClick(a.getProduct22());
	btnClick(a.getAddCart1());
	}
	
	@Test
	private void tc7() throws IOException, InterruptedException {
	PojoClass2 a = new PojoClass2();
	fill(a.getSearch(),getData(7,4));
	btnClick(a.getSearchbtn());
	btnClick(a.getProduct33());
	btnClick(a.getAddCart1());
	}
	
	@Test
	private void tc8() throws IOException, InterruptedException {
    PojoClass2 a = new PojoClass2();
    fill(a.getSearch(),getData(8,4));
	btnClick(a.getSearchbtn());
	btnClick(a.getProduct44());
	btnClick(a.getAddCart1());

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



