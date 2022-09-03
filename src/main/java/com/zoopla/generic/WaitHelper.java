package com.zoopla.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zoopla.basepage.ZooplaBase;

public class WaitHelper extends ZooplaBase{
	public static void waitUntilElementToBePresent(WebElement ele) {
		
		WebDriverWait wait = new WebDriverWait(driver,20);                  //Explecit wait object
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}
	}


