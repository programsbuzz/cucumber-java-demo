package com.pb.cucumbertest.common;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public String browser = "chrome";
	public static String screenshotdir = System.getProperty("user.dir") + "/test-output/screenshots/";
    private static boolean startBrowser = false;
    private WebDriver driver;


	public static int num1 = 1, num2 = 2;
	
	public WebDriver setDriver()  
	{
		System.setProperty("webdriver.chrome.driver", Constants.MAC_CHROME_DRIVER);

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	 public WebDriver getDriver() 
	 {
	        return driver;
	 }
}
