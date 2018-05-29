package com.ppc.cucumber.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFacade {
	
	public static ThreadLocal<WebDriver> drivers = new ThreadLocal<WebDriver>();
	public WebDriver driver = null;
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		setDriver(driver);
		getDriver().manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		getDriver().manage().window().maximize();		
	}

	public WebDriver getDriver() {
		return drivers.get();
	}
	
	public void setDriver(WebDriver driver) {
		drivers.set(driver);
	}
	
	public void closeBrowser() {
		getDriver().close();
	}
}
