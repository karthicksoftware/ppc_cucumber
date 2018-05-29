package com.ppc.cucumber.stepDefs;

import com.ppc.cucumber.steps.LoginSteps;

import cucumber.api.java.en.When;

public class LoginScenarios {

	private LoginSteps loginSteps = new LoginSteps();
	
	@When("^the user enters username as '(.*)' and password as '(.*)'$")
	public void the_user_enters_username_as_proj_mailinator_com_and_password_as_Test(String arg1, String arg2) throws Throwable {
	    loginSteps.enterCredentials(arg1, arg2);
	}
	
}
