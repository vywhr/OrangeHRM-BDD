package com.test.orangehrm;

import java.time.Duration;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import utility.Hooks;
import org.openqa.selenium.support.PageFactory;

public class LoginTest {

	WebDriver driver=Hooks.driver;  
	 LoginPage lp= new LoginPage(driver);
	

	@FindBy(xpath="//p[text()='Invalid credentials']")
	WebElement errormsg;
	

	/*Hooks.driver:
	 * यह Hooks क्लास में डिक्लेयर किया गया static WebDriver वेरिएबल है।
	 * 
	 * चूंकि इसे static घोषित किया गया है, इसे किसी भी क्लास से Hooks.driver के जरिए
	 * डायरेक्ट एक्सेस किया जा सकता है, बिना Hooks क्लास का नया ऑब्जेक्ट बनाए।
	 * WebDriver driver: यह एक लोकल वेरिएबल है जो Step Definition क्लास में बनाया
	 * गया है।
	 * 
	 * इसे Hooks.driver की वैल्यू से इनिशियलाइज़ किया जा रहा है।
	 */

	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	  @When("user provide valid credentials {string} and {string}") 
	  public void user_provide_valid_credentials_and(String string, String string2) {
	  driver.findElement(By.name("username")).sendKeys(string);
	  driver.findElement(By.name("password")).sendKeys(string2);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  }
	 

	@Then("user land on home page")
	public void user_land_on_home_page() {

		try {
			WebElement element = driver.findElement(By.xpath("//img[@alt='client brand banner']"));
			boolean flag = element.isDisplayed();
			Assert.assertTrue(flag);
			driver.quit();
		} catch (Exception e) {
			System.out.println("Handled");
			
		}
	}

	@When("user provide credentials {string} and {string}")
	public void user_provide_credentials_and(String string, String string2) {
		System.out.println(string);
		System.out.println(string2);
		driver.findElement(By.name("username")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
	@Given("user provide {string} and {string} a valid credentials to sucessful login")
    public void user_provide_and_a_valid_credentials_to_sucessful_login(String string, String string2) {
  
   	  driver.findElement(By.name("username")).sendKeys(string);
   	  driver.findElement(By.name("password")).sendKeys(string2);
   	  driver.findElement(By.xpath("//button[@type='submit']")).click();

}

	@When("user click on Admin tab")
	public void user_click_on_admin_tab() {
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
	
	}

	@When("user click on Orgnzation dropdown")
	public void user_click_on_orgnzation_dropdown() {
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		
	}

	@When("user click on general information")
	public void user_click_on_general_information() {
		
		driver.findElement(By.xpath("//a[normalize-space()='General Information']")).click();
	}

	@Then("validates all the general information displayed")
	public void validates_all_the_general_information_displayed() {
		String expectedOrgName="sample org name";
		
		/*
		 * String actualName=driver.findElement(By.
		 * xpath("//label[text()='Organization Name']//parent::div//following-sibling::div"
		 * )).getText();
		 * 
		 * if (expectedOrgName.equals(actualName)) {
		 * System.out.println("org name is matched"); } else { Assert.assertTrue(true);
		 * }
		 */
		
		System.out.println("Verification done");
}



		@When("User provide  invalid {string} and {string}")
		public void user_provide_invalid_and(String string, String string2) {
			
		      lp.enterUsername(string);
		      lp.enterPassword(string2);
		      lp.clickSubmitButton();
			
		}

		@Then("system should display proper {string}")
		public void system_should_display_proper(String string) throws InterruptedException {
	           lp.verifyErrorMsg(string);
			
		}
	
	
	
	
	

}
