package com.pb.cucumbertest.stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
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
	public void bf(Scenario scenario)
	{
		base.setDriver();
	}
	
	@After
	public void af(Scenario scenario) throws IOException
	{
	
	    base.getDriver().quit();	
	}
	
}