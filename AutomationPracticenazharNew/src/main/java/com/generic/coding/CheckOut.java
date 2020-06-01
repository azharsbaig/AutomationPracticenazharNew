package com.generic.coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.page.object.model.CheckOutPage;
import com.util.ExplicitWait;

public class CheckOut {
	public static WebDriver getChkOut(WebDriver driver) {
		CheckOutPage chkOut = new CheckOutPage(driver);

		new ExplicitWait().getExplicitWaitVisible(driver, chkOut.getPopChkOut());
		chkOut.getPopChkOut().click();

		new ExplicitWait().getExplicitWaitVisible(driver, chkOut.getSumChkOut());				
		
		chkOut.getSumChkOut().click();
		
		chkOut.getAddChkOut().click();
		
		chkOut.getAgreeChkOut().click();
		
		chkOut.getFinalChkOut().click();

		return driver;
	}
}
