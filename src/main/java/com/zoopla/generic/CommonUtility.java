package com.zoopla.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.zoopla.basepage.ZooplaBase;

import com.zoopla.basepage.ZooplaBase;





public class CommonUtility extends  ZooplaBase {

public static void getActionClass(WebElement elm,WebDriver driver) {    //pass parameter-WebElement elm
        Actions obj =new Actions(driver);                  //and click position pass only-elm
		obj.click(elm).build().perform();                  //Action Class.
	}
	
	
	
	public static void getJSClick(WebElement ele,WebDriver driver) {
		
		
		((JavascriptExecutor)driver ).executeScript("arguments[0].click();",ele);   //pass parameter-WebElement ele
	}                                                                              //and click position pass only-ele
	
	public static boolean getVerifyTheResult(String Expected,String Actual){
		
	Assert.assertEquals(Expected,Actual);
	if(Expected.equals(Actual)) {
	System.out.println("Expected and Actual are equal");	
	}else {
		System.out.println("Expected and Actual are not equal");
	}
		return true;
		
		
	}

		
	}
		
		
			
	
	
	
	



