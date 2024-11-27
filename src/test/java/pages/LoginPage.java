package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Constants;
import utility.Hooks;

public class LoginPage {
	
	WebDriver driver=Hooks.driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitBtn;
	@FindBy(xpath="//p[text()='Invalid credentials']")
	WebElement errormsg;
	
	
	public void enterUsername(String userName)
	{
		
       username.sendKeys(userName);
	}
	
	public void enterPassword(String passWord)
	{
		password.sendKeys(passWord);
	}
	
	public void clickSubmitButton()
	{
		
		submitBtn.click();
		
	}
	
	public void verifyErrorMsg(String expectedErrormsg) throws InterruptedException
	{
	
		//String expectedErrorMsg=Constants.Messages.errorMsgForInvalidCredentials;
		
		Thread.sleep(4000);
		String actualErrorMsg =errormsg.getText();
		if (expectedErrormsg.equals(actualErrorMsg))
		{
			System.out.println("Verified error msg succussfully. Error msg displayed is -->"+actualErrorMsg);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
}

