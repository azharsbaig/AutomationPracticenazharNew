package com.smoke.test;

import org.openqa.selenium.WebDriver;

import com.generic.coding.CheckOut;
import com.generic.coding.DressSelection;
import com.generic.coding.Login;
import com.generic.coding.Payment;

public class SanityTest1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = Login.getLogin();
		DressSelection.getDress(driver);
		CheckOut.getChkOut(driver);
		Payment.getPayment(driver);
		driver.quit();

	}

}
