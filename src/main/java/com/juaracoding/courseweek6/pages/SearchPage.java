package com.juaracoding.courseweek6.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.courseweek6.drivers.DriverSingleton;

public class SearchPage {

	private WebDriver driver;

		public SearchPage() {
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
		
		public void btnHome() {
			btnHome.click();
		}
		
		public void search(String search) {
			btnSearch.click();
			inputSearch.sendKeys(search);
			inputSearch.sendKeys(Keys.ENTER);
			
		}
		
		public String getTxtSearch() {
//			return driver.getTitle();
			return getTxtShowSearch.getText();
		}
		
		public void scroll() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");
		}

}
