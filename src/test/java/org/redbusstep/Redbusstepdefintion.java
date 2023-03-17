package org.redbusstep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbusstepdefintion {
	WebDriver driver;
	@Given("User is on redbus page")
	public void user_is_on_redbus_page() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://www.redbus.in/");
	    driver.manage().window().maximize();
	}

	@When("User enter the place in from and to")
	public void user_enter_the_place_in_from_and_to() {
	    WebElement txtfrom = driver.findElement(By.id("src"));
	    txtfrom.sendKeys("Chennai");
	    WebElement txtto = driver.findElement(By.id("dest"));
	    txtto.sendKeys("Bangalore");
	    WebElement txtdate = driver.findElement(By.id("onward_cal"));
	    Select s=new Select(txtdate);
	    s.selectByIndex(25);
	}

	@When("User click the search button")
	public void user_click_the_search_button() {
	    WebElement search = driver.findElement(By.id("search_btn"));
	    search.click();
	}

	@Then("Login to the page")
	public void login_to_the_page() {
	   System.out.println("User can able to see possiblity of bus details");



}
}