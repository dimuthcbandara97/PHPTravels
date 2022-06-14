package com.nibmsqa.pageobjects;


import org.apache.commons.io.serialization.ValidatingObjectInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class FlightBookPage {
	WebDriver lDriver;
	public FlightBookPage(WebDriver rDriver) {
		// TODO Auto-generated constructor stub
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}
	

	@FindBy(xpath = "//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/button[1]")
	@CacheLookup
	WebElement txtAeroplane;
	public void clickAeroplane() {
		txtAeroplane.click();
	}
	
	
}
