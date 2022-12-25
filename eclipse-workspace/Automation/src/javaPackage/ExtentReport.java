package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {
	
	static ExtentTest test;
	static ExtentReports report;
@BeforeClass

public  void startTest() {
	
		report = new ExtentReports("./extertreport/"+"ExtertReporttry.html");
	//report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
		
		 test = report.startTest("ExtentReport");
		 
		 				
}

@Test
public void extentReportsDemo() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\D Drive\\Softwares\\chromedriver_win32_recent\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
				if( driver.getTitle().equals("Facebook – log in or sign up")){
				test.log(LogStatus.PASS, "test passed");
			}
			else {
				test.log(LogStatus.FAIL, "test Failed");
			}
			
}


@AfterClass
public  void endTest() {
	report.endTest(test);
		   report.flush();
		
	}

}
