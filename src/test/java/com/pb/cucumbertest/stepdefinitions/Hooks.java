package com.pb.cucumbertest.stepdefinitions;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.pb.cucumbertest.common.Base;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Hooks
{
	Base base;	
	
	public Hooks(Base base)
	{
		this.base = base;
	}
	
	
	@Before
	public void bf(Scenario scenario) throws IOException
	{
		
		base.setDriver();
		base.setScenario(scenario);
		 Capabilities cap = ((RemoteWebDriver) base.getDriver()).getCapabilities();
		 String browserName = cap.getBrowserName().toLowerCase();
		 ExtentCucumberAdapter.getCurrentScenario().assignCategory(browserName);
		scenario.log("browser name: "+browserName);

	}
	
		
	//Base64
	public String getScreenshotPath(byte[] screenshotBytes)
	{
		String screenShotPath = "data:image/png;base64,"+Base64.getEncoder().encodeToString(screenshotBytes);
		return screenShotPath;
	}
	
	public byte[] getByteScreenshot() throws IOException 
	{
	    File src = ((TakesScreenshot) base.getDriver()).getScreenshotAs(OutputType.FILE);
	    byte[] fileContent = FileUtils.readFileToByteArray(src);
	    return fileContent;
	}
	
	public byte[] screenShotByte()
	{
		return ((TakesScreenshot) base.getDriver()).getScreenshotAs(OutputType.BYTES);
	}
	
	@AfterStep
	public void as(Scenario scenario) {
		// Enable below steps for Allure
//        Allure.addAttachment(scenario.getName(), new ByteArrayInputStream(((TakesScreenshot) base.getDriver()).getScreenshotAs(OutputType.BYTES)));
    
	}
	@After
	public void af(Scenario scenario) throws IOException, InterruptedException
	{
//		  if (scenario.isFailed()) {
//		        String screenshotName = scenario.getName().replaceAll(" ", "_");
//		        byte[] source = ((TakesScreenshot) base.getDriver()).getScreenshotAs(OutputType.BYTES);
//		        scenario.attach(source, "image/png", screenshotName);
//		     }
		  
//		if(scenario.isFailed())
//	    {		
//	        byte[] source = ((TakesScreenshot) base.getDriver()).getScreenshotAs(OutputType.BYTES);

//			 Enable this step for Extent
//			scenario.attach(screenShotByte(), "image/png", scenario.getName());

		
//			ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(getScreenshotPath(screenShotByte()));
//			scenario.log("test");
			// Enable below steps for Allure
//	        Allure.addAttachment(scenario.getName(), new ByteArrayInputStream(((TakesScreenshot) base.getDriver()).getScreenshotAs(OutputType.BYTES)));
//	    }
	    base.getDriver().quit();
	}
	
}