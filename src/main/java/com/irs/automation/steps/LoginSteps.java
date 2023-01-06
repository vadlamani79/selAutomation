package com.irs.automation.steps;

import com.irs.automation.steps.impl.LoginStepsImpl;

import io.cucumber.java.en.Given;

public class LoginSteps {
	
	@Given("User logs into LendingTree as a valid user")
	public void user_logs_into_LendingTree_as_a_valid_user() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		LoginStepsImpl loginImpl = new LoginStepsImpl();
		loginImpl.validlogin();
	}

}
