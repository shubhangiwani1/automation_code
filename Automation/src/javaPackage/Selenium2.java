package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Selenium2 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\D Drive\\Softwares\\chromedriver_win32_recent\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shubhangivani@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("shubhangi200");
		driver.findElement(By.xpath("//button")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[@aria-label='Marketplace'][@role='link']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@d,'M8.75')]")).click();
				
	}

}
