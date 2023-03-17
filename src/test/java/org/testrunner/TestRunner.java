package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\Desktop\\New folder\\cucuminstall\\src\\test\\resources\\feature files\\facebook.feature",
glue="org.step",monochrome=true,dryRun=true)
public class TestRunner {

}
