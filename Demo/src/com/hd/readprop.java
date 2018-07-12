package com.hd;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class readprop {

	 static WebDriver driver;
	static Properties prop;
		
		public static void readpropfile()
		{
			Properties prop = new Properties();
			
			try {
				
				InputStream input = new FileInputStream("C:\\Users\\MANSI\\eclipse-workspace\\Demo\\src\\prop\\demo.properties");
				prop.load(input);
		//	String URL1= prop.getProperty("URL");
			//	driver.get("URL");
			
			} 
			
			catch (Exception e) {
			
				e.printStackTrace();
			}
			
		}
		
		public static void readpropfile1() 
		{
		System.setProperty("webdriver.ie.driver",
				 "C:\\Users\\MANSI\\Downloads\\Automation\\IEDriverServer_x64_3.13.0\\IEDriverServer.exe");
		 WebDriver driver = new InternetExplorerDriver();
		 driver.manage().window().maximize();
	}
		
		public static void readpropfile2() 
		{
			driver.get(prop.getProperty("URL"));
		//	driver.get("URL1");
		}
}