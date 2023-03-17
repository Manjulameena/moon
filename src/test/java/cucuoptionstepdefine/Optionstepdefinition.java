package cucuoptionstepdefine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Optionstepdefinition {
	
	WebDriver driver;
	@Given("User is on facebook page.")
	public void user_is_on_facebook_page() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.get("https://www.facebook.com");
	   driver.manage().window().maximize();
	}

	@When("User enters{string}and{string}")
	public void user_enters_and(String email, String password) {
		WebElement txtemail=driver.findElement(By.id("email"));
		txtemail.sendKeys(email);
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys(password);
	   	}
	
	@When("User click the login button.")
	public void user_click_the_login_button(){
	    WebElement btnlogin = driver.findElement(By.name("login"));
	    btnlogin.click();
	}
	
	@Then("Error page is displayed.")
	public void error_page_is_displayed(){
	    System.out.println("ERROR PAGE IS DISPLAYED");    
	}
}
