package com.ppc.cucumber.pages;

import org.openqa.selenium.By;

import com.ppc.cucumber.core.PageObject;

public class LoginPage extends PageObject{

	By userName = By.id("j_username");
	By passWord = By.id("j_password");
	By login_btn = By.cssSelector("[type='submit']");
	
	public void loginToTheApplication(String arg1, String arg2)  {
		element(userName).typeOnElement(arg1);
		element(passWord).typeOnElement(arg2);
		element(login_btn).click();
	}
	
}
