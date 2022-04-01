package com.juaracoding.courseweek6.pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.courseweek6.drivers.DriverSingleton;
import com.juaracoding.courseweek6.utlis.Tools;

public class LoginPage {

private WebDriver driver;
private Tools tools;

	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="username")
	WebElement inputUsername;
	
	@FindBy(id ="password")
	WebElement inputPassword;
	
	@FindBy(name ="login")
	WebElement btnLogin;
	
	@FindBy(xpath ="/html/body/p/a")
	WebElement btnDismiss;
	
	@FindBy(id = "error-page")
	WebElement txtPageLogin;
	
	public void submitLogin() {
		btnDismiss.click();

		inputUsername.sendKeys("userexampleee");
		inputPassword.sendKeys("@Demo_user");
		btnLogin.click();
		
	}
	
	public String getTxtLogin() {
		return txtPageLogin.getText();
	}
	
}



