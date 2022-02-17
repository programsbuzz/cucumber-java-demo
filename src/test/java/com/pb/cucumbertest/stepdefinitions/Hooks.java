package com.pb.cucumbertest.stepdefinitions;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.pb.cucumbertest.common.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

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
	}
	
		
	public byte[] getByteScreenshot() throws IOException 
	{
	    File src = ((TakesScreenshot) base.getDriver()).getScreenshotAs(OutputType.FILE);
	    byte[] fileContent = FileUtils.readFileToByteArray(src);
	    return fileContent;
	}
	
	@After
	public void af(Scenario scenario) throws IOException, InterruptedException
	{
		if(scenario.isFailed())
	    {			
			// Enable this step for Extent
			scenario.attach(getByteScreenshot(), "image/png", scenario.getName());
		
			// Enable below steps for Allure
//	        Allure.addAttachment(scenario.getName(), new ByteArrayInputStream(((TakesScreenshot) base.getDriver()).getScreenshotAs(OutputType.BYTES)));
	    }
	    base.getDriver().quit();
	}
	
}