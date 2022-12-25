package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Assertion1 {
	
	WebDriver driver;
	
	@Test
	
	public void testCase1() throws Exception {
		String expectedresult = "Sorry, we don't recognize this email";
		System.setProperty("webdriver.chrome.driver","C:\\D Drive\\Softwares\\chromedriver_win32_recent\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(3000);
		
		String actualMessage = driver.findElement(By.id("username-error")).getText();
		
	     Assert.assertEquals(actualMessage,expectedresult,"Actaul and expected not matching" );
	     System.out.println("equal assertion verifiied");
	     
		
	     Thread.sleep(2000);
	     Assert.assertFalse(driver.findElement(By.id("username-error")).isSelected());
	     System.out.println("False assertion verifiied");
	     Assert.assertTrue(driver.findElement(By.id("username-error")).isDisplayed());
		
	     System.out.println("True assertion verifiied");
	
		
		
		
		
			
				
	}

}
