package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown2 {
 
	//public static void main(String[] args) throws Exception {
	
	@Test
	public void abc() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\D Drive\\Softwares\\chromedriver_win32_recent\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	
		Select date = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]")));
		date.selectByIndex(0);
		Thread.sleep(1000);
		date.selectByValue("03");
		Thread.sleep(1000);
		date.selectByVisibleText("19");
		
		
		
		List <WebElement> year = driver.findElements(By.xpath("//select[contains(@name,'DOB_Year')]/option"));
		System.out.println("total year available :" +year.size());
		String expResult = "1985";
		for (int i =0;i < year.size();i++) {
			if (year.get(i).getText().equalsIgnoreCase(expResult)) {
				year.get(i).click();
				
				System.out.println("year clicked is :" +expResult);
			}}}}
		
		
		
	
		
		
		
		
		
			

