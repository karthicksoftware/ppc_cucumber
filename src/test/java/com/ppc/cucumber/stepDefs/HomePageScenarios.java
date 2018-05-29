package com.ppc.cucumber.stepDefs;

import com.ppc.cucumber.core.DriverFacade;
import com.ppc.cucumber.steps.HomePageSteps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageScenarios {

	private DriverFacade browser =  new DriverFacade();
	private HomePageSteps homeSteps =  new HomePageSteps();
	
	
	@Before
	public void open_Browser() {
		System.out.println("Launching browser...");
		browser.openBrowser();
	}
	
	@After
	public void close_Browser(){
		System.out.println("Closing browser...");
		browser.closeBrowser();
	}
	
	@Given("^the user launches the application$")
	public void the_user_launches_the_application() throws Throwable {
	    homeSteps.navigateToTheURL();
	}
	
	@Then("^the user should be landed on home page$")
	public void the_user_should_be_landed_on_home_page() throws Throwable {
	    homeSteps.verifyHomePage();
	}

	@When("^the user selects 'Computer and Electronics' from category$")
	public void the_user_selects_Computer_and_Electronics_from_category() throws Throwable {
	    
	}
	
}
