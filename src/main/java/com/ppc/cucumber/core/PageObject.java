package com.ppc.cucumber.core;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject extends DriverFacade {

	public WebElement element = null;

	protected PageObject element(By locator) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		element = getDriver().findElement(locator);
		return this;
	}

	public void typeOnElement(String arg1) {
		element.sendKeys(arg1);
	}
	
	protected PageObject element(WebElement element) {
		this.element = element;
		return this;
	}

	public List<WebElement> elements(By locator) {
		return getDriver().findElements(locator);
	}
	
	public String getText() {
		return element.getText().trim();
	}

	public void shouldBeVisible() {
		Assert.assertTrue("Element is not visible", element.isDisplayed());
	}
	
	public void waitUntilVisible() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitUntilClickable() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
		
	public void click() {
		element.click();
	}
}
