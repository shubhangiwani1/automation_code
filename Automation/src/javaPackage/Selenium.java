package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\D Drive\\Softwares\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		WebDriver driver1 =new ChromeDriver();
		
		driver1.get("http://www.facebook.com");
		
	}
}

		
		
		
	


