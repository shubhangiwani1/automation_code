package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkaonwebpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.spicejet.com/");
		driver.manage().window().maximize();
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links on webpage :" +links.size());
		for(WebElement link :links) {
			System.out.println(link.getText()+ "----"+link.getAttribute("href"));
		}
		
	}

}
