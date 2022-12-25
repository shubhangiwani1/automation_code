package javaPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newwindowmessage {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");
		
		driver.findElement(By.id("messageWindowButton")).click();
		
		//print how many windows are opened
				Set<String> allwindow = driver.getWindowHandles();
				System.out.println(allwindow);
				System.out.println(allwindow.size());
				
				Iterator<String> abc= allwindow.iterator();
				String window1 = abc.next();
				String window2 = abc.next();
				
				driver.switchTo().window(window1);//alphanumberic id
				System.out.println(window1);
				System.out.println(driver.getTitle());
				driver.switchTo().defaultContent();
				driver.quit();
				
				
			}

}
