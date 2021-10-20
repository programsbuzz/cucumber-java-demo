package com.pb.cucumbertest.helper;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	String browser = "chrome";
	public static String screenshotdir = System.getProperty("user.dir") + "/test-output/screenshots/";

	public WebDriver setDriver() throws InterruptedException, MalformedURLException {

		System.setProperty("webdriver.chrome.driver", Constants.MAC_CHROME_DRIVER);

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
}
