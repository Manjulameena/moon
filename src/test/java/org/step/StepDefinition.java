package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	@Given("User is on facebook login page.")
	public void user_is_on_facebook_login_page() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	}

	@When("User enters valid username and invalid password.")
	public void user_enters_valid_username_and_invalid_password() {
	    WebElement txtemail = driver.findElement(By.id("email"));
	    txtemail.sendKeys("arun@gmail.com");
	    WebElement txtpass = driver.findElement(By.id("pass"));
	    txtpass.sendKeys("testing1234");
	}

	@When("User clicks the login button.")
	public void user_clicks_the_login_button() {
	    WebElement btnlogin = driver.findElement(By.name("login"));
	    btnlogin.click();
	}

	@Then("Error page is displayed.")
	public void error_page_is_displayed() {
	  System.out.println("Error Page is displayed");
	}
}
