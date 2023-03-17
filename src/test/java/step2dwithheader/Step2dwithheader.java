package step2dwithheader;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step2dwithheader {
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
		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(0);
		String email = map.get("username");
		 WebElement txtemail = driver.findElement(By.id("email"));
		    txtemail.sendKeys(email);
		    String password = asMaps.get(1).get("password");
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
