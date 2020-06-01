package com.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	public CheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="(//*[@class='btn btn-default button button-medium']")
	private WebElement popChkOut;
	
	@FindBy(xpath="//*[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement sumChkOut;
	
	@FindBy(xpath="//*[@class='button btn btn-default button-medium']")
	private WebElement addChkOut;
	
	@FindBy(xpath="//*[@id='cgv']")
	private WebElement agreeChkOut;
	
	@FindBy(xpath="//*[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement finalChkOut;

	public WebElement getPopChkOut() {
		return popChkOut;
	}

	public WebElement getSumChkOut() {
		return sumChkOut;
	}

	public WebElement getAddChkOut() {
		return addChkOut;
	}

	public WebElement getAgreeChkOut() {
		return agreeChkOut;
	}

	public WebElement getFinalChkOut() {
		return finalChkOut;
	}

}
