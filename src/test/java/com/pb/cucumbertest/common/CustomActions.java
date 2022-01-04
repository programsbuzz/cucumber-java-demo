package com.pb.cucumbertest.common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomActions 
{
	public WebDriver driver;

	public void JavaScriptClick(WebDriver driver, WebElement element)
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
	}
	
	public void JavaScriptClick(WebDriver driver, By locator)
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", driver.findElement(locator));
	}
	
	// JavaScript Scroll Into View
	// JavaScript Scroll Horizontally - scroll left
	// JavaScript Scroll Horizontally right
	// JavaScript Scroll To Bottom
	// switch to active window
	// switch to parent window
	// is sorted
	// random element from list
	// 


}
