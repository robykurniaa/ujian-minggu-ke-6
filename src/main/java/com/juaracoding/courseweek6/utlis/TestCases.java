package com.juaracoding.courseweek6.utlis;

public enum TestCases {

	T1("Testing Login Customer"),
	T2("Testing menu Home");
	
	private String testName;
	
	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
