package com.pb.cucumbertest.pagemodules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pb.cucumbertest.common.Base;

public class SecondPOM 
{
	public SecondPOM(Base base)
	{
		PageFactory.initElements(base.getDriver(), this);
	}
	
	@FindBy(css="a[href='/ask-doubt']")
	public WebElement askDoubtLnk;
	
	public void clickAskDoubt()
	{
		askDoubtLnk.click();
	}
}