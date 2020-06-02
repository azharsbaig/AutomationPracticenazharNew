package com.generic.coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.page.object.model.CheckOutPage;
import com.util.ExplicitWait;
import com.util.Highlighter;

public class CheckOut {
	public static WebDriver getChkOut(WebDriver driver) {
		
		CheckOutPage chkOut = new CheckOutPage(driver);

		new ExplicitWait().getExplicitWaitVisible(driver,chkOut.getPopChkOut() );
		//new Highlighter().getcolor(driver, logins.getSignInBtn(), "green", "red");
		new Highlighter().getcolor(driver, chkOut.getPopChkOut(), "green", "red");
		chkOut.getPopChkOut().click();
		//chkOut.getpopChkOut().click();

		new ExplicitWait().getExplicitWaitVisible(driver, chkOut.getSumChkOut());				
		new Highlighter().getcolor(driver, chkOut.getSumChkOut(), "green", "red");
		chkOut.getSumChkOut().click();
		
		new Highlighter().getcolor(driver, chkOut.getAddChkOut(), "green", "red");
		chkOut.getAddChkOut().click();
		
		new Highlighter().getcolor(driver, chkOut.getAgreeChkOut(), "green", "red");
		chkOut.getAgreeChkOut().click();
		
		new Highlighter().getcolor(driver, chkOut.getFinalChkOut(), "green", "red");
		chkOut.getFinalChkOut().click();

		return driver;
	}
}
