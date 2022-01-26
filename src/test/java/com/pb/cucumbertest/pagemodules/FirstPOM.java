package com.pb.cucumbertest.pagemodules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pb.cucumbertest.common.Base;

public class FirstPOM 
{
	public FirstPOM(Base base)
	{
		PageFactory.initElements(base.getDriver(), this);
	}
	
	@FindBy(css="a[href='/user/login']")
	public WebElement loginLnk;
	
	public void clickLoginLnk()
	{
		loginLnk.click();
	}
}
