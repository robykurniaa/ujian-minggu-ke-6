package com.juaracoding.courseweek6.glue;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.courseweek6.config.AutomationFrameworkConfig;
import com.juaracoding.courseweek6.drivers.DriverSingleton;
import com.juaracoding.courseweek6.pages.HomePage;
import com.juaracoding.courseweek6.pages.LoginPage;
import com.juaracoding.courseweek6.utlis.ConfigurationProperties;
import com.juaracoding.courseweek6.utlis.Constants;
import com.juaracoding.courseweek6.utlis.TestCases;
import com.juaracoding.courseweek6.utlis.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class StepDefinition {

	private static WebDriver driver;
	private LoginPage loginPage;
	private HomePage homePage;
	ExtentTest extentTest;
	static ExtentReports reports = new ExtentReports("src/main/resources/TestReport.html");
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		loginPage = new LoginPage();
		homePage = new HomePage();
		TestCases[] tests = TestCases.values();
		extentTest = reports.startTest(tests[Utils.testCount].getTestName());
		Utils.testCount++;
	}
	
	@AfterStep
	public void  getResult(Scenario  scenario) throws Exception {
		if(scenario.isFailed()) {
			String screenshotPath = Utils.getScreenshot(driver, scenario.getName().replace(" ", "_"));
			extentTest.log(LogStatus.FAIL, "Screenshot:/n"+
					extentTest.addScreenCapture(screenshotPath));
		}
	}
	
	@After
	public void closeObject() {
		reports.endTest(extentTest);
		reports.flush();
	}
	

	@AfterAll
	public static void closeBrowser() {
		driver.quit();
	}

	
	@Given("Customer mengakses url")
	public void customer_mengakses_url() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "Navigating to "+Constants.URL);
	}
	
	@When("Customer klik login button")
	public void customer_klik_login_button() {

		loginPage.submitLogin(configurationProperties.getUsername(), configurationProperties.getPassword());
		extentTest.log(LogStatus.PASS, "Customer klik login button");
	}
	
	@Then("Customer berhasil login")
	public void customer_berhasil_login() {
		assertEquals(configurationProperties.getTxtPageLogin(), loginPage.getTxtLogin());
	
	}
	
	@When("Customer klik buton home")
	public void klik_button_home() {
		driver.navigate().back();
		homePage.btnHome();

	}
	
	@Then("Customer melihat Page Home")
	public void lookHomePage() {
//		assertEquals(configurationProperties.getTxtPageHome(), homePage.getTxtPageHome;
	}
	
}
