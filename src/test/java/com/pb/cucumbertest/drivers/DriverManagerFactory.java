package com.pb.cucumbertest.drivers;

public class DriverManagerFactory 
{
	public DriverManager getManager(DriverType type)
	{
		DriverManager driverManager;
		
		switch(type)
		{
			case FIREFOX:
				driverManager = new FirefoxDriverManager();
				break;
//			case SAFARI:
//				driverManager = new SafariDriverManager();
//				break;
//			case Edge:
//				driverManager = new EdgeDriverManager();
//				break;		
//			case IE:
//				driverManager = new IEDriverManager();
//				break;	
//			case HUB:
//				driverManager = new SeleniumHubDriverManager();
//				break;
			default:
				driverManager = new ChromeDriverManager();
		}
		return driverManager;
	}

}
