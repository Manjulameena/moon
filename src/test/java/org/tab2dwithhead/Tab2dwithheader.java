package org.tab2dwithhead;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Tab2dwithheader {
	WebDriver driver;
	@Given("User is on login page.")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	}

	@When("User enter the valid username and password.")
	public void user_enter_the_valid_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	   Map<String, String> asMap = dataTable.asMap(String.class,String.class);
	 String email=(String) asMap.get("username");
	 WebElement txtemail = driver.findElement(By.id("email"));
	    txtemail.sendKeys(email);
		String password =(String) asMap.get("password");
		WebElement txtpass = driver.findElement(By.id("pass"));
	    txtpass.sendKeys(password);
	    
	}

	@When("User enter click button.")
	public void user_enter_click_button() {
		WebElement btnclick = driver.findElement(By.name("login"));
		btnclick.click();
	}

	@Then("Error page is displayed.")
	public void error_page_is_displayed() {
	   System.out.println("error page is displayed");	}



}
