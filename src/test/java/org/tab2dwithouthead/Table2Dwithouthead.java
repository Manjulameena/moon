package org.tab2dwithouthead;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Table2Dwithouthead {
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
	   List<List<String>> asLists = dataTable.asLists();
	   List<String> list = asLists.get(0);
	   String email = list.get(0);
	   WebElement txtemail = driver.findElement(By.id("email"));
	    txtemail.sendKeys(email);
	    List<List<String>> asLists2 = dataTable.asLists();
	    String password = asLists2.get(0).get(1);
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
	   System.out.println("error page is displayed");

}
}