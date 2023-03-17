package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\Desktop\\New folder\\cucuminstall\\src\\test\\resources\\feature files\\Adactin.feature",glue="org.adactin")
public class Adactintestrunner {

}
