package javaPackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		driver.findElement(By.id("windowButton")).click();
		
		//print how many windows are opened
		
		Set<String> allwindowid = driver.getWindowHandles();
		System.out.println(allwindowid);
		System.out.println(allwindowid.size());
		
		Iterator<String> abc= allwindowid.iterator();
		String window1 = abc.next();
		String window2 = abc.next();
		
		//print title of popup window
		driver.switchTo().window(window2);//alphanumberic id
		System.out.println(window2);
		System.out.println(driver.getTitle());
		driver.close();
		//print title of parent window
		
		driver.switchTo().window(window1);
		System.out.println(window1);
		System.out.println(driver.getTitle());
		driver.close();
		
		

	}

}
