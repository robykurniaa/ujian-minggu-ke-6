package com.juaracoding.courseweek6.pages;

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
		
		public void btnHome() {
			btnHome.click();
		}

}
