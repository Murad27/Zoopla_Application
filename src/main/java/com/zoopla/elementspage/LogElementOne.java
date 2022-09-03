package com.zoopla.elementspage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.basepage.ZooplaBase;

public class LogElementOne extends ZooplaBase {
	public LogElementOne() {                       //public LogElementOne(){}-Anotation
		PageFactory.initElements(driver,this );   //pagefactory-class
		                                          //initElement-method	
	}
@FindBy(xpath="//*[@id='__next']/div/header/div/div/nav/div[3]/div[2]/ul/li[3]/a")
@CacheLookup
WebElement clickOnsignButton;

public WebElement clickOnsignButton() {           //Getter  method
	return clickOnsignButton;
	
}
@FindBy(xpath="//*[@id='email']")
@CacheLookup
WebElement userName;

public WebElement getuserName() {           //Getter  method
	return userName;

}
@FindBy (xpath="//*[@id='password']")
@CacheLookup
WebElement password;
public WebElement getpassword() {
	return password;

}
@FindBy(xpath="//*[@id='main-content']/div/div/form/div[6]/div/button")
@CacheLookup
WebElement clickOnlogButton;

public WebElement getClickOnlogButton() {
	return clickOnlogButton;

}


public void getuserNameandpassword(String userName,String password) {
	getuserName().sendKeys(userName);
	getpassword().sendKeys(password);

}
@FindBy(xpath="//*[@id='main-content']/div[1]/div/div/div/div[2]/div")
@CacheLookup
WebElement VerifyText;

public WebElement getVerifyText() {
	return VerifyText;


}
}