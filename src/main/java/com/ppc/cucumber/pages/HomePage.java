package com.ppc.cucumber.pages;

import org.junit.Assert;

import com.ppc.cucumber.core.PageObject;

public class HomePage extends PageObject{

	
	public void openApplication() {
		getDriver().get("https://www.purchasingpower.com/store/login");
	}
	
	public void verifyHomePage() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue("HomePAge is not displayed", getDriver().getCurrentUrl().endsWith("/store/"));
	}
	
}
