package com.juaracoding.courseweek6.drivers;

import com.juaracoding.courseweek6.drivers.Chrome;
import com.juaracoding.courseweek6.drivers.DriverStrategy;
import com.juaracoding.courseweek6.drivers.Firefox;
import com.juaracoding.courseweek6.utlis.Constants;

public class DriverStrategyImplementator {
	
public static DriverStrategy chooseStrategy(String strategy) {
		
		switch(strategy) {
		case Constants.CHROME:
			return new Chrome();
			
		case Constants.FIREFOX:
			return new Firefox();
			
		default:
			return null;
		}
		
	}
	

}
