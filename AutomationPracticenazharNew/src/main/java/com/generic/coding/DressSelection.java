package com.generic.coding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.page.object.model.DressPage;

public class DressSelection {

	public static  WebDriver getDress(WebDriver driver) {
		
		DressPage dresses = new DressPage(driver);
		dresses.getDressBtn().click();

		int totalDress = dresses.getDressCount().size();
		System.out.println("Total Dress Displayed: " + totalDress);

		dresses.getDressName().forEach(name -> {
			System.out.println("Dress names: " + name.getText());
		});

		dresses.getDressPrice().forEach(price -> {
			System.out.println("Dress Prices: " + price.getText());
		});

		dresses.getDressName().get(4).click();

		dresses.getSelectQty().clear();
		dresses.getSelectQty().sendKeys("2");

		Select size = new Select(dresses.getDressSizeDropDown());
		// for large
		size.selectByIndex(2);
		size.selectByValue("3");
		size.selectByVisibleText("L");

		// WebElement addToCart =
		// driver.findElement(By.xpath("//*[@id='add_to_cart']"));
		dresses.getAddToCart().click();
		return driver;

	}

}
