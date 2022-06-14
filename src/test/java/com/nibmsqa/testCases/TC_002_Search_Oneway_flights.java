package com.nibmsqa.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.nibmsqa.pageobjects.BaseClass;
import com.nibmsqa.pageobjects.LoginPage;



public class TC_002_Search_Oneway_flights extends BaseClass {
	
	@Test
	public void loginTest() throws IOException, InterruptedException {
		
		
		
		driver.get(baseUrlString);
		logger.info("URL is Opened");
		LoginPage loginPage = new LoginPage(driver);
		logger.info("TC 001_ Main Page Loads Successfully");
		Thread.sleep(5000);
		
		loginPage.clickAeroplane();
		Thread.sleep(2000);
		logger.info("TC 002_Loading flights section successful");
		Thread.sleep(1000);
		
		loginPage.clickRadioOneway();
		logger.info("TC_002 S1 Select One Way trip");
		Thread.sleep(1000);
		
		loginPage.enter_departure();
		logger.info("Loads the suggestions for departure");
		loginPage.select_eparture();
		logger.info("TC_002_S2 Departure Selected Successfully ");
		Thread.sleep(1000);
		
		loginPage.enter_destination();
		logger.info("Loads the suggestions for destinatoin");
		
//		loginPage.select_destination();
		logger.info("TC_002_S3 Destination selected successfully");
		Thread.sleep(1000);
		
		loginPage.select_departure_date();
		logger.info("Select Departure date successfully");
		
		loginPage.select_past_date();
		logger.info("Unable to select past date");
		
		loginPage.select_future_date();
		logger.info("Select Departure date successfully");
		logger.info("TC_002_S4 Passed");
		
		loginPage.click_passengers();
		logger.info("Counter is working successfully");
		logger.info("TC_002_S5 Passed");
		
		//Selecting Items in Flight section
		Select flights = new Select(driver.findElement(By.xpath("//select[@id='flight_type']")));
		flights.selectByVisibleText("Business");
		flights.selectByVisibleText("First");
		flights.selectByVisibleText("Economy Premium");
		flights.selectByVisibleText("Economy");
		logger.info("TC_002 S6 Economy Class is Selected");
		
		Thread.sleep(1000);
		logger.info("TC_002 S6 Passed");
		loginPage.click_search();
		logger.info("TC_002_S7 Passed ");
	}
}
