package com.nibmsqa.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.nibmsqa.pageobjects.BaseClass;
import com.nibmsqa.pageobjects.LoginPage;

public class TC_003_Search_Roundway_Flights extends BaseClass {

	@Test
	public void loginTest() throws IOException, InterruptedException {
		driver.get(baseUrlString);
		logger.info("URL is Opened");
		LoginPage loginPage = new LoginPage(driver);
		logger.info("TC 001_ Main Page Loads Successfully");
		Thread.sleep(5000);
		
		loginPage.clickAeroplane();
		Thread.sleep(2000);
		logger.info("TC 003_Loading flights section successful");
		Thread.sleep(1000);
		
		loginPage.clickRadioRound();
		logger.info("TC_003_S1 Select Round Way trip");
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
		logger.info("TC_003_S4 Passed");
		/**return date
		 * */
		loginPage.select_return_date();
		logger.info("Select return date successfully");
		
		loginPage.select_past_Return__date();
		logger.info("Unable to select past retrun date");
		
		loginPage.select_future_return_date();
		logger.info("Select Retrn date successfully");
		logger.info("TC_003_S5 Passed");
		/*End retrun date
		 * */
		loginPage.click_passengers();
		logger.info("TC_003 S6 Passed");
		
		Select flights = new Select(driver.findElement(By.xpath("//select[@id='flight_type']")));
		flights.selectByVisibleText("Business");
		flights.selectByVisibleText("First");
		flights.selectByVisibleText("Economy Premium");
		flights.selectByVisibleText("Economy");
		logger.info("TC_002 S7 Economy Class is Selected");
		logger.info("TC_002 S7 Select Class Test is passed");
		loginPage.click_search();
		logger.info("TC_003_S8 Passed ");
	}
}
