package com.irs.automation.steps;

import com.irs.automation.steps.impl.LoginStepsImpl;

import io.cucumber.java.en.Then;

public class MainSteps {
	
	@Then("Mainpage is displayed")
	public void mainpage_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    LoginStepsImpl mainImpl = new LoginStepsImpl();
	    mainImpl.validMain();
	    
	}

}
