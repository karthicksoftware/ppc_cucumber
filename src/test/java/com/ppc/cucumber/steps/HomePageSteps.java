package com.ppc.cucumber.steps;

import com.ppc.cucumber.pages.HomePage;

public class HomePageSteps {
	
	HomePage homePage = new HomePage();
	
	public void navigateToTheURL() {
		homePage.openApplication();
	}
	
	public void verifyHomePage() {
		homePage.verifyHomePage();
	}

}
