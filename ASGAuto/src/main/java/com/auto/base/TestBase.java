package com.auto.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;


public class TestBase {
	
	public static WebDriver webDriver;
	public static Properties prop;
	
	
	public void initialization() {
		
		System.setProperty("webdriver.chrome.driver", "src/main/java/WebDrivers/chromedriver.exe/");
		
		webDriver = new ChromeDriver();
		
		webDriver.get(prop.getProperty("webexurl"));
		
		webDriver.manage().window().maximize();
		webDriver.manage().deleteAllCookies();
		webDriver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		webDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
	}
	
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fileInputStream = new FileInputStream("Configuration\\config.properties");
			prop.load(fileInputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
