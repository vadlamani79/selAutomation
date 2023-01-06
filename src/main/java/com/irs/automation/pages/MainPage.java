package com.irs.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.irs.automation.steps.Common;
import com.relevantcodes.extentreports.LogStatus;

public class MainPage extends Common {
	
	public void searchText() throws InterruptedException {
		getWebDriver().findElement(By.name("q")).click();
		Thread.sleep(1000);
		getWebDriver().findElement(By.name("q")).sendKeys("IRS");
		Thread.sleep(1000);
		getWebDriver().findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
	}
	
	public void validateMainPage() {
		if (getWebDriver().getTitle().contains("Dashboard")) {
		
			test.log(LogStatus.PASS, "Logged In Successfully");	
		} else {
			test.log(LogStatus.FAIL, "Log in failed");	
		}
	}
	

}
