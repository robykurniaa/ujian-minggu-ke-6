package com.juaracoding.courseweek6.utlis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {
	
	@Value("${browser}")
	private String browser;
	
	@Value("${username}")
	private String username;
	
	@Value("${password}")
	private String password;
	
	@Value("${txtPageLogin}")
	private String txtPageLogin;
	
	@Value("${search}")
	private String search;
	
	@Value("${txtPageSearch}")
	private String txtPageSearch;
	
	@Value("${messageToChart}")
	private String messageToChart;
	
	@Value("${textCheckOut}")
	private String textCheckOut;
	
	@Value("${compareText}")
	private String compareText;

	public String getTextCheckOut() {
		return textCheckOut;
	}

	public String getMessageToChart() {
		return messageToChart;
	}

	public String getTxtPageSearch() {
		return txtPageSearch;
	}

	public String getBrowser() {
		return browser;
	}
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}

	public String getTxtPageLogin() {
		return txtPageLogin;
	}

	public String getSearch() {
		return search;
	}

	public String getCompareText() {
		return compareText;
	}
	
	
}
