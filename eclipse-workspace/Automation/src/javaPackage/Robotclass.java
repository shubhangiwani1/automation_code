package javaPackage;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotclass {

	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://spreadsheetpage.com/calendar/"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href=contains(text(),'yearly-calendar.xls')]")).click();	
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);	
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		Thread.sleep(3000);
		robot.mouseMove(300,400);
		Thread.sleep(3000);
		robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		driver.close();
		
		
		
	}
}
