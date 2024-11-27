package com.test.orangehrm;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Homepage {
	
	 WebDriver  driver;
		/*
		 * @Given("user provide {string} and {string} a valid credentials to sucessful login"
		 * ) public void user_provide_and_a_valid_credentials_to_sucessful_login(String
		 * string, String string2) { WebDriverManager.chromedriver().setup(); driver =
		 * new ChromeDriver();
		 * 
		 * driver.findElement(By.name("username")).sendKeys(string);
		 * driver.findElement(By.name("password")).sendKeys(string2);
		 * driver.findElement(By.xpath("//button[@type='submit']")).click();
		 * 
		 * 
		 * }
		 * 
		 * @When("user click on Admin tab") public void user_click_on_admin_tab() {
		 * driver.findElement(By.xpath("//span[text()='Admin']")).click();
		 * 
		 * }
		 * 
		 * @When("user click on Orgnzation dropdown") public void
		 * user_click_on_orgnzation_dropdown() {
		 * driver.findElement(By.xpath("//span[normalize-space()='Organization']")).
		 * click();
		 * 
		 * }
		 * 
		 * @When("user click on general information") public void
		 * user_click_on_general_information() {
		 * 
		 * driver.findElement(By.xpath("//a[normalize-space()='General Information']")).
		 * click(); }
		 * 
		 * @Then("validates all the general information displayed") public void
		 * validates_all_the_general_information_displayed() { String
		 * expectedOrgName="sample org name";
		 * 
		 * String actualName=driver.findElement(By.
		 * xpath("//label[text()='Organization Name']//parent::div//following-sibling::div"
		 * )).getText();
		 * 
		 * if (expectedOrgName.equals(actualName)) {
		 * System.out.println("org name is matched"); } else { Assert.assertTrue(false);
		 * } }
		 */
}
