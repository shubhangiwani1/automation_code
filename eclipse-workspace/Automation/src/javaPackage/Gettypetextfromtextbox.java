package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gettypetextfromtextbox {
	
	
	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver", "C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.google.com/");
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("what you want");
			Thread.sleep(2000);
				System.out.println(driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value"));
				
				driver.findElement(By.xpath("//input[@type='text']")).clear();
				
				   Actions act = new Actions(driver);
				     
				     String s ="How many jobs in market";
				     act.sendKeys(driver.findElement(By.xpath("//input[@type='text']")), s).build().perform();

	}}


		

		
		
	
		
					
			
		
		
		
				
				
		
		
		
		
	