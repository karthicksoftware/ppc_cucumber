package com.ppc.cucumber.steps;

import com.ppc.cucumber.pages.LoginPage;

public class LoginSteps {

	LoginPage login = new LoginPage();
	
	public void enterCredentials(String username, String password) {
		login.loginToTheApplication(username, password);
	}
	
}
