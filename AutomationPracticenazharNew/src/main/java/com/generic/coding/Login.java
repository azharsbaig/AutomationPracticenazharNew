package com.generic.coding;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.page.object.model.LoginPage;

public class Login {
	
	static WebDriver driver;
	
	public static WebDriver getLogin() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);	
		
		driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//********	Finding Website	********
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
				
		
		LoginPage logins= new LoginPage(driver);
		
		logins.getSignInBtn().click();
		
		logins.getEmail().sendKeys("eezee1010@hotmail.com");
		
		logins.getPass().sendKeys("love7232");
		
		logins.getSubmit().click();
		
		return driver;		

	}

}
