package com.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	
public PaymentPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="//*[@class='cheque']")
	private WebElement payMethod;
	
	@FindBy(xpath = "//*[@class='button btn btn-default button-medium']")
	private WebElement payment;
	
	@FindBy (xpath = "//*[@class='box order-confirmation']")
	private WebElement orderSum;
	
	public WebElement getPayMethod() {
		return payMethod;
	}
	public WebElement getPayment() {
		return payment;
	}

	public WebElement getOrderSum() {
		return orderSum;
	}
	
}

