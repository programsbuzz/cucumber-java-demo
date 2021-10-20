package com.pb.cucumbertest.helper;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory 
{
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> locDriver =  new ThreadLocal<>();
	
	public void setDriver(String browser)
	{
		List<Integer> mylist = new ArrayList<>();
		if(browser.equals("Chrome"))
		{	
			//WebDriverManager.chromeDriver.setup();
			locDriver.set(new ChromeDriver());
		}	
		
	}

}
