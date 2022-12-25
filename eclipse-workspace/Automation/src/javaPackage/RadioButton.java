package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
//		  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
//		  driver.manage().window().maximize();
		  
		  //1st way
//		 driver.findElement(By.xpath("//input[@value='m']")).click();
//		 driver.findElement(By.xpath("//input[@value='f']")).click();
//		  
		  //2nd way
//          driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
//          List<WebElement> radio2= driver.findElements(By.xpath("//td[@xpath='1']/input"));
//          System.out.println("Radio Btn count is :" +radio2.size());
//          String wantedResult ="female";
//          for (int i=0;i<radio2.size();i++)
//          {
//        	  if (radio2.get(i).getText().equalsIgnoreCase(wantedResult))
//        		  
//        	  {
//        		  radio2.get(i).click();
//        		  System.out.println(wantedResult +" Clicked");
//        	  }
//        	  
//        	  }
//          }
//       
//		  
//		  List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
//		  List<WebElement> radios= driver.findElements(By.xpath("//*[contains(@name ,'gender')]"));
//		  System.out.println("Total radio buttons" +radios.size());
//		  System.out.println(radios.get(0).isEnabled());
//		  System.out.println(radios.get(0).isDisplayed());
//		  System.out.println(radios.get(0).isSelected());
//		  System.out.println(radios.get(1).isEnabled());
//		  System.out.println(radios.get(1).isDisplayed());
//		  System.out.println(radios.get(1).isSelected());
//		  radios.get(0).click();
//		 radios.get(1).click();
//		 radios.get(0).click();
//
//		  System.out.println(radios.get(0).isSelected());
//		  
//		  //3rd way
		  
		  
//		  
		  
		  //for facebook 
		  driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		  List<WebElement> radios1= driver.findElements(By.xpath("//label[contains(@class, 'mt')]"));
		  
		  System.out.println("Radio Btn" +radios1.size());
		  String expResult ="male";
		  for (int i=0;i<radios1.size();i++)
		  {
			  if (radios1.get(i).getText().equalsIgnoreCase(expResult))
			  {
				  radios1.get(i).click();
				  System.out.println(expResult +" Clicked");
				  break;
			  }
		  }
		  
		  
 
 
	}}


