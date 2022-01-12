package com.pb.cucumbertest.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pb.cucumbertest.common.Base;

import io.cucumber.java.en.Then;

public class SecondSD {
	
private WebDriver driver;
Base base;
	
	public SecondSD(Base base)
	{
		this.base = base;
	}

	@Then("I clicked on login link")
	public void readnum1()
	{
		base.getDriver().findElement(By.linkText("LOG IN")).click();
	
	}

}
