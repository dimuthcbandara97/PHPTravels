package com.nibmsqa.pageobjects;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.nibmsqa.utilities.ReadConfig;

public class BaseClass {

	ReadConfig readConfig = new ReadConfig();
//	public String baseUrlString = "https://demo.guru99.com/v4/";
//	public String usernameString = "mngr387726";
//	public String passwordString = "hujehyr";
	
	public String baseUrlString = readConfig.getApllicationURL();
	public String usernameString = readConfig.getUsername();
	public String passwordString = readConfig.getPassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String browser) {
//		System.setProperty("webdriver.chrome.driver", "E:\\Chathu\\NIBM SQA\\EclipseWorkPlace\\NIBM_POM_BANK\\Drivers\\ChromeDriver\\V98.exe");
//		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"//Drivers//ChromeDriver//V98.exe");
//		driver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver",
//				"E:\\Chathu\\NIBM SQA\\EclipseWorkPlace\\NIBMTestNG\\LibraryFiles\\ChromeDriver\\V98.exe");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",readConfig.getChromePath());
			driver = new ChromeDriver();
		}else if(browser.equals("edge")){
			System.setProperty("webdriver.edge.driver",readConfig.getEdgePath());
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		logger = Logger.getLogger("NIBM_SQA_FINAL");
		PropertyConfigurator.configure("Log4j.properties");
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException {
		//Thread.sleep(5000);
		//driver.quit();
		await().atMost(2, Duration.SECONDS).until(driverquitmethod());
		driverquitmethod()
	}

	public void driverquitmethod(){
		driver.quit()
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	}