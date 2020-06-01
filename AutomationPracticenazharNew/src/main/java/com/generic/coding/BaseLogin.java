package com.generic.coding;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

import com.util.ExplicitWait;

public class BaseLogin {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);	
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//********	Finding Website	********
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
				
		//signin
		WebElement signInBtn = driver.findElement(By.xpath("//*[@class='login']"));
		signInBtn.click();
		
		//*[@id='email']
		WebElement Email = driver.findElement(By.xpath("//*[@id='email']"));
		Email.sendKeys("eezee1010@hotmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//*[@id='passwd']"));
		pass.sendKeys("love7232");
		
		WebElement submit = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
		submit.click();
		//Dress
		System.out.println(driver.getTitle());
		
		WebElement dressBtn = driver.findElement(By.xpath("(//*[@Title='Dresses'])[2]"));
		dressBtn.click();
	
		List<WebElement> dressCount = driver.findElements(By.xpath("//*[@class='left-block']"));
		System.out.println(dressCount.size());
		
		List<WebElement> dressName = driver.findElements(By.xpath("//*[@class='right-block']//*[@class='product-name']"));
				
		for (int i = 0; i < dressName.size(); i++) {
			System.out.println(dressName.get(i).getText());
		}
		List<WebElement> dressPrice = driver.findElements(By.xpath("//*[@class='right-block']//*[@class='price product-price']"));
				
		for (int i = 0; i < dressPrice.size(); i++) {			
		System.out.println(dressPrice.get(i).getText());		
		}		
		
		dressName.get(4).click();
		
//		WebElement dressFifth = driver.findElement(By.xpath("( //*[@class='left-block']//*[@class='replace-2x img-responsive'])[5]"));
//		dressFifth.click();
		System.out.println(driver.getTitle());
		
		WebElement selectQty = driver.findElement(By.xpath("//*[@id='quantity_wanted']"));
		selectQty.clear();
		selectQty.sendKeys("2");		
		
		WebElement sizeOfDress = driver.findElement(By.xpath("//*[@id='group_1']"));
		Select size = new Select(sizeOfDress);
		//for large
		size.selectByIndex(2);		
		size.selectByValue("3");
		size.selectByVisibleText("L");
		
		WebElement addToCart = driver.findElement(By.xpath("//*[@id='add_to_cart']"));
		addToCart.click();
				
		new ExplicitWait().getExplicitWait(driver, By.xpath("//*[@class='btn btn-default button button-medium']"));
		WebElement popChkOut = driver.findElement(By.xpath("//*[@class='btn btn-default button button-medium']"));		
		popChkOut.click();
		
		new ExplicitWait().getExplicitWaitVisible(driver, By.xpath("//*[@class='button btn btn-default standard-checkout button-medium']"));
		WebElement sumChkOut = driver.findElement(By.xpath("//*[@class='button btn btn-default standard-checkout button-medium']"));				
		sumChkOut.click();	
		
		WebElement AddChkOut = driver.findElement(By.xpath("//*[@class='button btn btn-default button-medium']"));
		AddChkOut.click();
				
		WebElement agreeChkOut = driver.findElement(By.xpath("//*[@id='cgv']"));
		agreeChkOut.click();
		
		WebElement finalChkOut = driver.findElement(By.xpath("//*[@class='button btn btn-default standard-checkout button-medium']"));
		finalChkOut.click();		
		
		WebElement payMethod = driver.findElement(By.xpath("//*[@class='cheque']"));
		payMethod.click();
		
		WebElement payment = driver.findElement(By.xpath("//*[@class='button btn btn-default button-medium']"));
		payment.click();
		
		WebElement orderSum = driver.findElement(By.xpath("//*[@class='box order-confirmation']"));
		System.out.println(orderSum.getText());
		
		
		
		driver.quit();
		
	   
		}
	}

