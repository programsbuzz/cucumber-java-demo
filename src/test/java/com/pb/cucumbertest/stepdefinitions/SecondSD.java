package com.pb.cucumbertest.stepdefinitions;

import com.pb.cucumbertest.common.Base;
import com.pb.cucumbertest.pagemodules.SecondPOM;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

public class SecondSD {
	Base base;
	SecondPOM secondPOM;
	Scenario scenario;
	
	public SecondSD(Base base)
	{
		this.base = base;
		secondPOM = new SecondPOM(base);
		this.scenario = base.getScenario();
	}
	
	@Given("I click on ask doubt link")
	public void i_click_on_ask_doubt_link() {
	  secondPOM.clickAskDoubt();
	  scenario.log("scenario fdfdfdfd ");
	}
}
