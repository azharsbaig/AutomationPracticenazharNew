package com.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {//Constructor
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='login']")
	private WebElement signInBtn;

	@FindBy(xpath="//*[@id='email']")
	private WebElement Email;
	
	@FindBy(xpath="//*[@id='passwd']")
	private WebElement pass;
	
	@FindBy (xpath="//*[@id='SubmitLogin']")
	private WebElement submit;
	
	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}

}
