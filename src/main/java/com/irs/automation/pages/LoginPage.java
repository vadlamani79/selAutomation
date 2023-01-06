package com.irs.automation.pages;

import org.openqa.selenium.By;

import com.irs.automation.steps.Common;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPage extends Common {
	
	public void clickLogin() throws InterruptedException {
		Thread.sleep(3000);
		getWebDriver().findElement(By.xpath("//a[@class='signin']")).click();
		Thread.sleep(3000);
	}
	
	public void login( String user, String pwd) throws InterruptedException {
		getWebDriver().findElement(By.id("username")).sendKeys(user);
		Thread.sleep(1000);
		getWebDriver().findElement(By.id("password")).sendKeys(pwd);
		Thread.sleep(1000);
		getWebDriver().findElement(By.xpath("//button")).click();
		Thread.sleep(2000);
	}
	
	public void validateLogin() {

		if (getWebDriver().findElements(By.className("loginError")).isEmpty()){
			test.log(LogStatus.PASS, "Logged In Successfully");			
		} else {
			test.log(LogStatus.FAIL, "LogIn Failed");
		}
	}

}
