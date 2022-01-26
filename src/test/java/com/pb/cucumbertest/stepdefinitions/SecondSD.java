package com.pb.cucumbertest.stepdefinitions;

import com.pb.cucumbertest.common.Base;
import com.pb.cucumbertest.pagemodules.SecondPOM;

import io.cucumber.java.en.Given;

public class SecondSD {
	Base base;
	SecondPOM secondPOM;
	
	public SecondSD(Base base)
	{
		this.base = base;
		secondPOM = new SecondPOM(base);
	}
	
	@Given("I click on ask doubt link")
	public void i_click_on_ask_doubt_link() {
	  secondPOM.clickAskDoubt();
	}
}
