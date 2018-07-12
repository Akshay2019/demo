package com.hd;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class TestClass1 extends readprop {

	public static void main(String[] args) throws FileNotFoundException  {

	// System.setProperty("webdriver.ie.driver",
	//			 "C:\\Users\\MANSI\\Downloads\\Automation\\IEDriverServer_x64_3.13.0\\IEDriverServer.exe");

//	System.setProperty("webdriver.gecko.driver",
//				"C:\\Users\\mansi.delhiwala\\Downloads\\geckodriver-v0.20.0-win32\\geckodriver.exe");

	//	 WebDriver driver = new InternetExplorerDriver();
		 
		// File src = new File("C:\\Excel\\New Microsoft Excel Worksheet.xlsx");
		// FileInputStream fis = new  FileInputStream(src);
		 
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//	InputStream input = new FileInputStream("/Users/mansi.delhiwala/workspace1/Demo/src/property/Login.properties");
		//	prop.load(input);
			
		//	driver.get(prop.getProperty("URL"));
		// driver.get("https://www.facebook.com/");
		// readpropfile1();
		// readpropfile();
		 //readpropfile2();
		
		// InputStream input = new FileInputStream("C:\\Users\\MANSI\\eclipse-workspace\\Demo\\src\\prop\\demo.properties");
			//try {
				//prop.load(input);
			//} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
		//	}
			
			//driver.get(prop.getProperty("URL"));
		 
		 
		 // driver.get(prop.getProperty("URL"));

		driver.get("https://breeze-online-20.breeze.ca.gov?");

	driver.findElement(By.id("infoBlockIDImage")).click();
	driver.findElement(By.id("overridelink")).click();
	driver.findElement(By.id("userid")).sendKeys("VOUSER_ST_636");
	driver.findElement(By.id("password")).sendKeys("Password123!");
	driver.findElement(By.name("logon")).click();
	
	Select dropDown= new Select(driver.findElement(By.xpath("//*[@id='board']")));
	dropDown.selectByVisibleText("Board of Barbering and Cosmetology");
	
	Select dropDown1= new Select(driver.findElement(By.xpath("//*[@id='applicationType']")));
	dropDown1.selectByVisibleText("Barber - License by Reciprocity");
	
	driver.findElement(By.name("add")).click();
	
	driver.findElement(By.name("next")).click();
	
	driver.findElement(By.name("agree")).click();
	
	driver.findElement(By.id("true2217")).click();
	driver.findElement(By.id("true2218")).click();
	driver.findElement(By.id("true2167")).click();
	
	driver.findElement(By.name("next")).click();
	
	Select dropdown2= new Select(driver.findElement(By.name("question_0")));
	dropdown2.selectByValue("N");
	
	Select dropdown3= new Select(driver.findElement(By.name("question_1")));
	dropdown3.selectByValue("N");
	
	Select dropdown4= new Select(driver.findElement(By.name("question_2")));
	dropdown4.selectByValue("N");
	
	driver.findElement(By.name("next")).click();
	
	driver.findElement(By.name("next")).click();
	
	driver.findElement(By.name("add")).click();
	
	Select dropdown5= new Select(driver.findElement(By.name("contactInfoTypeId")));
	dropdown5.selectByVisibleText("Address of Record");
	
	driver.findElement(By.name("next")).click();
	
	driver.findElement(By.name("addressLine1")).sendKeys("abc");
	driver.findElement(By.name("addrCity")).sendKeys("ab");
	driver.findElement(By.name("addrZip")).sendKeys("12345");
	driver.findElement(By.name("next")).click();
	
	driver.findElement(By.name("next")).click();
	
	driver.findElement(By.name("add")).click();
	
	driver.findElement(By.name("rsdCol118")).sendKeys("123");
	driver.findElement(By.name("rsdCol119")).click();
	driver.findElement(By.name("rsdCol119")).sendKeys("01012001");
	driver.findElement(By.name("rsdCol120")).click();
	driver.findElement(By.name("rsdCol120")).sendKeys("01012002");
	Select dropdown6= new Select(driver.findElement(By.name("rsdCol342")));
	dropdown6.selectByVisibleText("Alaska");
	driver.findElement(By.name("rsdCol884")).sendKeys("xxx");
	driver.findElement(By.name("done")).click();
	
	driver.findElement(By.name("next")).click();
	
	driver.findElement(By.id("rsdDataValue0_1")).click();
	driver.findElement(By.id("rsdDataValue1_1")).click();
	driver.findElement(By.name("next")).click();
	
	Select dropdown7= new Select(driver.findElement(By.name("rsdCol35457")));
	dropdown7.selectByVisibleText("English");
	driver.findElement(By.name("next")).click();
	
	driver.findElement(By.name("next")).click();
	
	}
	}