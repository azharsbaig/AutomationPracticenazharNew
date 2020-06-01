package com.page.object.model;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressPage {
	public DressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="(//*[@Title='Dresses'])[2]")
	private WebElement dressBtn;
	
	@FindBy(xpath="//*[@class='left-block']")
	private List<WebElement> dressCount;
	
	@FindBy(xpath="//*[@class='right-block']//*[@class='product-name']")
	private List<WebElement> dressName;
	
	@FindBy(xpath="//*[@class='right-block']//*[@class='price product-price']")
	private List<WebElement> dressPrice;
	
	@FindBy(xpath="//*[@id='quantity_wanted']")
	private WebElement selectQty;
	
	@FindBy(xpath="//*[@id='group_1']")
	private WebElement dressSizeDropDown;
	
	@FindBy(xpath="//*[@id='add_to_cart']")
	private WebElement addToCart;

	public WebElement getDressBtn() {
		return dressBtn;
	}

	public List<WebElement> getDressCount() {
		return dressCount;
	}

	public WebElement getSelectQty() {
		return selectQty;
	}

	public WebElement getDressSizeDropDown() {
		return dressSizeDropDown;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public List<WebElement> getDressName() {
		return dressName;
	}

	public List<WebElement> getDressPrice() {
		return dressPrice;
	}
	
}
