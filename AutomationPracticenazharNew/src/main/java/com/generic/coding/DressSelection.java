package com.generic.coding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.page.object.model.DressPage;
import com.util.Highlighter;

public class DressSelection {

	public static  WebDriver getDress(WebDriver driver) {
		
		DressPage dresses = new DressPage(driver);
		
		new Highlighter().getcolor(driver, dresses.getDressBtn(), "green", "red");
		dresses.getDressBtn().click();

		int totalDress = dresses.getDressCount().size();
		
		System.out.println("Total Dress Displayed: " + totalDress);

		dresses.getDressName().forEach(name -> {
			System.out.println("Dress names: " + name.getText());
		});

		dresses.getDressPrice().forEach(price -> {
			System.out.println("Dress Prices: " + price.getText());
		});
		//new Highlighter().getcolor(driver, dresses.getDressName(), "green", "red");
		dresses.getDressName().get(4).click();

		dresses.getSelectQty().clear();
		new Highlighter().getcolor(driver, dresses.getSelectQty(), "green", "red");
		dresses.getSelectQty().sendKeys("2");

		Select size = new Select(dresses.getDressSizeDropDown());
		// for large
		new Highlighter().getcolor(driver, dresses.getDressSizeDropDown(), "green", "red");
		size.selectByIndex(2);
		size.selectByValue("3");
		size.selectByVisibleText("L");
		
		// WebElement addToCart =
		// driver.findElement(By.xpath("//*[@id='add_to_cart']"));
		new Highlighter().getcolor(driver, dresses.getDressBtn(), "green", "red");
		dresses.getAddToCart().click();
		
		return driver;

	}

}
