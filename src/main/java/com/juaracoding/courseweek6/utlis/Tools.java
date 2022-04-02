package com.juaracoding.courseweek6.utlis;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Tools {
	private WebDriver driver;
	
	public void tunggu() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void waitFiveSec() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void scroll () {
		 JavascriptExecutor js = (JavascriptExecutor) driver;  
		 js.executeScript("scroll(0, 300);");
	}

}
