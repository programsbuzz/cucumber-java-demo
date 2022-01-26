package com.pb.cucumbertest.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pb.cucumbertest.common.Base;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSD extends Base  {
	
	private WebDriver driver;
	Base base;
	
	public SearchSD(Base base)
	{
		this.base = base;
		driver = base.getDriver();
	}
	

	@When("I click on Search icon")
	public void i_click_on_search_icon() {
	    driver.findElement(By.cssSelector("div.gva-search-region span.icon")).click();
	}


//	@When("I fill in search query text with {string}")
//	public void i_fill_in_search_query_text_with(String queryTxt) {
//		driver.findElement(By.xpath("fdfdfdfdfd")).click();
//		
//		
//		
//		driver.findElement(By.cssSelector("input[id='search_query_top']")).sendKeys(queryTxt);
//	}
//
//	@When("I click on search button")
//	public void i_click_on_search_button() {
//		driver.findElement(By.cssSelector("button[name='submit_search']")).click();
//	}

	@Then("I should see search results for {string}")
	public void i_should_see_search_results_for(String string) throws InterruptedException {
		Thread.sleep(5000);
	}
	
	@When("I fill in search query one text with {string}")
	public void i_fill_in_search_query_one_text_with(String string) {

	}

}
