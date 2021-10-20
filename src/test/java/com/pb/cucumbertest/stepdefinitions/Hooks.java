package com.pb.cucumbertest.stepdefinitions;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.pb.cucumbertest.helper.Base;
import com.pb.cucumbertest.helper.GenericFunctions;
import com.pb.cucumbertest.helper.MySingleton;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;

public class Hooks extends Base {
	Base tb = new Base();
	public ExtentSparkReporter htmlReporter;
	public ExtentReports extent;
	Scenario scenario;
	public ExtentTest logger;
	MySingleton mys;

//	@BeforeClass
//	public void bc()
//	{
//		
//		File allureDirectory = new File(System.getProperty("user.dir")+"//allure-results");
//		System.out.println("allure path is:"+allureDirectory);
//		if(allureDirectory.exists())
//			allureDirectory.delete();
//	}
	
	@Before()
	public void bf0(Scenario scenario) throws InterruptedException, IOException {
		scenario.log("Before Hook");
		 MySingleton.getInstance();

		setDriver();
		this.scenario = scenario;
		if ((new File(screenshotdir)).exists())
			FileUtils.cleanDirectory(new File(screenshotdir));
	}

	@Attachment(value = "Page screenshot", type = "image/png")
	public byte[] saveScreenshot(byte[] screenShot) {
	    return screenShot;
	}
	
	@After
	public void af0(Scenario scenario) throws InterruptedException, IOException, IllegalMonitorStateException {
		
		scenario.log("After Hook");
		
//		Enable below line to print screenshot for Extent Adpter
//		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericFunctions.getBase64Screenshot());

		if(scenario.isFailed())
		{
//			ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericFunctions.getBase64Screenshot());
//
			Allure.addAttachment("Any Name", new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
		}
		driver.quit();
	}
}
