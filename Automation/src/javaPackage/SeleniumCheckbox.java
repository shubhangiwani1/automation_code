package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCheckbox {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		List <WebElement> checkbox = driver.findElements(By.xpath("//input[@name='color']"));
		
		System.out.println("Number of boxes present -: " +checkbox.size());
		
					
		for (int i =0; i<checkbox.size(); i++)
		{
						checkbox.get(i).click();
		}
//			else if 
//					(checkbox.get(i).getAttribute("value").equalsIgnoreCase("Red"))
//			{
//					checkbox.get(i).click();
//			}
//			else if (checkbox.get(i).getAttribute("value").equalsIgnoreCase("yellow"))
//			{
//			
//				checkbox.get(i).click();
//			
//			}
//			else 
//			{
//				System.out.println("out of loop");
//			}
//			}

	}}
		
			
			
			
	

		
	


