package com.pb.cucumbertest.stepdefinitions;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.pb.cucumbertest.common.Base;
import com.pb.cucumbertest.common.GenericFunctions;
import com.pb.cucumbertest.common.MySingleton;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;

public class Hooks
{
	WebDriver driver;
	public ExtentSparkReporter htmlReporter;
	public ExtentReports extent;
	Scenario scenario;
	public ExtentTest logger;
	MySingleton mys;


	
	@Before()
	public void bf0(Scenario scenario) throws InterruptedException, IOException {
//		String browser = System.getProperty("browserType").toUpperCase();
		
		scenario.log("Before Hook");
		 MySingleton.getInstance();
	}

	@Attachment(value = "Page screenshot", type = "image/png")
	public byte[] saveScreenshot(byte[] screenShot) {
	    return screenShot;
	}
	
//	@After
//	public void af0(Scenario scenario) throws InterruptedException, IOException, IllegalMonitorStateException {
//		
//		scenario.log("After Hook");
//		
////		Enable below line to print screenshot for Extent Adpter
////		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericFunctions.getBase64Screenshot());
//
//		if(scenario.isFailed())
//		{
////			ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericFunctions.getBase64Screenshot());
////
//			Allure.addAttachment("Any Name", new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
//		}
//		driver.quit();
//	}
}
