package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\Desktop\\New folder\\cucuminstall\\src\\test\\resources\\1Dwithouthead.feature",
glue="org.tab1dwithout",monochrome=true,dryRun=false)
public class Table1Dwithout {

}
