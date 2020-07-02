package com.smoke.test;

import org.openqa.selenium.WebDriver;


import com.generic.coding.CheckOut;
import com.generic.coding.DressSelection;
import com.generic.coding.LoginNew;
import com.generic.coding.Payment;

public class SanityTest1 {

		public static void main(String[] args) throws Throwable {
			
			//WebDriver driver = Login.getLoginNew();
			WebDriver driver = LoginNew.setupBrowser();
			LoginNew.getWebPage(driver);
			LoginNew.getLogin(driver);
			DressSelection.getDress(driver);
			CheckOut.getChkOut(driver);
			Payment.getPayment(driver);
			driver.quit();
		
			
		
		
//		WebDriver driver = Login.getLogin();
//		DressSelection.getDress(driver);
//		CheckOut.getChkOut(driver);
//		Payment.getPayment(driver);
//		driver.quit();

	}

}
