package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumRadiobuttons {

	public static void main(String[] args) throws Exception {
 System.setProperty("webdriver.chrome.driver", "C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//		boolean b= driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
//System.out.println(b);
//Thread.sleep(2000);
//driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//boolean c= driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
//System.out.println(c);
//Thread.sleep(2000);


driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
driver.findElement(By.xpath("//*[@type='radio'][@value='m']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='radio'][@value='f']")).click();
Thread.sleep(2000);


	}

}
