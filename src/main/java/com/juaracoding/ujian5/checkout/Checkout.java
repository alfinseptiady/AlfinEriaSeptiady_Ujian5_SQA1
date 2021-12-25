package com.juaracoding.ujian5.checkout;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ujian5.driver.DriverSingleton;

public class Checkout {
	
	
private WebDriver driver;
	
	public Checkout () {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (css = "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")
	private WebElement btnSummary;
	
	@FindBy (css = "#center_column > form > p > button")
	private WebElement btnAddress;
	
	@FindBy (css = "#form > div > p.checkbox > label")
	private WebElement btnTerms;
	
	@FindBy (css = "#form > p > button")
	private WebElement btnShipping;
	
	@FindBy (css = "#HOOK_PAYMENT > div > div > p > a")
	private List<WebElement> btnPayment;
	
	@FindBy (css = "#cart_navigation > button")
	private WebElement btnCheck;
	
	@FindBy (css = "#center_column > div > p > strong")
	private WebElement txtSuccess;
	
	
	public void Summary() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		btnSummary.click();
	}
	
	public void Address() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		btnAddress.click();
	}
	
	public void Shipping() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		btnTerms.click();
		btnShipping.click();
	}
	
	public void Payment() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		btnPayment.get(0).click();
	}
	
	public void Check() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		btnCheck.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		js.executeScript("window.scrollBy(0,400)");
		System.out.println(txtSuccess.getText()); 
	}
	
}
