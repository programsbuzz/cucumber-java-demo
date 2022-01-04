package com.pb.cucumbertest.drivers;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import com.pb.cucumbertest.common.Constants;

public class ChromeDriverManager extends DriverManager
{
	private ChromeDriverService driverService;

	@Override
	protected void startService() 
	{
		String chromePath = Constants.WINDOWS_CHROME_DRIVER;
		
		if(!System.getProperty("webdriver.chrome.driver").equals(null))
			chromePath = System.getProperty("webdriver.chrome.driver");
		else if(Constants.OS.equals("Mac"))
			chromePath = Constants.MAC_CHROME_DRIVER;
			
		
		if(null == driverService)
		{
			try
			{
				driverService = new ChromeDriverService.Builder()
						.usingDriverExecutable(new File(System.getProperty("webdriver.chrome.driver")))
						.usingAnyFreePort()
						.build();
				driverService.start();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	@Override
	protected void stopService()
	{
		if(null != driverService && driverService.isRunning())
			driverService.stop();
	}

	@Override
	protected void createDriver() 
	{
		ChromeOptions options = new ChromeOptions();
		
		if(!System.getProperty("headless").equalsIgnoreCase("FALSE"))
			options.addArguments("--headless");
	
		options.addArguments("window-size=1382, 800");
		driver = new ChromeDriver(driverService, options);
	}

}
