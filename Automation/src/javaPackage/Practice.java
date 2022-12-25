package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		  
		  List<WebElement> links = driver.findElements(By.tagName("a"));
		  System.out.println("number of links on page: " +links.size());
		  
		  for (WebElement lin :links ) {
			  System.out.println("text of link:- " +lin.getText() +"  AND  "+ "link info:- " +lin.getAttribute("href") );
		  }
		  
	
		  
	

	}}
		
		