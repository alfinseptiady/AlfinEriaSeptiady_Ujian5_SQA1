package com.juaracoding.ujian5.cart;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ujian5.driver.DriverSingleton;

public class CartTshirt {
	
private WebDriver driver;
	
	public CartTshirt () {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (css = "#block_top_menu > ul > li:nth-child(3) > a")
	private WebElement btnTshirt;
		
	@FindBy (css = "#center_column > ul > li > div > div.right-block > h5 > a")
	private List<WebElement> btnAddTshirt;
	
	@FindBy (css = "#add_to_cart > button")
	private WebElement btnAddCartTshirt;
	
	public void Tshirt() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-400)");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnTshirt.click();
	}
	
	public void addTshirt() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnAddTshirt.get(0).click();
	}
	
	public void addCartTshirt() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnAddCartTshirt.submit();
	}

}
