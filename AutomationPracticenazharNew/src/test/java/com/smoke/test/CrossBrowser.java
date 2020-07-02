package com.smoke.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.generic.coding.CheckOut;
import com.generic.coding.DressSelection;
import com.generic.coding.Login;
import com.generic.coding.Payment;

public class CrossBrowser {

	private WebDriver driver;
	private Login login;
	
	@BeforeTest
	@Parameters("BrowserName")
	public void setup(String browserName) throws Throwable {
		System.out.println(browserName);
		login = new Login();
		driver =login.setupBrowser(browserName);
				
		//driver = Login.getLogin();
	}
	@Test
	public void Login() throws Throwable {
		login.getLogin(driver);
		
	}
		
	@Test
	public void sanityTest1() {
		DressSelection.getDress(driver);
	}
		
	@Test
	public void sanityTest2() {
		CheckOut.getChkOut(driver);
	}
	@Test
	public void sanityTest3() {
		Payment.getPayment(driver); 
	} 
	@AfterTest
	public void complete() {
		driver.quit();
	}
}
