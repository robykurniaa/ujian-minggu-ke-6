package com.juaracoding.courseweek6.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.courseweek6.drivers.DriverSingleton;

public class HomePage {

	private WebDriver driver;

		public HomePage() {
			this.driver = DriverSingleton.getDriver();
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(css ="#noo-site > header > div.navbar-wrapper > div > div > div > div > a > img")
		WebElement btnHome;
		
		public void btnHome() {
			btnHome.click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)", "");
		}

}
