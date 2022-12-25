package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonsonwebpage {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		List <WebElement> buttonbytag = driver.findElements(By.xpath("//button"));
		Thread.sleep(2000);
		buttonbytag.get(0).click();
		System.out.println("Total buttons on webpage by tag :" +buttonbytag.size());
		 for (WebElement k: buttonbytag)
		
		System.out.println("name of button is : " +k.getAttribute("id"));
		
		
	}

}
