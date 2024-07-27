package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import helper.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginToFacebook {
	/*
	 * Given User navigated to Facebook.com When user enters Username as "User1" and
	 * Password as "PASSWORD" And user clicks on login button Then login should be
	 * successful
	 */
	
	@Given("User navigated to Facebook.com")
	public void user_navigated_to_facebook() {
		TestBase.driver.get("https://www.facebook.com/");
	}
	
	@When("user enters Username as {string} and Password as {string}")
	public void user_enter_Username_as_and_Password(String arg1,String arg2) {
		TestBase.driver.findElement(By.id("email")).sendKeys(arg1);
		TestBase.driver.findElement(By.id("pass")).sendKeys(arg2);
	}
	
	@When("user clicks on login button")
	public void user_click_on_login_button() {
		WebElement ele = TestBase.driver.findElement(By.name("login"));
		JavascriptExecutor jsx = (JavascriptExecutor)TestBase.driver;
		jsx.executeScript("arguments[0].click", ele);
	}
	
	@Then("login should be successful")
	public void login_shpuld_be_successful() {
	System.out.println("Hell all login is successful");	
	}

}
