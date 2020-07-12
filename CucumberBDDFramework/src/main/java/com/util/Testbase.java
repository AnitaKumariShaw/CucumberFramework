package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase  {
	
	public Properties prop;
	public static WebDriver driver;
	//Utilities util = new Utilities();
	
	public Testbase() {
		try {
		prop = new Properties();
			FileInputStream fis= new FileInputStream(new File("E:\\PhotonWS\\CucumberBDDFramework\\src\\main\\java\\com\\config\\Config.properties"));
			prop.load(fis);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public WebDriver driverInitialization()
	{
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium Server\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//implicitWaitTime(20);
			driver.get(prop.getProperty("url"));
			
		}
		return driver;
	}

}
