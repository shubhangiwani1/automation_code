package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert12 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
			Thread.sleep(3000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,400)");
			
			WebElement confirmbtn = driver.findElement(By.id("confirmButton"));
			
			confirmbtn.click();
		
		//accept alert
		Thread.sleep(2000);			
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		System.out.println("alert accepted");
		
		//dismiss alert
		
		confirmbtn.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		System.out.println("alert dismiss");
		
		

	}

}
