package com.nibmsqa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties properties;
	
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fileInputStream = new FileInputStream(src);
			properties = new Properties();
			properties.load(fileInputStream);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApllicationURL() {
		String urlString = properties.getProperty("baseURL");
		return urlString;
	}
	
	public String getFlightURL() {
		String urlString = properties.getProperty("flightURLRoundway");
		return urlString;
	}
	
	public String getBookingURL() {
		String urlString = properties.getProperty("flightBooking");
		return urlString;
	}
	
	public String getUsername() {
		String usernameString = properties.getProperty("username");
		return usernameString;
	}
	
	public String getPassword() {
		String passwordString = properties.getProperty("password");
		return passwordString;
	}
	
	public String getChromePath() {
		String chromePathString = properties.getProperty("chromepath");
		return chromePathString;
	}
	
	public String getEdgePath() {
		String edgePathString = properties.getProperty("edgepath");
		return edgePathString;
	}
}
