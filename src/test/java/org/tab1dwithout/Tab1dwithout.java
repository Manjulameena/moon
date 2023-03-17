package org.tab1dwithout;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Tab1dwithout {
	WebDriver driver;
	@Given("User is on facebook page.")
	public void user_is_on_facebook_page() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	}

	@When("User enter the valid username and password.")
	public void user_enter_the_valid_username_and_password(io.cucumber.datatable.DataTable dataTable) {
List<String> asList = dataTable.asList();
		String email = asList.get(0);
		WebElement txtemail = driver.findElement(By.id("email"));
	    txtemail.sendKeys(email);
	    String password = asList.get(1);
	    WebElement txtpass = driver.findElement(By.id("pass"));
	    txtpass.sendKeys(password);
	}

	@When("User clicks the login button.")
	public void user_clicks_the_login_button() {
		WebElement btnclick = driver.findElement(By.name("login"));
		btnclick.click();
	   	}

	@Then("Error page is displayed.")
	public void error_page_is_displayed() {
	   System.out.println("error ppage is displayed");
	}



}
