package com.pb.cucumbertest.helper;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestBase
{
	DesiredCapabilities cap;
	String browser = "firefox";
	public String screenshotdir = "screenshots";
	public static String hubAddress = "http://192.168.1.74:8888/wd/hub";
	public WebDriver driver;
	
	public void setDriver() throws InterruptedException, MalformedURLException
	{
		System.setProperty("webdriver.chrome.driver","/Users/tarungoswami/git/cucumbertest/cucumbertest/drivers/chromedriverm");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
}
