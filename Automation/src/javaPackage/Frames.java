package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://paytm.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Sign In')]")).click();
		
		//total number of frames
		int allfrms = driver.findElements(By.tagName("iframe")).size();
		System.out.println("number of frames "+allfrms);
//		driver.switchTo().frame(driver.findElement(By.xpath("//*[@scrolling='no']")));
//		driver.findElement(By.xpath("//span[normalize-space()='App Store']")).click();
//		
		//go inside frame and check if the web element is present or not
		
		for (int i=0; i<allfrms; i++) {
			driver.switchTo().frame(i);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[contains(text(),'Watch Video')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='close']")).click();
			System.out.println("all opn performed");
			
				
			
		}
		
		
	}}


