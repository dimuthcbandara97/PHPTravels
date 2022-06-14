package com.nibmsqa.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nibmsqa.pageobjects.BaseClass;

import com.nibmsqa.pageobjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException {
		driver.get(baseUrlString);
		logger.info("URL is Opened");
//		driver.get("https://demo.guru99.com/v4/");
		LoginPage loginPage = new LoginPage(driver);

	}
}
