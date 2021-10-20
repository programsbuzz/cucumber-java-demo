package com.pb.cucumbertest.stepdefinitions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.pb.cucumbertest.helper.Base;
import io.cucumber.core.api.TypeRegistry;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends Base {
	WebDriver driver;

	@When("I Logged in with users using class objects")
	public void i_Logged_in_with_users_using_class_objects(DataTable table) {
		List<List<String>> myList = table.asLists();
		List<Credentials> list = new ArrayList<>();

		for (List element : myList) {
//			  list.add(projection.apply(element));
		}

		for (Credentials item : list) {
			System.out.println(item.getUsername());
			System.out.println(item.getPassword());

		}

	}

	@When("I Logged in with users")
	public void i_Logged_in_with_users(DataTable dataTable) {
		for (Map<String, String> data : dataTable.asMaps()) {
			WebElement userName = driver.findElement(By.cssSelector("input[id='email']"));
			WebElement password = driver.findElement(By.cssSelector("input[id='passwd']"));
			userName.clear();
			userName.sendKeys(data.get("UserName"));
			password.clear();
			password.sendKeys(data.get("Password"));
			driver.findElement(By.cssSelector("button[id='SubmitLogin']")).click();
			try {
				if (driver.findElement(By.xpath("//h1[text()='My account']")).isDisplayed()) {
					System.out.println(data.get("UserName") + " is valid User");
				}
			} catch (Exception e) {
				System.out.println(data.get("UserName") + " is invalid User");
			}
			driver.manage().deleteAllCookies();
			driver.navigate().refresh();
		}
	}

	@Then("I gets following response")
	public void i_gets_following_response(DataTable dataTable) {
		List<List<String>> actualList = new ArrayList<List<String>>();
		actualList.add(Arrays.asList("Username", "Email"));
		actualList.add(Arrays.asList("tgoswami", "goswami.tarun77@gmail.com"));
		actualList.add(Arrays.asList("mahuja", "manish.ahuja@gmail.com"));
		actualList.add(Arrays.asList("ssharma", "simran.sharma@gmail.com"));

		DataTable actual = DataTable.create(actualList);
		dataTable.diff(actual);
	}

	@When("I enter following details")
	public void i_enter_following_details(DataTable dt) {
		List<List<String>> data = dt.asLists();
		System.out.println(data.get(0).get(0));
		System.out.println(data.get(0).get(1));
		System.out.println(data.get(1).get(0));
		System.out.println(data.get(1).get(1));
		System.out.println(data.get(2).get(0));
		System.out.println(data.get(2).get(1));
		System.out.println(data.get(3).get(0));
		System.out.println(data.get(3).get(1));

		if (data.get(0).get(1).equals("Mr."))
			driver.findElement(By.cssSelector("input[id='id_gender1']")).click();
		else
			driver.findElement(By.cssSelector("input[id='id_gender2']")).click();

		driver.findElement(By.cssSelector("input[id='customer_firstname']")).sendKeys(data.get(1).get(1));
		driver.findElement(By.cssSelector("input[id='customer_lastname']")).sendKeys(data.get(2).get(1));
		driver.findElement(By.cssSelector("input[id='passwd']")).sendKeys(data.get(3).get(1));
	}

	@When("^I fill in \"([^\"]*)\" with:$")
	public void i_fill_in_with1(String locator, String docString) {
		driver.findElement(By.cssSelector(locator)).sendKeys(docString);

	}

	@Given("Step from {string} in {string} feature file")
	public void step(String scenario, String file) {
		System.out.format("Thread ID - %2d - %s from %s feature file.\n", Thread.currentThread().getId(), scenario,
				file);
	}

	@When("I hit {string} api")
	public void i_hit_api(String string) {
	}

	public void configureTypeRegistry(TypeRegistry typeRegistry) {
		// TODO Auto-generated method stub

	}

}