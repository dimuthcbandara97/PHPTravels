package com.nibmsqa.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.mongodb.diagnostics.logging.Logger;
import com.nibmsqa.pageobjects.BaseClass_FlightPage;
import com.nibmsqa.pageobjects.FlightPage;

public class TC_004_Flight_Page_Testing extends BaseClass_FlightPage {

	@Test
	public void flightTest() throws IOException, InterruptedException {
		driver.get(baseUrlString);
		logger.info("TC_004_ Started -URL is Opened");
//		driver.get("https://demo.guru99.com/v4/");
		FlightPage flightPage = new FlightPage(driver);
		logger.info("Flight Page is loaded");
		Thread.sleep(4000);
		flightPage.clickAllFlights();
		logger.info("All flight option is working");
		Thread.sleep(1000);

		flightPage.clickDirectFlights();
		logger.info("Direct Fligh option is working");
		Thread.sleep(1000);
		logger.info("TC_004_S1 Passed Modify Flight by Flight stop");

		flightPage.selectIndiagotAirlines();
		Thread.sleep(1000);
		logger.info("Selected India Go");

		flightPage.selectAirIndia();
		Thread.sleep(1000);
		logger.info("Select Air India");

		flightPage.selectSpiceJect();
		logger.info("Selcted Spice Jet");
		Thread.sleep(1000);

		flightPage.selectSriLankan();
		logger.info("Selected Sri Lankan");
		logger.info("TC_004_S3 Passed Search Complete By Airlines");
		Thread.sleep(2000);

		flightPage.bookNow();
		logger.info("TC_005 Start");
		flightPage.fName();
		logger.info("First Name Entered");
		Thread.sleep(500);

		flightPage.lName();
		logger.info("Last Name Entered");
		Thread.sleep(500);

		flightPage.emaill();
		logger.info("Email is entered");
		Thread.sleep(500);

		flightPage.phonee();
		logger.info("Phone is entered");
		Thread.sleep(500);

		flightPage.adress();
		logger.info("Adress is entered");
		Thread.sleep(500);

		// country
		// nationality
		
		logger.error("Errors in Country and Nationality");
		Select title = new Select(driver.findElement(By.xpath(
				"//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/select[1]")));
		title.selectByVisibleText("MR");
		logger.info("MR is selected");
		
		// Fname
		// Lname
		logger.error("Errors in Fname and Lname");

		Select nationality = new Select(driver.findElement(By.name("nationality_1")));
		nationality.selectByVisibleText("Albania");
		logger.info("Albania is selected");
		Thread.sleep(500);

		Select dob = new Select(driver.findElement(By.name("dob_month_1")));
		dob.selectByVisibleText("03 March");
		logger.info("03 March");
		Thread.sleep(500);

		// day
		Select dayy = new Select(driver.findElement(By.name("dob_day_1")));
		dayy.selectByVisibleText("1");
		logger.info("01 is selected");
		Thread.sleep(500);

		// year
		Select yearr = new Select(driver.findElement(By.name("dob_year_1")));
		yearr.selectByVisibleText("1997");
		logger.info("1997 is selected");
		Thread.sleep(500);

		// Enter ID number
		flightPage.passport();
		logger.info("Passport / ID is entered");
		Thread.sleep(500);

		// passport issurance date
		Select passissmonth = new Select(driver.findElement(By.name("passport_issuance_month_1")));
		passissmonth.selectByVisibleText("03 March");
		logger.info("03 March is selected as passport issurance date");
		Thread.sleep(500);

		// passport issurance day
		Select passissday = new Select(driver.findElement(By.name("passport_issuance_day_1")));
		passissday.selectByVisibleText("1");
		logger.info("01 is selected as passport issurance day");
		Thread.sleep(500);

		// passport issurance year
		Select issue_yearr = new Select(driver.findElement(By.name("passport_issuance_year_1")));
		issue_yearr.selectByVisibleText("2020");
		logger.info("2020 is selected as passport issurance year");
		Thread.sleep(500);

		// passport issurance date
		Select pasexpmonth = new Select(driver.findElement(By.name("passport_month_1")));
		pasexpmonth.selectByVisibleText("03 March");
		logger.info("03 March is selected as passport issurance date");
		Thread.sleep(500);

		// passport issurance day
		Select passexpday = new Select(driver.findElement(By.name("passport_day_1")));
		passexpday.selectByVisibleText("2");
		logger.info("02 is selected as passport issurance day");
		Thread.sleep(500);

		// passport issurance year
		Select expirey_yearr = new Select(driver.findElement(By.name("passport_year_1")));
		expirey_yearr.selectByVisibleText("2024");
		logger.info("2024 is selected as passport issurance year");

		Thread.sleep(500);
		
		flightPage.bankTransfer();
		Thread.sleep(500);
		logger.info("Bank Transfer is selected");
		
		flightPage.payLater();
		Thread.sleep(500);
		logger.info("Pay later is selected");
		
//		flightPage.payStripe();
//		Thread.sleep(500);
//		logger.info("Pay Strip is selected");
		logger.error("Error in pay Stripe method");
		
		flightPage.pay_paypal();
		logger.info("Pay pal is selected");
		Thread.sleep(500);
		
		flightPage.agreeterms();
		Thread.sleep(500);
		logger.info("Agreed to terms and conditions");
		
		Thread.sleep(500);
		flightPage.confirmbooking();
		logger.info("Button Click Ok");
		
	}
}
