package com.pb.cucumbertest.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.pb.cucumbertest.common.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonSD
{
	Base base;
	WebDriver driver;

 
	public CommonSD(Base base)
	{
		this.base = base;
		this.driver = base.getDriver();
	}
	

@Given("I am on the homepage")
public void i_am_on_the_home_page() {
    driver.get("https://www.programsbuzz.com");
}

	
	
	@Given("I follow url {string}")
	public void i_follow_url(String url) {
		driver.get(url);
	    
	}
	
	@Then("^I should see \"([a-zA-Z \"']*)\" text")
	public void i_should_see_hello_world_text(String s) {
		ExtentCucumberAdapter.getCurrentScenario().fail("Test Failed");	  
	}
	
//	@Then("^I should see \"([\\w\\s\"]*)\" text$")
//	public void teststep3(String s)
//	{
//		System.out.println("value 3 is:"+s);
//	}
	
//	@Then("^I should see \"([\\w\\s']*)\" text$")
//	public void teststep4(String s)
//	{
//		System.out.println("value 4 is:"+s);
//	}
	
	
	
	

	
	@Then("I should see {int} item\\(s)")
	public void i_should_see_item_s(Integer int1) {
	    
	}

	@Then("I should see {int} \\{what}")
	public void i_should_see(Integer int1) {
	    
	}
	
	

	@Then("progress is {int}%")
	public void progress_is(Integer int1) {
		System.out.println(int1);
	}

	@Then("^total of cart is .([0-9.]*)")
	public void testing(Double double1)
	{
		System.out.println(double1);
	}
	
	@Then("the {string} label is displayed")
	public void the_label_is_displayed(String string) {
		System.out.println(string);
	}


	
	@When("I fill in your message with")
	public void i_fill_in_yourr_message_with(String docString) {
		driver.findElement(By.cssSelector("#Message")).sendKeys(docString);
	}	
	

	@Then("I have {int} item(s)/product(s) in cart")
	public void stepname(int i)
	{
		
	}
	
	@Then("count of item is {int}")	
	public void teststep(int n) {
		System.out.print(n);
	}
		
	
	
	
	@When("this step will fail")
	public void this_step_will_fail() {
//	    System.out.println(10/0);
	}
	

	@Then("I click on {string}")
	public void i_click_sign_in_button(String locator) {
//		WebElement myButton = driver.findElement(By.cssSelector(locator));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", myButton);
	}

	@Then("I should see heading {string}")
	public void i_should_see(String text) {
		String heading = "//h1[text()='" + text + "']";
		Assert.assertTrue(driver.findElement(By.xpath(heading)).isDisplayed());
	}

	@Then("^I( see| do not see) link \"([^\"]*)\"$")
	public void i_should_see_link(String optionalValue, String linkText) {
		Boolean expectedValue;

		if (optionalValue.equals(" do not see"))
			expectedValue = false;
		else if (optionalValue.equals(" see"))
			expectedValue = true;
	}
	
	@When("I click on submit button")
	public void i_click_on_submit_button() {
//	   driver.findElement(By.xpath("randomxpathwillnotwork")).click();
	}
	
	@Given("I follow {string}")
	public void i_follow(String string) {
		driver.findElement(By.linkText(string)).click();
	   
	}
	@When("I fill {string} with {string}")
	public void i_fill_with(String string, String string2) throws InterruptedException {
		Thread.sleep(5000);

	}
	
	@Then("I click {string}")
	public void i_click(String string) {
	  
	}

	@When("I fill in {string} with {string}")
	public void i_fill_in_with(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}



}
