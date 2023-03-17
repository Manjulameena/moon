package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\Desktop\\New folder\\cucuminstall\\src\\test\\resources\\feature files\\2dwithheader.feature",
glue="step2dwithheader",monochrome=true,dryRun=false)
public class Testrunner2dwithhead {

}
