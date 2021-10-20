package com.pb.cucumbertest.stepdefinitions;

import org.openqa.selenium.By;

import com.pb.cucumbertest.helper.Base;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSD extends Base {

	@When("I fill in search query text with {string}")
	public void i_fill_in_search_query_text_with(String queryTxt) {
		driver.findElement(By.xpath("fdfdfdfdfd")).click();
		
		
		
		driver.findElement(By.cssSelector("input[id='search_query_top']")).sendKeys(queryTxt);
	}

	@When("I click on search button")
	public void i_click_on_search_button() {
		driver.findElement(By.cssSelector("button[name='submit_search']")).click();
	}

	@Then("I should see search results for {string}")
	public void i_should_see_search_results_for(String string) throws InterruptedException {
		Thread.sleep(5000);
	}
	
	@When("I fill in search query one text with {string}")
	public void i_fill_in_search_query_one_text_with(String string) {

	}

}
