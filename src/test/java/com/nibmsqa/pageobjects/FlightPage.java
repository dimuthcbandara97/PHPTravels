package com.nibmsqa.pageobjects;


import org.apache.commons.io.serialization.ValidatingObjectInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.domsnapshot.model.LayoutTreeSnapshot;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class FlightPage {
	WebDriver lDriver;
	public FlightPage(WebDriver rDriver) {
		// TODO Auto-generated constructor stub
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(xpath = "//input[@id='all']")
	@CacheLookup
	WebElement clickAllflights;
	public void clickAllFlights() {
		clickAllflights.click();
	}
	
	@FindBy(xpath = "//input[@id='direct']")
	@CacheLookup
	WebElement clickDirectFlights;
	public void clickDirectFlights() {
		clickDirectFlights.click();;
	}
	
	@FindBy(xpath = "//body/main[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/ul[1]/li[1]/div[1]/label[1]")
	@CacheLookup
	WebElement selectIndiaGo;
	public void selectIndiagotAirlines() {
		selectIndiaGo.click();

	}
	
	@FindBy(xpath = "//body/main[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/ul[1]/li[2]/div[1]/label[1]")
	@CacheLookup
	WebElement selectAirIndia;
	public void selectAirIndia() {
		selectAirIndia.click();

	}
	
	@FindBy(xpath = "//body/main[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/ul[1]/li[3]/div[1]/label[1]")
	@CacheLookup
	WebElement selctSpiceJet;
	public void selectSpiceJect() {
		selctSpiceJet.click();

	}
	
	@FindBy(xpath = "//body/main[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/ul[1]/li[4]/div[1]/label[1]")
	@CacheLookup
	WebElement selctSriLankan;
	public void selectSriLankan() {
		selctSriLankan.click();

	}
	
	@FindBy(xpath = "//body[1]/main[1]/div[1]/div[2]/section[1]/ul[1]/li[1]/div[1]/form[1]/div[1]/div[2]/div[1]/button[1]")
	@CacheLookup
	WebElement BookNow;
	public void bookNow() {
		BookNow.click();

	}
	
	// First Name
	@FindBy(xpath = "//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement Fname;
	public void fName() {
		Fname.click();
		Fname.clear();
		Fname.sendKeys("Dimuth C");
	}
	
	// Last Name
		@FindBy(xpath = "//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
		@CacheLookup
		WebElement Lname;
		public void lName() {
			Lname.click();
			Lname.clear();
			Lname.sendKeys("Bandara");
		}
	
	// Email
		@FindBy(xpath = "//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
		@CacheLookup
		WebElement Emaill;
		public void emaill() {
			Emaill.click();
			Emaill.clear();
			Emaill.sendKeys("dimuthchathu101@gmail.com");
		}
		
	// Phone
		@FindBy(xpath = "//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1]")
		@CacheLookup
		WebElement phonee;
		public void phonee() {
			phonee.click();
			phonee.clear();
			phonee.sendKeys("+94771112783");
		}
	// Adreess
		@FindBy(xpath = "//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/input[1]")
		@CacheLookup
		WebElement adresss;
		public void adress() {
			adresss.click();
			adresss.clear();
			adresss.sendKeys("Kurunegala");
		}
		
//	// Country
//		@FindBy(id="select2-country_code-eg-container")
//		@CacheLookup
//		WebElement country;
//		public void country() {
//			country.click();
//			country.sendKeys("Sri Lanka");
//		}
//	// Nationality
//		@FindBy(xpath = "//span[@id='select2-nationality-eb-container']")
//		@CacheLookup
//		WebElement nationality;
//		public void nationality() {
//			nationality.click();
////			nationality.sendKeys("Sri Lanka");
//		}
		
	// Travellers Information
		// First Name
		@FindBy(name = "firstname_1")
		WebElement firstnamElement;
		public void trav_FName() {
			firstnamElement.click();
			firstnamElement.clear();
			firstnamElement.sendKeys("Sandun");
		}
		// Last Name
		@FindBy(name = "lastname_1")
		WebElement lastname;
		public void trav_Lname() {
			lastname.click();
			lastname.clear();
			lastname.sendKeys("Dissanayake");
		}
		// Passport or ID number
		@FindBy(xpath = "//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/input[1]")
		@CacheLookup
		WebElement passport;
		public void passport() {
			passport.click();
			passport.sendKeys("97*******8V");
		}
		// Bank Transfer
		@FindBy(xpath = "//input[@id='gateway_bank-transfer']")
		@CacheLookup
		WebElement bankTransfer;
		public void bankTransfer() {
			bankTransfer.click();

		}
		// Pay Later
		@FindBy(xpath = "//input[@id='gateway_pay-later']")
		@CacheLookup
		WebElement payLater;
		public void payLater() {
			payLater.click();
		}
		// pay with Stripe
		@FindBy(xpath = "//input[@id='gateway_stripe']")
		@CacheLookup
		WebElement paywithStripe;
		public void payStripe() {
			paywithStripe.click();
		}
		// pay with paypal
		@FindBy(xpath = "//input[@id='gateway_paypal']")
		@CacheLookup
		WebElement paywithpaypal;
		public void pay_paypal() {
			paywithpaypal.click();
		}
		// Agree terms and conditions
		@FindBy(xpath = "//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/label[1]")
		@CacheLookup
		WebElement agreeterms;
		public void agreeterms() {
			agreeterms.click();
		}
		// confirm booking
		@FindBy(xpath = "//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/label[1]")
		@CacheLookup
		WebElement confirmbooking;
		public void confirmbooking() {
			confirmbooking.click();
		}
}
