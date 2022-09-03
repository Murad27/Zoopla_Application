package com.zoopla.stepdefinations;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import com.zoopla.basepage.ZooplaBase;
import com.zoopla.elementspage.LogElementOne;
import com.zoopla.generic.CommonUtility;
import com.zoopla.generic.WaitHelper;


import io.cucumber.java.en.*;

public class ZooplaStepdef extends ZooplaBase{

	LogElementOne pf;
	
	@Given("User able to open a any browser")
	public void user_able_to_open_a_any_browser() {
		logger.info("User able to open a any browser");
		
		//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	 ZooplaBase.Initialization();
	pf = new LogElementOne();
	
		
		
	
	    
	}
	@Given("User able to enter {string} url")
	public void user_able_to_enter_url(String url) {
		logger.info("user_able_to_enter_url");
		
		driver.get(url);
		
	
	    
	}
	@When("User able to click on sign-in button")
	public void user_able_to_click_on_sign_in_button() {
	logger.info("User able to click on sign-in button");
		
		
		//pf.clickOnsignButton().click();                 //Click method.
		
		//Actions obj =new Actions(driver);
		//obj.click(pf.clickOnsignButton()).build().perform(); //Action Class before create commonUtility class  
		 
		//CommonUtility.getActionClass(pf.clickOnsignButton());  //Action Class After create commonUtility class 
	                                                           //and this one we are using real field
	    
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();",pf.clickOnsignButton());  //JSClick before create commonUtility class
		
		
		//CommonUtility.getJSClick(pf.clickOnsignButton());  //JSClick After create commonUtility class 
		                                                    //and this one we are using real field
	    
		//WaitHelper.waitUntilElementToBePresent(pf.clickOnsignButton());	
   
  WebDriverWait wait = new WebDriverWait(driver,20);                  //Explecit wait object
  wait.until(ExpectedConditions.elementToBeClickable(pf.clickOnsignButton())); //Explecit method 
 //CommonUtility.getJSClick(pf.clickOnsignButton());                       //And also us JSClick call the CommonUtility class.
  
  CommonUtility.getJSClick(pf.clickOnsignButton(), driver);
		
	}
	@When("User able to enter valid userName & password")
	public void user_able_to_enter_valid_user_name_password() {
		logger.info("User able to enter valid userName & password");
		
		
		//WaitHelper.waitUntilElementToBePresent(pf.getClickOnlogButton()); //Explicit wait call the WaitHelper class 
		//pf.getuserNameandpassword("hasanmurad4201@gmail.com","Murad123");
		
		
		
	pf.getuserName().sendKeys("hasanmurad4201@gmail.com");
   pf.getpassword().sendKeys("Murad123");                        //Click method
    
   // pf.getuserNameandpassword("hasanmurad4201@gmail.com","Murad123"); //2line code 1 line paramiterize method
       
	    
	}
	@When("User able to click on login button")
	public void user_able_to_click_on_login_button() {
		logger.info("user_able_to_click_on_login_button");
		
		
		//WaitHelper.waitUntilElementToBePresent(pf.getClickOnlogButton()); //Explecit wait method or waithelper 
		//pf.getClickOnlogButton().click();
		
		pf.getClickOnlogButton().click();      //only click Method use      
		
		
	
	    
	}
	@Then("User can verify the user information {string} on the grid")
	public void user_can_verify_the_user_information_on_the_grid(String text) {
	//logger.info("User can verify the user information {string} on the grid");
		
		logger.info("User able to use zoopla application ");
		
		//Assert.assertEquals(text,pf.getVerifyText().getText());//1st way verification
		//System.out.println("Expected and Actual are equal");
	  
		//if(text.equals(pf.getVerifyText().getText())) { // 2nd way verification
		//System.out.println("Expected and Actual are equal");
	    
	//}else {System.out.println("Expected and Actual are  not equal");
		CommonUtility.getVerifyTheResult(text,pf.getVerifyText().getText());
		
}
	}
	
