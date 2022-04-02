package com.juaracoding.courseweek6.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.courseweek6.drivers.DriverSingleton;

public class ProductPage {

	private WebDriver driver;

	public ProductPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1497.product.type-product.status-publish.has-post-thumbnail.product_cat-t-shirt.product_tag-t-shirt.product_tag-women.has-featured.first.instock.shipping-taxable.purchasable.product-type-variable > div")
	WebElement clickProduct1;
	
	public void clickproduct() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,250)", "");
//		js.executeScript("arguments[0].scrollIntoView();", clickProduct1);
		clickProduct1.click();
	}
}
