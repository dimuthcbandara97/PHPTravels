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

public class LoginPage {
	
	String firstpluString = "section.hero-wrapper:nth-child(3) div.hero-box.hero-bg.active.lazyloaded div.container div.row div.col-lg-12.mx-auto.responsive--column-l div.section-tab.fade-in.glass div.tab-content.search-fields-container.search_area.search_tabs div.tab-pane.fade.active.show:nth-child(2) form.main_search:nth-child(1) div.row.contact-form-action.g-1:nth-child(2) div.col-lg-1.pr-0 div.input-box div.form-group div.dropdown.dropdown-contain div.dropdown-menu.dropdown-menu-wrap div.dropdown-item.adult_qty:nth-child(1) div.qty-box.d-flex.align-items-center.justify-content-between div.qtyBtn.d-flex.align-items-center:nth-child(2) div.qtyInc > i.la.la-plus";
	WebDriver lDriver;
	public LoginPage(WebDriver rDriver) {
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
	
	@FindBy(xpath = "//input[@id='round-trip']")
	@CacheLookup
	WebElement rad_Round_way;
	public void clickRadioRound() {
		rad_Round_way.click();
	}
	
	@FindBy(xpath = "//input[@id='one-way']")
	@CacheLookup
	WebElement rad_onewayElement;
	public void clickRadioOneway() {
		rad_onewayElement.click();
	}
	
	@FindBy(xpath = "//input[@id='autocomplete']")
	@CacheLookup
	WebElement txt_departure;
	public void enter_departure() {
		txt_departure.click();
		txt_departure.clear();
		txt_departure.sendKeys("CMB");
	}
	
	@FindBy(className = "autocomplete-result")
	@CacheLookup
	WebElement select_departure;
	public void select_eparture() {
		select_departure.click();
	}
	
	@FindBy(xpath = "//input[@id='autocomplete2']")
	@CacheLookup
	WebElement txt_destination;
	public void enter_destination() {
		txt_destination.click();
		txt_destination.clear();
		txt_destination.sendKeys("MAA - Chennai Intl - Madras");
	}
	
//	@FindBy(className = "autocomplete-result")
//	@CacheLookup
//	WebElement select_destinElement;
//	public void select_destination() {
//		select_destinElement.click();
//	}
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
	LocalDate now = LocalDate.now();  
	@FindBy(xpath = "//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement select_departure_date;
	public void select_departure_date() {
		select_departure_date.click();
		select_departure_date.clear();
		select_departure_date.sendKeys(dtf.format(now));
	}
	
	public void select_past_date() {
		select_departure_date.click();
		select_departure_date.clear();
		select_departure_date.sendKeys("01-01-2022");
	}
	
	public void select_future_date() {
		select_departure_date.click();
		select_departure_date.clear();
		select_departure_date.sendKeys("07-07-2022");
	}
	
	@FindBy(xpath = "//input[@id='return']")
	WebElement select_return_date;
	public void select_return_date() {
		select_return_date.click();
		select_return_date.clear();
		select_return_date.sendKeys(dtf.format(now));
	}
	
	public void select_past_Return__date() {
		select_return_date.click();
		select_return_date.clear();
		select_return_date.sendKeys("01-01-2022");
	}
	
	public void select_future_return_date() {
		select_return_date.click();
		select_return_date.clear();
		select_return_date.sendKeys("12-07-2022");
	}
	
	
	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[3]/div[1]/div[1]")
	@CacheLookup
	WebElement click_passenger;
	
//	@FindBy(css = "section.hero-wrapper:nth-child(3) div.hero-box.hero-bg.active.lazyloaded div.container div.row div.col-lg-12.mx-auto.responsive--column-l div.section-tab.fade-in.glass div.tab-content.search-fields-container.search_area.search_tabs div.tab-pane.fade.active.show:nth-child(2) form.main_search:nth-child(1) div.row.contact-form-action.g-1:nth-child(2) div.col-lg-1.pr-0 div.input-box div.form-group div.dropdown.dropdown-contain div.dropdown-menu.dropdown-menu-wrap div.dropdown-item.adult_qty:nth-child(1) div.qty-box.d-flex.align-items-center.justify-content-between div.qtyBtn.d-flex.align-items-center:nth-child(2) div.qtyInc > i.la.la-plus" )
	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/i[1]")
	@CacheLookup
	WebElement click_adult_plus;
	
	// click adult minus
	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/i[1]")
	@CacheLookup
	WebElement click_adult_minus;
	
	// click childs plus
	@FindBy(xpath = "//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
	@CacheLookup
	WebElement childsplus;
	
	// click childs minus
	@FindBy(xpath = "//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
	@CacheLookup
	WebElement click_childt_minus;
	
	// click infants plus
	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/i[1]")
	@CacheLookup
	WebElement click_infant_plus;
	
	// click infants mius
	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/i[1]")
	@CacheLookup
	WebElement click_infant_minus;
	
	public void click_passengers() throws InterruptedException {
		click_passenger.click();
		click_adult_plus.click();		
		Thread.sleep(500);
		click_adult_minus .click();
		Thread.sleep(500);
		childsplus.click();
		Thread.sleep(500);
		click_childt_minus.click();
		Thread.sleep(500);
		click_infant_plus.click();
		Thread.sleep(500);
		click_infant_minus.click();
	}
	
	@FindBy(xpath = "//select[@id='flight_type']")
	@CacheLookup
	Select select;
	public void select_flight() throws InterruptedException {
		
		List<WebElement> list = select.getOptions();
		list.size();
		
		if(list.size()==0) {
			System.out.println("Empty Combo Box ");
		}else {
			System.out.println("Combo Box is not empty");
			for(int i=0;i<list.size();i++) {
				select.selectByIndex(i);
				Thread.sleep(1500);
//				select.deselectByIndex(i);
//				Thread.sleep(1000);
			}
		}
	}
	
	@FindBy(xpath = "//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]/a[1]")
	@CacheLookup
	WebElement click_search;
	public void click_search() {
		click_search.click();		
	}
	
}
