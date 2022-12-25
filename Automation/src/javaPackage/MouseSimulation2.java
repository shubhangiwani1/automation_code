package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://jqueryui.com/droppable/");
		
		//Switching to Frames
		List <WebElement> allframes = driver.findElements(By.tagName("iframe"));
		System.out.println("All frame available:- "+allframes.size());
		driver.switchTo().frame(0);
		//Will find draggable webelement
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		
		//will find droppable webelement
		
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		//using actions class to drag and drop
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDrop(draggable,droppable).build().perform();
		//act.dragAndDropBy(draggable, 100, 100).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
