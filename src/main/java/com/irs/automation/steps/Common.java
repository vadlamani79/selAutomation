package com.irs.automation.steps;

//import org.junit.After;
//import org.junit.Before;
import io.cucumber.java.*;
import org.openqa.selenium.edge.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.util.Properties;

import com.irs.automation.libs.ConfUtils;
import org.openqa.selenium.WebDriver;

public class Common {
	
	public static ExtentTest test;
	public static ExtentReports report;
	private static WebDriver driver;
	public static Properties localConf;
	
	@Before
	public void setUp() throws Exception {
		
		localConf = ConfUtils.loadConf();
		
		report = new ExtentReports("C:\\Users\\847336\\ExtentReportResults.html");
		test = report.startTest("Login");
		getWebDriver().get(ConfUtils.getEnvProperty("url"));
		test.log(LogStatus.INFO, "Test Started");
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
		report.endTest(test);
		report.flush();
		report.close();
	}
	
	public static WebDriver getWebDriver() {
		if (driver==null) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\847336\\selenium-drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		return driver;
	}
	

}
