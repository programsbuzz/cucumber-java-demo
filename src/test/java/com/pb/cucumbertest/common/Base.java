package com.pb.cucumbertest.common;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Scenario;

public class Base 
{
	private WebDriver driver;
	private Scenario scenario;
	
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	public Scenario getScenario()
	{
		return scenario;
	}
	
	public void setScenario(Scenario scenario)
	{
		this.scenario = scenario;
	}
	
	public void setDriver()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriverm");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	
}
