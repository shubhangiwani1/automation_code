package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakesSC2 {
	TakesSC t1 = new TakesSC();
	
	@Test
	public void lgn() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");
		t1.driver =new ChromeDriver();
		t1.driver.get("https://www.facebook.com/login/");
		t1.driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ancd");
		t1.driver.findElement(By.xpath("//button[@name='login1']")).click();
		t1.driver.quit();
	
	}
	
	@AfterMethod
	
	public void sccc(ITestResult result) throws Exception {
		t1.takesc(result);
	}
	
	

}
