package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownhandler {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\D Drive\\Softwares\\chromedriver_win32_recent\\chromedriver.exe");

   	  WebDriver driver = new ChromeDriver();
      driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		  driver.manage().window().maximize();
		  //1st way industry use
		  List<WebElement>  day = driver.findElements(By.xpath("//select[contains(@name,'DOB_Day')]/option"));
		 System.out.println("day count is :-" +day.size());
		  day.get(31).click();
		 Thread.sleep(2000);
		 
		 		 
		 //2nd way
		 WebElement day1= driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
		 Select date = new Select(day1);
		 date.selectByIndex(1);
         Thread.sleep(2000);
		 date.selectByVisibleText("18");
		 
		 Select month =new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]")));
		 
		 month.selectByValue("06");
		 
		 Select year =new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]")));
		 year.selectByValue("1988");
		 
		 
		 driver.findElement(By.id("mobno")).sendKeys("9800654355");
		 
		 
		 //3rd way will store all values in list
		 
		 WebElement month2= driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));
		 		 
		 Select monthtlist = new Select(month2);
		 List<WebElement> dropdown = monthtlist.getOptions();
		 for (int i =0; i < dropdown.size() ;i++)
		 {
			 String dropdownValues = dropdown.get(i).getText();
			 if (dropdownValues.equalsIgnoreCase("aug"))
           {
	      dropdown.get(i).click();
	      
	      
	      Select monthshu= new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]")));
	      	    List<WebElement> mnt = monthshu.getOptions();
	     
	     for (int j=0;j<mnt.size();j++) {
	    	if (mnt.get(j).getText().equalsIgnoreCase("May")) {
	    		mnt.get(j).click();
	    		break;
	    	}
	     }
	      
	   System.out.println(monthshu.getFirstSelectedOption().getText());
	   System.out.println(monthshu.isMultiple());
	   
	   driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]")).sendKeys("APR");
	   
	   
           }

	 }
	}
}
		 
		 
		


