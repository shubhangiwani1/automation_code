package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.spicejet.com/");
		  List <WebElement> radio =driver.findElements(By.xpath("//*[@class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa']"));
		  
		  System.out.println("total btn ="+ radio.size());
		  String expresult = "LTC";
		  for (int i=0; i<radio.size();i++)
		  {
			
			if (radio.get(i).getText().equalsIgnoreCase(expresult))
			{
				radio.get(i).click();
				System.out.println("this rdaio is clicked :- " +expresult);
				break;
				
			}
		  }
		  

	}

}
