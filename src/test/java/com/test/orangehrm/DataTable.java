package com.test.orangehrm;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTable {
	
	WebDriver driver;
	@Given("the user is on the registration page")
	public void the_user_is_on_the_registration_page() { 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}

	@When("the user enters the following details:")
	public void the_user_enters_the_following_details(io.cucumber.datatable.DataTable dataTable) {
		
		  Map<String, String> userDetails = dataTable.asMap(String.class, String.class);
		  
		  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(userDetails.get("First Name"));
		  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(userDetails.get("Last Name"));
		  driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(userDetails.get("Email"));
		
	}

	@When("user click on sign up button")
	public void user_click_on_sign_up_button() throws InterruptedException {
		
		System.out.println("User click on button");
		Thread.sleep(2000);
		
	}

	
	@Then("user get error message")
	public void user_get_error_message() throws InterruptedException {
		System.out.println("Validation");
		Thread.sleep(2000);
		driver.quit();
	}



	
	
	
	
	
	
	

}
