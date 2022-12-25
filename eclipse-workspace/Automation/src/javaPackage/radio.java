package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		List <WebElement> btn = driver.findElements(By.xpath("//*[@name='lang']"));
		
		
		System.out.println("Btn count is "+btn.size());
				
		for (int i=0; i< btn.size(); i++)
		{
			String expresult = "ruby";
			System.out.println(btn.get(i).getAttribute("id"));
			//String actual= btn.get(i).getAttribute("value");
					
			if (btn.get(i).getAttribute("value").equalsIgnoreCase(expresult))
			{
				btn.get(i).click();
				System.out.println("clicked radio btn is " +expresult);
				break;
				
		 }
								
			
		}
		}}
		
		
			

			
	
 
	

