package com.juaracoding.ujian5.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ujian5.driver.DriverSingleton;

public class Login {
	
private WebDriver driver;
	
	public Login () {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="email")
	private WebElement btnEmail;
	
	@FindBy (id="passwd")
	private WebElement btnPassword;
	
	@FindBy (id="SubmitLogin")
	private WebElement btnLogin;
	
	public void isLogin () {
		btnEmail.sendKeys("lintang2122@example.com");
		btnPassword.sendKeys("lintang2122");
		btnLogin.click();
	}
	
	
	

}
