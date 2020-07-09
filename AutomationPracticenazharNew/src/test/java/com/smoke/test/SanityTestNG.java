package com.smoke.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.generic.coding.CheckOut;
import com.generic.coding.DressSelection;
import com.generic.coding.Login;
import com.generic.coding.LoginNew;
import com.generic.coding.Payment;

public class SanityTestNG {
	
	WebDriver driver;
		
	@BeforeTest
	@Parameters("BrowserName")
	public void setup(String browser) throws Throwable {		
		driver = LoginNew.setupBrowser(browser);
		LoginNew.getWebPage(driver);
		LoginNew.getLogin(driver);
	}
	
/*	@Test(priority=0)
	public void setUrl() throws Throwable {
		LoginNew.getWebPage(driver);
	}
	
	@Test(priority=1)
	public void signIn() throws Throwable {
		LoginNew.getLogin(driver);
	}
	*/
	
	//@Test(priority=2)
	@Test
	public void sanityTest1() throws Throwable {		
		
		DressSelection.getDress(driver);
	}
		
	//@Test(priority=3)
	@Test
	public void sanityTest2() {
		CheckOut.getChkOut(driver);
	}
	//@Test(priority=4)
	@Test
	public void sanityTest3() {
		Payment.getPayment(driver);
	}
	
	@AfterTest
	public void complete() {
		driver.quit();
	}

}

