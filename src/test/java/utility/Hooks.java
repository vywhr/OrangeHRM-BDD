package utility;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class Hooks {
	public static  WebDriver driver;
	 
	@Before  // run before each sceanrio
	public void setUp() {
		
		  WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
		 
		 System.out.println("Driver initited");
		
	}
	
	
	@After // run After each sceanrio
	public void tearDown() 
	{   
		driver.quit();
		System.out.println("Driver Quit");
		
	}
	
	

}
