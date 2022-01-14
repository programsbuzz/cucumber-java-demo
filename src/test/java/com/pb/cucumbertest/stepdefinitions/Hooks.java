package com.pb.cucumbertest.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.pb.cucumbertest.common.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks
{

	WebDriver driver;
	Base base;
	
	public Hooks(Base base)
	{
		this.base = base;
	}
	
	@Before
	public void bf()
	{
		base.setDriver();
	}
	
	@After
	public void af()
	{
//		base.getDriver().quit();
	}
	
}