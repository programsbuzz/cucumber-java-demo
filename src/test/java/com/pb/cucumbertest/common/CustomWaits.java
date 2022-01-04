package com.pb.cucumbertest.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWaits 
{
	public WebDriver driver;
	
	
	public void sleepSeconds(int sec)
	{
		try
		{
			Thread.sleep(sec * 1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}		
	}
	
	public void sleepMS(int ms)
	{
		try
		{
			Thread.sleep(ms);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}		
	}
	
	public void waitUntilVisibility(WebDriver driver, By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void waitUntilVisibility(WebDriver driver, By locator, int seconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	

	public void waitUntilVisibility(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitUntilVisibility(WebDriver driver, WebElement element, int seconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	

	public void waitUntilPresense(WebDriver driver, By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	

	public void waitUntilPresense(WebDriver driver, By locator, int seconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public void waitUntilInvisibility(WebDriver driver, By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}
	
	public void waitUntilInvisibility(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	public void waitUntilVisibilityOfAllElements(WebDriver driver, By locator, int seconds) 
	{
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public void waitUntilVisibilityOfAllElements(WebDriver driver, WebElement element, int seconds) 
	{
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.invisibilityOfAllElements(element));
	}	
	
	// Clickable, frame, list

}
