package com.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty","html:target/html-reports/" }, features = "src/test/resources/Features", glue = {
		"com.ppc.cucumber.stepDefs" }, monochrome = true)

public class TestRunner {
	public void TestExecute() {
	}
}
