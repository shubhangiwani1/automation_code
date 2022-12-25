package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {

	WebDriver driver;

	@Parameters("browser")
	@BeforeTest
	

	public void setup(String abc) throws Exception {

		if (abc.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\D Drive\\Softwares\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(abc.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver","C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
			else {
				throw new Exception("Browser is not correct");
			}

		}
	
		@Test 
		public void test123(){
			
			driver.get("http://demo.guru99.com/V4/");
			WebElement userName = driver.findElement(By.name("uid"));
			userName.sendKeys("guru99");
			WebElement password = driver.findElement(By.name("password"));
			
			password.sendKeys("guru99");
			driver.close();
			
			
			
		
	}
}
