package org.adactin;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactinstepdefinition {
	WebDriver driver;
	@Given("User is on Adactin login page.")
	public void user_is_on_Adactin_login_page() {
		 WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		   driver.get("http://adactinhotelapp.com/");
		   driver.manage().window().maximize();
		   
	}

	@When("User enter the valid username and password.")
	public void user_enter_the_valid_username_and_password() {
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("sharmilamohan");
		WebElement txtpassword= driver.findElement(By.id("password"));
		txtpassword.sendKeys("710227");
		 WebElement btnlogin = driver.findElement(By.name("login"));
		   btnlogin.click();
	}

	@When("User enter the valid date in Search Hotel page.")
	public void user_enter_the_valid_date_in_Search_Hotel_page() {
		WebElement txtlocation = driver.findElement(By.id("location"));
		Select s=new Select(txtlocation);
		s.selectByIndex(2);
		WebElement txthotels= driver.findElement(By.id("hotels"));
		Select s1=new Select(txthotels);
		s1.selectByIndex(2);
		WebElement txtroomtype = driver.findElement(By.id("room_type"));
		Select s2=new Select(txtroomtype);
		s2.selectByIndex(2);
		WebElement txtroomnos= driver.findElement(By.id("room_nos"));
		Select s3=new Select(txtroomnos);
		s3.selectByIndex(1);
		WebElement txtadultroom = driver.findElement(By.id("adult_room"));
		Select s4=new Select(txtadultroom);
		s4.selectByIndex(1);
		WebElement txtchildroom= driver.findElement(By.id("child_room"));
		Select s5=new Select(txtchildroom);
		s5.selectByIndex(1);

		 WebElement btnsearch = driver.findElement(By.name("Submit"));
		 btnsearch.click();	
		 }	
	

	@When("User is on select hotel page and given a valid data.")
	public void user_is_on_select_hotel_page_and_given_a_valid_data() {
		WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
	    radiobutton.click();
	    WebElement btnconti = driver.findElement(By.id("continue"));
	    btnconti.click();
	}

	@When("User is on book a hotel page and given a valid data.")
	public void user_is_on_book_a_hotel_page_and_given_a_valid_data() {

		WebElement txtfirstname = driver.findElement(By.id("first_name"));
		txtfirstname.sendKeys("manjula");
		
		WebElement txtlastname= driver.findElement(By.id("last_name"));
		txtlastname.sendKeys("ganesh");
		
		WebElement txtaddress = driver.findElement(By.id("address"));
		txtaddress.sendKeys("Chennai");
		
		WebElement txtccnum= driver.findElement(By.id("cc_num"));
		txtccnum.sendKeys("1234567890987654");
		
		WebElement txtcctype = driver.findElement(By.id("cc_type"));
		Select s=new Select(txtcctype);
		s.selectByValue("MAST");
		
		WebElement txtccexpmonth= driver.findElement(By.id("cc_exp_month"));
		Select s1=new Select(txtccexpmonth);
		s1.selectByValue("2");
		
		WebElement txtccexpyear= driver.findElement(By.id("cc_exp_year"));
		Select s2=new Select(txtccexpyear);
		s2.selectByValue("2022");
		
		WebElement txtcccvv = driver.findElement(By.id("cc_cvv"));
		txtcccvv.sendKeys("1234");
		 WebElement btnbook = driver.findElement(By.id("book_now"));
		    btnbook.click();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    
		    WebElement orderno  = driver.findElement(By.id("order_no"));
		    String attribute= orderno.getAttribute("value");
		    System.out.println(attribute);
		    }
	
	@When("User is on cancel page.")
	public void user_is_on_cancel_page() {
	    WebElement btnmyitinerary  = driver.findElement(By.id("my_itinerary"));
	    btnmyitinerary.click();
	    WebElement radiobutton  = driver.findElement(By.name("ids[]"));
	    radiobutton.click();
	    WebElement btncancel= driver.findElement(By.name("cancelall"));
	    btncancel.click();
	    Alert al=driver.switchTo().alert();
	    al.accept();
	    
	    
	}

	@Then("User will logout.")
	public void user_will_logout() {
	    
	    System.out.println("User will be logout");
	}

}
