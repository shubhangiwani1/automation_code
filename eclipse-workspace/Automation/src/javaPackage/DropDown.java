package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		 driver.get("http://www.google.com");
		 
		 WebElement abc = driver.findElement(By.xpath("//input[@title='Search']"));
		 
		 Actions act = new Actions(driver);
		 driver.manage().window().maximize();
		 act.contextClick(abc).perform();
		 
		 
 
 
	}

}
