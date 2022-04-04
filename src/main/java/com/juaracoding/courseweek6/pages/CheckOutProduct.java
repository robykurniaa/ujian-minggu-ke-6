package com.juaracoding.courseweek6.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
	
	@FindBy(css ="#post-6 > div > div > div.cart-collaterals > div.cart_totals > div > a")
	WebElement btnProceedCheckOut;
	
	@FindBy(name ="billing_company")
	WebElement scrollToCompany;
	
	@FindBy(name ="billing_first_name")
	WebElement firstName;
	
	@FindBy(name ="billing_last_name")
	WebElement lastName;
	
	@FindBy(css = "#billing_country_field > span > span > span.selection > span")
	WebElement inputCountry;
	
	@FindBy(name = "billing_city")
	WebElement inputCity;
	
	@FindBy(name ="billing_address_1")
	WebElement inputAddress;
	
	@FindBy(css = "#billing_state_field > span > span > span.selection > span")
	WebElement inputProvince;
	
	@FindBy(name ="billing_postcode")
	WebElement inputPostcode;
	
	@FindBy(name ="billing_phone")
	WebElement inputPhone;
	
	@FindBy(name ="billing_email")
	WebElement inputEmail;
	
	@FindBy(name ="terms")
	WebElement clickTerms;
	
	@FindBy(id ="place_order")
	WebElement btnPlaceOrder;
	
	@FindBy(css ="#noo-site > section > div > div > h1")
	WebElement CheckOutText;
	
	@FindBy(css = "#noo-site > header > div.navbar-wrapper > div > div > div > ul")
	WebElement goToCart;
	
	public void addData() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-1000)", "");
		goToCart.click();
		js.executeScript("arguments[0].scrollIntoView(true);", btnProceedCheckOut);
		btnProceedCheckOut.click();
		js.executeScript("arguments[0].scrollIntoView(true);", scrollToCompany);
		firstName.sendKeys("Dadang");
		lastName.sendKeys("durjana");
		inputCountry.sendKeys("Indonesia");
		inputCountry.sendKeys(Keys.RETURN);
		inputAddress.sendKeys("Majalaya");
		inputCity.sendKeys("Bandung");
		inputProvince.sendKeys("Jawa Barat");
		inputProvince.sendKeys(Keys.TAB);
		js.executeScript("arguments[0].scrollIntoView(true);", inputPostcode);
		inputPostcode.sendKeys("40394");
		inputPhone.sendKeys("08513677345");
		inputEmail.sendKeys("dadangdur@gmail.com");
		js.executeScript("arguments[0].scrollIntoView(true);", scrollToCompany);
		clickTerms.click();
		btnPlaceOrder.click();
		
	}
	
	public String getTextCheckOut() {
		return CheckOutText.getText();
	}
	
	
	}
