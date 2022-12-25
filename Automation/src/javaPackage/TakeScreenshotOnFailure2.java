package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenshotOnFailure2 {

	TakeScreenshotOnFailure1 t1= new TakeScreenshotOnFailure1();
	
	@Test
	public void doLogin() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");
		t1.driver = new ChromeDriver();
		t1.driver.manage().window().maximize();
		t1.driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		t1.driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		t1.driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		t1.driver.findElement(By.id("pass")).sendKeys("1234com");
		
		//pass wrong id
		t1.driver.findElement(By.id("wrong_id")).click();
	}
		
		@AfterMethod
		
		public void TakeSC(ITestResult result) throws Exception{
			t1.captureScreenshot(result);
			
		}
		
			
		}
		
		
	
	
	
	

