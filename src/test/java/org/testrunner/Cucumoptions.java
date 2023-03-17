package org.testrunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\Desktop\\New folder\\cucuminstall\\src\\test\\resources\\feature files\\face.feature",
glue="cucuoptionstepdefine",monochrome=true,strict=true,plugin= "junit:src/test/resources/Facebook/Fb.xml")
public class Cucumoptions{
	
}
