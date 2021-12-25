package com.juaracoding.ujian5.main;

import org.openqa.selenium.WebDriver;

import com.juaracoding.ujian5.Akun.Akun;
import com.juaracoding.ujian5.cart.CartDress;
import com.juaracoding.ujian5.cart.CartTshirt;
import com.juaracoding.ujian5.checkout.Checkout;
import com.juaracoding.ujian5.driver.DriverSingleton;
import com.juaracoding.ujian5.login.Login;

public class MainApp {

	public static void main(String[] args) {
		
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		driver.get("http://automationpractice.com/index.php");
		
		
		Akun account = new Akun();
		
		account.Signin();
		account.EmailCreate();
		account.mengisiForm();
		account.isDays(29);
		account.isMonth(9);
		account.isYears(26);
		account.mengisiForm1();
		account.isState(3);
		account.mengisiForm2();
		account.isCountry(1);
		account.mengisiForm3();
		
		//Gunakan ini jika tidak bisa create account
//		Login login = new Login();
//		login.isLogin();
		
		CartDress cartdress = new CartDress();
		cartdress.Dress();
		cartdress.addDress();
		cartdress.addCart();
		cartdress.Continue();
		
		CartTshirt cartshirt = new CartTshirt();
		cartshirt.Tshirt();
		cartshirt.addTshirt();
		cartshirt.addCartTshirt();
		
		Checkout checkout = new Checkout();
		checkout.Summary();
		checkout.Address();
		checkout.Shipping();
		checkout.Payment();
		checkout.Check();
		
	}

}
