package com.pb.cucumbertest.stepdefinitions;

import com.pb.cucumbertest.helper.Base;

import io.cucumber.java.en.When;

public class LoginSD extends Base {
	@When("I fill in username with {string}")
	public void i_fill_in_username_with(String string) {

	}

	@When("I click on Sign in button")
	public void i_click_on_Sign_in_button() {

	}

//	@When("I fill in password with {string}")
//	public void i_fill_in_password_with(String a) {
//
//		System.out.println("value received"+a);
//	}

	@When("I click on Sign in")
	public void i_click_on_Sign_in() {
		// Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@When("I fill in email with {string} and password with {double}")
	public void i_fill_in_email_with_and_password_with(String string, double a) {

	}

	@When("I fill in email with {string}")
	public void i_fill_in_email_with(String string) {

	}

	@When("I fill in password with {string}")
	public void i_fill_in_password_with(String string) {

	}

}
