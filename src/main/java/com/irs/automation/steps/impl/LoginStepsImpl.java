package com.irs.automation.steps.impl;

import com.irs.automation.libs.ConfUtils;

import com.irs.automation.pages.LoginPage;
import com.irs.automation.pages.MainPage;

public class LoginStepsImpl {
	
	LoginPage loginPage = new LoginPage();
	MainPage mainPage = new MainPage();
	
	public void validlogin() throws InterruptedException {
		loginPage.clickLogin();
		loginPage.login(ConfUtils.getEnvProperty("user1"), ConfUtils.getEnvProperty("pwd1"));
		
	}
	
	public void validMain() {
		mainPage.validateMainPage();
	}
	

}
