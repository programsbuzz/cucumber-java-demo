package com.pb.cucumbertest.stepdefinitions;

import com.pb.cucumbertest.common.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomeSD extends Base {


	
	@Then("^cart contains \"([d])\" items$")
	public void test1(int i) {
//		driver.get("http://automationpractice.com");

	}
	

//	@Then("^I( see| do not see) link \"([^\"]*)\"$")
	
//	@Then("cart contains {string} items")
//	public void test2(String s) {
////		driver.get("http://automationpractice.com");
//
//	}
	
	@Then("I see (hello*) text")
	public void test3() {
//		driver.get("http://automationpractice.com");

	}

}
