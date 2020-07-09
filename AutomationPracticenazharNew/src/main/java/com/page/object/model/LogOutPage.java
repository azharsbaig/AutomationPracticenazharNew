package com.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	public LogOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		}
		
		

		@FindBy(xpath="//*[@class='logout']")
		private WebElement logout;
		
		public WebElement getLogout() {
			return logout;
		}
		
		
}


