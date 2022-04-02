package com.juaracoding.courseweek6.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.courseweek6.drivers.DriverSingleton;

public class CheckOutProduct {

	private WebDriver driver;

	public CheckOutProduct() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="#noo-site > div.noo-container-shop.noo-shop-wrap.noo-shop-single-fullwidth > div > div > div.woocommerce-notices-wrapper > div > a")
	WebElement btnViewCart;
	
	@FindBy(css ="#post-6 > div > div > div.cart-collaterals > div.cart_totals.calculated_shipping > div > a")
	WebElement btnProceedCheckOut;
	
	public void proceesCheckout() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(200)", "");
		btnViewCart.click();
		js.executeScript("arguments[0].scrollIntoView(true);", btnProceedCheckOut);
		btnProceedCheckOut.click();
	}
	
}
