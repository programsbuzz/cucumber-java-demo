package com.pb.cucumbertest.pagemodules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPOM {
	WebDriver driver;

	@FindBy(id = "search_query_top")
	public WebElement searchText;

	@FindBy(name = "submit_search")
	public WebElement searchBtn;

	public SearchPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void searchText(String text) {
		searchText.sendKeys(text);
		searchBtn.click();
	}

}
