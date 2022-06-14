package com.nibmsqa.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.nibmsqa.pageobjects.BaseClass2_Flight_Book_Page;
import com.nibmsqa.pageobjects.FlightBookPage;

public class TC_005_Flight_Booking_Page_Testing extends BaseClass2_Flight_Book_Page{

	@Test
	public void loginTest() throws IOException {
		driver.get(baseUrlString);
		logger.info("URL is Opened");
//		driver.get("https://demo.guru99.com/v4/");
		FlightBookPage loginPage = new FlightBookPage(driver);
		
	}
}
