package com.pb.cucumbertest.stepdefinitions;

import org.junit.runner.RunWith;



import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
//		Enable below plugin for Extent Adapter
		plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
		
		//Enable below plugin for different default report
//		plugin = {"pretty", "html:target/cucumber-html-report" , "json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucumber.xml"},

//		Enable below plugin for Allure Adapter
//		plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
		features = {"classpath:features"},
		glue = {"com.pb.cucumbertest"},
		monochrome = true,
		dryRun = false, 
		tags = ("@Smoke")
		)

public class TestRunner {
}



