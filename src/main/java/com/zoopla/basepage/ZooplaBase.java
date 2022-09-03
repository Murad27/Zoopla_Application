package com.zoopla.basepage;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ZooplaBase {
	public static Logger logger;
	
	

	
	public Properties prof;    //Global level variable
	
	public static WebDriver driver;
	 
	public ZooplaBase()  {
	
	logger=Logger.getLogger(" Try To Get The Job QA-Murad");
	
	//PropertyConfigurator.configure("./log4j.properties");
	PropertyConfigurator.configure("log4j.properties");
		
		
		
		
		try {  
			prof=new Properties ();  //if u use properties file then create an object properties class
	 FileInputStream ip;
	 
	   ip = new FileInputStream("./src/main/java/com/zoopla/config/config.properties");
	   
		//System.getProperty("user.dir") + "/src/main/java/com/config/ZooplaConfig.properties"); 
	  // when ever serialization any thing read thats why use FileInputStream class 
		   //and pass the location.
	  
		prof.load(ip);
	} catch (FileNotFoundException e1) {
		
		e1.printStackTrace();
	}
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	
	
	public static void Initialization() {
		//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup(); 
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);  //implicit wait method
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

}
