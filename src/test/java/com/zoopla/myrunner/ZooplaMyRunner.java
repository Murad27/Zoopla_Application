package com.zoopla.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		plugin= {"pretty","json:target/cucumber.json" },
		features="./Features",
		glue="com.zoopla.stepdefinations",
		tags="@Sanity"
		//monochrome=true
		
		
		
		
		
		
		)


public class ZooplaMyRunner extends AbstractTestNGCucumberTests{


}
