package javaPackage;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger("log4j");
		PropertyConfigurator.configure("C:\\Users\\shubh\\eclipse-workspace\\Automation\\Repository\\Log4j.properties");
		
		System.setProperty("webdriver.chrome.driver","C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("window maximized");
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("implicit wait applied");
		
		driver.get("https://www.facebook.com/");
		logger.info("open URL");
		
		try {
			driver.findElement(By.id("emails")).isDisplayed();
		}
		
		catch (Exception s) {
			logger.info("Failure of webelement");
		}
		
		if (driver.findElement(By.id("email")).isSelected())
		{
			logger.info("web element is selected ");
		}
		else {
			logger.info("web element is not selected");
		}

}
}