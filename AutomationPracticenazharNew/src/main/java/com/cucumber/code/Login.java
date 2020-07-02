package com.cucumber.code;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.config.BaseConfig;
import com.page.object.model.LoginPage;
import com.util.Highlighter;

public class Login {	
	
	public WebDriver setupBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);			
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}
	
	public void getWebPage(WebDriver driver) throws Throwable {
		driver.get(BaseConfig.getconfig("URL"));
	}
	
	public void getLogin(WebDriver driver) throws Throwable {		
		
		
		//driver.get("URL");		
		
		//********	Finding Website	********
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
				
		
		LoginPage logins= new LoginPage(driver);
		
		new Highlighter().getcolor(driver, logins.getSignInBtn(), "green", "red");
		logins.getSignInBtn().click();
				
		new Highlighter().getcolor(driver, logins.getEmail(), "green", "red");
		logins.getEmail().sendKeys(BaseConfig.getconfig("email"));
		
		new Highlighter().getcolor(driver, logins.getPass(), "green", "red");
		logins.getPass().sendKeys(BaseConfig.getconfig("pass"));
		
		new Highlighter().getcolor(driver, logins.getSubmit(), "green", "red");
		logins.getSubmit().click();		
		
	}

}
