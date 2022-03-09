package com.pb.cucumbertest.stepdefinitions;

import org.junit.runner.RunWith;



import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm;

@RunWith(Cucumber.class)

@CucumberOptions(
//		Enable below plugin for Extent Adapter
//		plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
		
		//Enable below plugin for different default report
//		plugin = {"pretty", "html:target/cucumber-html-report" , "json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucumber.xml" , "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

//		Enable below plugin for Allure Adapter
		plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
		features = {"src/test/resources/features" }, 
		glue = {"com.pb.cucumbertest.stepdefinitions"}, 
		monochrome = true, 
		dryRun = false, 
		tags = ("@SmokeTest")
		)

public class TestRunner {
}



