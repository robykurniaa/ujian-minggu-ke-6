package com.juaracoding.courseweek6.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.courseweek6.drivers.DriverSingleton;

public class SelectProduct {

	private WebDriver driver;

		public SelectProduct() {
			this.driver = DriverSingleton.getDriver();
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(css ="#noo-site > header > div.navbar-wrapper > div > div > div > div > a > img")
		WebElement btnHome;
		
		@FindBy(css ="#noo-site > header > div.navbar-wrapper > div > a")
		WebElement btnSearch;
		
		@FindBy(name ="s")
		WebElement inputSearch;
		
		@FindBy(css ="#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-container-catalog > div > p")
		WebElement getTxtShowSearch;
		
		@FindBy(css ="#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1497.product.type-product.status-publish.has-post-thumbnail.product_cat-t-shirt.product_tag-t-shirt.product_tag-women.has-featured.first.instock.shipping-taxable.purchasable.product-type-variable")
		WebElement clickProduct1;
		
		@FindBy(id ="pa_color")
		WebElement chooseColor;
		
		@FindBy(id ="pa_size")
		WebElement chooseSize;
		
		@FindBy(css ="#product-1497 > div.single-product-content > div.summary.entry-summary > form > div > div.woocommerce-variation-add-to-cart.variations_button.woocommerce-variation-add-to-cart-enabled > button")
		WebElement btnAddToChart;
		
		public void btnHome() {
			btnHome.click();
		}
		
		public void searchProduct(String search) {
			btnSearch.click();
			inputSearch.sendKeys(search);
			inputSearch.sendKeys(Keys.ENTER);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)", "");
			clickProduct1.click();
			
		}
		
		/*
		public String getTxtSearch() {
//			
			return getTxtShowSearch.getText();
		}
		*/
		
		public void pageProduct1() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", chooseColor);
			chooseColor.sendKeys(Keys.DOWN);
			chooseColor.sendKeys(Keys.TAB);
			chooseSize.sendKeys(Keys.DOWN);
			chooseSize.sendKeys(Keys.TAB);
			btnAddToChart.click();
		}

}
