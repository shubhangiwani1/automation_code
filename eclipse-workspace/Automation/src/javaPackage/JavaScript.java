package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\\\D Drive\\\\Softwares\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		
		//type casting of two interfaces
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		
		//Locate webelement
		
		jse.executeScript("document.getElementById('email').value='svani@gamil.com'");
		jse.executeScript("document.getElementById('pass').value='abcDRRF'");
		
		//Scroll down by javscript
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)");
		
		//scroll up by javscript
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-500)");
		
		
		//scroll  horizontally right
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(500,0)");
		
		Thread.sleep(2000);
		
		//scroll  horizontally right
		jse.executeScript("window.scrollBy(-500,0)");
			
		
	}

}
