package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\D Drive\\Softwares\\chromedriver_win32_recent\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

  driver.get("https://www.facebook.com/");
  driver.manage().window().maximize();
  driver.manage().deleteAllCookies();
  Thread.sleep(2000);
  driver.navigate().to("http://www.google.com/");
  Thread.sleep(2000);
  driver.navigate().refresh();
  Thread.sleep(2000);
  driver.navigate().back();
  Thread.sleep(2000);
  driver.navigate().forward();
  driver.navigate().back();
  System.out.println(driver.getCurrentUrl());
  System.out.println(driver.getTitle());
  Thread.sleep(2000);
  driver.close();
  driver.quit();
  
  
  		
  
  
   

  
  


  	

	}

}
