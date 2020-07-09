package com.generic.coding;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.config.BaseConfig;
import com.page.object.model.LoginPage;
import com.util.ExplicitWait;
import com.util.Highlighter;

public class LoginNew {
	public static WebDriver setupBrowser(String name) {
		WebDriver driver=null;
		if(name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
			driver = new ChromeDriver();
		} else if (name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}

	public static void getWebPage(WebDriver driver) throws Throwable {
		driver.get(BaseConfig.getconfig("URL"));
	}

	public static void getLogin(WebDriver driver) throws Throwable {

		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		LoginPage logins = new LoginPage(driver);

		new Highlighter().getcolor(driver, logins.getSignInBtn(), "", "red");
		logins.getSignInBtn().click();
		new ExplicitWait().getExplicitWait(driver, logins.getEmail());
		new Highlighter().getcolor(driver, logins.getEmail(), "light orange", "red");
		logins.getEmail().sendKeys(BaseConfig.getconfig("email"));

		new Highlighter().getcolor(driver, logins.getPass(), "light orange", "red");
		logins.getPass().sendKeys(BaseConfig.getconfig("pass"));

		new Highlighter().getcolor(driver, logins.getSubmit(), "light orange", "red");
		logins.getSubmit().click();

	}

	
}