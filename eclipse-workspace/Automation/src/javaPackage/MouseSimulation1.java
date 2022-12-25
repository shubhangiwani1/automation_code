package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[contains(@class,'_2do')]")).click();
		Thread.sleep(2000);
		//create a webelement reference
		
		WebElement home = driver.findElement(By.xpath("//div[text()='Home']"));
		
		//mouse simulation
		
		Actions act = new Actions(driver);
		
		//hover mouse
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Home']"))).build().perform();
		
		
		//press enter key
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement fash = driver.findElement(By.xpath("//div[text()='Fashion']"));
		act.sendKeys(fash,Keys.ENTER).build().perform();
		System.out.println("Fashion option clicked");
		
		
		//right click on webpage
		
		act.contextClick().build().perform();
		
		//rightclick on webelement
		
		Thread.sleep(2000);
		act.contextClick(driver.findElement(By.xpath("//div[text()='Grocery']"))).build().perform();
		
		//doubleclick
		
		act.doubleClick(driver.findElement(By.xpath("//div[text()='Grocery']"))).build().perform();
				
		System.out.println("grocery clicked");
		
		//send key
		
		act.sendKeys(Keys.ENTER).build().perform();
		
		//sending two keys at a time
		Thread.sleep(2000);
		
		String pagedwn = Keys.chord(Keys.ALT,Keys.TAB);
		
		act.sendKeys(pagedwn).build().perform();
		System.out.println("all opertions performed");
		
		
			}

}
