package org.project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	//1
		static WebDriver driver;
		public static void launchChrome() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			}
		
		//2
		public  static void winmax() {
			driver.manage().window().maximize();
			}
		  //3  
		public static void loadUrl(String url) {
			driver.get(url);
			}
			//4
		public static void printTitle() {
				System.out.println(driver.getTitle());
	         }
		
	       //5 
		public static void printCurrentUrl() {
				System.out.println(driver.getCurrentUrl());
	         }
		//6
		public  static void fill(WebElement ele,String value) {
				ele.sendKeys(value);
		    	}
		
		//7
		public static String getData(int rowNumber , int CellNumber) throws IOException {
			
			File f = new File("C:\\Users\\nicky\\eclipse-workspace\\TestNgProject\\src\\test\\resources\\test1.xlsx");
			FileInputStream fin = new FileInputStream(f);
			
			Workbook w = new XSSFWorkbook(fin);
			
			Sheet s = w.getSheet("Data");
			Row r = s.getRow(rowNumber);
			
			Cell c = r.getCell(CellNumber);
			
		     int cellType = c.getCellType();
		     
		     String Value = "";
		     
		     if (cellType ==1) {
		    	 
		    Value = c.getStringCellValue();	 
		    	 
		  }
			return Value;}
		
		
		//8
		public static void btnClick(WebElement ele) {
	        	ele.click();
	           
		}
	     //9   
		public static void closeBrowser() {
			driver.close();
	       }	
	        
		//10
		public static void rightClick(WebElement ele) {
	        	 Actions a = new Actions(driver);
	        	 a.contextClick(ele).perform();
	         }
		
	     // 11
		public static void dclick(WebElement ele) {
	         Actions a = new Actions(driver);
	         a.doubleClick(ele).perform();
		 }

		//12
		public static void moveElement(WebElement down) {
			Actions a = new Actions(driver);
	        a.moveToElement(down).perform();
			} 
		
		//13
		public static void fill1(WebElement s1) {
			   s1.sendKeys("office chair");
			   
		}
		//14
		public static void dragDrop(WebElement ele) {
			Actions a = new Actions(driver);
			a.dragAndDrop(ele, ele).perform();
			}
		
		//15
		
		
		public static void tab() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		
		}
		
		//16
		public static void keypress(WebElement ele) throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

		}
		 //17
		public static void cut () throws AWTException {
		Robot r = new Robot ();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
	    }
		 
		//18
		
		public static void copy () throws AWTException {
			Robot r = new Robot ();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
		    }

		//19
		
		public static void paste() throws AWTException {
			Robot r = new Robot ();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
		    }
		
		//20
		
		public static void first() throws AWTException {
			Robot r = new Robot ();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.KEY_FIRST);
		    }
		
		
		//21
		
		public static void last() throws AWTException {
			Robot r = new Robot ();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.KEY_LAST);
		    }
		
		//22
		
		public static void capsLock() throws AWTException {
			Robot r = new Robot ();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_CAPS_LOCK);
		    }
		
		//23
		
		public static void clear() throws AWTException {
			Robot r = new Robot ();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_CLEAR);
		    }
		
		
		//24
		
		public static void brouserquit () {
		driver.quit();
		
	}
		
		//25
		
		public static void previouspage () {
			driver.navigate().back();
		}
		
		//26
		
		public static void nextpage () {
			driver.navigate().forward();
			
		}
		
		//27
		
		public static void refresh () {
			driver.navigate().refresh();
		}
		
		
		//28
		
		public static void retrieve () {
			String pageSource = driver.getPageSource();
		}
		
		//29
		
		public static void color (WebElement ele) {
			String color = ele.getCssValue("color");
		}
		
		//30
		
		public static void getAttribute(WebElement att) {
			String A = att.getAttribute("A");
		}
		
		
		//31
		
		
		public static void dropdown(WebElement drop) {
			Select s = new Select(drop);
			s.selectByValue("test");
		}
		
		//32
		
		public static void dropdown1(WebElement drop1) {
			Select s1 = new Select(drop1);
			s1.selectByIndex(4);
		
		}
		
		//33
		
		public static void dropdown2(WebElement drop2) {
			Select s2 = new Select(drop2);
			s2.selectByValue("test");
		
		
		}
		
		//34
		
		public static void listOfOption(WebElement opt) {
			
			Select s3 = new Select(opt);
			List<WebElement> opt1 = s3.getOptions();
			
			for (int i = 0; i < opt1.size(); i++) {
				
				System.out.println(opt1.get(1));
		}}
		
		
		
		//35
		
	  public static void listOfOption1(WebElement opt1) {
			
			Select s4 = new Select(opt1);
			List<WebElement> opt2 = s4.getOptions();
			
			for (int i = 0; i < opt2.size(); i++) {
				
				System.out.println(opt2.size());
		
			}}
		
		
		//36	
	private static void takeScreenShot(WebElement ele) throws IOException {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			File destination = new File("C:\\Users\\nicky\\eclipse-workspace\\SELENIUM\\Screenshot1\\Data.png");
			
			FileUtils.copyFile(source, destination);
			}
		
		//37

		private static void Alert(WebElement ele) {
			Alert b = driver.switchTo().alert();
			   b.accept();
		}
		
		
		//38
		private static void dropDown(WebElement ab) {
			Select s = new Select(ab);
			List<WebElement> list = s.getOptions();
			((Select) ab).selectByIndex(1);
			

			
}}
