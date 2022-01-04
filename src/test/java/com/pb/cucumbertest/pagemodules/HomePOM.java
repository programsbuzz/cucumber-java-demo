package com.pb.cucumbertest.pagemodules;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pb.cucumbertest.common.Base;
import com.pb.cucumbertest.common.GenericFunctions;

public class HomePOM extends Base {
	GenericFunctions generic = new GenericFunctions();

	public HomePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "select[id='schoolinput']")
	public WebElement schoolList;

	@FindBy(xpath = "(//a[@title='Remove item' and @class='action action-delete'])")
	public List<WebElement> removeIconList;

}
