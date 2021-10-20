package com.pb.cucumbertest.stepdefinitions;

import com.pb.cucumbertest.helper.Base;
import io.cucumber.java.en.Given;

public class HomeSD extends Base {

	@Given("^(?:I am|User is) on the home page$")
	public void i_am_on_the_homepage() {
		driver.get("http://automationpractice.com");

	}

}
