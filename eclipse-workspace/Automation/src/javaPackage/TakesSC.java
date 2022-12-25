package javaPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakesSC {
	WebDriver driver;
	
	
	public void takesc(ITestResult result) throws Exception {
		
		if(ITestResult.FAILURE== result.getStatus()) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Src=  ts.getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(Src, new File("./SCTAKEEN/"+result.getName()+".png"));
		  System.out.println(result.getName() +"SC captured****");
		
		
	}
	
	
	}
}
