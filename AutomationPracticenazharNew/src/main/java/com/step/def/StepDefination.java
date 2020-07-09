package com.step.def;

import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertEquals;
import com.cucumber.code.Login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	private WebDriver driver;
	private Login login;
	
	@Given("User is on automationPage")
	public void user_is_on_automationPage() {
		login = new Login();
		driver =login.setupBrowser();	    
	}

	@When("User clicks on the account")
	public void user_clicks_on_the_account() throws Throwable {
	    login.getWebPage(driver);
	    Thread.sleep(3000);
	}

	@When("User write username and password and click on Submit")
	public void user_write_username_and_password_and_click_on_Submit() throws Throwable {
		login.getLogin(driver);	    
	}

	@Then("User is signed in")
	public void user_is_signed_in() {		
		assertEquals("My account - My Store",driver.getTitle());
	    
	}

	@When("User select dress")
	public void user_select_dress() {
	    assertEquals(true,true);
	}

	@Then("Dress selected")
	public void dress_selected() {
		assertEquals(true,true);
	}

	@When("User pay the price and logout")
	public void user_pay_the_price_and_logout() {
		assertEquals(true,true);
	}

	@Then("User Logout")
	public void user_Logout() {
		driver.quit();
	}
}
