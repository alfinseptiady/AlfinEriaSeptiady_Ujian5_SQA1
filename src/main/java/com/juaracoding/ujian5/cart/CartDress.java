package com.juaracoding.ujian5.cart;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.ujian5.driver.DriverSingleton;

public class CartDress {
	
private WebDriver driver;
	
	public CartDress () {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (css="#block_top_menu > ul > li:nth-child(2) > a")
	private WebElement btnDress;
	
	@FindBy (css = "#center_column > ul > li > div > div.right-block > h5 > a")
	private List<WebElement> btnAddDress;
	
	@FindBy (css = "#add_to_cart > button")
	private WebElement btnAddCart;
	
	@FindBy (css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span")
	private WebElement btnContinue;
	

	
	public void Dress() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnDress.click();
	}
	
	public void addDress() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnAddDress.get(2).click();
	}
	
	public void addCart() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnAddCart.click();
	}
	
	public void Continue() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnContinue.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	


}
