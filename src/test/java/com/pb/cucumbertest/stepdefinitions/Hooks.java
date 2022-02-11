package com.pb.cucumbertest.stepdefinitions;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.pb.cucumbertest.common.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

public class Hooks
{
	Base base;	
	
	public Hooks(Base base)
	{
		this.base = base;
	}
	
	@Before
	public void bf(Scenario scenario)
	{
		base.setDriver();
		base.setScenario(scenario);
	}
	
	@After
	public void af(Scenario scenario) throws IOException, InterruptedException
	{
		if(scenario.isFailed())
	    {	
			Thread.sleep(5000);
	        Allure.addAttachment(scenario.getName(), new ByteArrayInputStream(((TakesScreenshot) base.getDriver()).getScreenshotAs(OutputType.BYTES)));
	    }
		
	  
		scenario.log("closing the browser.");
//		ExtentCucumberAdapter.addTestStepLog("this is my log");

	    base.getDriver().quit();
	    scenario.log("Browser closed");
	}
	
}