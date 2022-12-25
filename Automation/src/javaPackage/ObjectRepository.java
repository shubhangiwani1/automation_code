package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	public static void main(String[] args) throws Exception {

	 File src = new File("C:\\Users\\shubh\\eclipse-workspace\\Automation\\Repository\\object_repo.properties");
	 FileInputStream fis = new FileInputStream(src);
	 Properties pro = new Properties();
	 pro.load(fis);
	 
	 System.setProperty("webdriver.chrome.driver","C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get(pro.getProperty("URL"));
	 driver.findElement(By.id(pro.getProperty("Email"))).sendKeys(pro.getProperty("Testdata1"));;
	 driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys("Testdata2");
	 
	 //getProperty() method accept key and returns it's value
	 
	}

}
