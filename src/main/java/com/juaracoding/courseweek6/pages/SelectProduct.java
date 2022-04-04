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
		
		@FindBy(css ="#noo-site > div.noo-container-shop.noo-shop-wrap.noo-shop-single-fullwidth > div > div > div.woocommerce-notices-wrapper > div")
		WebElement messageChart;
		
		@FindBy(css ="#noo-site > div.noo-container-shop.noo-shop-wrap.noo-shop-single-fullwidth > div > div > div.woocommerce-notices-wrapper > div > a")
		WebElement btnViewCart;
		
		@FindBy(css = "#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1485.product.type-product.status-publish.has-post-thumbnail.product_cat-t-shirt.product_tag-t-shirt.product_tag-women.has-featured.first.instock.shipping-taxable.purchasable.product-type-variable > div")
		WebElement clickProduct2;
		
		@FindBy(css = "#noo-site > header > div.navbar-wrapper > div > div > div > a")
		WebElement btnSearch2;
		
		@FindBy(css ="#product-1485 > div.single-product-content > div.summary.entry-summary > form > div > div.woocommerce-variation-add-to-cart.variations_button.woocommerce-variation-add-to-cart-enabled > button")
		WebElement btnAddToChartProduct2;
		
		@FindBy(css = "#post-6 > div > div > form > table > tbody > tr:nth-child(1)")
		WebElement cartPinkClothes;
		
		@FindBy(css = "#post-6 > div > div > form > table > tbody > tr:nth-child(1) > td.product-name > a")
		WebElement cartPinkClothess;
		
		@FindBy(css = "#product-1497 > div.single-product-content > div.summary.entry-summary > a")
		WebElement btnCompare;
		
		@FindBy(css = "#DataTables_Table_0 > tbody > tr.title.odd > td")
		WebElement compareProductText;
		
		@FindBy(id = "cboxClose")
		WebElement closeCompare;
		
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
		
		public void pageProduct1() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", chooseColor);
			chooseColor.sendKeys(Keys.DOWN);
			chooseColor.sendKeys(Keys.TAB);
			chooseSize.sendKeys(Keys.DOWN);
			chooseSize.sendKeys(Keys.TAB);
		}
		
		public void addToChart() {
			btnAddToChart.click();
			
		}
		
		public void compareProduct() {
			tunggu();
			btnSearch2.click();
			inputSearch.sendKeys("black");
			inputSearch.sendKeys(Keys.ENTER);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", clickProduct2);
			clickProduct2.click();
			
			js.executeScript("arguments[0].scrollIntoView(true);", chooseColor);
			chooseColor.sendKeys(Keys.DOWN);
			chooseColor.sendKeys(Keys.TAB);
			chooseSize.sendKeys(Keys.DOWN);
			chooseSize.sendKeys(Keys.TAB);
			btnAddToChartProduct2.click();
			btnViewCart.click();
			
			js.executeScript("window.scrollBy(0,310)", "");
			cartPinkClothess.click();
			btnCompare.click();
			
			driver.navigate().refresh();
			js.executeScript("window.scrollBy(0,-600)", "");
			goToCart.click();
			
			js.executeScript("window.scrollBy(0,600)", "");
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
		public void addData() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			
		}	
		
		public String getTextCompare() {
			return compareProductText.getText();
		}
		
		
			public void tunggu() {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}